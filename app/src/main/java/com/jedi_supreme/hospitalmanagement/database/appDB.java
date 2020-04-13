package com.jedi_supreme.hospitalmanagement.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.jedi_supreme.hospitalmanagement.models.Employee;
import com.jedi_supreme.hospitalmanagement.models.User;
import com.jedi_supreme.hospitalmanagement.models.Role;

@Database(entities = {Employee.class, User.class, Role.class}, exportSchema = false, version = 1)
public abstract class appDB extends RoomDatabase {

    private static appDB appDB_instance;

    public static appDB getInstance(Context context){

        if (appDB_instance == null){

            String DB_NAME = "hospital_management_DB";
            appDB_instance = Room.databaseBuilder(context.getApplicationContext(),appDB.class, DB_NAME)
                    .allowMainThreadQueries()
                    .build();
        }

        return appDB_instance;
    }
}
