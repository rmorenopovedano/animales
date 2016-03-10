package com.example.raul.myapplication;

import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;


import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton gato,tigre,vaca;
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        gato=(ImageButton)findViewById(R.id.imageButton);
        gato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(MainActivity.this, R.raw.gato);
                mp.start();

            }
        });
        tigre=(ImageButton)findViewById(R.id.imageButton2);
        tigre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(MainActivity.this, R.raw.tigre);
                mp.start();
            }
        });
        vaca=(ImageButton)findViewById(R.id.imageButton3);
        vaca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(MainActivity.this, R.raw.vaca);
                mp.start();


            }
        });
    }
}