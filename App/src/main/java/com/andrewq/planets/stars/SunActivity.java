package com.andrewq.planets.stars;

import android.app.ActionBar;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityOptions;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Toast;

import com.andrewq.planets.R;
import com.andrewq.planets.image_views.SunImageView;
import com.andrewq.planets.util.NotifyingScrollView;
import com.google.analytics.tracking.android.EasyTracker;
import com.suredigit.inappfeedback.FeedbackDialog;
import com.suredigit.inappfeedback.FeedbackSettings;

@SuppressWarnings("ConstantConditions")
public class SunActivity extends Activity {

    private ImageView imgV;
    private Drawable mActionBarBackgroundDrawable;

    private ImageView img;
    private ActionBar mActionBar;

    private NotifyingScrollView.OnScrollChangedListener mOnScrollChangedListener = new NotifyingScrollView.OnScrollChangedListener() {
        public void onScrollChanged(ScrollView who, int l, int t, int oldl, int oldt) {
            final int headerHeight = findViewById(R.id.image_header_sun).getHeight() - getActionBar().getHeight();
            final float ratio = (float) Math.min(Math.max(t, 0), headerHeight) / headerHeight;
            final int newAlpha = (int) (ratio * 255);
            mActionBarBackgroundDrawable.setAlpha(newAlpha);
        }
    };

    public static Bitmap drawableToBitmap(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }

        // We ask for the bounds if they have been set as they would be most
        // correct, then we check we are  > 0
        final int width = !drawable.getBounds().isEmpty() ?
                drawable.getBounds().width() : drawable.getIntrinsicWidth();

        final int height = !drawable.getBounds().isEmpty() ?
                drawable.getBounds().height() : drawable.getIntrinsicHeight();

        // Now we check we are > 0
        final Bitmap bitmap = Bitmap.createBitmap(width <= 0 ? 1 : width, height <= 0 ? 1 : height,
                Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);

        return bitmap;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sun_activity);

        mActionBar = getActionBar();
        assert mActionBar != null;

        mActionBar.setCustomView(R.layout.custom_actionbar_the_sun);

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

            int actionBarColor = Color.parseColor("#D32F2F");

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                this.setTaskDescription(new ActivityManager.TaskDescription("The Sun",
                        drawableToBitmap(getResources().getDrawable(R.drawable.ic_launcher)), actionBarColor));
            }
        } else if (theme_chooser == 2) {
            //Orange
            mActionBarBackgroundDrawable = getResources().getDrawable(R.drawable.ab_background_orange);

            int actionBarColor = Color.parseColor("#E64A19");

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                this.setTaskDescription(new ActivityManager.TaskDescription("The Sun",
                        drawableToBitmap(getResources().getDrawable(R.drawable.ic_launcher)), actionBarColor));
            }
        } else if (theme_chooser == 3) {
            //Blue
            mActionBarBackgroundDrawable = getResources().getDrawable(R.drawable.ab_background_blue);

            int actionBarColor = Color.parseColor("#1976D2");

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                this.setTaskDescription(new ActivityManager.TaskDescription("The Sun",
                        drawableToBitmap(getResources().getDrawable(R.drawable.ic_launcher)), actionBarColor));
            }
        } else if (theme_chooser == 4) {
            //Green
            mActionBarBackgroundDrawable = getResources().getDrawable(R.drawable.ab_background_green);

            int actionBarColor = Color.parseColor("#388E3C");

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                this.setTaskDescription(new ActivityManager.TaskDescription("The Sun",
                        drawableToBitmap(getResources().getDrawable(R.drawable.ic_launcher)), actionBarColor));
            }
        } else if (theme_chooser == 5) {
            //Purple
            mActionBarBackgroundDrawable = getResources().getDrawable(R.drawable.ab_background_purple);

            int actionBarColor = Color.parseColor("#512DA8");

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                this.setTaskDescription(new ActivityManager.TaskDescription("The Sun",
                        drawableToBitmap(getResources().getDrawable(R.drawable.ic_launcher)), actionBarColor));
            }
        } else if (theme_chooser == 6) {
            //Black
            mActionBarBackgroundDrawable = getResources().getDrawable(R.drawable.ab_background_black);

            int actionBarColor = Color.parseColor("#212121");

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                this.setTaskDescription(new ActivityManager.TaskDescription("The Sun",
                        drawableToBitmap(getResources().getDrawable(R.drawable.ic_launcher)), actionBarColor));
            }
        }

        mActionBarBackgroundDrawable.setAlpha(0);

        getActionBar().setBackgroundDrawable(mActionBarBackgroundDrawable);

        ((NotifyingScrollView) findViewById(R.id.scroll_view_1)).setOnScrollChangedListener(mOnScrollChangedListener);

        imgV = (ImageView) findViewById(R.id.image_header_sun);

        View.OnTouchListener upDownListener = new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    imgV.setAlpha(0.8f);
                    return true;
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    imgV.setAlpha(1.0f);
                    Intent i = new Intent(getBaseContext(), SunImageView.class);
                    Bundle scaleBundle = ActivityOptions.makeScaleUpAnimation(
                            v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                    startActivity(i, scaleBundle);
                    return true;
                }

                return false;
            }

        };

        imgV.setOnTouchListener(upDownListener);

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

        imgV = (ImageView) findViewById(R.id.image_header_sun);

        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            imgV.setAlpha(0.8f);
        } else if (event.getAction() == MotionEvent.ACTION_UP) {
            imgV.setAlpha(1.0f);
        }

        return super.onTouchEvent(event);
    }

    @Override
    public void onStart() {
        super.onStart();
        EasyTracker.getInstance(this).activityStart(this);  // Add this method.
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
        EasyTracker.getInstance(this).activityStop(this);  // Add this method.
    }
}