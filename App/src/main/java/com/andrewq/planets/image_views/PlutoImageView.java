package com.andrewq.planets.image_views;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.andrewq.planets.R;

/**
 * Created by Andrew Quebe on 5/19/2014.
 */
public class PlutoImageView extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_pluto_image_view);

        Toast.makeText(this, "NOTE: Image is approximate", Toast.LENGTH_SHORT).show();
    }
}
