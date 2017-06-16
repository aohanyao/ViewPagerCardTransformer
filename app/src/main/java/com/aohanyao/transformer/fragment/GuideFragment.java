package com.aohanyao.transformer.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.aohanyao.transformer.R;

/**
 */
public class GuideFragment extends Fragment {

    public GuideFragment() {
        // Required empty public constructor
    }

    public static GuideFragment newInstance(int pageIndex) {

        Bundle args = new Bundle();
        args.putInt("key", pageIndex);
        GuideFragment fragment = new GuideFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_guide, container, false);

        TextView tvText = (TextView) view.findViewById(R.id.tv_text);


        int pageIndex = getArguments().getInt("key", 0) + 1;
        tvText.setText(String.valueOf(pageIndex));

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }
}
