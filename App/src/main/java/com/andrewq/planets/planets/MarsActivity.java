package com.andrewq.planets.planets;

import android.app.ActionBar;
import android.app.Activity;
import android.app.ActivityOptions;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Toast;

import com.andrewq.planets.R;
import com.andrewq.planets.image_views.MarsImageView;
import com.andrewq.planets.moons.DeimosActivity;
import com.andrewq.planets.moons.PhobosActivity;
import com.andrewq.planets.util.NotifyingScrollView;
import com.google.analytics.tracking.android.EasyTracker;
import com.suredigit.inappfeedback.FeedbackDialog;
import com.suredigit.inappfeedback.FeedbackSettings;

@SuppressWarnings("ConstantConditions")
public class MarsActivity extends Activity {

    Button moonButton;
    ImageView imgV;
    Context con = this;

    private ImageView img;
    private ActionBar mActionBar;

    private Drawable mActionBarBackgroundDrawable;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mars_activity);

        mActionBar = getActionBar();
        assert mActionBar != null;
        mActionBar.setCustomView(R.layout.custom_actionbar_mars);
        mActionBar.setDisplayShowCustomEnabled(true);
        mActionBar.setDisplayHomeAsUpEnabled(false);

        img = (ImageView) findViewById(R.id.backButtonSettings);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        SharedPreferences getPrefs2 = PreferenceManager
                .getDefaultSharedPreferences(getBaseContext());

        //Give theme_chooser the preference key defined in XML
        int theme_chooser = Integer.parseInt(getPrefs2.getString("prefSetTheme", "3"));

        //Set the action bar colors to whatever the user selects from the ListPreference
        if (theme_chooser == 1) {
            //Red
            mActionBarBackgroundDrawable = getResources().getDrawable(R.drawable.ab_background_red);
        } else if (theme_chooser == 2) {
            //Orange
            mActionBarBackgroundDrawable = getResources().getDrawable(R.drawable.ab_background_orange);
        } else if (theme_chooser == 3) {
            //Blue
            mActionBarBackgroundDrawable = getResources().getDrawable(R.drawable.ab_background_blue);
        } else if (theme_chooser == 4) {
            //Green
            mActionBarBackgroundDrawable = getResources().getDrawable(R.drawable.ab_background_green);
        } else if (theme_chooser == 5) {
            //Purple
            mActionBarBackgroundDrawable = getResources().getDrawable(R.drawable.ab_background_purple);
        } else if (theme_chooser == 6) {
            //Black
            mActionBarBackgroundDrawable = getResources().getDrawable(R.drawable.ab_background_black);
        }

        mActionBarBackgroundDrawable.setAlpha(0);

        getActionBar().setBackgroundDrawable(mActionBarBackgroundDrawable);

        ((NotifyingScrollView) findViewById(R.id.scroll_view_6)).setOnScrollChangedListener(mOnScrollChangedListener);

        imgV = (ImageView) findViewById(R.id.image_header_mars);

        View.OnTouchListener upDownListener = new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    imgV.setAlpha(0.8f);
                    return true;
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    imgV.setAlpha(1.0f);
                    Intent i = new Intent(getBaseContext(), MarsImageView.class);
                    Bundle scaleBundle = ActivityOptions.makeScaleUpAnimation(
                            v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                    startActivity(i, scaleBundle);
                    return true;
                }

                return false;
            }

        };

        imgV.setOnTouchListener(upDownListener);

        moonButton = (Button) findViewById(R.id.mars_satellite);

        moonButton.setOnClickListener(new View.OnClickListener() {
            //Handle the button being pressed
            @Override
            public void onClick(View v) {
                //Make a new alert dialog
                new AlertDialog.Builder(con)
                        //Set the title
                        .setTitle("Select Moon")
                                //Set it's items to an array
                        .setItems(R.array.mars_moons, new DialogInterface.OnClickListener() {
                            //Handle what happens when each item is pressed
                            public void onClick(DialogInterface dialog, int which) {
                                //If the user pressed the first item
                                if (which == 0) {
                                    //Open the first moon activity
                                    Intent phobos = new Intent(getBaseContext(), PhobosActivity.class);
                                    startActivity(phobos);
                                }
                                //Otherwise
                                else {
                                    //In this case, open the other moon activity
                                    Intent deimos = new Intent(getBaseContext(), DeimosActivity.class);
                                    startActivity(deimos);
                                }
                            }
                        })
                                //Create a cancel button
                        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            //Handle when it's clicked. Here we don't need it to do anything
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                //Do nothing!
                            }
                        })

                                //Show the dialog after an item is pressed
                        .show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.source_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.sendFeedback:
                FeedbackSettings fbs = new FeedbackSettings();
                fbs.setText("Use this to send feedback, suggestions, and bugs to the developer. " +
                        "All feedback/suggestions are appreciated!");
                fbs.setYourComments("Your message here...");
                fbs.setTitle("Feedback Submitter");

                fbs.setToast("Thanks! Check back later for a reply if applicable.");
                fbs.setToastDuration(Toast.LENGTH_LONG);

                fbs.setRadioButtons(true);
                fbs.setBugLabel("Bug");
                fbs.setIdeaLabel("Suggestion");
                fbs.setQuestionLabel("General Feedback");

                fbs.setOrientation(LinearLayout.VERTICAL);
                fbs.setGravity(Gravity.LEFT);

                fbs.setModal(true);

                FeedbackDialog fdb = new FeedbackDialog(this, "AF-FD2E2AEF7F0A-27", fbs);
                fdb.show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        imgV = (ImageView) findViewById(R.id.image_header_mars);

        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            imgV.setAlpha(0.8f);
        } else if (event.getAction() == MotionEvent.ACTION_UP) {
            imgV.setAlpha(1.0f);
        }

        return super.onTouchEvent(event);
    }

    private NotifyingScrollView.OnScrollChangedListener mOnScrollChangedListener = new NotifyingScrollView.OnScrollChangedListener() {
        public void onScrollChanged(ScrollView who, int l, int t, int oldl, int oldt) {
            final int headerHeight = findViewById(R.id.image_header_mars).getHeight() - getActionBar().getHeight();
            final float ratio = (float) Math.min(Math.max(t, 0), headerHeight) / headerHeight;
            final int newAlpha = (int) (ratio * 255);
            mActionBarBackgroundDrawable.setAlpha(newAlpha);
        }
    };

    @Override
    public void onStart() {
        super.onStart();
        EasyTracker.getInstance(this).activityStart(this);  // Add this method.
    }

    @Override
    public void onStop() {
        super.onStop();
        EasyTracker.getInstance(this).activityStop(this);  // Add this method.
    }
}