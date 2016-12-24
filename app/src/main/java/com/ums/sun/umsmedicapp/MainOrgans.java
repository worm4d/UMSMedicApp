package com.ums.sun.umsmedicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainOrgans extends AppCompatActivity {

    private List<MainOrgansModel> dataModelList = new ArrayList<>();
    private RecyclerView recyclerView;
    private MainOrgansAdapter mAdapter;

    private ImageView backbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_organs);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        backbtn = (ImageView) findViewById(R.id.backImage);

        mAdapter = new MainOrgansAdapter(dataModelList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        setUpRecyclerView();
        setUpListener();
    }

    private void setUpRecyclerView() {

        int[] covers = new int[]{
                R.drawable.organ_brain,
                R.drawable.organ_heart,
                R.drawable.organ_intestine_small,
                R.drawable.organ_intestine_large,
                R.drawable.organ_kidney,
                R.drawable.organ_liver,
                R.drawable.organ_lung,
                R.drawable.organ_pancreas,
                R.drawable.organ_skin,
                R.drawable.organ_stomach,};

        MainOrgansModel mainOrgansModel = new MainOrgansModel("Brain", "Old Building", "Brain", covers[0]);
        dataModelList.add(mainOrgansModel);

        mainOrgansModel = new MainOrgansModel("Heart", "Old Building", "Heart", covers[1]);
        dataModelList.add(mainOrgansModel);

        mainOrgansModel = new MainOrgansModel("Small Intestine", "New Building", "2000", covers[2]);
        dataModelList.add(mainOrgansModel);

        mainOrgansModel = new MainOrgansModel("Large Intestine", "Old Building", "1985", covers[3]);
        dataModelList.add(mainOrgansModel);

        mainOrgansModel = new MainOrgansModel("Kidney", "New Building", "2008", covers[4]);
        dataModelList.add(mainOrgansModel);

        mainOrgansModel = new MainOrgansModel("Liver", "Old Building", "1965", covers[5]);
        dataModelList.add(mainOrgansModel);

        mainOrgansModel = new MainOrgansModel("Lung", "New Building", "2000", covers[6]);
        dataModelList.add(mainOrgansModel);

        mainOrgansModel = new MainOrgansModel("Pancreas", "Old Building", "1985", covers[7]);
        dataModelList.add(mainOrgansModel);

        mainOrgansModel = new MainOrgansModel("Skin", "New Building", "2008", covers[8]);
        dataModelList.add(mainOrgansModel);

        mainOrgansModel = new MainOrgansModel("Stomach", "Old Building", "1985", covers[9]);
        dataModelList.add(mainOrgansModel);

        mAdapter.notifyDataSetChanged();
    }

    private void setUpListener() {
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main = new Intent(MainOrgans.this, MainActivity.class);
                startActivity(main);
                finish();
            }
        });
    }
}
