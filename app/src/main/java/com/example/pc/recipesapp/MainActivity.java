package com.example.pc.recipesapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView  myRecyclerView;
    String [] myTitlesArray, myDescriptionArray;
    int imgResource[]= {R.drawable.mousse_cake,R.drawable.lasagna,R.drawable.parmesan,R.drawable.soup,R.drawable.spaghatti,R.drawable.pie};
    MyAdapterClass ad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myRecyclerView= (RecyclerView) findViewById(R.id.rv1);
        myTitlesArray= getResources().getStringArray(R.array.title_names);
        myDescriptionArray= getResources().getStringArray(R.array.descriptions);

        ad = new MyAdapterClass(this, myTitlesArray,myDescriptionArray, imgResource );

        myRecyclerView.setAdapter(ad);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}