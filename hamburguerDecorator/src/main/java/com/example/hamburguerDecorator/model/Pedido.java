package com.example.hamburguerDecorator.model;

public class Pedido {
    private Hamburguer hamburguer;

    public Pedido(Hamburguer hamburguer) {
        this.hamburguer = hamburguer;
    }

    public void adicionarAdicional(String adicional, double precoAdicional) {
        hamburguer = new HamburguerComAdicional(hamburguer, adicional, precoAdicional);
    }

    public double getTotal() {
        return hamburguer.getPrecoBase();
    }

    public Hamburguer getHamburguer() {
        return hamburguer;
    }
}
