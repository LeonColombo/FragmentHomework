package com.leon.fragmenthomework.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.leon.fragmenthomework.DAO.SQL_Autos;
import com.leon.fragmenthomework.Models.Auto;
import com.leon.fragmenthomework.R;


public class FragmentAuto extends Fragment {

    private Auto auto;
    private View v;
    private TextView textMarca, textModelo, textAnio;
    private SQL_Autos sql_autos;

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       v = inflater.inflate(R.layout.fragment_fragment_auto, container, false);
       textMarca = v.findViewById(R.id.textAuto);
       textModelo = v.findViewById(R.id.textModelo);
       textAnio = v.findViewById(R.id.textAnio);

       return v;


    }


}
