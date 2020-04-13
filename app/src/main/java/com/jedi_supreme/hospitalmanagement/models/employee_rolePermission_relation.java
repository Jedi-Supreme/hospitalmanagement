package com.jedi_supreme.hospitalmanagement.models;

import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.ArrayList;

import utilities.ColumnNames;

public class employee_rolePermission_relation {

    //Relation list for employee and security roles

    public employee_rolePermission_relation() {
    }

    public employee_rolePermission_relation(Employee employee, ArrayList<Roles_Permission> employee_role_permission) {
        this.employee = employee;
        this.employee_role_permission = employee_role_permission;
    }

    @Embedded
    private Employee employee;

    @Relation(entityColumn = ColumnNames.COLUMN_FIREBASE_ID, parentColumn = ColumnNames.COLUMN_FIREBASE_ID, entity = Roles_Permission.class)
    private ArrayList<Roles_Permission> employee_role_permission;

    public ArrayList<Roles_Permission> getEmployee_role_permission() {
        return employee_role_permission;
    }

    public void setEmployee_role_permission(ArrayList<Roles_Permission> employee_role_permission) {
        this.employee_role_permission = employee_role_permission;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
