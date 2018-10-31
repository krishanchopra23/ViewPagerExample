package edu.osucascades.choprakrishanviewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewPager = (ViewPager) findViewById(R.id.view_pager_id);
        FragmentManager fragmentManager = getSupportFragmentManager();

        mViewPager.setAdapter(new FragmentStatePagerAdapter(fragmentManager) {
            @Override
            public Fragment getItem(int position) {
                switch (position) {
                    case 0:
                        Fragment1 fragment1 = new Fragment1();
                        return fragment1;
                    case 1:
                        Fragment2 fragment2 = new Fragment2();
                        return fragment2;
                    case 2:
                        Fragment3 fragment3 = new Fragment3();
                        return fragment3;
                }
                return null;
            }

            @Override
            public int getCount() {
                return 3;
            }
        });

    }
}
