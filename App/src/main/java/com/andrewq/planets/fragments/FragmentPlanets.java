package com.andrewq.planets.fragments;

import android.app.ActivityOptions;
import android.app.Fragment;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.graphics.Palette;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.andrewq.planets.R;
import com.andrewq.planets.planets.EarthActivity;
import com.andrewq.planets.planets.JupiterActivity;
import com.andrewq.planets.planets.MarsActivity;
import com.andrewq.planets.planets.MercuryActivity;
import com.andrewq.planets.planets.NeptuneActivity;
import com.andrewq.planets.planets.SaturnActivity;
import com.andrewq.planets.planets.UranusActivity;
import com.andrewq.planets.planets.VenusActivity;
import com.nhaarman.listviewanimations.swinginadapters.prepared.SwingBottomInAnimationAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andrew on 2/27/15.
 */
public class FragmentPlanets extends Fragment {

    public static GridView gridView;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        gridView = (GridView) getActivity().findViewById(R.id.gridview);

        SwingBottomInAnimationAdapter swingBottomInAnimationAdapter = new SwingBottomInAnimationAdapter(new MyAdapter(), 100, 300);

        swingBottomInAnimationAdapter.setAbsListView(gridView);

        gridView.setAdapter(swingBottomInAnimationAdapter);

        //Set getPrefs to a preference manager
        SharedPreferences getPrefs2 = PreferenceManager.getDefaultSharedPreferences(getActivity().getBaseContext());

        //Give sort_chooser the preference key defined in XML
        int sort_chooser = Integer.parseInt(getPrefs2.getString("prefSortBy", "1"));

