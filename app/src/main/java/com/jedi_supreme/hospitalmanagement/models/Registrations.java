package com.jedi_supreme.hospitalmanagement.models;

import androidx.room.ColumnInfo;

import utilities.ColumnNames;

public class Registrations {

    @ColumnInfo(name = ColumnNames.COLUMN_REGISTRAR)
    private String registrar;

    @ColumnInfo(name = ColumnNames.COLUMN_DATE)
    private String registration_date;

    @ColumnInfo(name = ColumnNames.COLUMN_REGISTRATION_FACILITY_ID)
    private String reg_fac_id;

    public Registrations(String registrar, String registration_date, String reg_fac_id) {
        this.registrar = registrar;
        this.registration_date = registration_date;
        this.reg_fac_id = reg_fac_id;
    }

    public String getRegistrar() {
        return registrar;
    }

    public void setRegistrar(String registrar) {
        this.registrar = registrar;
    }

    public String getRegistration_date() {
        return registration_date;
    }

    public void setRegistration_date(String registration_date) {
        this.registration_date = registration_date;
    }

    public String getReg_fac_id() {
        return reg_fac_id;
    }

    public void setReg_fac_id(String reg_fac_id) {
        this.reg_fac_id = reg_fac_id;
    }
}
