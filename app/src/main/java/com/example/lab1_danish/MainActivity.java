package com.example.lab1_danish;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView tvMessage;
    Button submitButton;
    EditText etName;
    Button clearButton;
    
    int counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMessage = (TextView) findViewById(R.id.textView2);
        submitButton = (Button) findViewById(R.id.button2);
        etName = (EditText) findViewById(R.id.editText);


    }
    public void displayText(View view) {

        String text = etName.getText().toString();

        tvMessage.setText("Welcome " + text);

        Toast toast = Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT);
        toast.show();


        {
        clearButton = (Button) findViewById(R.id.button);
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                etName.getText().clear();

                tvMessage.setText("Hello World!");

                Toast toast1 = Toast.makeText(getApplicationContext(), "Name cleared", Toast.LENGTH_SHORT);
                toast1.show();
            }
        });}
        }}