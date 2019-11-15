package com.example.quanlidichvupet.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.quanlidichvupet.database.DatabaseHelper;

public class DichVuDAO {
    public static final String TB_NAME = "DichVu";
    public static final String SQL_DICH_VU ="CREATE TABLE DichVu(madv TEXT PRIMARY KEY, tendv TEXT, gia DOUBLE)";
    private SQLiteDatabase db;
    private DatabaseHelper dbhelper;
    public DichVuDAO(Context context){
        dbhelper = new DatabaseHelper(context);
        db = dbhelper.getWritableDatabase();
    }
}
