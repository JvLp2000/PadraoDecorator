package org.example;

public class Bacon extends CachorroQuenteDecorator {

    public Bacon(CachorroQuente cachorroQuente) {
        super(cachorroQuente);
    }

    @Override
    public float getPreco() {
        return cachorroQuente.getPreco() + 2.0f; // Adiciona o preço do bacon
    }

    @Override
    public String getDescricao() {
        return cachorroQuente.getDescricao() + ", Bacon";
    }
}