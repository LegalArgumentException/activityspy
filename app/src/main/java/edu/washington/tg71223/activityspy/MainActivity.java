package edu.washington.tg71223.activityspy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.*;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "activityspy";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("activityspy", "onCreate event fired, " + getIntent());
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume event fired");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause event fired");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop event fired");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart event fired");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "WE'RE GOING DOWN CAPTAIN!");
    }
}
