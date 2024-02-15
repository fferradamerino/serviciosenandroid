package com.example.tutorialspoint7.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void StartService() {
        startService(new Intent(getBaseContext(), MyService.class));
    }

    public void StopService() {
        stopService(new Intent(getBaseContext(), MyService.class));
    }
}
