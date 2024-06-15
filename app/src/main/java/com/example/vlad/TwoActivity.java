package com.example.vlad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class TwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);


        List<ItemList> itemLists = new ArrayList<>();

        itemLists.add(new ItemList(12,"Ivan",2,1,1,"No comment"));
        itemLists.add(new ItemList(17,"Anton",2,1,1,"No comment"));
        itemLists.add(new ItemList(20,"Svetlana",2,1,1,"No comment"));
        itemLists.add(new ItemList(14,"Petr",2,1,1,"No comment"));
        itemLists.add(new ItemList(16,"Dima",2,1,1,"No comment"));
        itemLists.add(new ItemList(12,"Olga",2,1,1,"No comment"));
        itemLists.add(new ItemList(12,"Ivan",2,1,1,"No comment"));
        itemLists.add(new ItemList(31,"Petr",2,1,1,"No comment"));
        itemLists.add(new ItemList(14,"Ivan",2,1,1,"No comment"));
        itemLists.add(new ItemList(12,"Olga",2,1,1,"No comment"));
        itemLists.add(new ItemList(11,"Svetlana",2,1,1,"No comment"));
        itemLists.add(new ItemList(12,"Ivan",2,1,1,"No comment"));

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),itemLists));

    }
}