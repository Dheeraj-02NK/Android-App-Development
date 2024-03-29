Simple Calculator

-----------------------------------------------------------------------
XML Code
-----------------------------------------------------------------------

<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#FFFFFF"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/textView"
        android:layout_width="266dp"
        android:layout_height="35dp"
        android:text="SIMPLE CALCULATOR"
        android:textAlignment="center"
        android:textAllCaps="true"
        android:textColor="#050505"
        android:textSize="16sp"
        android:textStyle="bold"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.496"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.067" />

    <TextView
        android:id="@+id/textView2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="RESULT"
        android:textAlignment="center"
        android:textAllCaps="true"
        android:textColor="#0B0A0A"
        android:textSize="14sp"
        android:textStyle="bold"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.182"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.168" />

    <EditText
        android:id="@+id/result"
        android:layout_width="279dp"
        android:layout_height="48dp"
        android:ems="10"
        android:inputType="textPersonName"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.245" />

    <Button
        android:id="@+id/button1"
        android:layout_width="81dp"
        android:layout_height="52dp"
        android:text="1"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.048"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.378" />

    <Button
        android:id="@+id/btnclr"
        android:layout_width="81dp"
        android:layout_height="52dp"
        android:text="C"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.945"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.773" />

    <Button
        android:id="@+id/btnadd"
        android:layout_width="81dp"
        android:layout_height="52dp"
        android:text="+"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.945"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.667" />

    <Button
        android:id="@+id/eq"
        android:layout_width="81dp"
        android:layout_height="52dp"
        android:text="="
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.6"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.667" />

    <Button
        android:id="@+id/button0"
        android:layout_width="81dp"
        android:layout_height="52dp"
        android:text="0"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.327"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.667" />

    <Button
        android:id="@+id/btndot"
        android:layout_width="81dp"
        android:layout_height="52dp"
        android:text="."
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.048"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.667" />

    <Button
        android:id="@+id/btnsub"
        android:layout_width="81dp"
        android:layout_height="52dp"
        android:text="-"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.945"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.572" />

    <Button
        android:id="@+id/button9"
        android:layout_width="81dp"
        android:layout_height="52dp"
        android:text="9"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.6"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.572" />

    <Button
        android:id="@+id/button8"
        android:layout_width="81dp"
        android:layout_height="52dp"
        android:text="8"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.327"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.572" />

    <Button
        android:id="@+id/button7"
        android:layout_width="81dp"
        android:layout_height="52dp"
        android:text="7"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.048"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.572" />

    <Button
        android:id="@+id/btnmul"
        android:layout_width="81dp"
        android:layout_height="52dp"
        android:text="*"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.945"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.475" />

    <Button
        android:id="@+id/button6"
        android:layout_width="81dp"
        android:layout_height="52dp"
        android:text="6"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.6"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.475" />

    <Button
        android:id="@+id/button5"
        android:layout_width="81dp"
        android:layout_height="52dp"
        android:text="5"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.327"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.475" />

    <Button
        android:id="@+id/button4"
        android:layout_width="81dp"
        android:layout_height="52dp"
        android:text="4"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.048"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.475" />

    <Button
        android:id="@+id/btndiv"
        android:layout_width="81dp"
        android:layout_height="52dp"
        android:text="/"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.945"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.378" />

    <Button
        android:id="@+id/button3"
        android:layout_width="81dp"
        android:layout_height="52dp"
        android:text="3"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.6"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.378" />

    <Button
        android:id="@+id/button2"
        android:layout_width="81dp"
        android:layout_height="52dp"
        android:text="2"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.327"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.378" />
</androidx.constraintlayout.widget.ConstraintLayout>


-----------------------------------------------------------------------
Java Code
-----------------------------------------------------------------------

