package com.example.dz_3_month3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NameViewHolder extends RecyclerView.ViewHolder{

    private TextView tv_name;


    public NameViewHolder(@NonNull View itemView) {
        super(itemView);
        tv_name = itemView.findViewById(R.id.text_view_three);
    }
    public void bind(String name){
        tv_name.setText(name);
    }
}
