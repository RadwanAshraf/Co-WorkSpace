package com.radwan_pc.co_workspace.view;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.radwan_pc.co_workspace.R;
import com.radwan_pc.co_workspace.model.Room;
import com.radwan_pc.co_workspace.model.teste;

import java.util.ArrayList;
import java.util.zip.Inflater;

/**
 * Created by Radwan-PC on 08-Mar-18.
 */

public class RoomsAdapter extends BaseAdapter implements ListAdapter,teste {



    private ArrayList<Room> list= teste.arr;
    private Context context;

    public RoomsAdapter(ArrayList<Room> list, Context context) {

        this.list=list;
        this.context=context;
    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return list.get(i).getRoomID();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if(view==null)
        {
            LayoutInflater inflater=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

            view=inflater.inflate(R.layout.room_item,null);
        }

        Button deleteButton=view.findViewById(R.id.button_delete);

        TextView textView1=view.findViewById(R.id.tv_maxUserRoomItem);
        TextView textView2=view.findViewById(R.id.tv_priceRoomItem);
        TextView textView3=view.findViewById(R.id.tv_roomNum);

        textView1.setText("Max Users  "+String.valueOf(teste.arr.get(i).getMaxUser()));

        textView2.setText("Price  "+String.valueOf(teste.arr.get(i).getPriceHour())+" EGP/h");

        textView3.setText("ROOM "+String.valueOf(i+1));

        deleteButton.setTag(i);

        //  DELETE Button in item

        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               teste.arr.remove(Integer.parseInt(view.getTag().toString()));
                RoomsAdapter.this.notifyDataSetChanged();
            }
        });




        return view;
    }
}
