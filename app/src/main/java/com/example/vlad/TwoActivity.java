package com.example.vlad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class TwoActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    MyAdapter adapter;
    LinearLayoutManager layoutManager;

    List<ItemList> itemLists = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
//------------------------------------------------

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        MySwipeHelper swipeHelper = new MySwipeHelper(this, recyclerView, 200) {
            @Override
            public void instantiateMyButton(RecyclerView.ViewHolder viewHolder, List<MySwipeHelper.MyButton> buffer) {
                buffer.add(new MyButton(TwoActivity.this,
                        "Delete",
                        30,
                        0,
                        Color.parseColor("#FF3C30"),
                        new MyButtonClickListener() {
                            @Override
                            public void onClick(int pos) {
                                Toast.makeText(TwoActivity.this, "Delete click", Toast.LENGTH_SHORT).show();
                                itemLists.remove(pos);
                                adapter.notifyDataSetChanged();

                            }
                        }
                ));

                buffer.add(new MyButton(TwoActivity.this,
                        "Update",
                        30,
                        R.drawable.img,
                        Color.parseColor("#FF9502"),
                        new MyButtonClickListener() {
                            @Override
                            public void onClick(int pos) {
                                Toast.makeText(TwoActivity.this, "Update click", Toast.LENGTH_SHORT).show();
                            }
                        }
                ));
            }
        };

        generateItem();
    }


//------------------------------------------------



    private void generateItem() {



        itemLists.add(new

    ItemList(12,"Ivan",2,1,1,"No comment"));
        itemLists.add(new

    ItemList(17,"Anton",2,1,1,"No comment"));
        itemLists.add(new

    ItemList(20,"Svetlana",2,1,1,"No comment"));
        itemLists.add(new

    ItemList(14,"Petr",2,1,1,"No comment"));
        itemLists.add(new

    ItemList(16,"Dima",2,1,1,"No comment"));
        itemLists.add(new

    ItemList(12,"Olga",2,1,1,"No comment"));
        itemLists.add(new

    ItemList(12,"Ivan",2,1,1,"No comment"));
        itemLists.add(new

    ItemList(31,"Petr",2,1,1,"No comment"));
        itemLists.add(new

    ItemList(14,"Ivan",2,1,1,"No comment"));
        itemLists.add(new

    ItemList(12,"Olga",2,1,1,"No comment"));
        itemLists.add(new

    ItemList(11,"Svetlana",2,1,1,"No comment"));
        itemLists.add(new

    ItemList(12,"Ivan",2,1,1,"No comment"));

    RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new

    LinearLayoutManager(this));
        recyclerView.setAdapter(new

    MyAdapter(getApplicationContext(),itemLists));

}
}