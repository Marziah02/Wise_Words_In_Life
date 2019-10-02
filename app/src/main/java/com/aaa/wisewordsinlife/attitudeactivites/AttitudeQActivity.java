package com.aaa.wisewordsinlife.attitudeactivites;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.aaa.wisewordsinlife.R;
import com.aaa.wisewordsinlife.attitudeadapter.AttitudeImgAdapter;

import java.util.ArrayList;
import java.util.List;

public class AttitudeQActivity extends AppCompatActivity {

    RecyclerView recyclerViewT;
    GridLayoutManager gridLayoutManagerT;
    List<Integer> imgListTwo = new ArrayList<>(  );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_attitude_q );
        initialize();
    }

    private void initialize() {
        recyclerViewT = findViewById( R.id.recycleVWT );
        recyclerViewT.setHasFixedSize( true );
        gridLayoutManagerT = new GridLayoutManager( this,4 );
        recyclerViewT.setLayoutManager( gridLayoutManagerT );
        //image list
        imgListTwo.add( R.drawable.a1 );
        imgListTwo.add( R.drawable.a2 );
        imgListTwo.add( R.drawable.a3 );
        imgListTwo.add( R.drawable.a4 );
        imgListTwo.add( R.drawable.a5 );
        imgListTwo.add( R.drawable.a6 );
        imgListTwo.add( R.drawable.a7 );
        imgListTwo.add( R.drawable.a8 );
        imgListTwo.add( R.drawable.a9 );
        imgListTwo.add( R.drawable.a10 );
        imgListTwo.add( R.drawable.a11 );
        imgListTwo.add( R.drawable.a12 );
        imgListTwo.add( R.drawable.a13 );
        imgListTwo.add( R.drawable.a14 );
        imgListTwo.add( R.drawable.a15 );
        imgListTwo.add( R.drawable.a16 );
        imgListTwo.add( R.drawable.a17 );
        imgListTwo.add( R.drawable.a18 );
        imgListTwo.add( R.drawable.a19 );
        imgListTwo.add( R.drawable.a20 );
        imgListTwo.add( R.drawable.a21 );
        imgListTwo.add( R.drawable.a22 );
        imgListTwo.add( R.drawable.a23 );
        imgListTwo.add( R.drawable.a24 );
        imgListTwo.add( R.drawable.a25 );
        imgListTwo.add( R.drawable.a26 );
        imgListTwo.add( R.drawable.a27 );
        imgListTwo.add( R.drawable.a28 );
        imgListTwo.add( R.drawable.a29 );
        imgListTwo.add( R.drawable.a30 );
        imgListTwo.add( R.drawable.a31 );
        imgListTwo.add( R.drawable.a32 );
        imgListTwo.add( R.drawable.a33 );
        imgListTwo.add( R.drawable.a34 );
        imgListTwo.add( R.drawable.a35 );
        imgListTwo.add( R.drawable.a36 );
        imgListTwo.add( R.drawable.a37 );
        imgListTwo.add( R.drawable.a38 );
        imgListTwo.add( R.drawable.a39 );
        imgListTwo.add( R.drawable.a40 );
        imgListTwo.add( R.drawable.a41 );
        imgListTwo.add( R.drawable.a42 );
        imgListTwo.add( R.drawable.a43 );
        imgListTwo.add( R.drawable.a44 );
        imgListTwo.add( R.drawable.a45 );
        imgListTwo.add( R.drawable.a46 );
        imgListTwo.add( R.drawable.a47 );
        imgListTwo.add( R.drawable.a48 );
        imgListTwo.add( R.drawable.a49 );
        imgListTwo.add( R.drawable.a50 );
        imgListTwo.add( R.drawable.a51 );
        imgListTwo.add( R.drawable.a52 );
        imgListTwo.add( R.drawable.a53 );
        imgListTwo.add( R.drawable.a54 );
        imgListTwo.add( R.drawable.a55 );
        imgListTwo.add( R.drawable.a56 );
        imgListTwo.add( R.drawable.a57 );
        imgListTwo.add( R.drawable.a58 );
        imgListTwo.add( R.drawable.a59 );
        imgListTwo.add( R.drawable.a60 );
        imgListTwo.add( R.drawable.a61 );
        imgListTwo.add( R.drawable.a62 );
        imgListTwo.add( R.drawable.a63 );
        imgListTwo.add( R.drawable.a64 );
        imgListTwo.add( R.drawable.a65 );
        imgListTwo.add( R.drawable.a66 );
        imgListTwo.add( R.drawable.a67 );
        imgListTwo.add( R.drawable.a68 );
        imgListTwo.add( R.drawable.a69 );
        imgListTwo.add( R.drawable.a70 );
        imgListTwo.add( R.drawable.a71 );
        imgListTwo.add( R.drawable.a72 );
        imgListTwo.add( R.drawable.a73 );
        imgListTwo.add( R.drawable.a74 );
        imgListTwo.add( R.drawable.a75 );
        imgListTwo.add( R.drawable.a76 );
        imgListTwo.add( R.drawable.a77 );
        imgListTwo.add( R.drawable.a78 );
        imgListTwo.add( R.drawable.a79 );
        imgListTwo.add( R.drawable.a80 );
        imgListTwo.add( R.drawable.a91 );
        imgListTwo.add( R.drawable.a92 );
        imgListTwo.add( R.drawable.a93 );
        imgListTwo.add( R.drawable.a94 );
        imgListTwo.add( R.drawable.a95 );
        imgListTwo.add( R.drawable.a96 );
        imgListTwo.add( R.drawable.a97 );
        imgListTwo.add( R.drawable.a98 );
        imgListTwo.add( R.drawable.a99 );
        imgListTwo.add( R.drawable.a100 );
        imgListTwo.add( R.drawable.a101 );
        imgListTwo.add( R.drawable.a102 );
        imgListTwo.add( R.drawable.a103 );
        imgListTwo.add( R.drawable.a104 );
        imgListTwo.add( R.drawable.a105 );
        imgListTwo.add( R.drawable.a106 );
        imgListTwo.add( R.drawable.a107 );
        imgListTwo.add( R.drawable.a108 );
        imgListTwo.add( R.drawable.a109 );
        imgListTwo.add( R.drawable.a110 );
        imgListTwo.add( R.drawable.a111 );
        imgListTwo.add( R.drawable.a112 );
        imgListTwo.add( R.drawable.a113 );
        imgListTwo.add( R.drawable.a114 );
        imgListTwo.add( R.drawable.a115 );
        imgListTwo.add( R.drawable.a116 );
        imgListTwo.add( R.drawable.a117 );
        imgListTwo.add( R.drawable.a118 );
        imgListTwo.add( R.drawable.a119 );
        imgListTwo.add( R.drawable.a120 );
        imgListTwo.add( R.drawable.a121 );
        imgListTwo.add( R.drawable.a122 );
        imgListTwo.add( R.drawable.a123 );
        imgListTwo.add( R.drawable.a124 );
        imgListTwo.add( R.drawable.a125 );
        imgListTwo.add( R.drawable.a126 );
        imgListTwo.add( R.drawable.a127 );
        imgListTwo.add( R.drawable.a128 );
        imgListTwo.add( R.drawable.a129 );
        imgListTwo.add( R.drawable.a130 );
        imgListTwo.add( R.drawable.a131 );
        imgListTwo.add( R.drawable.a132 );
        imgListTwo.add( R.drawable.a133 );
        imgListTwo.add( R.drawable.a134 );
        imgListTwo.add( R.drawable.a135 );
        imgListTwo.add( R.drawable.a136 );
        imgListTwo.add( R.drawable.a137 );
        imgListTwo.add( R.drawable.a138 );
        imgListTwo.add( R.drawable.a139 );
        imgListTwo.add( R.drawable.a140 );
        imgListTwo.add( R.drawable.a141 );
        imgListTwo.add( R.drawable.a143 );
        imgListTwo.add( R.drawable.a144 );
        imgListTwo.add( R.drawable.a145 );
        imgListTwo.add( R.drawable.a146 );
        imgListTwo.add( R.drawable.a147 );
        imgListTwo.add( R.drawable.a148 );
        imgListTwo.add( R.drawable.a149 );
        imgListTwo.add( R.drawable.a150 );
        imgListTwo.add( R.drawable.a151 );
        //image list
        recyclerViewT.setAdapter( new AttitudeImgAdapter( imgListTwo ) );
        getSupportActionBar().setTitle( "Encouraging sayings" );
        getSupportActionBar().setDisplayHomeAsUpEnabled( true );




    }
}
