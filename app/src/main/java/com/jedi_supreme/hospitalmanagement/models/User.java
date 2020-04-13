package com.jedi_supreme.hospitalmanagement.models;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

import utilities.ColumnNames;
import com.jedi_supreme.hospitalmanagement.models.Address;

@Entity(tableName = User.TABLE, indices = {
        @Index(ColumnNames.COLUMN_FIREBASE_ID),
        @Index(ColumnNames.COLUMN_PHONE_NUMBER),
        @Index(ColumnNames.COLUMN_FIRSTNAME),
        @Index(ColumnNames.COLUMN_LASTNAME),
        @Index(ColumnNames.COLUMN_EMAIL),
        @Index(ColumnNames.COLUMN_OPD_NUMBER)
}, primaryKeys = {ColumnNames.COLUMN_ID, ColumnNames.COLUMN_FIREBASE_ID})
public class User {

    static final String TABLE = "USERS";

    @ColumnInfo(name = ColumnNames.COLUMN_ID)
    @NonNull
    private int id;

    @ColumnInfo(name = ColumnNames.COLUMN_FIREBASE_ID)
    @NonNull
    private String firebase_id;

    @ColumnInfo(name = ColumnNames.COLUMN_OPD_NUMBER)
    private String opd_number;

    @ColumnInfo(name = ColumnNames.COLUMN_FIRSTNAME)
    private String first_name;

    @ColumnInfo(name = ColumnNames.COLUMN_LASTNAME)
    private String last_name;

    @ColumnInfo(name = ColumnNames.COLUMN_DOB)
    private String dob;

    @ColumnInfo(name = ColumnNames.COLUMN_EMAIL)
    private String email;

    @ColumnInfo(name = ColumnNames.COLUMN_PHONE_NUMBER)
    private String phone_number;

    @ColumnInfo(name = ColumnNames.COLUMN_RELIGION)
    private String religion;

    @ColumnInfo(name = ColumnNames.COLUMN_GENDER)
    private int gender;

    @ColumnInfo(name = ColumnNames.COLUMN_MODIFICATION_ID)
    private String modification_id;

    @Embedded
    private Registrations registration;

    @ColumnInfo(name = ColumnNames.COLUMN_ACC_TYPE)
    private Boolean isEmployee;

    @Embedded
    private Address address;

    public User(@NonNull String firebase_id, String opd_number, String first_name, String last_name, String dob, String email, String phone_number, String religion, int gender,
                String modification_id, Registrations registration, Boolean isEmployee, Address address) {
        this.firebase_id = firebase_id;
        this.opd_number = opd_number;
        this.first_name = first_name;
        this.last_name = last_name;
        this.dob = dob;
        this.email = email;
        this.phone_number = phone_number;
        this.religion = religion;
        this.gender = gender;
        this.modification_id = modification_id;
        this.registration = registration;
        this.isEmployee = isEmployee;
        this.address = address;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @NonNull
    public String getFirebase_id() {
        return firebase_id;
    }

    public void setFirebase_id(@NonNull String firebase_id) {
        this.firebase_id = firebase_id;
    }

    public String getModification_id() {
        return modification_id;
    }

    public void setModification_id(String modification_id) {
        this.modification_id = modification_id;
    }

    public Registrations getRegistration() {
        return registration;
    }

    public void setRegistration(Registrations registration) {
        this.registration = registration;
    }

    public Boolean getEmployee() {
        return isEmployee;
    }

    public void setEmployee(Boolean employee) {
        isEmployee = employee;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getOpd_number() {
        return opd_number;
    }

    public void setOpd_number(String opd_number) {
        this.opd_number = opd_number;
    }
}
