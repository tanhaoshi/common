package org.devio.takephoto.model;

import android.app.Activity;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/**
 * Author: JPH
 * Date: 2016/8/11 17:01
 */
public class TContextWrap {
    private FragmentActivity activity;
    private Fragment fragment;

    public static TContextWrap of(FragmentActivity activity) {
        return new TContextWrap(activity);
    }

    public static TContextWrap of(Fragment fragment) {
        return new TContextWrap(fragment);
    }

    private TContextWrap(FragmentActivity activity) {
        this.activity = activity;
    }

    private TContextWrap(Fragment fragment) {
        this.fragment = fragment;
        this.activity = fragment.getActivity();
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(FragmentActivity activity) {
        this.activity = activity;
    }

    public Fragment getFragment() {
        return fragment;
    }

    public void setFragment(Fragment fragment) {
        this.fragment = fragment;
    }
}
