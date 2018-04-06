package com.radwan_pc.co_workspace;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.Toast;

import com.radwan_pc.co_workspace.model.Room;
import com.radwan_pc.co_workspace.model.teste;
import com.radwan_pc.co_workspace.view.AddPlaceActivity;
import com.radwan_pc.co_workspace.view.AddRoomActivity;
import com.radwan_pc.co_workspace.view.FeaturesActivity;
import com.radwan_pc.co_workspace.view.RoomsAdapter;

import java.util.ArrayList;
import java.util.Objects;


public class AdminActivity extends AppCompatActivity {


    private BottomNavigationView navigationView;
    private FrameLayout frameLayout;
    private AddRoomActivity addRoomActivity;
    private AddPlaceActivity addPlaceActivity;
    private FeaturesActivity featuresActivity;
    private String current;
    private BottomNavigationItemView buttonBack;

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_admin);
;
        navigationView = findViewById(R.id.bottom_nav);
        frameLayout = findViewById(R.id.fragment_admin);
        buttonBack = findViewById(R.id.bb_back);


        addRoomActivity = new AddRoomActivity();
        addPlaceActivity = new AddPlaceActivity();
        featuresActivity = new FeaturesActivity();

        current = "addPlace";
        buttonBack.setCheckable(false);


        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {

                    case R.id.bb_next: {
                        buttonBack.setCheckable(true);
                        if (current.equals("addPlace")) {
                            setFragment(addRoomActivity);
                            item.setCheckable(true);
                            current = "addRoom";
                        } else if (current.equals("addRoom")) {
                            setFragment(featuresActivity);
                            item.setCheckable(true);
                            current = "addFeat";
                        } else if(current.equals("addFeat"))
                            item.setCheckable(true);

                    }
                    break;
                    case R.id.bb_back: {
                            item.setCheckable(true);
                        if (current.equals("addRoom")) {
                            setFragment(addPlaceActivity);
                            buttonBack.setCheckable(true);
                            current = "addPlace";
                        } else if (current.equals("addFeat")) {
                            setFragment(addRoomActivity);
                            buttonBack.setCheckable(true);
                            current = "addRoom";
                        }
                    }
                    break;
                    case R.id.bb_cancel: {

                    }
                    break;

                    default:
                        return false;

                }
                return true;
            }
        });

    }


    private void setFragment(Fragment fragment) {

        FragmentTransaction fragmentTransaction =getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_admin,fragment);
      //  lastFrag=fragment.getId();
        fragmentTransaction.commit();
    }
}
