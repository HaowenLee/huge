package com.sample.huge;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.haowen.huge.DebugLog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String s = onlyTest("我是你", "爷爷");
    }

    @DebugLog
    private String onlyTest(String... args) {
        return args[0] + args[1];
    }
}
