package com.example.randomnumberltmtk12t;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class MainActivity extends AppCompatActivity {

    private TextView tvNumber;

    private ImageView imgRandom;

    private int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvNumber = findViewById(R.id.tvNumber);

        imgRandom = findViewById(R.id.imgRandom);
    }

    @Override
    protected void onResume() {
        super.onResume();
        int rd = getRandomNumber(1, 100);
        tvNumber.setText(String.valueOf(rd));

        // Load anh moi ve
        Glide.with(this).load("https://source.unsplash.com/300x300")
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .skipMemoryCache(true)
                .into(imgRandom);
    }
}