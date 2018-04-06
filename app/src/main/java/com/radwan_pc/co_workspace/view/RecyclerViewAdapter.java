package com.radwan_pc.co_workspace.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.radwan_pc.co_workspace.R;
import com.radwan_pc.co_workspace.model.WorkSpace;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Mohammed Morse on 23/03/2018.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.Hold_Views> {
     List<WorkSpace> WorkSpace_Data ;
     Context context ;
public RecyclerViewAdapter(List<WorkSpace> WorkSpace_Data , Context context ){
   this.context=context;
   this.WorkSpace_Data=WorkSpace_Data;
}

    @Override
    public Hold_Views onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.ic_my_place_item_shape,parent , false);
        Hold_Views hold=new Hold_Views(view);
        return hold;
    }

    @Override
    public void onBindViewHolder(Hold_Views holder, int position) {

       if(context.equals(MyPlacesActivity.class)){
           Picasso.with(context).load("Url").into(holder.WorkImage);
           holder.Name.setText(WorkSpace_Data.get(position).getName());
           holder.Desc.setText(WorkSpace_Data.get(position).getAddress());
           holder.Rate.setRating(WorkSpace_Data.get(position).getId());
       }
       else if(context.equals(FavoritsActivity.class)) {
           Picasso.with(context).load("Url").into(holder.WorkImage);
           holder.Name.setText(WorkSpace_Data.get(position).getName());
           holder.Desc.setText(WorkSpace_Data.get(position).getUserRate().toString());
       }
    }

    @Override
    public int getItemCount() {
        return WorkSpace_Data.size();
    }

    public class Hold_Views extends RecyclerView.ViewHolder{
          public ImageView WorkImage ;
          public TextView Name , Desc;
          public RatingBar Rate;
        public Hold_Views(View itemView) {
            super(itemView);
            WorkImage=itemView.findViewById(R.id.userImage);
            Name=itemView.findViewById(R.id.WorkspaceName);
            Desc=itemView.findViewById(R.id.WorkspaceDes);
        }
    }
}
