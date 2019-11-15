package com.example.quanlidichvupet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.quanlidichvupet.ui.DichVuActivity;
import com.example.quanlidichvupet.ui.HoaDonActivity;
import com.example.quanlidichvupet.ui.KHTTActivity;
import com.example.quanlidichvupet.ui.KhachHangActivity;
import com.example.quanlidichvupet.ui.PetActivity;
import com.example.quanlidichvupet.ui.ThongKeActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Quản lý dịch vụ Pet");
    }

    public void viewKhachHang(View view) {
        startActivity(new Intent(getApplicationContext(), KhachHangActivity.class));
    }

    public void ViewPet(View view) {
        startActivity(new Intent(getApplicationContext(), PetActivity.class));
    }

    public void viewDichVu(View view) {
        startActivity(new Intent(getApplicationContext(), DichVuActivity.class));
    }

    public void viewHoaDon(View view) {
        startActivity(new Intent(getApplicationContext(), HoaDonActivity.class));
    }

    public void viewThongKe(View view) {
        startActivity(new Intent(getApplicationContext(), ThongKeActivity.class));
    }

    public void viewKHTT(View view) {
        startActivity(new Intent(getApplicationContext(), KHTTActivity.class));
    }
}
