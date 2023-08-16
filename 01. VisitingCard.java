Visiting card: 

-----------------------------------------------------------------------
XML Code:
-----------------------------------------------------------------------

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:paddingTop="250dp"
    android:background="#C7E6FF"
    android:paddingRight="25dp"
    android:paddingLeft="25dp"
    tools:context=".MainActivity">

    <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="87dp">

        <TextView
            android:id="@+id/textView"
            android:layout_width="276dp"
            android:layout_height="match_parent"
            android:layout_alignParentStart="true"
            android:layout_alignParentTop="true"
            android:layout_alignParentEnd="true"
            android:layout_alignParentBottom="true"
            android:layout_marginStart="113dp"
            android:layout_marginTop="21dp"
            android:layout_marginEnd="-27dp"
            android:layout_marginBottom="1dp"
            android:text="KASHtech"
            android:textAlignment="center"
            android:textSize="30dp" />

        <ImageView
            android:id="@+id/imageView"
            android:layout_width="wrap_content"
            android:layout_height="match_parent"
            android:layout_alignParentStart="true"
            android:layout_alignParentTop="true"
            android:layout_alignParentEnd="true"
            android:layout_alignParentBottom="true"
            android:layout_marginStart="0dp"
            android:layout_marginTop="0dp"
            android:layout_marginEnd="207dp"
            android:layout_marginBottom="0dp"
            app:srcCompat="@drawable/f53045395" />

    </RelativeLayout>

    <View
        android:layout_width="match_parent"
        android:layout_height="5dp"
        android:background="#000000" />

    <TextView
        android:id="@+id/textView2"
        android:layout_width="match_parent"
        android:layout_height="22dp"
        android:text="Dheeraj N Kashyap"
        android:textAlignment="center" />

    <View
        android:layout_width="match_parent"
        android:layout_height="5dp"
        android:background="#000000" />

    <TextView
        android:id="@+id/textView3"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Location: Bengaluru, Karntaka"
        android:textAlignment="center" />

    <TextView
        android:id="@+id/textView4"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:textAlignment="center"
        android:text="Email: dheeraj.nk20@gmail.com" />

    <TextView
        android:id="@+id/textView5"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Ph: +91 8762784593"
        android:textAlignment="center" />

</LinearLayout>


-----------------------------------------------------------------------
Java Code
-----------------------------------------------------------------------

package com.example.visitingcard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
