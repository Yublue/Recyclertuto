package com.example.chydii.recyclertuto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements MyRecyclerViewAdapter.ItemClickListener {
    MyRecyclerViewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> animalNames = new ArrayList<>();
        animalNames.add("Horse");
        animalNames.add("Owl");
        animalNames.add("Camel");
        animalNames.add("Cow");
        animalNames.add("Goat");
        animalNames.add("Sheep");
        animalNames.add("Dog");
        animalNames.add("Vulture");
        animalNames.add("Snake");
        animalNames.add("Python");
        animalNames.add("Lizard");
        animalNames.add("Cameleon");
        animalNames.add("Wallgecko");
        animalNames.add("Rat");
        animalNames.add("Mouse");
        animalNames.add("Cat");
        animalNames.add("Eagle");
        animalNames.add("Peacock");

        //Setting up te RecyclerView.
        RecyclerView recyclerView = findViewById(R.id.rvAnimals);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MyRecyclerViewAdapter(this, animalNames);
        adapter.setClickListener (this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "You clicked" + adapter.getItem(position) + "on row number" + position, Toast.LENGTH_SHORT);
    }
    }
}