package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button0;
    Button btnadd, btnsub, btnmul, btndiv;
    Button btndot, btnclr, eq;
    EditText result;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=(Button)findViewById(R.id.button1);
        button1.setOnClickListener(this);

        button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(this);

        button3=(Button)findViewById(R.id.button3);
        button3.setOnClickListener(this);

        button4=(Button)findViewById(R.id.button4);
        button4.setOnClickListener(this);

        button5=(Button)findViewById(R.id.button5);
        button5.setOnClickListener(this);

        button6=(Button)findViewById(R.id.button6);
        button6.setOnClickListener(this);

        button7=(Button)findViewById(R.id.button7);
        button7.setOnClickListener(this);

        button8=(Button)findViewById(R.id.button8);
        button8.setOnClickListener(this);

        button9=(Button)findViewById(R.id.button9);
        button9.setOnClickListener(this);

        button0=(Button)findViewById(R.id.button0);
        button0.setOnClickListener(this);

        btnadd=(Button)findViewById(R.id.btnadd);
        btnadd.setOnClickListener(this);

        btnsub=(Button)findViewById(R.id.btnsub);
        btnsub.setOnClickListener(this);

        btnmul=(Button)findViewById(R.id.btnmul);
        btnmul.setOnClickListener(this);

        btndiv=(Button)findViewById(R.id.btndiv);
        btndiv.setOnClickListener(this);

        btndot=(Button)findViewById(R.id.btndot);
        btndot.setOnClickListener(this);

        btnclr=(Button)findViewById(R.id.btnclr);
        btnclr.setOnClickListener(this);

        eq=(Button)findViewById(R.id.eq);
        eq.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v.equals(button1))
            result.append("1");
        if(v.equals(button2))
            result.append("2");
        if(v.equals(button3))
            result.append("3");
        if(v.equals(button4))
            result.append("4");
        if(v.equals(button5))
            result.append("5");
        if(v.equals(button6))
            result.append("6");
        if(v.equals(button7))
            result.append("7");
        if(v.equals(button8))
            result.append("8");
        if(v.equals(button9))
            result.append("9");
        if(v.equals(button0))
            result.append("0");
        if(v.equals(btndot))
            result.append(".");
        if(v.equals(btnclr))
            result.append("");
        if(v.equals(btnadd))
            result.append("+");
        if(v.equals(btnsub))
            result.append("-");
        if(v.equals(btnmul))
            result.append("*");
        if(v.equals(btndiv))
            result.append("/");

        if (v.equals(eq)) {
            try {
                String data = result.getText().toString();
                if (data.contains("*")) {

                    String[] operands = data.split(Pattern.quote("*"));
                    if (operands.length == 2) {
                        double operand1 = Double.parseDouble(operands[0]);
                        double operand2 = Double.parseDouble(operands[1]);
                        double res = operand1 * operand2;
                        result.setText(String.valueOf(res));
                    }
                } else {
                    Toast.makeText(getBaseContext(), "invalid input", Toast.LENGTH_SHORT).show();
                }
                if (data.contains("/")) {

                    String[] operands = data.split(Pattern.quote("*"));
                    if (operands.length == 2) {
                        double operand1 = Double.parseDouble(operands[0]);
                        double operand2 = Double.parseDouble(operands[1]);
                        double res = operand1 / operand2;
                        result.setText(String.valueOf(res));
                    }
                } else {
                    Toast.makeText(getBaseContext(), "invalid input", Toast.LENGTH_SHORT).show();
                }
                if (data.contains("+")) {

                    String[] operands = data.split(Pattern.quote("*"));
                    if (operands.length == 2) {
                        double operand1 = Double.parseDouble(operands[0]);
                        double operand2 = Double.parseDouble(operands[1]);
                        double res = operand1 + operand2;
                        result.setText(String.valueOf(res));
                    }
                } else {
                    Toast.makeText(getBaseContext(), "invalid input", Toast.LENGTH_SHORT).show();
                }
                if (data.contains("-")) {

                    String[] operands = data.split(Pattern.quote("*"));
                    if (operands.length == 2) {
                        double operand1 = Double.parseDouble(operands[0]);
                        double operand2 = Double.parseDouble(operands[1]);
                        double res = operand1 - operand2;
                        result.setText(String.valueOf(res));
                    }
                } else {
                    Toast.makeText(getBaseContext(), "invalid input", Toast.LENGTH_SHORT).show();
                }
            } catch (Exception E) {
                Toast.makeText(getBaseContext(), "invalid input", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
