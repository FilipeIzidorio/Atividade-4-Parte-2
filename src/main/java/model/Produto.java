package model;

public class Produto extends Item {
    private boolean industrial;

    public Produto(int codigo, String descricao, double valor, boolean industrial) {
        super(codigo, descricao, valor);
        this.industrial = industrial;
    }

    public boolean isIndustrial() {
        return industrial;
    }
}
