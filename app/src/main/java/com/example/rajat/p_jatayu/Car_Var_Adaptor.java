package com.example.rajat.p_jatayu;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.ImageView;

/**
 * Created by JATIN on 16-12-2016.
 */
public class Car_Var_Adaptor extends FragmentPagerAdapter {


    private int var_car1[]=
            {
              R.drawable.tesla2,R.drawable.tesla3,R.drawable.tesla4,R.drawable.tesla5
            };

    public Car_Var_Adaptor(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:

        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
