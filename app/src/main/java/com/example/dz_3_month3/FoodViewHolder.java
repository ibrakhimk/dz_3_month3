package com.example.dz_3_month3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FoodViewHolder extends RecyclerView.ViewHolder {

    private TextView tvNameFood;

    public FoodViewHolder(@NonNull View itemView) {
        super(itemView);
        tvNameFood = itemView.findViewById(R.id.tv_name_food);
    }

    public void bind(String food){
        tvNameFood.setText(food);
    }
}
