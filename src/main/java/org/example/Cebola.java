package org.example;

public class Cebola extends CachorroQuenteDecorator {

    public Cebola(CachorroQuente cachorroQuente) {
        super(cachorroQuente);
    }

    @Override
    public float getPreco() {
        return cachorroQuente.getPreco() + 1.0f; // Adiciona o preço da cebola
    }

    @Override
    public String getDescricao() {
        return cachorroQuente.getDescricao() + ", Cebola";
    }
}
