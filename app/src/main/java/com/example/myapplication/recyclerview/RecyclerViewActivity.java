package com.example.myapplication.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        List<String> data = new ArrayList<>();
        for (int i = 0; i < 100; i++)
            data.add("# " + (i + 1));

        RecyclerView rv = findViewById(R.id.recyclerview);
        rv.setAdapter(new MyRecyclerAdapter(data));
    }
}