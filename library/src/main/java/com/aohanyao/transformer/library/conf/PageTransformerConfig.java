package com.aohanyao.transformer.library.conf;

import android.support.annotation.IntDef;

/**
 * Created by jjc on 2017/6/17.
 * <p>相关的配置</p>
 */

public class PageTransformerConfig {
    /**
     * 方向
     */
    @IntDef({HORIZONTAL, VERTICAL})
    public @interface Orientation {
    }

    /**
     * 动画类型
     */
    @IntDef({NONE, ROTATION, ALPHA})
    public @interface AnimationType {
    }

    /**
     * 视图类型
     */
    @IntDef({BOTTOM, BOTTOM_LEFT, BOTTOM_RIGHT, TOP, TOP_LEFT, TOP_RIGHT, LEFT, RIGHT})
    public @interface ViewType {
    }

    /**
     * 没有动画
     */
    public static final int NONE = 99;
    /**
     * 旋转
     */
    public static final int ROTATION = 98;
    /**
     * 透明度
     */
    public static final int ALPHA = 97;
    /**
     * 水平方向
     */
    public static final int HORIZONTAL = -1;
    /**
     * 垂直方向
     */
    public static final int VERTICAL = -2;

    /**
     * 底部
     */
    public static final int BOTTOM = 1;
    /**
     * 底部 左边
     */
    public static final int BOTTOM_LEFT = 11;
    /**
     * 底部右边
     */
    public static final int BOTTOM_RIGHT = 12;
    /**
     * 上面
     */
    public static final int TOP = 2;
    /**
     * 上左
     */
    public static final int TOP_LEFT = 21;
    /**
     * 上右
     */
    public static final int TOP_RIGHT = 22;
    /**
     * 左边
     */
    public static final int LEFT = 3;
    /**
     * 右边
     */
    public static final int RIGHT = 4;
}
