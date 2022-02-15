package com.example.cat_dog_mouse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ListView;

import java.util.List;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";
    List<String> animalsList;
    private Object String;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView ListView = findViewById(R.id.listView);

        final Adapter movieAdapter = new Adapter( this, animalsList);
        listView.setAdapter(Adapter);
        animalsList = new ArrayList<>();
        animalsList.add();

    }
}