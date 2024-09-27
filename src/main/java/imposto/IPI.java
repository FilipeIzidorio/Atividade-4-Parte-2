package imposto;

import model.Item;
import model.Produto;

public class IPI implements Imposto {
    @Override
    public double calcular(Item item) {
        if (item instanceof Produto && ((Produto) item).isIndustrial()) {
            return item.getValor() * 0.12; // 12% se industrial
        }
        return 0; // Não aplica IPI se não for industrial
    }
}

