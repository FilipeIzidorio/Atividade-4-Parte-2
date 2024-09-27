package imposto;

import model.Item;

public class ICMS implements Imposto {
    @Override
    public double calcular(Item item) {
        return item.getValor() * 0.18; // 18% de ICMS
    }
}

