package com.example.dz_3_month3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dz_3_month3.databinding.FragmentMainBinding;
import com.example.dz_3_month3.databinding.FragmentSecondBinding;
import com.example.dz_3_month3.databinding.FragmentThreeBinding;

import java.util.ArrayList;

public class ThreeFragment extends Fragment {
    private FragmentThreeBinding binding;
    private ArrayList<String> nameLIst = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent,
                             Bundle savedInstanceState) {
        binding = FragmentThreeBinding.inflate(inflater,parent,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = binding.recyclerViewThree;
        loadData();
        NameAdapter adapter = new NameAdapter(nameLIst);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        nameLIst.add("Jon");
        nameLIst.add("Ben");
        nameLIst.add("Cristian");
        nameLIst.add("Bobi");
        nameLIst.add("Max");
        nameLIst.add("Han");
        nameLIst.add("Maxim");
        nameLIst.add("Joe");
        nameLIst.add("Ibrahim");
        nameLIst.add("Samir");
        nameLIst.add("Mr.Lazba");
        nameLIst.add("Mr.Lazba");
        nameLIst.add("Mr.Lazba");
        nameLIst.add("shakir.babaev");
        nameLIst.add("shakir.babaev");
        nameLIst.add("shakir.babaev");
    }
}