package com.jhr.abdallahsarayrah.smsmarksh

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

/**
 * Created by abdallah.sarayrah on 12/18/2017.
 */
class StudentsDB(context: Context) : SQLiteOpenHelper(context, "Students.db", null, 1) {
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("create table student(mobile string, mark integer)")
        db?.execSQL("insert into student values('11',90)")
        db?.execSQL("insert into student values('22',80)")
        db?.execSQL("insert into student values('33',70)")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
    }
}