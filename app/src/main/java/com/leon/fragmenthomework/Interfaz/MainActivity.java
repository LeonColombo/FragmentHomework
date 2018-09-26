package com.leon.fragmenthomework.Interfaz;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.leon.fragmenthomework.Adapters.AdapterViewPager;
import com.leon.fragmenthomework.DAO.SQL_Autos;
import com.leon.fragmenthomework.Fragments.FragmentAuto;
import com.leon.fragmenthomework.Listeners.ListenerFloatingAuto;
import com.leon.fragmenthomework.Models.Auto;
import com.leon.fragmenthomework.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private FragmentManager fragmentManager;
    private ArrayList<Auto> autoArrayList;
    private AdapterViewPager adapterViewPager;
    private ListenerFloatingAuto listenerFloatingAuto;
    private FloatingActionButton floatingActionAuto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.TabLayout);
        viewPager = findViewById(R.id.pagerAutos);
        fragmentManager = getSupportFragmentManager();
        autoArrayList = new ArrayList<>();

        floatingActionAuto = findViewById(R.id.floatingAuto);

        listenerFloatingAuto = new ListenerFloatingAuto(this);
        floatingActionAuto.setOnClickListener(listenerFloatingAuto);

        SQL_Autos sql_Autos = new SQL_Autos(this);
        String a = "";
        String b = "";
        Integer c = 1;
        Integer d = 2;
        Auto auto = new Auto(a,b,c,d);
        FragmentAuto unFragment = new FragmentAuto();
        unFragment.setAuto(auto);
        //autoArrayList.add(unFragment);
        TabLayout.Tab untab = tabLayout.newTab();
        untab.setText(auto.getModelo());
        untab.setText(auto.getAnio());
        untab.setText(auto.getMarca());

        adapterViewPager = new AdapterViewPager(fragmentManager,autoArrayList);

        viewPager.setAdapter(adapterViewPager);
        tabLayout.setupWithViewPager(viewPager);





    }
}
