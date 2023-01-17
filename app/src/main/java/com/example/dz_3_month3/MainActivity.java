package com.example.dz_3_month3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;

import com.example.dz_3_month3.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private ArrayList<String> listFood = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//        loadData();
//        FoodAdapter adapter = new FoodAdapter(listFood);
//        binding.recyclerView.setAdapter(adapter);
        getSupportFragmentManager().beginTransaction().add(R.id.container, new MainFragment()).commit();


    }

//    private void Chang(View view) {
//        Fragment fragment = null;
//        switch (view.getId()){
//            case R.id.btn_next:
//                fragment = new MainFragment();
//        }
//
////        FragmentManager fm = getFragmentManager();
////        FragmentTransaction ft = fm.beginTransaction();
////        ft.replace()
//
//    }

    private void loadData() {
        listFood.add("Плов");
        listFood.add("Манты");
        listFood.add("Манты");
        listFood.add("Манты");
        listFood.add("Манты");
        listFood.add("Манты");
        listFood.add("Манты");
        listFood.add("Манты");
        listFood.add("Манты");
        listFood.add("Манты");
        listFood.add("Манты");
        listFood.add("Манты");
        listFood.add("Манты");
        listFood.add("Манты");
        listFood.add("Манты");
        listFood.add("Манты");
        listFood.add("Манты");
        listFood.add("Манты");
        listFood.add("Манты");
        listFood.add("Манты");
        listFood.add("Манты");
        listFood.add("Манты");
        listFood.add("Манты");
        listFood.add("Манты");
        listFood.add("Манты");
        listFood.add("Манты");
        listFood.add("Манты");
        listFood.add("Манты");
        listFood.add("Манты");
        listFood.add("Манты");
        listFood.add("Манты");
        listFood.add("Манты");
        listFood.add("Манты");
        listFood.add("Манты");
        listFood.add("Манты");
        listFood.add("Манты");
        listFood.add("Манты");
        listFood.add("Манты");
        listFood.add("Манты");
        listFood.add("Манты");
        listFood.add("Шашлык");
        listFood.add("Мраморная гавядина");
    }
}