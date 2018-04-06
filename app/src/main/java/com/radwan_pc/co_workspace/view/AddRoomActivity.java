package com.radwan_pc.co_workspace.view;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import android.support.v7.widget.Toolbar;

import com.radwan_pc.co_workspace.R;
import com.radwan_pc.co_workspace.model.Room;
import com.radwan_pc.co_workspace.model.teste;

import java.io.IOException;
import java.util.ArrayList;

public class AddRoomActivity extends Fragment implements teste {

    private ArrayList<Room> roomList;
    private RoomsAdapter roomsAdapter;
    private Context context;
    private ListView  listView;
    private FloatingActionButton fab;
    private Toolbar toolbar;

    public AddRoomActivity() {


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_add_room, container, false);
        toolbar=view.findViewById(R.id.toolbar);
        listView=view.findViewById(R.id.ListView_rooms);
        fab=view.findViewById(R.id.FabButton_addRoom);
        context=getContext();
        roomList=new ArrayList<>();

        toolbar.setTitle("Rooms");

        listView.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView absListView, int i) {


            }

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {

                int lastItem = firstVisibleItem + visibleItemCount;
                if(totalItemCount>5){
                if (totalItemCount==lastItem) {
                    fab.setVisibility(View.INVISIBLE);
                } else {
                    fab.setVisibility(View.VISIBLE);}
                }
                else {
                    fab.setVisibility(View.VISIBLE);
                }
            }

        });

        fab.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBulider=new AlertDialog.Builder(context);
                View mView = getLayoutInflater().inflate(R.layout.dialog_addroom,null);
                final  EditText maxUserET= mView.findViewById(R.id.ET_maxUser);
                final  EditText priceET= mView.findViewById(R.id.ET_price);
                Button addRoom= mView.findViewById(R.id.B_addRoom);

                addRoom.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Room room=new Room();
                        int maxUser,price;
                        try{
                        maxUser=Integer.parseInt(maxUserET.getText().toString());
                        price=Integer.parseInt(priceET.getText().toString());
                        }catch (Exception ex) {
                            Toast.makeText(context,"Error",Toast.LENGTH_SHORT).show();
                            return;
                        }

                            room.setMaxUser(maxUser);
                            room.setPriceHour(price);
                            room.setRoomID(roomList.size() + 1);

                            // roomList.add(room);
                            teste.arr.add(room);
                            roomsAdapter = new RoomsAdapter(teste.arr, context);

                            listView.setAdapter(roomsAdapter);

                            roomsAdapter.notifyDataSetChanged();

                          //  Toast.makeText(context,"Done",Toast.LENGTH_SHORT).show();

                    }
                });

                mBulider.setView(mView);
                AlertDialog dialog=mBulider.create();
                dialog.show();
            }
        });

         return view;
    }



/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.add_room_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()==R.id.button_next) {

            Intent intent=new Intent(getApplicationContext(),FeaturesActivity.class);
            startActivity(intent);

            Toast.makeText(getApplicationContext(),"nexxxt",Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }

    */
}
