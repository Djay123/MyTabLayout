package com.gn.djay.tablayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DJAY on 2017/4/23.
 */

public class MyFragment extends Fragment {

    public static final String KEY = "content";

    public static MyFragment generateFragment(String content){
        Bundle bundle = new Bundle();
        bundle.putString(KEY,content);
        MyFragment fragment = new MyFragment();
        fragment.setArguments(bundle);

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        Bundle bundle = getArguments();
        String content = "默认值";
        if (bundle != null)
            content = bundle.getString(KEY);
        TextView tv = new TextView(getActivity());
        tv.setText(content);
        tv.setGravity(Gravity.CENTER);
        return tv;
    }



}
