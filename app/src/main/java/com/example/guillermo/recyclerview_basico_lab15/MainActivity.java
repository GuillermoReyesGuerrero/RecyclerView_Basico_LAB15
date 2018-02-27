package com.example.guillermo.recyclerview_basico_lab15;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    String datos[][]={
            {"Guillermo Reyes Guerrero","14400996","ISC"},
            {"Juan Pedro Gil Llanos","1400941","ISC"},
            {"Ernesto GonzalezArellano","14400996","ISC"},
            {"Hector Garay Ocegueda","14400996","ISC"},
            {"Joaquin Rodriguez Gomez","14400941","ISC"},
            {"Eduardo Silva Camacho","14400996","ISC"},
            {"Genaro Enciso Luna","144009941","ISC"}
    };
    Adapter adapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.lista);
        adapter=new Adapter(datos);
        recyclerView.setAdapter(adapter);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
    }
}
