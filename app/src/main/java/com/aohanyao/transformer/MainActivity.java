package com.aohanyao.transformer;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private Activity mActivity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivity = this;
        setContentView(R.layout.activity_main);
    }

    public void horizontalBottomCard(View view) {
        openActivity(HorizontalBottomCardActivity.class);
    }

    public void horizontalBottomScaleCard(View view) {
        openActivity(HorizontalBottomScaleCardActivity.class);
    }

    public void horizontalTopCard(View view) {
        openActivity(HorizontalTopCardActivity.class);
    }

    public void horizontalTopScaleCard(View view) {
        openActivity(HorizontalTopScaleCardActivity.class);
    }

    public void horizontalLeftCard(View view) {
        openActivity(HorizontalLeftCardActivity.class);
    }

    public void horizontalRightCard(View view) {
        openActivity(HorizontalRightCardActivity.class);
    }

    public void horizontalLeftTop(View view) {
        openActivity(HorizontalLeftTopActivity.class);
    }

    private void openActivity(Class<?> activityClass) {
        startActivity(new Intent(mActivity, activityClass));
    }
}
