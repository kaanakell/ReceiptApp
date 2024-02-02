package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;




import java.util.ArrayList;
import java.util.List;

public class DashBoard extends AppCompatActivity {

    RecyclerView mRecyclerView;
    ArrayList<FoodData> myFoodList;
    FoodData mFoodData;









    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        mRecyclerView = (RecyclerView)findViewById(R.id.recyclerView);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(DashBoard.this,1 );
        mRecyclerView.setLayoutManager(gridLayoutManager);


    DbManager db=new DbManager(DashBoard.this);




    Intent i=getIntent();
   myFoodList=db.BringRecipes(i.getStringArrayListExtra("a"));






    MyAdapter myAdapter = new MyAdapter(DashBoard.this,myFoodList);
        mRecyclerView.setAdapter(myAdapter);












}}