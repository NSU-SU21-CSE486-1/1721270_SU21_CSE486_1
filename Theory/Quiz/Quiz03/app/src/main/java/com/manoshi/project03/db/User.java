package com.manoshi.project03.db;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User {
    @PrimaryKey(autoGenerate = true)
    public int uid;

    @ColumnInfo(name = "first_name")
    public String firstname;

    @ColumnInfo(name = "Last_name")
    public String lastname;
}
