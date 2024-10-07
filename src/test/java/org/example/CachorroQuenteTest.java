package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CachorroQuenteTest {

    @Test
    public void testCachorroQuenteSimples() {
        CachorroQuente cachorroQuente = new CachorroQuenteSimples();
        assertEquals(5.0f, cachorroQuente.getPreco(), 0.01);
        assertEquals("Cachorro Quente Simples", cachorroQuente.getDescricao());
    }

    @Test
    public void testCachorroQuenteComCebola() {
        CachorroQuente cachorroQuente = new CachorroQuenteSimples();
        cachorroQuente = new Cebola(cachorroQuente);
        assertEquals(6.0f, cachorroQuente.getPreco(), 0.01);
        assertEquals("Cachorro Quente Simples, Cebola", cachorroQuente.getDescricao());
    }

    @Test
    public void testCachorroQuenteComQueijo() {
        CachorroQuente cachorroQuente = new CachorroQuenteSimples();
        cachorroQuente = new Queijo(cachorroQuente);
        assertEquals(6.5f, cachorroQuente.getPreco(), 0.01);
        assertEquals("Cachorro Quente Simples, Queijo", cachorroQuente.getDescricao());
    }

    @Test
    public void testCachorroQuenteComBacon() {
        CachorroQuente cachorroQuente = new CachorroQuenteSimples();
        cachorroQuente = new Bacon(cachorroQuente);
        assertEquals(7.0f, cachorroQuente.getPreco(), 0.01);
        assertEquals("Cachorro Quente Simples, Bacon", cachorroQuente.getDescricao());
    }

    @Test
    public void testCachorroQuenteComTodosIngredientes() {
        CachorroQuente cachorroQuente = new CachorroQuenteSimples();
        cachorroQuente = new Cebola(cachorroQuente);
        cachorroQuente = new Queijo(cachorroQuente);
        cachorroQuente = new Bacon(cachorroQuente);

        assertEquals(9.5f, cachorroQuente.getPreco(), 0.01);
        assertEquals("Cachorro Quente Simples, Cebola, Queijo, Bacon", cachorroQuente.getDescricao());
    }
}