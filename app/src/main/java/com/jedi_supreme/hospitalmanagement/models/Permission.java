package com.jedi_supreme.hospitalmanagement.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import utilities.ColumnNames;

@Entity(tableName = Permission.TABLE)
public class Permission {

    public static final String TABLE = "PERMISSIONS";

    @ColumnInfo(name = ColumnNames.COLUMN_ID)
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = ColumnNames.COLUMN_DESCRIPTION)
    private String access_level; //of access level (Enterprise, facility, department)

    public Permission(String access_level) {
        this.access_level = access_level;
    }

    public String getAccess_level() {
        return access_level;
    }

    public void setAccess_level(String access_level) {
        this.access_level = access_level;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
