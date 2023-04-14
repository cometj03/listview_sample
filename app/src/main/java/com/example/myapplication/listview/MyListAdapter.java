package com.example.myapplication.listview;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.myapplication.R;

import java.util.List;

public class MyListAdapter extends BaseAdapter {
    private final List<String> data;

    public MyListAdapter(List<String> data) {
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public String getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0; // 무슨 의미였는지 까먹었는데 큰 의미 없었던 걸로 기억함
    }

    @Override
    public View getView(int pos, View view, ViewGroup viewGroup) {
        if (view == null) {
            // view가 null이 아닐 때는 이전에 사용했던 뷰가 인자로 들어옴
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_text, viewGroup, false);
        }
        TextView tv = view.findViewById(R.id.txt1);
        tv.setText(data.get(pos));

        view.setOnClickListener(v -> {
            Log.d("TEST", "getView: click" + pos);
        });
        return view;
    }
}
