import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // Configurando o diálogo de seleção de arquivo
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Escolha o arquivo de entrada");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Arquivos de Texto", "txt"));

        // Exibindo o diálogo de seleção de arquivo
        int result = fileChooser.showOpenDialog(null);

        // Verificando se o usuário selecionou um arquivo
        if (result == JFileChooser.APPROVE_OPTION) {
            // Obtendo o arquivo selecionado
            java.io.File selectedFile = fileChooser.getSelectedFile();

            // Criando um InputStream a partir do arquivo selecionado
            InputStream input = new FileInputStream(selectedFile);
            ANTLRInputStream stream = new ANTLRInputStream(input);

            // Lexer
            SimpAlgLexer lexer = new SimpAlgLexer(stream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Parser
            SimpAlgParser parser = new SimpAlgParser(tokens);

            // Árvore de análise sintática
            ParseTree tree = parser.program();


            // Imprimir a árvore de análise sintática
            System.out.println(tree.toStringTree(parser));

            System.out.println("Finalizando programa");
        } else {
            System.out.println("Nenhum arquivo selecionado. Encerrando o programa.");
        }
    }
}
