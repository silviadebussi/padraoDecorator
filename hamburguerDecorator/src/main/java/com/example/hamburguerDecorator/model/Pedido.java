package com.example.hamburguerDecorator.model;

import com.example.hamburguerDecorator.model.Hamburguer;
import com.example.hamburguerDecorator.model.HamburguerComAdicional;

import java.util.ArrayList;

public class Pedido {
    private Hamburguer hamburguer;
    private ArrayList<String> adicionais;
    private double total;

    public Pedido(Hamburguer hamburguer) {
        this.hamburguer = hamburguer;
        this.adicionais = new ArrayList<>();
        this.total = hamburguer.getPrecoBase();
    }

    public void adicionarAdicional(String adicional, double precoAdicional) {
        hamburguer = new HamburguerComAdicional(hamburguer, adicional, precoAdicional);
        adicionais.add(adicional);
        total += precoAdicional;
    }

    public double getTotal() {
        return total;
    }

    public Hamburguer getHamburguer() {
        return hamburguer;
    }

    public ArrayList<String> getAdicionais() {
        return adicionais;
    }
}
