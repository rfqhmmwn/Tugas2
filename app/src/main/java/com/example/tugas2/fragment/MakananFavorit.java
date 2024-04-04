
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

public class MakananFavorit extends Fragment implements AdapterList.ItemClickListener{

    private RecyclerView recyclerView;
    private AdapterList adapter;
    private List<com.example.tugasdrawer.DataItem> dataList;

    public MakananFavorit() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_makanan_favorit, container, false);

        recyclerView = view.findViewById(R.id.rvList3);
        dataList = new ArrayList<>();

        dataList.add(new DataItem("Nasi Goreng", "9.5", R.drawable.nasgor));
        dataList.add(new DataItem("Bakso", "9.0", R.drawable.bakso));
        dataList.add(new DataItem("Cendol", "9.0", R.drawable.cendol));
        dataList.add(new DataItem("Es Kelapa", "9.5", R.drawable.eskelapa));
        dataList.add(new DataItem("Es Teh", "10", R.drawable.esteh));

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
