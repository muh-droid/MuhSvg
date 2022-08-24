package com.muh.svgfromurl;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.muh.muhsvg.MuhSvg;

public class MainActivity extends AppCompatActivity {
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = findViewById(R.id.img);
        MuhSvg.loadSvg(this,"https://static.meteoblue.com/assets/images/picto/02_iday.svg",img);
    }
}