package com.example.dell.pk12;

import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.gesture.Gesture;
import android.widget.TextView;

import static  android.view.GestureDetector.*;

public class MainActivity extends AppCompatActivity implements OnGestureListener,OnDoubleTapListener {
    private static TextView t;
    private GestureDetectorCompat g;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t=(TextView)findViewById(R.id.textView);
        g=new GestureDetectorCompat(this,this);
        g.setOnDoubleTapListener(this);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        g.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        t.setText("onSingleTapConfirmed");
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        t.setText("onDoubleTap");
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        t.setText("onDoubleTapEvent");
        return false;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        t.setText("onDown");
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        t.setText("onShowPress");

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        t.setText(" onSingleTapUp");
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        t.setText(" onScroll");
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        t.setText("onLongPress");
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        t.setText("onFling");
        return false;
    }
}
