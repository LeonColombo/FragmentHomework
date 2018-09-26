package com.leon.fragmenthomework.Interfaz;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.leon.fragmenthomework.DAO.SQL_Autos;
import com.leon.fragmenthomework.Listeners.ListenerFloatingAuto;
import com.leon.fragmenthomework.Listeners.ListenerGuardarAuto;
import com.leon.fragmenthomework.Models.Auto;
import com.leon.fragmenthomework.R;

import java.util.ArrayList;

public class CargaAuto extends AppCompatActivity {

    private ListenerFloatingAuto listenerFloatingAuto;
    private FloatingActionButton floatingAuto;
    private EditText editMarca, editModelo, editAnio;
    private Integer Id;
    private SQL_Autos sql_autos;
    private Button btnGuardarAuto;
    private ListenerGuardarAuto listenerGuardarAuto;

    public EditText getEditMarca() {
        return editMarca;
    }

    public EditText getEditModelo() {
        return editModelo;
    }

    public EditText getEditAnio() {
        return editAnio;
    }

    public Integer getId() {
        return Id;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carga_auto);

        btnGuardarAuto = findViewById(R.id.btnGuardarAuto);
        listenerGuardarAuto = new ListenerGuardarAuto(this);
        btnGuardarAuto.setOnClickListener(listenerGuardarAuto);


    }
}
