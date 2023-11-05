import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CustomToledoMGV6 extends ToledoMGV6 {
    @Override
    public void exportar(List<Produto> produtos, String pastaArquivoTxt) {
        try {

            String arquivoTxt = pastaArquivoTxt + "/exportacao_toledo.txt";
            BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoTxt));

            for (Produto produto : produtos) {
                writer.write("Código: " + produto.getCodigo() + "\n");
                writer.write("Descrição: " + produto.getDescricao() + "\n");
                writer.write("Tipo: " + produto.getTipo() + "\n");
                writer.write("Valor: " + produto.getValor() + "\n");
                writer.write("\n");
            }

            writer.close();
            System.out.println("Produtos exportados com sucesso para " + arquivoTxt);
        } catch (IOException e) {
            System.err.println("Erro ao exportar produtos: " + e.getMessage());
        }
    }
}