package com.jedi_supreme.hospitalmanagement.models;

import androidx.room.ColumnInfo;

import utilities.ColumnNames;

/*@Entity(
        tableName = Address.TABLE,
        indices = {@Index(ColumnNames.COLUMN_FIREBASE_ID)},
        foreignKeys = {@ForeignKey(entity = Person.class,
                parentColumns = ColumnNames.COLUMN_FIREBASE_ID, childColumns = ColumnNames.COLUMN_FIREBASE_ID)}
        )*/
public class Address {

    @ColumnInfo(name = ColumnNames.COLUMN_LOCALITY)
    private String locality;

    @ColumnInfo(name = ColumnNames.COLUMN_TOWN)
    private String town;

    @ColumnInfo(name = ColumnNames.COLUMN_DIGITAL_ADDRESS)
    private String digital_address;

    @ColumnInfo(name = ColumnNames.COLUMN_POSTAL_ADDRESS)
    private String postal_address;

    public Address(String locality, String town, String digital_address, String postal_address) {
        this.locality = locality;
        this.town = town;
        this.digital_address = digital_address;
        this.postal_address = postal_address;
    }

    public String getDigital_address() {
        return digital_address;
    }

    public void setDigital_address(String digital_address) {
        this.digital_address = digital_address;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getPostal_address() {
        return postal_address;
    }

    public void setPostal_address(String postal_address) {
        this.postal_address = postal_address;
    }
}
