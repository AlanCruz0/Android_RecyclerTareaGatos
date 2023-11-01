package com.example.tarearecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.tarearecycler.adapters.GatoAdapter;
import com.example.tarearecycler.models.Bigote;
import com.example.tarearecycler.models.Color;
import com.example.tarearecycler.models.Gato;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcgato;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Gato> gatos = new ArrayList<>();

        gatos.add(new Gato(new Bigote("medio"), new Color("carey")));
        gatos.add(new Gato(new Bigote("Largo"), new Color("Siames")));

        rcgato = findViewById(R.id.rcvgatos);
        rcgato.setAdapter(new GatoAdapter(gatos));
        rcgato.setLayoutManager(new LinearLayoutManager(this));
        rcgato.hasFixedSize();
    }
}