import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CustomUranoIntegra extends UranoIntegra {
    @Override
    public void exportar(List<Produto> produtos, String pastaArquivoTxt) {
        try {
            // Crie um arquivo de texto na pasta especificada
            String arquivoTxt = pastaArquivoTxt + "/exportacao_urano.txt";
            BufferedWriter writer = getBufferedWriter(produtos, arquivoTxt);

            // Feche o arquivo
            writer.close();
            System.out.println("Produtos exportados com sucesso para " + arquivoTxt);
        } catch (IOException e) {
            System.err.println("Erro ao exportar produtos: " + e.getMessage());
        }
    }

    private static BufferedWriter getBufferedWriter(List<Produto> produtos, String arquivoTxt) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoTxt));

        // Escreva os produtos no arquivo de texto
        for (Produto produto : produtos) {
            writer.write("Código: " + produto.getCodigo() + "\n");
            writer.write("Descrição: " + produto.getDescricao() + "\n");
            writer.write("Tipo: " + produto.getTipo() + "\n");
            writer.write("Valor: " + produto.getValor() + "\n");
            writer.write("\n");
        }
        return writer;
    }
}

