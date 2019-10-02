package com.aaa.wisewordsinlife.attitudeadapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.aaa.wisewordsinlife.R;

import java.util.ArrayList;
import java.util.List;

public class SecondFullAdapter extends PagerAdapter {
    Context context;
    List<Integer> imgListTwo = new ArrayList<>(  );
    LayoutInflater inflater;

    public SecondFullAdapter(Context context, List<Integer> imgListTwo) {
        this.context = context;
        this.imgListTwo = imgListTwo;
    }

    @Override
    public int getCount() {
        return imgListTwo.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        inflater = (LayoutInflater)context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        View view = inflater.inflate( R.layout.secondimg_layout,null );
        ImageView imageVw = view.findViewById( R.id.imgTwo );
        imageVw.setScaleType( ImageView.ScaleType.FIT_XY );
        imageVw.setImageResource( imgListTwo.get( position ) );
        ViewPager vPagerTwo = (ViewPager) container;
        vPagerTwo.addView( view,0 );
        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        ViewPager viewPager = (ViewPager) container;
        View view = (View) object;
        viewPager.removeView( view );
    }

}
