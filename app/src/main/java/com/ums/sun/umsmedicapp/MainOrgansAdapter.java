package com.ums.sun.umsmedicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

public class MainOrgansAdapter extends RecyclerView.Adapter<MainOrgansAdapter.MyViewHolder> {

    private List<MainOrgansModel> dataModelList;


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, year, location;
        public ImageView image;
        public RelativeLayout relativeLayout;

        public MyViewHolder(View view) {
            super(view);
            relativeLayout = (RelativeLayout) view.findViewById(R.id.relative_layout);
            title = (TextView) view.findViewById(R.id.list_title);
            image = (ImageView) view.findViewById(R.id.list_imageview);
        }
    }

    public MainOrgansAdapter( List<MainOrgansModel> dataModelList) {
        this.dataModelList = dataModelList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_customview, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        MainOrgansModel mainOrgansModel = dataModelList.get(position);
        holder.title.setText(mainOrgansModel.getTitle());
//        holder.location.setText(attraction_model.getLocation());
//        holder.year.setText(attraction_model.getYear());
        holder.image.setImageResource(mainOrgansModel.getImage());

    }

    @Override
    public int getItemCount() {
        return dataModelList.size();
    }

}
