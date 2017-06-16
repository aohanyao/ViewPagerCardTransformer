package com.aohanyao.transformer.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.aohanyao.transformer.R;
import com.aohanyao.transformer.fragment.GuideFragment;

import java.util.ArrayList;
import java.util.List;

public abstract class BasePagerActivity extends AppCompatActivity {

    protected ViewPager vp;
    protected Activity mActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivity = this;
        setContentView(R.layout.activity_base_pager);
        initPager();

    }

    private void initPager() {
        vp = (ViewPager) findViewById(R.id.vp);
        List<Fragment> mFragments = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            mFragments.add(GuideFragment.newInstance(i));
        }
        vp.setOffscreenPageLimit(mFragments.size() * 2);
        setTransformer();
        vp.setAdapter(new BaseFragmentPagerAdapter(getSupportFragmentManager(), mFragments, null));
    }

    protected abstract void setTransformer();
}
