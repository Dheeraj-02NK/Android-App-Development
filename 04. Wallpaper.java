Wallpaper

-----------------------------------------------------------------------
XML Code
-----------------------------------------------------------------------

<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <TextView
        android:layout_width="240dp"
        android:layout_height="wrap_content"
        android:layout_alignParentStart="true"
        android:layout_alignParentTop="true"
        android:layout_alignParentEnd="true"
        android:layout_alignParentBottom="true"
        android:layout_marginStart="60dp"
        android:layout_marginTop="190dp"
        android:layout_marginEnd="60dp"
        android:layout_marginBottom="497dp"
        android:text="Click here to change"
        android:textAlignment="center"
        android:textSize="20dp" />

    <Button
        android:id="@+id/btn_start_change_wallpaper"
        android:layout_width="wrap_content"
        android:layout_height="46dp"
        android:layout_alignParentStart="true"
        android:layout_alignParentTop="true"
        android:layout_alignParentEnd="true"
        android:layout_alignParentBottom="true"
        android:layout_marginStart="110dp"
        android:layout_marginTop="348dp"
        android:layout_marginEnd="110dp"
        android:layout_marginBottom="337dp"
        android:text="Click" />

</RelativeLayout>

-----------------------------------------------------------------------
Java Code
-----------------------------------------------------------------------

package com.example.wallpaper;

import androidx.appcompat.app.AppCompatActivity;

import android.app.WallpaperManager;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnChangeWallpaper;
    boolean running;
    int[] imagesArray=new int[] {

            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img3,
            R.drawable.img4,
            R.drawable.img5,
            R.drawable.img6,
            R.drawable.img7,
            R.drawable.img8,

    };

    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnChangeWallpaper = (Button)
                findViewById(R.id.btn_start_change_wallpaper);
        btnChangeWallpaper.setOnClickListener(this);
    }

    public void onClick(View v)
    {
        if(!running)
        {
            new Timer().schedule(new MyTimer(),0,100);
            running=true;
        }
    }
    class MyTimer extends TimerTask
    {
        public void run()
        {
            try {
                WallpaperManager wallpaperManager = WallpaperManager.getInstance(getBaseContext());

                if(i==8)
                    i=1;

                if(i==7)
                    i=2;

                if(i==6)
                    i=3;

                if(i==5)
                    i=4;

                if(i==4)
                    i=5;

                if(i==3)
                    i=6;

                wallpaperManager.setBitmap(BitmapFactory.decodeResource(getResources(),imagesArray[i]));
                i++;
            }
            catch (Exception e)
            {

            }
        }
    }
}
