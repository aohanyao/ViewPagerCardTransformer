package com.aohanyao.transformer;

import android.os.Bundle;

import com.aohanyao.transformer.base.BasePagerActivity;
import com.aohanyao.transformer.library.hrizontal.bottom.HorizontalBottomCardPageTransformer;
import com.aohanyao.transformer.util.DensityUtils;

public class HorizontalBottomCardActivity extends BasePagerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void setTransformer() {
        vp.setPageTransformer(true, new HorizontalBottomCardPageTransformer(DensityUtils.dp2px(mActivity, 20f)));
    }
}
