package com.jedi_supreme.hospitalmanagement.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import utilities.ColumnNames;

import static androidx.room.ForeignKey.CASCADE;

@Entity(tableName = Roles_Permission.TABLE,
        //TODO ON DELETE AND ON UPDATE ACTIONS FOR FOREIGN KEYS

        foreignKeys = {
        @ForeignKey(
                entity = Role.class,
                parentColumns = ColumnNames.COLUMN_ROLE_ID,
                childColumns = ColumnNames.COLUMN_ROLE_ID,
                onDelete = CASCADE),
        @ForeignKey(
                entity = Permission.class,
                parentColumns = ColumnNames.COLUMN_ID,
                childColumns = ColumnNames.COLUMN_PERMISSION_ID,
                onDelete = CASCADE),
        @ForeignKey(
                entity = Employee.class,
                parentColumns = ColumnNames.COLUMN_FIREBASE_ID,
                childColumns = ColumnNames.COLUMN_EMPLOYEE_ID ,
                onDelete = CASCADE)
}
)
public class Roles_Permission {

    public static final String TABLE = "ROLES_PERMISSIONS_MAPPING";

    @ColumnInfo(name = ColumnNames.COLUMN_ID)
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = ColumnNames.COLUMN_ROLE_ID)
    private int role_id;

    @ColumnInfo(name = ColumnNames.COLUMN_PERMISSION_ID)
    private int permission_id;

    @ColumnInfo(name = ColumnNames.COLUMN_EMPLOYEE_ID)
    private String employee_id;

    public Roles_Permission(int role_id, int permission_id, String employee_id) {
        this.role_id = role_id;
        this.permission_id = permission_id;
        this.employee_id = employee_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public int getPermission_id() {
        return permission_id;
    }

    public void setPermission_id(int permission_id) {
        this.permission_id = permission_id;
    }

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }
}
