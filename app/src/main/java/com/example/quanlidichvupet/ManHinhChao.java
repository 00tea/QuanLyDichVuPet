package com.example.quanlidichvupet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class ManHinhChao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Quản lý dịch vụ Pet");
        setContentView(R.layout.activity_man_hinh_chao);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
            startActivity(new Intent(getApplicationContext(),MainActivity.class));
            finish();
            }
        },3000);
    }
}
