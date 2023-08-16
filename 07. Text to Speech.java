Text-to-Speech

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
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="50dp"
        android:layout_marginTop="80dp"
        android:text="Enter Text to Speak"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <EditText
        android:id="@+id/editText"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="40dp"
        android:ems="10"
        android:inputType="textPersonName"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.331"
        app:layout_constraintStart_toStartOf="@+id/textView"
        app:layout_constraintTop_toBottomOf="@+id/textView"
        app:layout_constraintVertical_bias="0.0" />

    <Button
        android:id="@+id/btn_speak"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="52dp"
        android:text="Speak"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/editText" />

</androidx.constraintlayout.widget.ConstraintLayout>

-----------------------------------------------------------------------
Java Code
-----------------------------------------------------------------------

package com.example.text_to_speech;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Locale;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

        TextToSpeech textToSpeech;
        Button btnSpeak;
        EditText txtSpeak;



        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                txtSpeak=(EditText)findViewById(R.id.editText);
                btnSpeak=(Button)findViewById(R.id.btn_speak);
                btnSpeak.setOnClickListener(this);textToSpeech=new
                TextToSpeech(getBaseContext(), new
                TextToSpeech.OnInitListener() {
        @Override
                public void onInit(int status) {
                        if(status!=TextToSpeech.ERROR)
                        {
                                Toast.makeText(getBaseContext(),"Success",Toast.LENGTH_LONG).show();
                        }
                }
        });
        textToSpeech.setLanguage(Locale.UK);
        }
public void onClick(View v)
        {
        String text=txtSpeak.getText().toString();
        textToSpeech.speak(text,TextToSpeech.QUEUE_FLUSH,null);
        }
}
