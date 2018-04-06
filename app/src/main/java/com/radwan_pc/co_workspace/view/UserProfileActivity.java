package com.radwan_pc.co_workspace.view;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.radwan_pc.co_workspace.R;

public class UserProfileActivity extends AppCompatActivity {
public FloatingActionButton SaveButton ;
public ImageView UserImage ;
public ImageButton Change_Image;
public EditText Name , City , Phone , Email ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);
        UserImage=findViewById(R.id.personImage);
        Change_Image=findViewById(R.id.ChangeUserPhoto);
        Name=findViewById(R.id.ET_name);
        City=findViewById(R.id.city_edittext);
        Phone=findViewById(R.id.ET_phone);
        Email=findViewById(R.id.ET_Email);
        SaveButton=findViewById(R.id.SaveBotton);
    }
}
