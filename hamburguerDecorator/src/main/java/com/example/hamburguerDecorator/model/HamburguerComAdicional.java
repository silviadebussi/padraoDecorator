package com.example.hamburguerDecorator.model;

public class HamburguerComAdicional implements Hamburguer {

    private Hamburguer hamburguer;
    private String adicional;
    private double precoAdicional;

    public HamburguerComAdicional(Hamburguer hamburguer, String adicional, double precoAdicional) {
        this.hamburguer = hamburguer;
        this.adicional = adicional;
        this.precoAdicional = precoAdicional;
    }

    @Override
    public String getNome() {
        return hamburguer.getNome() + " " + adicional;
    }

    @Override
    public double getPrecoBase() {
        return hamburguer.getPrecoBase() + precoAdicional;
    }
}
