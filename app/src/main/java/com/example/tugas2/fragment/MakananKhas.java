package com.example.tugas2.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.navdrawerexample.AdapterList;
import com.example.navdrawerexample.R;
import com.example.tugasdrawer.DataItem;

import java.util.ArrayList;
import java.util.List;

public class MakananKhas extends Fragment implements AdapterList.ItemClickListener{

    private RecyclerView recyclerView;
    private AdapterList adapter;
    private List<com.example.tugasdrawer.DataItem> dataList;

    public MakananKhas() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_makanan_khas, container, false);

        recyclerView = view.findViewById(R.id.rvList);
        dataList = new ArrayList<>();

        dataList.add(new DataItem("Soto Kerbau", "8.5", R.drawable.sotokebo));
        dataList.add(new DataItem("Nasi Jangkrik", "8.5", R.drawable.nasi_jangkrik));
        dataList.add(new DataItem("Soto Kudus", "8.8", R.drawable.soto_kudus));
        dataList.add(new DataItem("Tahu Kecap", "8.5", R.drawable.tahu_kecap));

        adapter = new AdapterList(dataList, getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
        return view;
    }

    @Override
    public void onItemClick(View view, int position) {

    }
}