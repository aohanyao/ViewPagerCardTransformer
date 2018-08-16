package com.aohanyao.transformer;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.aohanyao.transformer.base.BaseFragmentPagerAdapter;
import com.aohanyao.transformer.fragment.GuideFragment;
import com.aohanyao.transformer.library.CardPageTransformer;
import com.aohanyao.transformer.library.conf.OnPageTransformerListener;
import com.aohanyao.transformer.library.conf.PageTransformerConfig;

import java.util.ArrayList;
import java.util.List;

public class HorizontalActivity extends AppCompatActivity {
    private Activity mActivity;
    private ViewPager vpMain;
    private BaseFragmentPagerAdapter mAdapter;
    private List<Fragment> mFragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horizontal);
        mActivity = this;
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //---------
        mFragments = getFragments();
        vpMain.setOffscreenPageLimit(mFragments.size() * 2);


        initPager(PageTransformerConfig.BOTTOM);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.view_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_top:
                initPager(PageTransformerConfig.TOP);
                break;
            case R.id.action_top_left:
                initPager(PageTransformerConfig.TOP_LEFT);
                break;
            case R.id.action_top_right:
                initPager(PageTransformerConfig.TOP_RIGHT);
                break;
            case R.id.action_bottom:
                initPager(PageTransformerConfig.BOTTOM);
                break;
            case R.id.action_bottom_left:
                initPager(PageTransformerConfig.BOTTOM_LEFT);
                break;
            case R.id.action_bottom_right:
                initPager(PageTransformerConfig.BOTTOM_RIGHT);
                break;
            case R.id.action_right:
                initPager(PageTransformerConfig.RIGHT);
                break;
            case R.id.action_Left:
                initPager(PageTransformerConfig.LEFT);
                break;

        }


        return super.onOptionsItemSelected(item);
    }


    private void initPager(@PageTransformerConfig.ViewType int mViewType) {
        vpMain.setOffscreenPageLimit(3);


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
                .create(vpMain));


        //创建适配器
        mAdapter = new BaseFragmentPagerAdapter(getSupportFragmentManager(), mFragments, null);
        vpMain.setAdapter(mAdapter);


    }

    /**
     * 模拟创建数据
     *
     * @return
     */
    @NonNull
    private List<Fragment> getFragments() {
        vpMain = (ViewPager) findViewById(R.id.vp_main);
        List<Fragment> mFragments = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            mFragments.add(GuideFragment.newInstance(i));
        }
        return mFragments;
    }
}
