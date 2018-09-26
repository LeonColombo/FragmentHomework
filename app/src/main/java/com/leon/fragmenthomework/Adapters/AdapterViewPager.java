package com.leon.fragmenthomework.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.leon.fragmenthomework.Fragments.FragmentAuto;

import java.util.ArrayList;

public class AdapterViewPager extends FragmentStatePagerAdapter {

    private ArrayList<FragmentAuto> fragmentAutoArrayList;

    public AdapterViewPager(FragmentManager fm, ArrayList<FragmentAuto> fragmentAutoArrayList) {
        super(fm);
        this.fragmentAutoArrayList = fragmentAutoArrayList;
    }

    @Override
    public Fragment getItem(int i) {
        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }
}



