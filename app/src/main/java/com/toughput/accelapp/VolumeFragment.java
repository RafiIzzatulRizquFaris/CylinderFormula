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
public class VolumeFragment extends Fragment implements View.OnClickListener {

    private EditText edtTinggi, edtDiameter;
    private TextView tvVolume;


    public VolumeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_volume, container, false);
        edtDiameter = view.findViewById(R.id.edt_diameter);
        edtTinggi = view.findViewById(R.id.edt_tinggi);
        Button btnVolume = view.findViewById(R.id.btn_result_volume);
        tvVolume = view.findViewById(R.id.result_text_volume);
        btnVolume.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        String inputTinggi = edtTinggi.getText().toString().trim();
        String inputDiameter = edtDiameter.getText().toString().trim();
        Double diameter = Double.valueOf(inputDiameter);
        Double tinggi = Double.valueOf(inputTinggi);
        Double phi = 3.14;
        Double volume = diameter * tinggi * phi;
        tvVolume.setText(String.valueOf(volume));
    }
}
