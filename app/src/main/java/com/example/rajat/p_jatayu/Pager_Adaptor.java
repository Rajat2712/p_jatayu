package com.example.rajat.p_jatayu;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by JATIN on 15-12-2016.
 */
public class Pager_Adaptor  extends FragmentPagerAdapter{

    public Pager_Adaptor(FragmentManager fm) {
        super(fm);
    }

    private String title[]=
    {
      "JT MIL1","JT ETV","CAV"
    };

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                Car1 car1 =new Car1();
                return car1;
            case 1:
                Car2 car2= new Car2();
                return car2;
            case 2:
                Car3 car3= new Car3();
                return car3;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }
}
