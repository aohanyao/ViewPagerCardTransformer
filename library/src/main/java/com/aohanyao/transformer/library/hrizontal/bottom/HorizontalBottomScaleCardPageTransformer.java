package com.aohanyao.transformer.library.hrizontal.bottom;

import android.annotation.SuppressLint;
import android.view.View;

/**
 * 水平滑动的且是旋转的
 */
public class HorizontalBottomScaleCardPageTransformer extends HorizontalBottomCardPageTransformer {
    /**
     * @param mScaleOffset 缩放偏移量 单位 px
     */
    public HorizontalBottomScaleCardPageTransformer(int mScaleOffset) {
        super(mScaleOffset);
    }

    @SuppressLint("NewApi")
    public void transformPage(View page, float position) {

        if (position <= 0.0f) {//被滑动的那页
            //设置旋转角度
            page.setRotation((45 * position));
            page.setTranslationX(0f);
            if (Math.abs(position) > 0.9f) {//差不多偏移完成了
                page.setTranslationX((page.getWidth() * position));
            }

        } else {//剩余未被滑动的那页
            //缩放比例
            super.setTransformPagerToBottom(page, position);
        }
    }
}