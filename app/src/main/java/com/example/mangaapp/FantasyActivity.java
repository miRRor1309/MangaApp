package com.example.mangaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.mangaapp.adapter.ActionAdapter;
import com.example.mangaapp.adapter.FantasyAdapter;
import com.example.mangaapp.model.Action;
import com.example.mangaapp.model.Fantasy;

import java.util.ArrayList;

public class FantasyActivity extends AppCompatActivity {

    RecyclerView recyclerViewFantasy;
    FantasyAdapter fantasyAdapter;
    ArrayList<Fantasy> arr_Fantasy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action);
        addControl();
        LoadData();
    }

    private void LoadData() {
        arr_Fantasy.add(new Fantasy(R.drawable.a1,"Độc cô cầu bại",1));
        arr_Fantasy.add(new Fantasy(R.drawable.a1,"Độc cô cầu bại",2));
        arr_Fantasy.add(new Fantasy(R.drawable.a1,"Độc cô cầu bại",9));
        arr_Fantasy.add(new Fantasy(R.drawable.a1,"Độc cô cầu bại",8));
    }

    private void addControl() {
        recyclerViewFantasy=findViewById(R.id.recyclerViewAction);
        arr_Fantasy=new ArrayList<>();
        fantasyAdapter = new FantasyAdapter(this,arr_Fantasy);
        recyclerViewFantasy.setAdapter(fantasyAdapter);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,3);
        //recyclerViewAction.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewFantasy.setLayoutManager(gridLayoutManager);
    }
}