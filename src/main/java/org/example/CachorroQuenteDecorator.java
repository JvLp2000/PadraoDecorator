package org.example;

public abstract class CachorroQuenteDecorator implements CachorroQuente {
    protected CachorroQuente cachorroQuente;

    public CachorroQuenteDecorator(CachorroQuente cachorroQuente) {
        this.cachorroQuente = cachorroQuente;
    }

    @Override
    public float getPreco() {
        return cachorroQuente.getPreco();
    }

    @Override
    public String getDescricao() {
        return cachorroQuente.getDescricao();
    }
}