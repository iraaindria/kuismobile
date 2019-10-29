package com.example.reclyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private keluargaAdapter adapter;
    private ArrayList<keluarga>keluargaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView = findViewById(R.id.recylerview);
        adapter = new keluargaAdapter(keluargaArrayList);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    private void addData(){
        keluargaArrayList = new ArrayList<>();
        keluargaArrayList.add(new keluarga("Gunarto","Bapak", R.drawable.bapak));
        keluargaArrayList.add(new keluarga("Sri Hartini", "Ibu", R.drawable.ibu));
        keluargaArrayList.add(new keluarga("Eko Crisnawanto","Anak ke-1", R.drawable.eko));
        keluargaArrayList.add(new keluarga("Henny Cristianawati","Anak ke-2", R.drawable.henny));
        keluargaArrayList.add(new keluarga("Crismantoro Budi Saputro","Anak ke-3", R.drawable.crismantoro));
        keluargaArrayList.add(new keluarga("Ira Indriastuti","Anak ke-4", R.drawable.ira));
    }
}
