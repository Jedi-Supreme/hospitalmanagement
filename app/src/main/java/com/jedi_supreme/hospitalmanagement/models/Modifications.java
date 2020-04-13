package com.jedi_supreme.hospitalmanagement.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;

import utilities.ColumnNames;

@Entity(tableName = Modifications.TABLE, primaryKeys = {ColumnNames.COLUMN_OWNER_ID,ColumnNames.COLUMN_MODIFIER_ID},
        indices = {@Index(ColumnNames.COLUMN_OWNER_ID), @Index(ColumnNames.COLUMN_MODIFIER_ID)})
public class Modifications {

    public static final String TABLE = "MODIFICATIONS";

    @ColumnInfo(name = ColumnNames.COLUMN_OWNER_ID)
    private String owner_id;

    @ColumnInfo(name = ColumnNames.COLUMN_MODIFICATION_TYPE)
    private String modification_Type;

    @ColumnInfo(name = ColumnNames.COLUMN_MODIFIER_ID)
    private String modifier_id;

    @ColumnInfo(name = ColumnNames.COLUMN_DATE)
    private String modification_date;

    public Modifications(String owner_id, String modification_Type, String modifier_id, String modification_date) {
        this.owner_id = owner_id;
        this.modification_Type = modification_Type;
        this.modifier_id = modifier_id;
        this.modification_date = modification_date;
    }

    public String getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(String owner_id) {
        this.owner_id = owner_id;
    }

    public String getModification_Type() {
        return modification_Type;
    }

    public void setModification_Type(String modification_Type) {
        this.modification_Type = modification_Type;
    }

    public String getModifier_id() {
        return modifier_id;
    }

    public void setModifier_id(String modifier_id) {
        this.modifier_id = modifier_id;
    }

    public String getModification_date() {
        return modification_date;
    }

    public void setModification_date(String modification_date) {
        this.modification_date = modification_date;
    }
}
