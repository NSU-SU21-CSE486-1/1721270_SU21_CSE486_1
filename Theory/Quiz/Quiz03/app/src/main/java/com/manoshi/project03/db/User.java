package com.manoshi.project03.db;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User {
    @PrimaryKey(autoGenerate = true)
    public int uid;

    @ColumnInfo(name = "Name")
    public String name;

    @ColumnInfo(name = "Birth of Date")
    public String date;

    @ColumnInfo(name = "NID")
    public String NID;

    @ColumnInfo(name = "Blood group")
    public String bg;
}
