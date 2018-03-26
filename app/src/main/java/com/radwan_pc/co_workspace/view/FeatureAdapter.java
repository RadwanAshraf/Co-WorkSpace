package com.radwan_pc.co_workspace.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.radwan_pc.co_workspace.R;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Radwan-PC on 07-Mar-18.
 */

public class FeatureAdapter extends BaseAdapter implements ListAdapter{


    private ArrayList<String> list = new ArrayList<>();
    private ArrayList<String> featuresName = new ArrayList<>();
    private ArrayList<String> featuresPNG = new ArrayList<>();
    static private Context context;

    public FeatureAdapter(ArrayList<String> list, Context context) {

        this.list = list;
        this.context = context;

        final String featName="WiFi,Food,Drinks,FunCorner,PlayStation,Xbox,Paint Zone,Engineering Tools,3D Printer,Laser Cutter" +
                ",Air Conditioning,Projector,Screens,Party Hosting,Prayer Area,Fun Area,Relaxing,Books";

        final String featPNG="ic_features_wifi_black,ic_features_fast_food,ic_features_coffee,ic_features_fun,ic_features_playstation," +
                "ic_features_xbox,ic_features_painter,ic_features_eng_tools,ic_features_3d_printer,ic_features_laser_cutter," +
                "ic_features_air_con,ic_features_projector,ic_features_monitor,ic_features_party,ic_features_prayer,ic_features_fun," +
                "ic_features_relax,ic_features_book_shelf";

        featuresName= new ArrayList<>(Arrays.asList(featName.split(",")));

        featuresPNG= new ArrayList<>(Arrays.asList(featPNG.split(",")));

        if(list.size()==0)
            this.list=new ArrayList<>(Arrays.asList("0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17".split(",")));
    }

    @Override
    public int getCount() {
        return featuresName.size();
    }

    @Override
    public Object getItem(int i) {
        return featuresName.get(i);
    }

    @Override
    public long getItemId(int i) {
        return featuresName.get(i).codePointAt(i);
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view==null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view =inflater.inflate(R.layout.feature_item,null);
        }



        TextView tvContact= view.findViewById(R.id.tv_featName);
        tvContact.setText(featuresName.get(i));

        ImageView imageViewPng=view.findViewById(R.id.Image_featIcon);
        imageViewPng.setImageResource(getDrawable(featuresPNG.get(i)));

        final RadioButton radioButton=view.findViewById(R.id.RadioButton_featureItem) ;
        radioButton.setTag(i);
        if(list.get(i).charAt(0)=='0')
        {
            radioButton.setChecked(false);
        }
        else radioButton.setChecked(true);

        radioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(list.get((int)radioButton.getTag()).charAt(0)=='0')
                {
                    list.set((int)radioButton.getTag(),"1");
                    radioButton.setChecked(true);

                }else{
                    list.set((int)radioButton.getTag(),"0");
                    radioButton.setChecked(false);
                }

            }
        });

        return view;
    }

    public static int getDrawable(String name) {
        Log.v("NNNAMMe",name);
        int resourceId = context.getResources().getIdentifier(name, "drawable", context.getPackageName());
        Log.v("RESSSSs",resourceId+"");
        return resourceId;
    }
}
