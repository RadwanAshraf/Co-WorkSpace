package com.radwan_pc.co_workspace.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.radwan_pc.co_workspace.R;
import com.radwan_pc.co_workspace.model.WorkSpace;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Mohammed Morse on 05/04/2018.
 */

public class RecyclerViewAdapterMyFavourite extends RecyclerView.Adapter<RecyclerViewAdapterMyFavourite.Hold_Views> implements View.OnClickListener {
    List<WorkSpace> WorkSpace_Data;
    Context context;

    public RecyclerViewAdapterMyFavourite(List<WorkSpace> WorkSpace_Data, Context context) {
        this.context = context;
        this.WorkSpace_Data = WorkSpace_Data;
    }

    @Override
    public RecyclerViewAdapterMyFavourite.Hold_Views onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.ic_my_place_item_shape, parent, false);
        RecyclerViewAdapterMyFavourite.Hold_Views hold = new RecyclerViewAdapterMyFavourite.Hold_Views(view);
        return hold;
    }

    @Override
    public void onBindViewHolder(RecyclerViewAdapterMyFavourite.Hold_Views holder, int position) {
            Picasso.with(context).load("Url").into(holder.WorkImage);
            holder.Name.setText(WorkSpace_Data.get(position).getName());
            holder.imageButton.setOnClickListener(this);
    }

    @Override
    public int getItemCount() {
        return WorkSpace_Data.size();
    }

    @Override
    public void onClick(View v) {
        //Delet From Data Base Or FireBase
    }

    public class Hold_Views extends RecyclerView.ViewHolder {
        public ImageView WorkImage;
        public TextView Name, Desc;
        public ImageButton imageButton;

        public Hold_Views(View itemView) {
            super(itemView);
            WorkImage = itemView.findViewById(R.id.userImagemyFavourite);
            Name = itemView.findViewById(R.id.WorkspaceNameMyFavourite);
            imageButton = itemView.findViewById(R.id.favouriteButton);
        }
    }
}
