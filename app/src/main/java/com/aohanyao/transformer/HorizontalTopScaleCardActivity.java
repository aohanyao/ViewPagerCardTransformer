package com.aohanyao.transformer;

import android.os.Bundle;

import com.aohanyao.transformer.base.BasePagerActivity;
import com.aohanyao.transformer.library.hrizontal.top.HorizontalTopScaleCardPageTransformer;

public class HorizontalTopScaleCardActivity extends BasePagerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void setTransformer() {
        vp.setPageTransformer(true,new HorizontalTopScaleCardPageTransformer(40));
    }
}
