package com.leon.fragmenthomework.Listeners;

import android.view.View;
import android.widget.Toast;

import com.leon.fragmenthomework.DAO.SQL_Autos;
import com.leon.fragmenthomework.Interfaz.CargaAuto;
import com.leon.fragmenthomework.Models.Auto;

public class ListenerGuardarAuto implements View.OnClickListener {
    CargaAuto context;
    private SQL_Autos sql_autos;

    public ListenerGuardarAuto(CargaAuto context) {
        this.context = context;
    }

    @Override
    public void onClick(View view) {
        sql_autos = new SQL_Autos(context);
//(String marca, String modelo, Integer anio, Integer ID)
        Auto auto = new Auto(String.valueOf(context.getEditMarca().getText()),String.valueOf(context.getEditModelo().getText()),Integer.valueOf(context.getEditAnio().getText().toString()),Integer.valueOf(context.getId()));
        sql_autos.guardarAuto(auto);

        Toast.makeText(context,"REGISTRADO",Toast.LENGTH_LONG).show();

    }
}
