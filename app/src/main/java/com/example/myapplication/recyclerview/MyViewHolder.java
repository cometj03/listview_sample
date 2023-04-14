package com.example.myapplication.recyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

// 뷰들의 정보를 담고있고 재활용되는 뷰홀더
public class MyViewHolder extends RecyclerView.ViewHolder {

    final TextView textView;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.txt1);
    }

    public void bind(String text) {
        textView.setText(text);
    }
}