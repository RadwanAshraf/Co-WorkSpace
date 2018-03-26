package com.radwan_pc.co_workspace.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.radwan_pc.co_workspace.R;

import java.util.ArrayList;
import java.util.Arrays;

public class FeaturesActivity extends AppCompatActivity {

    ListView listView;
    static ArrayList<String> feat;
    FeatureAdapter featureAdapter;
    private android.support.v7.widget.Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_features);

        listView=findViewById(R.id.ListView_feature);

        toolbar=findViewById(R.id.toolbar);
        toolbar.setTitle("Features");
        setSupportActionBar(toolbar);

        // Log.v("lol",feat.get(0));

        feat=new ArrayList<>();

        featureAdapter=new FeatureAdapter(feat,getApplicationContext());

        listView.setAdapter(featureAdapter);

        featureAdapter.notifyDataSetChanged();


    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.add_featuers_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()==R.id.button_saveFeature) {
            Toast.makeText(getApplicationContext(),"Save",Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
}
