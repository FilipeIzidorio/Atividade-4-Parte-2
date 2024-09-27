package imposto;

import model.Item;

public class PIS implements Imposto {
    @Override
    public double calcular(Item item) {
        return item.getValor() * 0.0065; // 0,65% de PIS
    }
}

