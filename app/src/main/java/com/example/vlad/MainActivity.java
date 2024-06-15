package com.example.vlad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText text_time_one = findViewById(R.id.text_time_one);
        EditText text_time_two = findViewById(R.id.text_time_two);
        EditText name_guest = findViewById(R.id.name_guest);
        EditText number_of_guests = findViewById(R.id.number_of_guests);
        EditText basic = findViewById(R.id.basic);
        EditText premium = findViewById(R.id.premium);
        EditText comments = findViewById(R.id.comments);
        Button constants = findViewById(R.id.constants);


        Button begin = findViewById(R.id.begin);


        begin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TwoActivity.class);
                startActivity(intent);
            }
        });

    }
}