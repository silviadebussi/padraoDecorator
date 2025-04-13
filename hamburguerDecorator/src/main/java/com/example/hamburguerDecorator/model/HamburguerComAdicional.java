package com.example.hamburguerDecorator.model;

public class HamburguerComAdicional extends HamburguerDecorator {
    private String adicional;
    private double precoAdicional;

    public HamburguerComAdicional(Hamburguer hamburguer, String adicional, double precoAdicional) {
        super(hamburguer);
        this.adicional = adicional;
        this.precoAdicional = precoAdicional;
    }

    @Override
    public String getNome() {
        return hamburguer.getNome() + " com " + adicional;
    }

    @Override
    public double getPrecoBase() {
        return hamburguer.getPrecoBase() + precoAdicional;
    }
}
