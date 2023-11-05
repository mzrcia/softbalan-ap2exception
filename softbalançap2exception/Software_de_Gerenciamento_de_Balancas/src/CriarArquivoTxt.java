import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CriarArquivoTxt {
    public static void main(String[] args) {
        String nomeArquivo = "produto.txt";

        try {

            FileWriter arquivo = new FileWriter(nomeArquivo);

            BufferedWriter escritor = new BufferedWriter(arquivo);

            escritor.write("Este é o conteúdo do meu arquivo de texto.");
            escritor.newLine();
            escritor.write("Você pode adicionar mais linhas conforme necessário.");

            escritor.close();

            System.out.println("Arquivo criado com sucesso: " + nomeArquivo);
        } catch (IOException e) {
            System.err.println("Ocorreu um erro ao criar o arquivo: " + e.getMessage());
        }
    }
}
