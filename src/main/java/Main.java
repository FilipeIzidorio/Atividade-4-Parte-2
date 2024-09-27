import factory.ImpostoFactory;
import factory.TipoImposto;
import imposto.Imposto;
import model.Produto;
import model.Servico;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto(1, "Milho", 100.0, false);
        Servico servico = new Servico(2, "Consultoria", 200.0);
        Produto industrializado = new Produto(3, "Produto Industrial", 150.0, true);

        Imposto icms = ImpostoFactory.getImposto(TipoImposto.TIPOICMS);
        Imposto pis = ImpostoFactory.getImposto(TipoImposto.TIPOPIS);
        Imposto iss = ImpostoFactory.getImposto(TipoImposto.TIPOISS);
        Imposto ipi = ImpostoFactory.getImposto(TipoImposto.TIPOIPI);

        produto.setImpostoCalculado(icms.calcular(produto));
        servico.setImpostoCalculado(iss.calcular(servico));
        industrializado.setImpostoCalculado(ipi.calcular(industrializado));

        System.out.println("Produto ICMS: " + produto.getImpostoCalculado());
        System.out.println("Serviço ISS: " + servico.getImpostoCalculado());
        System.out.println("Produto Industrial IPI: " + industrializado.getImpostoCalculado());
    }
}
