package imposto;

import model.Item;
import model.Servico;

public class ISS implements Imposto {
    @Override
    public double calcular(Item item) {
        if (item instanceof Servico) {
            return item.getValor() * 0.22; // 22% de ISS
        }
        return 0;
    }
}

