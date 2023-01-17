package com.example.dz_3_month3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.dz_3_month3.databinding.FragmentMainBinding;

import java.util.ArrayList;


public class MainFragment extends Fragment {

   private FragmentMainBinding binding;

   private ArrayList<String> listFood = new ArrayList<>();
   private RecyclerView recyclerView;
   private Button btn_next;

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup parent,
                             Bundle savedInstanceState) {
        binding = FragmentMainBinding.inflate(inflater,parent,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = binding.recyclerView;
        loadData();
        FoodAdapter adapter = new FoodAdapter(listFood);
        binding.recyclerView.setAdapter(adapter);
        initView();
        clickListener();
    }

    private void clickListener() {
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                requireActivity().getSupportFragmentManager().beginTransaction().
            replace(R.id.container, new SecondFragment()).addToBackStack(null).commit();
            }
        });
    }

    private void initView() {
        btn_next = binding.btnNext;

    }

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
    }
}