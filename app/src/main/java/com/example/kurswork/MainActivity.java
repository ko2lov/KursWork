package com.example.kurswork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Кноповка сигнал 1
        Button buttonSignal1 = (Button)findViewById(R.id.button);

        buttonSignal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(MainActivity.this, Signal1.class);
                    startActivity(intent);finish();
                }catch(Exception e){

                }// конец конструци
            }
        });

        //Кноповка сигнал 2
        Button buttonSignal2 = (Button)findViewById(R.id.button2);

        buttonSignal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(MainActivity.this, Signal2.class);
                    startActivity(intent);finish();
                }catch(Exception e){

                }// конец конструци
            }
        });

        //Кноповка сигнал 3
        Button buttonSignal3 = (Button)findViewById(R.id.button3);

        buttonSignal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(MainActivity.this, Signal1.class);
                    startActivity(intent);finish();
                }catch(Exception e){

                }// конец конструци
            }
        });
    }
}