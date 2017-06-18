# ViewPagerCardTransformer
各种方向的ViewPager层叠卡片

->>[相关介绍](http://www.jianshu.com/p/1cb7cd31fa65)

来先看看效果

![](http://obh9jd33g.bkt.clouddn.com/%E5%B1%82%E5%8F%A0%E5%8D%A1%E7%89%878.gif)



#### setp 1

	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
	
	
### step 2

	dependencies {
	        compile 'com.github.aohanyao:ViewPagerCardTransformer:v1.0'
	}

### step 3

	 vpMain.setPageTransformer(true, CardPageTransformer.getBuild()//建造者模式
                .addAnimationType(PageTransformerConfig.ROTATION)//默认动画 default animation rotation  旋转  当然 也可以一次性添加两个  后续会增加更多动画
                .setRotation(-45)//旋转角度
                .addAnimationType(PageTransformerConfig.ALPHA)//默认动画 透明度 暂时还有问题
                .setViewType(mViewType)
                .setOnPageTransformerListener(new OnPageTransformerListener() {
                    @Override
                    public void onPageTransformerListener(View page, float position) {
                        //你也可以在这里对 page 实行自定义动画 cust anim
                    }
                })
                .setTranslationOffset(40)
                .setScaleOffset(80)
                .create());






### about
如果我的代码对你有帮组，请给我一个star

我的[简书](http://www.jianshu.com/u/3e53005808b1)

来来扫下码，关注一下吧,或者微信搜索AndroidRookie

![AndroidRookie](http://upload-images.jianshu.io/upload_images/1760510-809d019561f671ed.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)