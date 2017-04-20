package com.var.gankv.ui.splash;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.var.gankv.R;

public class SplashActivity extends AppCompatActivity implements SplashContract.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }

    @Override
    public void showMainUi() {

    }
}
