Phone Number

-----------------------------------------------------------------------
XML Code
-----------------------------------------------------------------------

<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:background="#FFFFFF"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="100dp"
        android:textAlignment="center"
        android:text="PHONE DAILER"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <EditText
        android:id="@+id/txt_phonenumber"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="20dp"
        android:layout_marginTop="30dp"
        android:ems="10"
        android:inputType="textPersonName"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView" />

    <Button
        android:id="@+id/btn_delete"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="36dp"
        android:layout_marginTop="28dp"
        android:text="Delete"
        app:layout_constraintStart_toEndOf="@+id/txt_phonenumber"
        app:layout_constraintTop_toBottomOf="@+id/textView" />

    <Button
        android:id="@+id/btn_one"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="20dp"
        android:layout_marginTop="30dp"
        android:text="1"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/txt_phonenumber" />

    <Button
        android:id="@+id/btn_two"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="30dp"
        android:text="2"
        app:layout_constraintEnd_toStartOf="@+id/btn_three"
        app:layout_constraintStart_toEndOf="@+id/btn_one"
        app:layout_constraintTop_toBottomOf="@+id/txt_phonenumber" />

    <Button
        android:id="@+id/btn_three"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="30dp"
        android:layout_marginEnd="20dp"
        android:text="3"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/txt_phonenumber" />

    <Button
        android:id="@+id/btn_four"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="20dp"
        android:layout_marginTop="30dp"
        android:text="4"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/btn_one" />

    <Button
        android:id="@+id/btn_five"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="30dp"
        android:text="5"
        app:layout_constraintEnd_toStartOf="@+id/btn_six"
        app:layout_constraintStart_toEndOf="@+id/btn_four"
        app:layout_constraintTop_toBottomOf="@+id/btn_two" />

    <Button
        android:id="@+id/btn_six"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="30dp"
        android:layout_marginEnd="20dp"
        android:text="6"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/btn_three" />

    <Button
        android:id="@+id/btn_seven"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="20dp"
        android:layout_marginTop="30dp"
        android:text="7"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/btn_four" />


    <Button
        android:id="@+id/btn_eight"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="28dp"
        android:layout_marginEnd="20dp"
        android:text="8"
        app:layout_constraintEnd_toStartOf="@id/btn_nine"
        app:layout_constraintHorizontal_bias="0.666"
        app:layout_constraintStart_toEndOf="@+id/btn_seven"
        app:layout_constraintTop_toBottomOf="@+id/btn_five" />

    <Button
        android:id="@+id/btn_nine"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="30dp"
        android:layout_marginEnd="20dp"
        android:text="9"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/btn_six" />

    <Button
        android:id="@+id/btn_zero"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="32dp"
        android:text="0"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.513"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/btn_eight" />

    <Button
        android:id="@+id/btn_call"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="20dp"
        android:layout_marginTop="30dp"
        android:text="Call"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/btn_zero" />

    <Button
        android:id="@+id/btn_start"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="20dp"
        android:layout_marginTop="30dp"
        android:text="*"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/btn_seven" />

    <Button
        android:id="@+id/btn_save"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="30dp"
        android:layout_marginEnd="20dp"
        android:text="Save"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/btn_zero" />

    <Button
        android:id="@+id/btn_hash"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="30dp"
        android:layout_marginEnd="20dp"
        android:text="#"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/btn_nine" />

</androidx.constraintlayout.widget.ConstraintLayout>

-----------------------------------------------------------------------
Java Code
-----------------------------------------------------------------------

package com.example.phone;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnOne,btnTwo,btnThree,btnFour,btnFive;
    Button btnSix,btnSeven,btnEight,btnNine,btnZero;
    Button btnDel,btnStar,btnHash,btnCall,btnSave;
    EditText txtPhonenumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOne=(Button)findViewById(R.id.btn_one);
        btnOne.setOnClickListener(this);

        btnTwo=(Button)findViewById(R.id.btn_two);
        btnTwo.setOnClickListener(this);

        btnThree=(Button)findViewById(R.id.btn_three);
        btnThree.setOnClickListener(this);

        btnFour=(Button)findViewById(R.id.btn_four);
        btnFour.setOnClickListener(this);

        btnFive=(Button)findViewById(R.id.btn_five);
        btnFive.setOnClickListener(this);

        btnSix=(Button)findViewById(R.id.btn_six);
        btnSix.setOnClickListener(this);

        btnSeven=(Button)findViewById(R.id.btn_seven);
        btnSeven.setOnClickListener(this);

        btnEight=(Button)findViewById(R.id.btn_eight);
        btnEight.setOnClickListener(this);

        btnNine=(Button)findViewById(R.id.btn_nine);
        btnNine.setOnClickListener(this);

        btnZero=(Button)findViewById(R.id.btn_zero);
        btnZero.setOnClickListener(this);

        btnStar=(Button)findViewById(R.id.btn_start);
        btnStar.setOnClickListener(this);

        btnHash=(Button)findViewById(R.id.btn_hash);
        btnHash.setOnClickListener(this);

        btnCall=(Button)findViewById(R.id.btn_call);
        btnCall.setOnClickListener(this);

        btnSave=(Button)findViewById(R.id.btn_save);
        btnSave.setOnClickListener(this);

        btnDel=(Button)findViewById(R.id.btn_delete);
        btnDel.setOnClickListener(this);

        txtPhonenumber=(EditText)findViewById(R.id.txt_phonenumber);

        txtPhonenumber.setText("");
    }

    public void onClick(View v)
    {
        if(v.equals(btnOne))
            txtPhonenumber.append("1");
        else if(v.equals(btnTwo))
            txtPhonenumber.append("2");
        else if(v.equals(btnThree))
            txtPhonenumber.append("3");
        else if(v.equals(btnFour))
            txtPhonenumber.append("4");
        else if(v.equals(btnFive))
            txtPhonenumber.append("5");
        else if(v.equals(btnSix))
            txtPhonenumber.append("6");
        else if(v.equals(btnSeven))
            txtPhonenumber.append("7");
        else if(v.equals(btnEight))
            txtPhonenumber.append("8");
        else if(v.equals(btnNine))
            txtPhonenumber.append("9");
        else if(v.equals(btnZero))
            txtPhonenumber.append("0");
        else if(v.equals(btnStar))
            txtPhonenumber.append("*");
        else if(v.equals(btnHash))
            txtPhonenumber.append("#");
        else if(v.equals(btnSave))
        {
            Intent contactIntent= new Intent(ContactsContract.Intents.Insert.ACTION);
            contactIntent.setType(ContactsContract.RawContacts.CONTENT_TYPE);
            contactIntent.putExtra(ContactsContract.Intents.Insert.NAME,"Unknown");
            contactIntent.putExtra(ContactsContract.Intents.Insert.PHONE, txtPhonenumber.getText().toString());
            startActivity(contactIntent);
        }
        else if(v.equals(btnDel)) {
            String data = txtPhonenumber.getText().toString();
            if (data.length() > 0) {
                txtPhonenumber.setText(data.substring(0, data.length() - 1));
            } else {
                txtPhonenumber.setText("");
            }
        }
        btnCall.setOnClickListener(new View.OnClickListener()
                                   {
                                       @Override
                                       public void onClick(View v) {
                                               String data = txtPhonenumber.getText().toString(); Intent
                                                       intent=new Intent(Intent.ACTION_DIAL);
                                               intent.setData(Uri.parse("tel:"+ data)); startActivity(intent);
                                           }
                                   }
        );
    }
}
