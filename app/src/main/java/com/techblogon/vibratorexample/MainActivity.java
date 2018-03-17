package com.techblogon.vibratorexample;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
    public Vibrator vibrator;
    public EditText editTextDuration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickVibrate(View v) {
        //Set the pattern, like vibrate for 300 milliseconds and then stop for 200 ms, then 
        //vibrate for 300 milliseconds and then stop for 500 ms. You can change the pattern and 
        // test the result for better clarity.
        long pattern[] = {0, 300, 200, 300, 500};

        // Start the vibration
        vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        //start vibration with repeated count, use -1 if you don't want to repeat the vibration
        vibrator.vibrate(pattern, 0);
    }

    public void onClickStop(View v) {
        vibrator.cancel();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

}
