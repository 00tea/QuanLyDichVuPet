package com.example.quanlidichvupet.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.quanlidichvupet.R;
import com.example.quanlidichvupet.ThemDichVuActivity;
import com.example.quanlidichvupet.ThemKhachHangActivity;

public class DichVuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Dịch vụ");
        setContentView(R.layout.activity_dich_vu);
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
                startActivity(new Intent(getApplicationContext(), ThemDichVuActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
