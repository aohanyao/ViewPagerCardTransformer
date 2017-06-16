package com.aohanyao.transformer.library.hrizontal.left;

import android.annotation.SuppressLint;
import android.support.v4.view.ViewPager;
import android.view.View;

/**
 * 水平滑动的
 */
public class HorizontalLeftTopCardPageTransformer implements ViewPager.PageTransformer {
    /**
     * 偏移量
     */
    private int mScaleOffset = 40;


    /**
     * @param mScaleOffset 缩放偏移量 单位 px
     */
    public HorizontalLeftTopCardPageTransformer(int mScaleOffset) {
        this.mScaleOffset = mScaleOffset;
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
        } else {
            setTransformPagerToBottom(page, position);
        }

    }

    protected void setTransformPagerToBottom(View page, float position) {
        //缩放比例
        float scale = (page.getWidth() - mScaleOffset * position) / (float) (page.getWidth());

        page.setScaleX(scale);
        page.setScaleY(scale);

        page.setTranslationX((-page.getWidth() * position) + ((mScaleOffset * 0.8f) * position));
        page.setTranslationY(0);
        page.setTranslationY(-((mScaleOffset * 0.8f) * position));

    }
}