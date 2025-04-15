package com.example.hamburguerDecorator.model;

public class HamburguerSimples implements Hamburguer {

    private String nome;
    private double precoBase;

    public HamburguerSimples(String nome, double precoBase) {

        this.nome = nome;
        this.precoBase = precoBase;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPrecoBase() {
        return precoBase;
    }
}
