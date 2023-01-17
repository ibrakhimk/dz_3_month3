package com.example.dz_3_month3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class VideoViewHolder extends RecyclerView.ViewHolder {

    private TextView text_view_two;

    public VideoViewHolder(@NonNull View itemView) {
        super(itemView);
        text_view_two = itemView.findViewById(R.id.text_view_two);
    }
    public void bind(String video){
        text_view_two.setText(video);
    }
}
