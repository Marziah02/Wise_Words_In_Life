package com.aaa.wisewordsinlife.wiseadapter;

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

public class FullImageAdapter extends PagerAdapter {

    Context c;
    List<Integer> imgList = new ArrayList<>(  );
    LayoutInflater inflater;

    public FullImageAdapter(Context c, List<Integer> imgList) {
        this.c = c;
        this.imgList = imgList;
    }

    @Override
    public int getCount() {
        return imgList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        inflater = (LayoutInflater)c.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        View view = inflater.inflate( R.layout.img_layout,null );
        ImageView imageVw = view.findViewById( R.id.imgI );
        imageVw.setScaleType( ImageView.ScaleType.FIT_XY );
        imageVw.setImageResource( imgList.get( position ) );
        ViewPager vPager = (ViewPager) container;
        vPager.addView( view,0 );
        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        ViewPager viewPager = (ViewPager) container;
        View view = (View) object;
        viewPager.removeView( view );
    }
}
