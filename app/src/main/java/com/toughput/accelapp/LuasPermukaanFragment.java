package com.toughput.accelapp;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class LuasPermukaanFragment extends Fragment implements View.OnClickListener {

    private EditText edtJari, edtTinggi;
    private TextView resultText;


    public LuasPermukaanFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_luas_permukaan, container, false);
        edtJari= view.findViewById(R.id.edt_jari);
        edtTinggi = view.findViewById(R.id.edt_tinggip);
        Button btnResult = view.findViewById(R.id.btn_result_lp);
        btnResult.setOnClickListener(this);
        resultText = view.findViewById(R.id.result_text_lp);
        return view;
    }

    @Override
    public void onClick(View view) {
        String inputJari = edtJari.getText().toString().trim();
        String inputTinggi = edtTinggi.getText().toString().trim();
        Double phi = 3.14;
        Double jari = Double.valueOf(inputJari);
        Double tinggi = Double.valueOf(inputTinggi);
        Double luasSelimut = 2 * phi * jari * tinggi;
        Double luasalas1 = phi * jari * jari;
        Double luasalas2 = 2 * luasalas1;
        Double luasPermukaan = luasSelimut + luasalas2;
        resultText.setText(String.valueOf(luasPermukaan));
    }
}
