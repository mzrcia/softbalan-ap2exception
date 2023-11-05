import java.util.ArrayList;
import java.util.List;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList();
        produtos.add(new Produto());
        String outputPath = "C:\\\\Users\\\\Mércia\\\\Documents\\\\arquivo.txt";

        exportarProdutosParaBalanca(TipoBalanca.TOLEDO_MGV6, produtos, outputPath);
        exportarProdutosParaBalanca(TipoBalanca.FILIZOLA_SMART, produtos, outputPath);
        exportarProdutosParaBalanca(TipoBalanca.URANO_INTEGRA, produtos, outputPath);
    }

    private static void exportarProdutosParaBalanca(TipoBalanca tipoBalanca, List<Produto> produtos, String outputPath) {
        IBalanca<Produto> balanca = BalanceFactory.getBalanca(tipoBalanca);
        balanca.exportar(produtos, outputPath);
    }
}
