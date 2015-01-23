package com.andrewq.planets.image_views;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.andrewq.planets.R;

/**
 * Created by Andrew Quebe on 5/14/2014.
 */
public class VenusImageView extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_mercury_image_view);
    }
}