package com.example.quanlidichvupet.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.quanlidichvupet.R;
import com.example.quanlidichvupet.ThemKhachHangActivity;

import java.util.zip.Inflater;

public class KhachHangActivity extends AppCompatActivity {
    ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Khách Hàng");

        setContentView(R.layout.activity_khach_hang);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_them,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.itThem:
                startActivity(new Intent(getApplicationContext(), ThemKhachHangActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
