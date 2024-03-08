package com.example.mangaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.mangaapp.adapter.FantasyAdapter;
import com.example.mangaapp.adapter.ShounenAdapter;
import com.example.mangaapp.model.Fantasy;
import com.example.mangaapp.model.Shounen;

import java.util.ArrayList;

public class ShounenActivity extends AppCompatActivity {

    RecyclerView recyclerViewShounen;
    ShounenAdapter shounenAdapter;
    ArrayList<Shounen> arr_Shounen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action);
        addControl();
        LoadData();
    }

    private void LoadData() {
        arr_Shounen.add(new Shounen(R.drawable.a1, "Độc cô cầu bại", 1));
        arr_Shounen.add(new Shounen(R.drawable.a1, "Độc cô cầu bại", 2));
        arr_Shounen.add(new Shounen(R.drawable.a1, "Độc cô cầu bại", 9));
        arr_Shounen.add(new Shounen(R.drawable.a1, "Độc cô cầu bại", 8));
    }

    private void addControl() {
        recyclerViewShounen = findViewById(R.id.recyclerViewAction);
        arr_Shounen = new ArrayList<>();
        shounenAdapter = new ShounenAdapter(this, arr_Shounen);
        recyclerViewShounen.setAdapter(shounenAdapter);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3);
        //recyclerViewAction.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewShounen.setLayoutManager(gridLayoutManager);
    }
}