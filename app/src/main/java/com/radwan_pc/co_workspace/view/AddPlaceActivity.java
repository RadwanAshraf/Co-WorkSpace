package com.radwan_pc.co_workspace.view;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.radwan_pc.co_workspace.R;

import static android.app.Activity.RESULT_OK;

public class AddPlaceActivity extends Fragment {


    private static final int PICK_IMAGE=100;
    ImageView imageView;
    Button nextButton;
    Uri imageUri;
    Toolbar toolbar;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        View view=inflater.inflate(R.layout.activity_add_place, container, false);

        imageView= view.findViewById(R.id.Image_profile);
        toolbar=view.findViewById(R.id.toolbar);
        toolbar.setTitle("Basic Info");

        //setSupportActionBar(toolbar);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
                startActivityForResult(intent,PICK_IMAGE);
            }
        });

        return view;


        //nextButton=findViewById(R.id.button_next);


    }


   /* public void browseGallery(View view)
    {
        Intent intent=new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
        startActivityForResult(intent,PICK_IMAGE);
    }
*/

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

                    if(resultCode==RESULT_OK&&requestCode==PICK_IMAGE) {
                        imageUri = data.getData();
                        imageView.setImageURI(imageUri);
                    }
                }


    @Override
    public void onResume() {
        super.onResume();
    }

    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.add_place_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()==R.id.button_next) {

            Intent intent=new Intent(getApplicationContext(),AddRoomActivity.class);
            startActivity(intent);

            Toast.makeText(getApplicationContext(),"nexxxt",Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }

    */
}
