package com.radwan_pc.co_workspace.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

import com.radwan_pc.co_workspace.R;
import com.radwan_pc.co_workspace.model.WorkSpace;

import java.util.ArrayList;

public class MyPlacesActivity extends AppCompatActivity {
public RecyclerView Places ;
public LinearLayoutManager layoutManager;
public RecyclerViewAdapter BindAdapter ;
public ArrayList<WorkSpace> Data ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_places);
        Places=findViewById(R.id.recyclerView);
        layoutManager=new LinearLayoutManager(this);
        Data =new ArrayList<WorkSpace>();
        BindAdapter=new RecyclerViewAdapter(Data , this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        new ItemTouchHelper(new ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT) {
            @Override
            public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
                return 0;
            }

            @Override
            public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
                int id= (int) viewHolder.itemView.getTag();


                // Delet Data in RecyclerView


                return false;
            }

            @Override
            public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {

            }
        }).attachToRecyclerView(Places);

    }
}
