package org.example;

public class Queijo extends CachorroQuenteDecorator {

    public Queijo(CachorroQuente cachorroQuente) {
        super(cachorroQuente);
    }

    @Override
    public float getPreco() {
        return cachorroQuente.getPreco() + 1.5f; // Adiciona o preço do queijo
    }

    @Override
    public String getDescricao() {
        return cachorroQuente.getDescricao() + ", Queijo";
    }
}