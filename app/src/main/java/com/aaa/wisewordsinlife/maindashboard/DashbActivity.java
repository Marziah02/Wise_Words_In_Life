package com.aaa.wisewordsinlife.maindashboard;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import com.aaa.wisewordsinlife.R;
import com.aaa.wisewordsinlife.attitudeactivites.AttitudeQActivity;
import com.aaa.wisewordsinlife.wiseactivities.MainActivity;

import java.io.File;

public class DashbActivity extends AppCompatActivity {
    CardView wiseW, encourageW, rateMe, followOn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_dashb );
        wiseW = findViewById( R.id.wiseWord );
        encourageW = findViewById( R.id.encourageWords );
        rateMe = findViewById( R.id.rateUs );
        followOn = findViewById( R.id.followUs );
        wiseW.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wiseWordActivity();
            }
        } );

        encourageW.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                attitudeQActivity();
            }
        } );

        rateMe.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    startActivity( new Intent( Intent.ACTION_VIEW,
                            Uri.parse( "market://details?id=" + "com.aaa.wisewordsinlife.maindashboard" )) );
                } catch (ActivityNotFoundException e){
                    startActivity( new Intent( Intent.ACTION_VIEW,
                            Uri.parse( "http://play.google.com/store/apps/details?id=" + getPackageName() )));
                }
            }
        } );

        followOn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent =  new Intent( Intent.ACTION_VIEW, Uri.parse( "https://www.instagram.com/imran_sk_96/" ));
                    startActivity( intent );
                }
            });

}

    private void attitudeQActivity() {
        Intent intent = new Intent( this, AttitudeQActivity.class );
        startActivity( intent );

    }

    private void wiseWordActivity() {
        Intent intent = new Intent( this, MainActivity.class );
        startActivity( intent );

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//menu
        getMenuInflater().inflate( R.menu.pager_menu,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.share){
            Intent intent = new Intent( Intent.ACTION_SEND );
            intent.setType( "*/*" );
            intent.putExtra( Intent.EXTRA_STREAM, Uri.parse( "https://play.google.com/store/apps/details?id=com.whatsapp" ) );
            startActivity( Intent.createChooser( intent, "Share this app via" ) );
        }
        return true;
    }
}
