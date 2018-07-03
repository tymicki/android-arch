package com.mock.jt.myapplication.home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mock.jt.myapplication.R;
import com.mock.jt.myapplication.base.ApplicationComponent;
import com.mock.jt.myapplication.base.ApplicationModule;
import com.mock.jt.myapplication.base.DaggerApplicationComponent;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
