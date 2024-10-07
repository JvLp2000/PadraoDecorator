package org.example;

public class CachorroQuenteSimples implements CachorroQuente {
    private float preco;

    public CachorroQuenteSimples() {
        this.preco = 5.0f; // Preço base do cachorro quente simples
    }

    @Override
    public float getPreco() {
        return preco;
    }

    @Override
    public String getDescricao() {
        return "Cachorro Quente Simples";
    }
}