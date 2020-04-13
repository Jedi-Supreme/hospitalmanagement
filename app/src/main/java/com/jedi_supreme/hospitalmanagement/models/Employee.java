package com.jedi_supreme.hospitalmanagement.models;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import androidx.room.Relation;

import java.util.ArrayList;
import utilities.ColumnNames;

@Entity(tableName = Employee.TABLE,
        indices = {
        @Index(ColumnNames.COLUMN_FACILITY_ID),
        @Index(ColumnNames.COLUMN_FIREBASE_ID),
        @Index(ColumnNames.COLUMN_STAFF_ID)})
public class Employee{

    static final String TABLE = "EMPLOYEE";

    @ColumnInfo(name = ColumnNames.COLUMN_FIREBASE_ID)
    @PrimaryKey
    @NonNull
    private String firebase_id;

    @ColumnInfo(name = ColumnNames.COLUMN_FACILITY_ID)
    private String facility_id;

    @ColumnInfo(name = ColumnNames.COLUMN_STAFF_ID)
    private String staff_id;

    @Ignore
    private ArrayList<Roles_Permission> role_permission_id_list;


    public Employee(@NonNull String firebase_id, String facility_id, String staff_id) {
        this.firebase_id = firebase_id;
        this.facility_id = facility_id;
        this.staff_id = staff_id;
    }

    @NonNull
    public String getFirebase_id() {
        return firebase_id;
    }

    public void setFirebase_id(@NonNull String firebase_id) {
        this.firebase_id = firebase_id;
    }

    public String getFacility_id() {
        return facility_id;
    }

    public void setFacility_id(String facility_id) {
        this.facility_id = facility_id;
    }

    public String getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(String staff_id) {
        this.staff_id = staff_id;
    }

    public ArrayList<Roles_Permission> getRole_permission_id_list() {
        return role_permission_id_list;
    }

    public void setRole_permission_id_list(ArrayList<Roles_Permission> role_permission_id_list) {
        this.role_permission_id_list = role_permission_id_list;
    }

}
