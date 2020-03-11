package com.amikomdeveloper.traditionalfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

import java.util.ArrayList;

public class ActivityDetail extends AppCompatActivity {
    public static final String EXTRA_NAMA = "extra_nama";
    public static final String EXTRA_DETAIL = "extra_detail";
    public static final String EXTRA_IMAGE = "extra_image";

    ImageView foodImage;
    TextView foodName, foodDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        foodImage = (ImageView) findViewById(R.id.imageFood);
        foodName = (TextView) findViewById(R.id.nameFood);
        foodDetail = (TextView) findViewById(R.id.detailFood);

        String namefood =getIntent().getStringExtra(EXTRA_NAMA);
        String detailfood = getIntent().getStringExtra(EXTRA_DETAIL);
        int temp = getIntent().getIntExtra("photo",0);


        foodName.setText(namefood);
        foodDetail.setText(detailfood);
        foodImage.setImageResource(temp);


    }
}
