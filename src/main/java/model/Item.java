package model;

import lombok.Data;

@Data
public abstract class Item {
    private int codigo;
    private String descricao;
    private double valor;
    private double impostoCalculado;
    private double total;


    public Item(int codigo, String descricao, double valor) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
    }





}
