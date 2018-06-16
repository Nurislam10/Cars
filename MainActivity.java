package com.example.nurislam.lesson12;

import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements
        GestureDetector.OnGestureListener,
        GestureDetector.OnDoubleTapListener
         {

    private TextView txt;
    private GestureDetectorCompat gd;
    private AutoCompleteTextView actv;
    private String [] cars = new String[]{
            "AUDI",
            "ALPINA",
            "BMW",
            "BUGATTI",
            "CHEVROLET",
            "CHRYSLER",
            "DODGE",
            "FORD",
            "GEELY",
            "HONDA",
            "HYUNDAI",
            "INFINITI",
            "JAGUAR",
            "JEEP",
            "KIA",
            "LADA",
            "LEXUS",
            "MERCEDES",
            "MAZDA",
            "NISSAN",
            "OPEL",
            "PORSCHE",
            "RENAULT",
            "SKODA",
            "SUBARU",
            "TESLA",
            "VOLVO",
            "VOLKSWAGEN",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = (TextView)findViewById(R.id.Num);
        gd = new GestureDetectorCompat(this, this);
        gd.setOnDoubleTapListener(this);
        actv = (AutoCompleteTextView)findViewById(R.id.complete);
        ArrayAdapter adapter  = new ArrayAdapter(this, android.R.layout.select_dialog_item, cars);
        actv.setThreshold(1);
        actv.setAdapter(adapter);
    }
    @Override
    public boolean onTouchEvent (MotionEvent event) {
        gd.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        txt.setText("111111111111111111111");

        return false;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        txt.setText("onLongPress000000000000000000000000");

    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        return false;
    }
}
