package com.Aluracurso.Conversor.Moneda;

import com.google.gson.annotations.SerializedName;

import java.text.DecimalFormat;

public class Moneda {

    @SerializedName("target_code")
    private String monedaA;

    @SerializedName("base_code")
    private String monedaB;

    @SerializedName("conversion_rate")
    private double valor;


    private double cantidad;

    public String getMonedaA() {
        return monedaA;
    }

    public void setNombre(String monedaA) {
        this.monedaA = monedaA;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getMonedaB() {
        return monedaB;
    }

    public void setMonedaB(String monedaB) {
        this.monedaB = monedaB;
    }

    public void convertir(){

        double conversion = cantidad * valor;

        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("Se han convertido "+cantidad +
                " " + monedaB + " En " + df.format(conversion) + " "+monedaA);
    }

    @Override
    public String toString() {
        return getMonedaA() + getValor();
    }
}
