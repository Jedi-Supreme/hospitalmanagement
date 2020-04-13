package com.jedi_supreme.hospitalmanagement.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import utilities.ColumnNames;

@Entity(tableName = Role.TABLE)
public class Role {

    public static final String TABLE = "ROLES";

    @ColumnInfo(name = ColumnNames.COLUMN_ID)
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = ColumnNames.COLUMN_DESCRIPTION)
    private String role_name;

    public Role(String role_name) {
        this.role_name = role_name;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
