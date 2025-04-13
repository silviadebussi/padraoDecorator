package com.example.hamburguerDecorator;

import com.example.hamburguerDecorator.model.Hamburguer;
import com.example.hamburguerDecorator.model.HamburguerSimples;
import com.example.hamburguerDecorator.model.Pedido;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {

    @Test
    public void testPedidoComAdicionais() {
        Hamburguer base = new HamburguerSimples("X-Salada", 12.0);
        Pedido pedido = new Pedido(base);

        pedido.adicionarAdicional("Bacon", 3.0);
        pedido.adicionarAdicional("Cheddar", 2.5);

        assertEquals(17.5, pedido.getTotal(), 0.001);
        assertEquals(2, pedido.getAdicionais().size());
        assertEquals("X-Salada com Bacon com Cheddar", pedido.getHamburguer().getNome());
    }

    @Test
    public void testPedidoSemAdicional() {
        Hamburguer base = new HamburguerSimples("X-Burger", 10.0);
        Pedido pedido = new Pedido(base);

        assertEquals(10.0, pedido.getTotal(), 0.001);
        assertTrue(pedido.getAdicionais().isEmpty());
        assertEquals("X-Burger", pedido.getHamburguer().getNome());
    }
}
