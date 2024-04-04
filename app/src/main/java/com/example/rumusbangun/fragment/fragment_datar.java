package com.example.rumusbangun.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rumusbangun.AdapterBangun;
import com.example.rumusbangun.R;
import com.example.rumusbangun.bangunDatar.lingkaran;
import com.example.rumusbangun.bangunDatar.persegi;
import com.example.rumusbangun.bangunDatar.persegiPanjang;
import com.example.rumusbangun.bangunDatar.segitiga;
import com.example.rumusbangun.modelbangun;

import java.util.ArrayList;
import java.util.List;

public class fragment_datar extends Fragment implements AdapterBangun.ItemClickListener {

    RecyclerView rvBangunDatar;
    List<modelbangun> listDataBangunDatar;
    AdapterBangun adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_datar, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvBangunDatar = view.findViewById(R.id.rvBangun);
        listDataBangunDatar = new ArrayList<>();

        modelbangun persegi = new modelbangun();
        persegi.setNamaBangun("Persegi");
        persegi.setDesc("Sisi x Sisi ");
        persegi.setImageBangun("https://imgix3.ruangguru.com/assets/miscellaneous/png_f7pgcn_4714.png");
        listDataBangunDatar.add(persegi);

        modelbangun PersegiPanjang = new modelbangun();
        PersegiPanjang.setNamaBangun("Persegi Panjang");
        PersegiPanjang.setDesc("Panjang x Lebar");
        PersegiPanjang.setImageBangun("data:image/png;base64,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");
        listDataBangunDatar.add(PersegiPanjang);

        modelbangun segitiga = new modelbangun();
        segitiga.setNamaBangun("Segitiga");
        segitiga.setDesc("L = 1/2 x Alas x Tinggi");
        segitiga.setImageBangun("data:image/png;base64,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");
        listDataBangunDatar.add(segitiga);

        modelbangun lingkaran = new modelbangun();
        lingkaran.setNamaBangun("Lingkaran");
        lingkaran.setDesc("π × Jari-jari²");
        lingkaran.setImageBangun("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS5VuZwtTUqhRZOF9DpDQfc41GG4mNNjMwE-w&s");
        listDataBangunDatar.add(lingkaran);

        rvBangunDatar.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new AdapterBangun(listDataBangunDatar, getContext());
        rvBangunDatar.setAdapter(adapter);
        adapter.setClickListener(this);


    }

    @Override
    public void onItemClick(View view, int position) {
        if (adapter.getItem(position).getNamaBangun().equals("Lingkaran")) {
            Intent intent = new Intent(getActivity(), lingkaran.class);
            startActivity(intent);
        }else if (adapter.getItem(position).getNamaBangun().equals("Persegi")) {
            Intent intent = new Intent(getActivity(), persegi.class);
            startActivity(intent);
        }else if (adapter.getItem(position).getNamaBangun().equals("Persegi Panjang")) {
            Intent intent = new Intent(getActivity(), persegiPanjang.class);
            startActivity(intent);
        }else if (adapter.getItem(position).getNamaBangun().equals("Segitiga")) {
            Intent intent = new Intent(getActivity(), segitiga.class);
            startActivity(intent);
        }
    }
}