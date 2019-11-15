package com.example.quanlidichvupet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.quanlidichvupet.model.KhachHang;

public class ThemKhachHangActivity extends AppCompatActivity {
    EditText edmakh,edhoten,edsdt,eddiachi;
    Button btnthem,btnhuy,btnshow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_them_khach_hang);
        setTitle("Thêm Khách Hàng");
        edmakh = findViewById(R.id.edMaKH);
        edhoten = findViewById(R.id.edHoTen);
        edsdt = findViewById(R.id.edSDT);
        eddiachi = findViewById(R.id.edDiaChi);
        btnthem = findViewById(R.id.btnThemKH);
        btnhuy = findViewById(R.id.btnHuyKH);
        btnshow = findViewById(R.id.btnshowKH);
        btnhuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        btnshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                startActivity(new Intent(getApplicationContext(), KhachHang.class));
            }
        });
        }
}
