Counter App

-----------------------------------------------------------------------
XML Code
-----------------------------------------------------------------------

<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:id="@+id/textView"
        android:layout_marginTop="100dp"
        android:text="Counter App"
        android:textSize="36sp"
        android:textStyle="bold"
        android:textColor="@color/black"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        />

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:id="@+id/lbl_text"
        android:layout_marginTop="30dp"
        android:text="Counter Value"
        android:textColor="#020202"
        android:textSize="30sp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@id/textView"
        />

    <Button
        android:id="@+id/btn_Start"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="50dp"
        android:text="Start"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.498"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@id/lbl_text" />

    <Button
        android:id="@+id/btn_Stop"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="50dp"
        android:text="Stop"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@id/btn_Start"
        />

</androidx.constraintlayout.widget.ConstraintLayout>

-----------------------------------------------------------------------
Java Code
-----------------------------------------------------------------------

package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView lblCouter;
    Button btnStart,btnStop;

    int counter=0;
    boolean running=false;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lblCouter = (TextView) findViewById(R.id.lbl_text);
        btnStart = (Button) findViewById(R.id.btn_Start);
        btnStop = (Button) findViewById(R.id.btn_Stop);
        btnStart.setOnClickListener(this);
        btnStop.setOnClickListener(this);
    }

    public void onClick(View v)
    {
        if(v.equals(btnStart))
        {
            counter=0;
            running=true;
            new MyCounter().start();
        }
        else if (v.equals(btnStop))
        {
            running=false;
        }
    }
    @SuppressLint("HandlerLeak")
    Handler handler = new Handler()
    {
        public void handleMessage(Message m)
        {
            lblCouter.setText(String.valueOf(m.what));
        }
    };

    class MyCounter extends Thread{
        public void run(){
            while(running)
            {
                counter++;
                handler.sendEmptyMessage(counter);

                try{
                    Thread.sleep(1000);
                }
                catch (Exception e) { }
            }
        }
    }


}
