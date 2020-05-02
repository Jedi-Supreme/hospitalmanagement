package com.jedi_supreme.hospitalmanagement.activities;

import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.jedi_supreme.hospitalmanagement.R;

public abstract class BaseActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.base_activity);

        ActionBar actionBar = getSupportActionBar();

        drawerLayout = findViewById(R.id.drawer_dashboard);

        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.drawable.ic_menu_white_24dp);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.menu_settings){
            Toast.makeText(getApplicationContext(),getString(R.string.settings_lbl),Toast.LENGTH_SHORT).show();
        }else if (id == R.id.menu_logout){
            Toast.makeText(getApplicationContext(),getString(R.string.logout_lbl),Toast.LENGTH_SHORT).show();
        }else if (id == android.R.id.home){
            if (drawerLayout.isDrawerOpen(GravityCompat.START)){
                drawerLayout.closeDrawer(GravityCompat.START);
            }else {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        }
        return super.onOptionsItemSelected(item);
    }


}
