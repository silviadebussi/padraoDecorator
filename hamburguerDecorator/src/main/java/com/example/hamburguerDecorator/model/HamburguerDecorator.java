package com.example.hamburguerDecorator.model;

public abstract class HamburguerDecorator implements Hamburguer {
    protected Hamburguer hamburguer;

    public HamburguerDecorator(Hamburguer hamburguer) {
        this.hamburguer = hamburguer;
    }

    @Override
    public String getNome() {
        return hamburguer.getNome();
    }

    @Override
    public double getPrecoBase() {
        return hamburguer.getPrecoBase();
    }
}
