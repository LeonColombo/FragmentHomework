package com.leon.fragmenthomework.Listeners;

import android.content.Intent;
import android.view.View;

import com.leon.fragmenthomework.DAO.SQL_Autos;
import com.leon.fragmenthomework.Interfaz.CargaAuto;
import com.leon.fragmenthomework.Interfaz.MainActivity;

public class ListenerFloatingAuto implements View.OnClickListener {
    MainActivity context;
    private SQL_Autos sql_autos;

    public ListenerFloatingAuto(MainActivity context) {
        this.context = context;
    }

    @Override
    public void onClick(View view) {

        Intent intent = new Intent(this.context, CargaAuto.class);
        context.startActivity(intent);

    }
}
