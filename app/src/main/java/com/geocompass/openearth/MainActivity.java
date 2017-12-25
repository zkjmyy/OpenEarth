package com.geocompass.openearth;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.geocompass.openearth.sdk.earth.Earth;
import com.geocompass.openearth.sdk.earth.EarthView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EarthView mEarthView;
    private Earth mEarth;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEarthView = findViewById(R.id.earth_view);

        mEarth = mEarthView.getEarth();

        findViewById(R.id.btn_rotate_right).setOnClickListener(this);
        findViewById(R.id.btn_rotate_left).setOnClickListener(this);
        findViewById(R.id.btn_rotate_up).setOnClickListener(this);
        findViewById(R.id.btn_rotate_down).setOnClickListener(this);
        findViewById(R.id.btn_zoom_in).setOnClickListener(this);
        findViewById(R.id.btn_zoom_out).setOnClickListener(this);
        findViewById(R.id.btn_look_up).setOnClickListener(this);
        findViewById(R.id.btn_look_down).setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_rotate_right:
                mEarth.rotateEarth(1, (float) (Math.PI / 72));
                return;
            case R.id.btn_rotate_left:
                mEarth.rotateEarth(1, -(float) (Math.PI / 72));
                return;
            case R.id.btn_rotate_up:
                mEarth.rotateEarth(0, -(float) (Math.PI / 72));
                return;
            case R.id.btn_rotate_down:
                mEarth.rotateEarth(0, (float) (Math.PI / 72));
                return;
            case R.id.btn_zoom_in:
                mEarth.zoomIn();
                return;
            case R.id.btn_zoom_out:
                mEarth.zoomOut();
                return;
            case R.id.btn_look_up:
                mEarth.lookUp();
                return;
            case R.id.btn_look_down:
                mEarth.lookDown();
                return;
        }
    }


}
