package com.leon.fragmenthomework.Models;

public class Auto {

    private String marca;
    private String modelo;
    private Integer anio;
    private Integer ID;

    public Auto(String marca, String modelo, Integer anio, Integer ID) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.ID = ID;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }
}
