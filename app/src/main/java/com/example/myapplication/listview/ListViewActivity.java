package com.example.myapplication.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        List<String> data = new ArrayList<>();
        for (int i = 0; i < 100; i++)
            data.add("# " + (i + 1));

        ListView lv = findViewById(R.id.lv);
        lv.setAdapter(new MyListAdapter(data));
    }
}