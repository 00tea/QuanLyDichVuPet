package com.example.quanlidichvupet.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.quanlidichvupet.database.DatabaseHelper;

public class KhachHangDAO {
    public static final String TB_NAME="KhachHang";
    public static final String SQL_KHACH_HANG="CREATE TABLE KhachHang(makh TEXT PRIMARY KEY, tenkh TEXT," +
            " SDT INT, diachi TEXT)";
    private SQLiteDatabase db;
    private DatabaseHelper dbhelper;

    public KhachHangDAO(Context context) {
        dbhelper = new DatabaseHelper(context);
        db = dbhelper.getWritableDatabase();
    }
}

