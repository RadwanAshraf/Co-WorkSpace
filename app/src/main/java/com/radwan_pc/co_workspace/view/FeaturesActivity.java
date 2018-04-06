package com.radwan_pc.co_workspace.view;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.radwan_pc.co_workspace.R;

import java.util.ArrayList;
import java.util.Arrays;

public class FeaturesActivity extends Fragment {

    ListView listView;
    static ArrayList<String> feat;
    FeatureAdapter featureAdapter;
    private android.support.v7.widget.Toolbar toolbar;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View view=inflater.inflate(R.layout.activity_features, container, false);


        listView=view.findViewById(R.id.ListView_feature);

        toolbar=view.findViewById(R.id.toolbar);
        toolbar.setTitle("Features");
        //setSupportActionBar(toolbar);

        // Log.v("lol",feat.get(0));

        feat=new ArrayList<>();

        featureAdapter=new FeatureAdapter(feat,getContext());

        listView.setAdapter(featureAdapter);

        featureAdapter.notifyDataSetChanged();


        return view;


    }



/*
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

    */
}
