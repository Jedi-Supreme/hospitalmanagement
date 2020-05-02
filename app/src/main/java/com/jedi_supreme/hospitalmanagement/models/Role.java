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

    @ColumnInfo(name = ColumnNames.COLUMN_MALE_ICON)
    private int male_icon_id;

    @ColumnInfo(name = ColumnNames.COLUMN_FEMALE_ICON)
    private int female_icon_id;

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

    public int getMale_icon_id() {
        return male_icon_id;
    }

    public void setMale_icon_id(int male_icon_id) {
        this.male_icon_id = male_icon_id;
    }

    public int getFemale_icon_id() {
        return female_icon_id;
    }

    public void setFemale_icon_id(int female_icon_id) {
        this.female_icon_id = female_icon_id;
    }
}
