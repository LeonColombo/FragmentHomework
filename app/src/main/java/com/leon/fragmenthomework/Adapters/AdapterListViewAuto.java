package com.leon.fragmenthomework.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.leon.fragmenthomework.Interfaz.MainActivity;
import com.leon.fragmenthomework.Models.Auto;
import com.leon.fragmenthomework.R;

import java.util.ArrayList;

public class AdapterListViewAuto extends BaseAdapter {

    private ArrayList<Auto> autoArrayList;
    private MainActivity context;

    private ListView listView;

    @Override
    public int getCount() {
        return autoArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return autoArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater;
        layoutInflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        view = layoutInflater.inflate(R.layout.layout_listview_autos, viewGroup,false);

        TextView marca, modelo, anio;

        marca = view.findViewById(R.id.textAuto);
        modelo = view.findViewById(R.id.textModelo);
        anio = view.findViewById(R.id.textAnio);

        marca.setText(autoArrayList.get(i).getMarca());
        modelo.setText(autoArrayList.get(i).getModelo());
        anio.setText(autoArrayList.get(i).getAnio());


        return view;
    }
}
