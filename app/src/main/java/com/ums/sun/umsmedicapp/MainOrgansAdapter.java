package com.ums.sun.umsmedicapp;

import android.content.Intent;
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
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        MainOrgansModel mainOrgansModel = dataModelList.get(position);
        holder.title.setText(mainOrgansModel.getTitle());
        holder.image.setImageResource(mainOrgansModel.getImage());

        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (dataModelList.get(position).getImage()){
                    case R.drawable.organ_brain:
                        Intent main = new Intent(view.getContext(), MainOrgansBrain.class);
                        view.getContext().startActivity(main);
                        break;

                    case R.drawable.organ_heart:
                        Intent heartIntent = new Intent(view.getContext(), MainOrgansHeart.class);
                        view.getContext().startActivity(heartIntent);
                        break;

                    case R.drawable.organ_intestine_small:
                        Intent intestine_small_Intent = new Intent(view.getContext(), MainOrgansIntestineSmall.class);
                        view.getContext().startActivity(intestine_small_Intent);
                        break;

                    case R.drawable.organ_intestine_large:
                        Intent intestine_large_Intent = new Intent(view.getContext(), MainOrgansIntestineLarge.class);
                        view.getContext().startActivity(intestine_large_Intent);
                        break;

                    case R.drawable.organ_kidney:
                        Intent kidneyIntent = new Intent(view.getContext(), MainOrgansKidney.class);
                        view.getContext().startActivity(kidneyIntent);
                        break;

                    case R.drawable.organ_liver:
                        Intent liverIntent = new Intent(view.getContext(), MainOrgansLiver.class);
                        view.getContext().startActivity(liverIntent);
                        break;

                    case R.drawable.organ_lung:
                        Intent lungIntent = new Intent(view.getContext(), MainOrgansLung.class);
                        view.getContext().startActivity(lungIntent);
                        break;

                    case R.drawable.organ_pancreas:
                        Intent pancreasIntent = new Intent(view.getContext(), MainOrgansPancreas.class);
                        view.getContext().startActivity(pancreasIntent);
                        break;

                    case R.drawable.organ_skin:
                        Intent skinIntent = new Intent(view.getContext(), MainOrgansSkin.class);
                        view.getContext().startActivity(skinIntent);
                        break;

                    case R.drawable.organ_stomach:
                        Intent stomachIntent = new Intent(view.getContext(), MainOrgansStomach.class);
                        view.getContext().startActivity(stomachIntent);
                        break;
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return dataModelList.size();
    }

}
