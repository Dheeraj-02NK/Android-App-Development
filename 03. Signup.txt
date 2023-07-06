Signup & LoginPage

-----------------------------------------------------------------------
XML Code
-----------------------------------------------------------------------

01. activity_main.xml

<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/textView2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="100dp"
        android:text="Login"
        android:textColor="@android:color/background_dark"
        android:textSize="22dp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <TextView
        android:id="@+id/textView3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="30dp"
        android:layout_marginTop="50dp"
        android:text="USERNAME"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView2" />

    <TextView
        android:id="@+id/textView4"
        android:layout_width="82dp"
        android:layout_height="34dp"
        android:layout_marginTop="50dp"
        android:text="PASSWORD"
        app:layout_constraintStart_toStartOf="@+id/textView3"
        app:layout_constraintTop_toBottomOf="@+id/textView3" />

    <EditText
        android:id="@+id/txt_username"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="40dp"
        android:layout_marginEnd="10dp"
        android:ems="10"
        android:inputType="textPersonName"
        app:layout_constraintBottom_toBottomOf="@+id/textView3"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toEndOf="@+id/textView3"
        app:layout_constraintTop_toTopOf="@+id/textView3" />

    <EditText
        android:id="@+id/txt_password"
        android:layout_width="0dp"
        android:layout_height="40dp"
        android:layout_marginTop="26dp"
        android:ems="10"
        android:inputType="textPassword"
        app:layout_constraintEnd_toEndOf="@+id/txt_username"
        app:layout_constraintStart_toStartOf="@+id/txt_username"
        app:layout_constraintTop_toBottomOf="@+id/txt_username" />

    <Button
        android:id="@+id/btn_signup"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="30dp"
        android:text="Login"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/txt_password" />

</androidx.constraintlayout.widget.ConstraintLayout>


02. activity_login.xml

<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".LoginActivity">

    <TextView
        android:id="@+id/textView7"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="50dp"
        android:text="Login"
        android:textSize="22dp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <TextView
        android:id="@+id/textView9"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="30dp"
        android:layout_marginTop="50dp"
        android:text="Username"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView7" />

    <EditText
        android:id="@+id/txt_login_username"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="20dp"
        android:layout_marginEnd="20dp"
        android:ems="10"
        android:inputType="textPersonName"
        app:layout_constraintBottom_toBottomOf="@+id/textView9"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toEndOf="@+id/textView9"
        app:layout_constraintTop_toTopOf="@+id/textView9" />

    <TextView
        android:id="@+id/textView10"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="30dp"
        android:layout_marginTop="50dp"
        android:text="PASSWORD"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView9" />

    <EditText
        android:id="@+id/txt_login_password"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:ems="10"
        android:inputType="textPassword"
        app:layout_constraintEnd_toEndOf="@+id/txt_login_username"
        app:layout_constraintStart_toStartOf="@+id/txt_login_username"
        app:layout_constraintTop_toTopOf="@+id/textView10" />

    <Button
        android:id="@+id/btn_login_signin"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="50dp"
        android:text="Login"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/txt_login_password" />

</androidx.constraintlayout.widget.ConstraintLayout>

-----------------------------------------------------------------------
Java Code
-----------------------------------------------------------------------

01. MainActivity.java

package com.example.signin;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText txtUsername;
    EditText txtPassword;
    Button btnSignup;
    String regularExpression = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!])[A-Zaz\\d@$!]{8,}$";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUsername = (EditText) findViewById(R.id.txt_username);
        txtPassword = (EditText) findViewById(R.id.txt_password);
        btnSignup = (Button)findViewById(R.id.btn_signup);
        btnSignup.setOnClickListener(this);
    }

    public void onClick(View v) {
        String username = txtUsername.getText().toString();
        String password = txtPassword.getText().toString();
        if (validatePassword(password)) {
            Bundle bundle = new Bundle();
            bundle.putString("user", username);
            bundle.putString("Lab@2018", password);
            Intent it = new Intent(this, LoginActivity.class);
            it.putExtra("data", bundle);
            startActivity(it);
        } else {
            Toast.makeText(getBaseContext(), "Invalid Password", Toast.LENGTH_LONG).show();
        }
    }
    public boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile(regularExpression);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}

02. LoginActivity.java

package com.example.signin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    EditText txtLoginUsername;
    EditText txtLoginPassword;
    Button btnLogin;
    String user,pass;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        txtLoginUsername=(EditText)
                findViewById(R.id.txt_login_username);
        txtLoginPassword=(EditText)
                findViewById(R.id.txt_login_password);
        btnLogin=(Button)findViewById(R.id.btn_login_signin);
        btnLogin.setOnClickListener(this);
        Bundle bundle=getIntent().getBundleExtra("data");
        user=bundle.getString("user"); pass=bundle.getString("Lab@2018");
    }
    public void onClick(View v)
    {
        String user1=txtLoginUsername.getText().toString(); String
            pass1=txtLoginPassword.getText().toString();
        if(user.equals(user1)&&pass.equals(pass1))
        {
            Toast.makeText(this,"Login Successful",Toast.LENGTH_LONG).show();
        }
        else
        {
            count++;
            if(count==3)
            {
                btnLogin.setEnabled(false);
                Toast.makeText(this,
                        "Failed Login Attempts"
                        ,Toast.LENGTH_LONG).show();
            }
            else
            {
                Toast.makeText(this,"Login Failed "+count
                        ,Toast.LENGTH_LONG).show();
            }
        }
    }
}
