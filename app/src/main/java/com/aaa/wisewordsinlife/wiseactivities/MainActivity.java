package com.aaa.wisewordsinlife.wiseactivities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.aaa.wisewordsinlife.wiseadapter.ImageAdapter;
import com.aaa.wisewordsinlife.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

     RecyclerView recyclerView;
     GridLayoutManager gridLayoutManager;
     List<Integer> imgList = new ArrayList<>(  );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        initialize();

    }

    private void initialize() {
        recyclerView = findViewById( R.id.recycleVW );
        recyclerView.setHasFixedSize( true );
        gridLayoutManager = new GridLayoutManager( this,4 );
        recyclerView.setLayoutManager( gridLayoutManager );
        imgList.add( R.drawable.wise1 );
        imgList.add( R.drawable.wise2 );
        imgList.add( R.drawable.wise3 );
        imgList.add( R.drawable.wise4 );
        imgList.add( R.drawable.wise5 );
        imgList.add( R.drawable.wise6 );
        imgList.add( R.drawable.wise7 );
        imgList.add( R.drawable.wise8 );
        imgList.add( R.drawable.wise9 );
        imgList.add( R.drawable.wise10 );
        imgList.add( R.drawable.wise11 );
        imgList.add( R.drawable.wise12 );
        imgList.add( R.drawable.wise13 );
        imgList.add( R.drawable.wise14 );
        imgList.add( R.drawable.wise15 );
        imgList.add( R.drawable.wise16 );
        imgList.add( R.drawable.wise17 );
        imgList.add( R.drawable.wise18 );
        imgList.add( R.drawable.wise19 );
        imgList.add( R.drawable.wise20 );
        imgList.add( R.drawable.wise21 );
        imgList.add( R.drawable.wise22 );
        imgList.add( R.drawable.wise23 );
        imgList.add( R.drawable.wise24 );
        imgList.add( R.drawable.wise25 );
        imgList.add( R.drawable.wise26 );
        imgList.add( R.drawable.wise27 );
        imgList.add( R.drawable.wise28 );
        imgList.add( R.drawable.wise29 );
        imgList.add( R.drawable.wise30 );
        imgList.add( R.drawable.wise31 );
        imgList.add( R.drawable.wise32 );
        imgList.add( R.drawable.wise33 );
        imgList.add( R.drawable.wise34 );
        imgList.add( R.drawable.wise35 );
        imgList.add( R.drawable.wise36 );
        imgList.add( R.drawable.wise37 );
        imgList.add( R.drawable.wise38 );
        imgList.add( R.drawable.wise39 );
        imgList.add( R.drawable.wise40 );
        imgList.add( R.drawable.wise41 );
        imgList.add( R.drawable.wise42 );
        imgList.add( R.drawable.wise43 );
        imgList.add( R.drawable.wise44 );
        imgList.add( R.drawable.wise45 );
        imgList.add( R.drawable.wise46 );
        imgList.add( R.drawable.wise47 );
        imgList.add( R.drawable.wise48 );
        imgList.add( R.drawable.wise49 );
        imgList.add( R.drawable.wise50 );
        imgList.add( R.drawable.wise51 );
        imgList.add( R.drawable.wise52 );
        imgList.add( R.drawable.wise54 );
        imgList.add( R.drawable.wise55 );
        imgList.add( R.drawable.wise56 );
        imgList.add( R.drawable.wise57 );
        imgList.add( R.drawable.wise58 );
        imgList.add( R.drawable.wise59 );
        imgList.add( R.drawable.wise60 );
        imgList.add( R.drawable.wise61 );
        imgList.add( R.drawable.wise62 );
        imgList.add( R.drawable.wise63 );
        imgList.add( R.drawable.wise64 );
        imgList.add( R.drawable.wise65 );
        imgList.add( R.drawable.wise66 );
        imgList.add( R.drawable.wise67 );
        imgList.add( R.drawable.wise68 );
        imgList.add( R.drawable.wise69 );
        imgList.add( R.drawable.wise70 );
        imgList.add( R.drawable.wise71 );
        imgList.add( R.drawable.wise72 );
        imgList.add( R.drawable.wise73 );
        imgList.add( R.drawable.wise74 );
        imgList.add( R.drawable.wise75 );
        imgList.add( R.drawable.wise76 );
        imgList.add( R.drawable.wise77 );
        imgList.add( R.drawable.wise78 );
        imgList.add( R.drawable.wise79 );
        imgList.add( R.drawable.wise80 );
        imgList.add( R.drawable.wise81 );
        imgList.add( R.drawable.wise82 );
        imgList.add( R.drawable.wise83 );
        imgList.add( R.drawable.wise84 );
        imgList.add( R.drawable.wise85 );
        imgList.add( R.drawable.wise86 );
        imgList.add( R.drawable.wise87 );
        imgList.add( R.drawable.wise88 );
        imgList.add( R.drawable.wise89 );
        imgList.add( R.drawable.wise90 );
        imgList.add( R.drawable.wise91 );
        imgList.add( R.drawable.wise92 );
        imgList.add( R.drawable.wise93 );
        imgList.add( R.drawable.wise94 );
        imgList.add( R.drawable.wise95 );
        imgList.add( R.drawable.wise96 );
        imgList.add( R.drawable.wise97 );
        imgList.add( R.drawable.wise98 );
        imgList.add( R.drawable.wise99 );
        imgList.add( R.drawable.wise100 );
        imgList.add( R.drawable.wise102 );
        imgList.add( R.drawable.wise104 );
        imgList.add( R.drawable.wise105 );
        imgList.add( R.drawable.wise106 );
        imgList.add( R.drawable.wise107 );
        imgList.add( R.drawable.wise108 );
        recyclerView.setAdapter( new ImageAdapter(imgList)  );
        getSupportActionBar().setTitle( "Wise old sayings" );
        getSupportActionBar().setDisplayHomeAsUpEnabled( true );






    }
}