        //Set the action bar colors to whatever the user selects from the ListPreference
        if (sort_chooser == 1) {
            //Traditional
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

                    switch (position) {
                        case 0:
                            Intent i2 = new Intent(getActivity().getApplicationContext(),
                                    MercuryActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle2 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i2, scaleBundle2);
                            break;
                        case 1:
                            Intent i3 = new Intent(getActivity().getApplicationContext(),
                                    VenusActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle3 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i3, scaleBundle3);
                            break;
                        case 2:
                            Intent i4 = new Intent(getActivity().getApplicationContext(),
                                    EarthActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle4 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i4, scaleBundle4);
                            break;
                        case 3:
                            Intent i5 = new Intent(getActivity().getApplicationContext(),
                                    MarsActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle5 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i5, scaleBundle5);
                            break;
                        case 4:
                            Intent i6 = new Intent(getActivity().getApplicationContext(),
                                    JupiterActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle6 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i6, scaleBundle6);
                            break;
                        case 5:
                            Intent i7 = new Intent(getActivity().getApplicationContext(),
                                    SaturnActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle7 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i7, scaleBundle7);
                            break;
                        case 6:
                            Intent i8 = new Intent(getActivity().getApplicationContext(),
                                    NeptuneActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle8 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i8, scaleBundle8);
                            break;
                        case 7:
                            Intent i9 = new Intent(getActivity().getApplicationContext(),
                                    UranusActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle9 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i9, scaleBundle9);
                            break;
                    }

                }
            });
        } else if (sort_chooser == 2) {
            //A - Z
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

                    switch (position) {
                        case 0:
                            Intent i2 = new Intent(getActivity().getApplicationContext(),
                                    EarthActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle2 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i2, scaleBundle2);
                            break;
                        case 1:
                            Intent i3 = new Intent(getActivity().getApplicationContext(),
                                    JupiterActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle3 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i3, scaleBundle3);
                            break;
                        case 2:
                            Intent i4 = new Intent(getActivity().getApplicationContext(),
                                    MarsActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle4 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i4, scaleBundle4);
                            break;
                        case 3:
                            Intent i5 = new Intent(getActivity().getApplicationContext(),
                                    MercuryActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle5 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i5, scaleBundle5);
                            break;
                        case 4:
                            Intent i6 = new Intent(getActivity().getApplicationContext(),
                                    NeptuneActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle6 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i6, scaleBundle6);
                            break;
                        case 5:
                            Intent i7 = new Intent(getActivity().getApplicationContext(),
                                    SaturnActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle7 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i7, scaleBundle7);
                            break;
                        case 6:
                            Intent i8 = new Intent(getActivity().getApplicationContext(),
                                    UranusActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle8 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i8, scaleBundle8);
                            break;
                        case 7:
                            Intent i9 = new Intent(getActivity().getApplicationContext(),
                                    VenusActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle9 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i9, scaleBundle9);
                            break;
                    }

                }
            });
        } else if (sort_chooser == 3) {
            //Z - A
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

                    switch (position) {
                        case 0:
                            Intent i2 = new Intent(getActivity().getApplicationContext(),
                                    VenusActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle2 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i2, scaleBundle2);
                            break;
                        case 1:
                            Intent i3 = new Intent(getActivity().getApplicationContext(),
                                    UranusActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle3 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i3, scaleBundle3);
                            break;
                        case 2:
                            Intent i4 = new Intent(getActivity().getApplicationContext(),
                                    SaturnActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle4 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i4, scaleBundle4);
                            break;
                        case 3:
                            Intent i5 = new Intent(getActivity().getApplicationContext(),
                                    NeptuneActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle5 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i5, scaleBundle5);
                            break;
                        case 4:
                            Intent i6 = new Intent(getActivity().getApplicationContext(),
                                    MercuryActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle6 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i6, scaleBundle6);
                            break;
                        case 5:
                            Intent i7 = new Intent(getActivity().getApplicationContext(),
                                    MarsActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle7 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i7, scaleBundle7);
                            break;
                        case 6:
                            Intent i8 = new Intent(getActivity().getApplicationContext(),
                                    JupiterActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle8 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i8, scaleBundle8);
                            break;
                        case 7:
                            Intent i9 = new Intent(getActivity().getApplicationContext(),
                                    EarthActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle9 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i9, scaleBundle9);
                            break;
                    }

                }
            });
        } else if (sort_chooser == 4) {
            //Smallest to Largest
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

                    switch (position) {
                        case 0:
                            Intent i2 = new Intent(getActivity().getApplicationContext(),
                                    MercuryActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle2 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i2, scaleBundle2);
                            break;
                        case 1:
                            Intent i3 = new Intent(getActivity().getApplicationContext(),
                                    MarsActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle3 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i3, scaleBundle3);
                            break;
                        case 2:
                            Intent i4 = new Intent(getActivity().getApplicationContext(),
                                    VenusActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle4 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i4, scaleBundle4);
                            break;
                        case 3:
                            Intent i5 = new Intent(getActivity().getApplicationContext(),
                                    EarthActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle5 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i5, scaleBundle5);
                            break;
                        case 4:
                            Intent i6 = new Intent(getActivity().getApplicationContext(),
                                    NeptuneActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle6 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i6, scaleBundle6);
                            break;
                        case 5:
                            Intent i7 = new Intent(getActivity().getApplicationContext(),
                                    UranusActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle7 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i7, scaleBundle7);
                            break;
                        case 6:
                            Intent i8 = new Intent(getActivity().getApplicationContext(),
                                    SaturnActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle8 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i8, scaleBundle8);
                            break;
                        case 7:
                            Intent i9 = new Intent(getActivity().getApplicationContext(),
                                    JupiterActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle9 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i9, scaleBundle9);
                            break;
                    }

                }
            });
        } else if (sort_chooser == 5) {
            //Largest to Smallest
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

                    switch (position) {
                        case 0:
                            Intent i2 = new Intent(getActivity().getApplicationContext(),
                                    JupiterActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle2 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i2, scaleBundle2);
                            break;
                        case 1:
                            Intent i3 = new Intent(getActivity().getApplicationContext(),
                                    SaturnActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle3 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i3, scaleBundle3);
                            break;
                        case 2:
                            Intent i4 = new Intent(getActivity().getApplicationContext(),
                                    UranusActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle4 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i4, scaleBundle4);
                            break;
                        case 3:
                            Intent i5 = new Intent(getActivity().getApplicationContext(),
                                    NeptuneActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle5 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i5, scaleBundle5);
                            break;
                        case 4:
                            Intent i6 = new Intent(getActivity().getApplicationContext(),
                                    EarthActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle6 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i6, scaleBundle6);
                            break;
                        case 5:
                            Intent i7 = new Intent(getActivity().getApplicationContext(),
                                    VenusActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle7 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i7, scaleBundle7);
                            break;
                        case 6:
                            Intent i8 = new Intent(getActivity().getApplicationContext(),
                                    MarsActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle8 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i8, scaleBundle8);
                            break;
                        case 7:
                            Intent i9 = new Intent(getActivity().getApplicationContext(),
                                    MercuryActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle9 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i9, scaleBundle9);
                            break;
                    }

                }
            });
        } else {
            //Traditional
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

                    switch (position) {
                        case 0:
                            Intent i2 = new Intent(getActivity().getApplicationContext(),
                                    MercuryActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle2 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i2, scaleBundle2);
                            break;
                        case 1:
                            Intent i3 = new Intent(getActivity().getApplicationContext(),
                                    VenusActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle3 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i3, scaleBundle3);
                            break;
                        case 2:
                            Intent i4 = new Intent(getActivity().getApplicationContext(),
                                    EarthActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle4 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i4, scaleBundle4);
                            break;
                        case 3:
                            Intent i5 = new Intent(getActivity().getApplicationContext(),
                                    MarsActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle5 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i5, scaleBundle5);
                            break;
                        case 4:
                            Intent i6 = new Intent(getActivity().getApplicationContext(),
                                    JupiterActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle6 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i6, scaleBundle6);
                            break;
                        case 5:
                            Intent i7 = new Intent(getActivity().getApplicationContext(),
                                    SaturnActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle7 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i7, scaleBundle7);
                            break;
                        case 6:
                            Intent i8 = new Intent(getActivity().getApplicationContext(),
                                    NeptuneActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle8 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i8, scaleBundle8);
                            break;
                        case 7:
                            Intent i9 = new Intent(getActivity().getApplicationContext(),
                                    UranusActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle9 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i9, scaleBundle9);
                            break;
                    }

                }
            });
        }
    }

    public FragmentPlanets() {
        // Required empty public constructor
    }

    @Override
    public void onResume() {
        super.onResume();

        gridView = (GridView) getActivity().findViewById(R.id.gridview);

        SwingBottomInAnimationAdapter swingBottomInAnimationAdapter = new SwingBottomInAnimationAdapter(new MyAdapter(), 100, 300);

        swingBottomInAnimationAdapter.setAbsListView(gridView);

        gridView.setAdapter(swingBottomInAnimationAdapter);

        //Set getPrefs to a preference manager
        SharedPreferences getPrefs2 = PreferenceManager.getDefaultSharedPreferences(getActivity().getBaseContext());

        //Give sort_chooser the preference key defined in XML
        int sort_chooser = Integer.parseInt(getPrefs2.getString("prefSortBy", "1"));

        //Set the action bar colors to whatever the user selects from the ListPreference
        if (sort_chooser == 1) {
            //Traditional
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

                    switch (position) {
                        case 0:
                            Intent i2 = new Intent(getActivity().getApplicationContext(),
                                    MercuryActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle2 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i2, scaleBundle2);
                            break;
                        case 1:
                            Intent i3 = new Intent(getActivity().getApplicationContext(),
                                    VenusActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle3 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i3, scaleBundle3);
                            break;
                        case 2:
                            Intent i4 = new Intent(getActivity().getApplicationContext(),
                                    EarthActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle4 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i4, scaleBundle4);
                            break;
                        case 3:
                            Intent i5 = new Intent(getActivity().getApplicationContext(),
                                    MarsActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle5 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i5, scaleBundle5);
                            break;
                        case 4:
                            Intent i6 = new Intent(getActivity().getApplicationContext(),
                                    JupiterActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle6 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i6, scaleBundle6);
                            break;
                        case 5:
                            Intent i7 = new Intent(getActivity().getApplicationContext(),
                                    SaturnActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle7 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i7, scaleBundle7);
                            break;
                        case 6:
                            Intent i8 = new Intent(getActivity().getApplicationContext(),
                                    NeptuneActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle8 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i8, scaleBundle8);
                            break;
                        case 7:
                            Intent i9 = new Intent(getActivity().getApplicationContext(),
                                    UranusActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle9 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i9, scaleBundle9);
                            break;
                    }

                }
            });
        } else if (sort_chooser == 2) {
            //A - Z
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

                    switch (position) {
                        case 0:
                            Intent i2 = new Intent(getActivity().getApplicationContext(),
                                    EarthActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle2 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i2, scaleBundle2);
                            break;
                        case 1:
                            Intent i3 = new Intent(getActivity().getApplicationContext(),
                                    JupiterActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle3 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i3, scaleBundle3);
                            break;
                        case 2:
                            Intent i4 = new Intent(getActivity().getApplicationContext(),
                                    MarsActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle4 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i4, scaleBundle4);
                            break;
                        case 3:
                            Intent i5 = new Intent(getActivity().getApplicationContext(),
                                    MercuryActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle5 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i5, scaleBundle5);
                            break;
                        case 4:
                            Intent i6 = new Intent(getActivity().getApplicationContext(),
                                    NeptuneActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle6 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i6, scaleBundle6);
                            break;
                        case 5:
                            Intent i7 = new Intent(getActivity().getApplicationContext(),
                                    SaturnActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle7 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i7, scaleBundle7);
                            break;
                        case 6:
                            Intent i8 = new Intent(getActivity().getApplicationContext(),
                                    UranusActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle8 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i8, scaleBundle8);
                            break;
                        case 7:
                            Intent i9 = new Intent(getActivity().getApplicationContext(),
                                    VenusActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle9 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i9, scaleBundle9);
                            break;
                    }

                }
            });
        } else if (sort_chooser == 3) {
            //Z - A
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

                    switch (position) {
                        case 0:
                            Intent i2 = new Intent(getActivity().getApplicationContext(),
                                    VenusActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle2 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i2, scaleBundle2);
                            break;
                        case 1:
                            Intent i3 = new Intent(getActivity().getApplicationContext(),
                                    UranusActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle3 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i3, scaleBundle3);
                            break;
                        case 2:
                            Intent i4 = new Intent(getActivity().getApplicationContext(),
                                    SaturnActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle4 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i4, scaleBundle4);
                            break;
                        case 3:
                            Intent i5 = new Intent(getActivity().getApplicationContext(),
                                    NeptuneActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle5 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i5, scaleBundle5);
                            break;
                        case 4:
                            Intent i6 = new Intent(getActivity().getApplicationContext(),
                                    MercuryActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle6 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i6, scaleBundle6);
                            break;
                        case 5:
                            Intent i7 = new Intent(getActivity().getApplicationContext(),
                                    MarsActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle7 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i7, scaleBundle7);
                            break;
                        case 6:
                            Intent i8 = new Intent(getActivity().getApplicationContext(),
                                    JupiterActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle8 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i8, scaleBundle8);
                            break;
                        case 7:
                            Intent i9 = new Intent(getActivity().getApplicationContext(),
                                    EarthActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle9 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i9, scaleBundle9);
                            break;
                    }

                }
            });
        } else if (sort_chooser == 4) {
            //Smallest to Largest
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

                    switch (position) {
                        case 0:
                            Intent i2 = new Intent(getActivity().getApplicationContext(),
                                    MercuryActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle2 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i2, scaleBundle2);
                            break;
                        case 1:
                            Intent i3 = new Intent(getActivity().getApplicationContext(),
                                    MarsActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle3 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i3, scaleBundle3);
                            break;
                        case 2:
                            Intent i4 = new Intent(getActivity().getApplicationContext(),
                                    VenusActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle4 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i4, scaleBundle4);
                            break;
                        case 3:
                            Intent i5 = new Intent(getActivity().getApplicationContext(),
                                    EarthActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle5 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i5, scaleBundle5);
                            break;
                        case 4:
                            Intent i6 = new Intent(getActivity().getApplicationContext(),
                                    NeptuneActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle6 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i6, scaleBundle6);
                            break;
                        case 5:
                            Intent i7 = new Intent(getActivity().getApplicationContext(),
                                    UranusActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle7 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i7, scaleBundle7);
                            break;
                        case 6:
                            Intent i8 = new Intent(getActivity().getApplicationContext(),
                                    SaturnActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle8 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i8, scaleBundle8);
                            break;
                        case 7:
                            Intent i9 = new Intent(getActivity().getApplicationContext(),
                                    JupiterActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle9 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i9, scaleBundle9);
                            break;
                    }

                }
            });
        } else if (sort_chooser == 5) {
            //Largest to Smallest
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

                    switch (position) {
                        case 0:
                            Intent i2 = new Intent(getActivity().getApplicationContext(),
                                    JupiterActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle2 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i2, scaleBundle2);
                            break;
                        case 1:
                            Intent i3 = new Intent(getActivity().getApplicationContext(),
                                    SaturnActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle3 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i3, scaleBundle3);
                            break;
                        case 2:
                            Intent i4 = new Intent(getActivity().getApplicationContext(),
                                    UranusActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle4 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i4, scaleBundle4);
                            break;
                        case 3:
                            Intent i5 = new Intent(getActivity().getApplicationContext(),
                                    NeptuneActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle5 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i5, scaleBundle5);
                            break;
                        case 4:
                            Intent i6 = new Intent(getActivity().getApplicationContext(),
                                    EarthActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle6 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i6, scaleBundle6);
                            break;
                        case 5:
                            Intent i7 = new Intent(getActivity().getApplicationContext(),
                                    VenusActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle7 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i7, scaleBundle7);
                            break;
                        case 6:
                            Intent i8 = new Intent(getActivity().getApplicationContext(),
                                    MarsActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle8 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i8, scaleBundle8);
                            break;
                        case 7:
                            Intent i9 = new Intent(getActivity().getApplicationContext(),
                                    MercuryActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle9 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i9, scaleBundle9);
                            break;
                    }

                }
            });
        } else {
            //Traditional
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

                    switch (position) {
                        case 0:
                            Intent i2 = new Intent(getActivity().getApplicationContext(),
                                    MercuryActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle2 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i2, scaleBundle2);
                            break;
                        case 1:
                            Intent i3 = new Intent(getActivity().getApplicationContext(),
                                    VenusActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle3 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i3, scaleBundle3);
                            break;
                        case 2:
                            Intent i4 = new Intent(getActivity().getApplicationContext(),
                                    EarthActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle4 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i4, scaleBundle4);
                            break;
                        case 3:
                            Intent i5 = new Intent(getActivity().getApplicationContext(),
                                    MarsActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle5 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i5, scaleBundle5);
                            break;
                        case 4:
                            Intent i6 = new Intent(getActivity().getApplicationContext(),
                                    JupiterActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle6 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i6, scaleBundle6);
                            break;
                        case 5:
                            Intent i7 = new Intent(getActivity().getApplicationContext(),
                                    SaturnActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle7 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i7, scaleBundle7);
                            break;
                        case 6:
                            Intent i8 = new Intent(getActivity().getApplicationContext(),
                                    NeptuneActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle8 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i8, scaleBundle8);
                            break;
                        case 7:
                            Intent i9 = new Intent(getActivity().getApplicationContext(),
                                    UranusActivity.class);
                            //Scale animation is sent as a bundle to the next activity.
                            Bundle scaleBundle9 = ActivityOptions.makeScaleUpAnimation(
                                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
                            //then start the activity, and send the bundle
                            startActivity(i9, scaleBundle9);
                            break;
                    }

                }
            });
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.gallery_main, container, false);
    }

    private class MyAdapter extends BaseAdapter {
        private List<Item> items = new ArrayList<>();
        private LayoutInflater inflater;

        public MyAdapter() {
            inflater = LayoutInflater.from(getActivity().getApplicationContext());

            //Set getPrefs to a preference manager
            SharedPreferences getPrefs2 = PreferenceManager.getDefaultSharedPreferences(getActivity().getBaseContext());

            //Give sort_chooser the preference key defined in XML
            int sort_chooser = Integer.parseInt(getPrefs2.getString("prefSortBy", "1"));

            //Set the action bar colors to whatever the user selects from the ListPreference
            if (sort_chooser == 1) {
                //Traditional
                items.add(new Item("Mercury", R.drawable.mercury));
                items.add(new Item("Venus", R.drawable.venus));
                items.add(new Item("Earth", R.drawable.earth));
                items.add(new Item("Mars", R.drawable.mars));
                items.add(new Item("Jupiter", R.drawable.jupiter));
                items.add(new Item("Saturn", R.drawable.saturn));
                items.add(new Item("Neptune", R.drawable.neptune));
                items.add(new Item("Uranus", R.drawable.uranus));
            } else if (sort_chooser == 2) {
                //A - Z
                items.add(new Item("Earth", R.drawable.earth));
                items.add(new Item("Jupiter", R.drawable.jupiter));
                items.add(new Item("Mars", R.drawable.mars));
                items.add(new Item("Mercury", R.drawable.mercury));
                items.add(new Item("Neptune", R.drawable.neptune));
                items.add(new Item("Saturn", R.drawable.saturn));
                items.add(new Item("Uranus", R.drawable.uranus));
                items.add(new Item("Venus", R.drawable.venus));
            } else if (sort_chooser == 3) {
                //Z - A
                items.add(new Item("Venus", R.drawable.venus));
                items.add(new Item("Uranus", R.drawable.uranus));
                items.add(new Item("Saturn", R.drawable.saturn));
                items.add(new Item("Neptune", R.drawable.neptune));
                items.add(new Item("Mercury", R.drawable.mercury));
                items.add(new Item("Mars", R.drawable.mars));
                items.add(new Item("Jupiter", R.drawable.jupiter));
                items.add(new Item("Earth", R.drawable.earth));
            } else if (sort_chooser == 4) {
                //Smallest to Largest
                items.add(new Item("Mercury", R.drawable.mercury));
                items.add(new Item("Mars", R.drawable.mars));
                items.add(new Item("Venus", R.drawable.venus));
                items.add(new Item("Earth", R.drawable.earth));
                items.add(new Item("Neptune", R.drawable.neptune));
                items.add(new Item("Uranus", R.drawable.uranus));
                items.add(new Item("Saturn", R.drawable.saturn));
                items.add(new Item("Jupiter", R.drawable.jupiter));
            } else if (sort_chooser == 5) {
                //Largest to Smallest
                items.add(new Item("Jupiter", R.drawable.jupiter));
                items.add(new Item("Saturn", R.drawable.saturn));
                items.add(new Item("Uranus", R.drawable.uranus));
                items.add(new Item("Neptune", R.drawable.neptune));
                items.add(new Item("Earth", R.drawable.earth));
                items.add(new Item("Venus", R.drawable.venus));
                items.add(new Item("Mars", R.drawable.mars));
                items.add(new Item("Mercury", R.drawable.mercury));
            } else {
                //Traditional
                items.add(new Item("Mercury", R.drawable.mercury));
                items.add(new Item("Venus", R.drawable.venus));
                items.add(new Item("Earth", R.drawable.earth));
                items.add(new Item("Mars", R.drawable.mars));
                items.add(new Item("Jupiter", R.drawable.jupiter));
                items.add(new Item("Saturn", R.drawable.saturn));
                items.add(new Item("Neptune", R.drawable.neptune));
                items.add(new Item("Uranus", R.drawable.uranus));
            }
        }

        @Override
        public int getCount() {
            return items.size();
        }

        @Override
        public Object getItem(int i) {
            return items.get(i);
        }

        @Override
        public long getItemId(int i) {
            return items.get(i).drawableId;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View v = view;
            ImageView picture;
            TextView name;
            View textContainer;

            if (v == null) {
                v = inflater.inflate(R.layout.gridview_item, viewGroup, false);
                v.setTag(R.id.picture, v.findViewById(R.id.picture));
                v.setTag(R.id.text, v.findViewById(R.id.text));
                v.setTag(R.id.textContainer, v.findViewById(R.id.textContainer));
            }

            picture = (ImageView) v.getTag(R.id.picture);
            name = (TextView) v.getTag(R.id.text);
            textContainer = (View) v.getTag(R.id.textContainer);

            Item item = (Item) getItem(i);

            picture.setImageResource(item.drawableId);
            name.setText(item.name);

            Palette.Builder builder = new Palette.Builder(BitmapFactory.decodeResource(getResources(), item.drawableId));
            builder.generate(new PaletteListener(name, textContainer));
            return v;
        }

        private class PaletteListener implements Palette.PaletteAsyncListener {

            private TextView text;
            private View textContainer;

            private PaletteListener(TextView text, View textContainer) {
                this.text = text;
                this.textContainer = textContainer;
            }

            @Override
            public void onGenerated(Palette palette) {
                Palette.Swatch swatch = palette.getDarkVibrantSwatch();
                if (swatch == null) {
                    swatch = palette.getDarkMutedSwatch();
                }
                if (swatch != null) {
                    int titleTextColor = swatch.getBodyTextColor();
                    int rgb = swatch.getRgb();
                    text.setTextColor(titleTextColor);
                    textContainer.setBackgroundColor(rgb);
                    textContainer.getBackground().setAlpha(127);
                }
            }
        }

        private class Item {
            final String name;
            final int drawableId;

            Item(String name, int drawableId) {
                this.name = name;
                this.drawableId = drawableId;
            }
        }
    }

}
