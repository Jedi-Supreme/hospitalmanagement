package com.jedi_supreme.hospitalmanagement.activities;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.FrameLayout;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.jedi_supreme.hospitalmanagement.R;

import fragments.Dashboard_fragment;

public class Dashboard extends BaseActivity {


    FrameLayout dash_frame;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //set content view method handled in Base activity

        Fragment fragment = new Dashboard_fragment();

        dash_frame = findViewById(R.id.draw_frame);

        loadFragment(fragment);
    }


    //-----------------------------------------------DEFINED METHODS--------------------------------
    public void loadFragment(Fragment fragment){

        FragmentManager frag_manager = getSupportFragmentManager();
        FragmentTransaction frag_transact = frag_manager.beginTransaction();
        frag_transact.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        frag_transact.replace(R.id.draw_frame,fragment);
        frag_transact.addToBackStack(null);
        frag_transact.commit();
    }
    //-----------------------------------------------DEFINED METHODS--------------------------------

}
