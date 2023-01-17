package com.example.dz_3_month3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.dz_3_month3.databinding.FragmentMainBinding;
import com.example.dz_3_month3.databinding.FragmentSecondBinding;

import java.util.ArrayList;

public class SecondFragment extends Fragment {

    private ArrayList<String> videoList = new ArrayList<>();
    private RecyclerView recyclerView;
    private FragmentSecondBinding binding;
    private Button btn_next2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentSecondBinding.inflate(inflater,parent,false);
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = binding.recyclerViewTwo;
        loadData();
        VideoAdapter adapter = new VideoAdapter(videoList);
        recyclerView.setAdapter(adapter);
        initView();
        clickListener();
    }

    private void clickListener() {
        btn_next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                requireActivity().getSupportFragmentManager().beginTransaction().replace(
                        R.id.container, new ThreeFragment()).addToBackStack(null).commit();
            }
        });
    }

    private void initView() {
        btn_next2 = binding.btnNext2;
    }

    private void loadData() {
        videoList.add("Mr.Best");
        videoList.add("Mr.Best");
        videoList.add("Mr.Best");
        videoList.add("Mr.Best");
        videoList.add("Mr.Best");
        videoList.add("Mr.Best");
        videoList.add("Mr.Best");
        videoList.add("Mr.Best");
        videoList.add("Mr.Best");
        videoList.add("Mr.Best");
        videoList.add("Mr.Best");
        videoList.add("Mr.Best");
        videoList.add("PUBG");
        videoList.add("Job");
        videoList.add("relax");
        videoList.add("winter");
        videoList.add("bobi");
        videoList.add("Ben");
        videoList.add("Ben10");
        videoList.add("Ben10000");
    }
}