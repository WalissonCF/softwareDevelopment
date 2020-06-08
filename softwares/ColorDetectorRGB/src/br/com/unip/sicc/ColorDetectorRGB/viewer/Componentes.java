
package br.com.unip.sicc.ColorDetectorRGB.viewer;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JSeparator;

public class Componentes {
    
    public static JSeparator montaSeparadora(int x, int y, int altura, int largura) {
        JSeparator linha = new JSeparator();
        linha.setForeground(Color.WHITE);
        linha.setBounds(x, y, altura, largura);
        return linha;
    }
    
    public static JSeparator montaSeparadoraAlteraCor(int x, int y, int altura, int largura) {
        JSeparator linha = new JSeparator();
        linha.setForeground(Color.BLACK);
        linha.setBounds(x, y, altura, largura);
        return linha;
    }
    
     public static JLabel montaTexto(String conteudo, int tamanhoFonte, Color corfonte, int x, int y, int altura, int largura) {
        JLabel texto = new JLabel(conteudo);
        texto.setForeground(corfonte);
        texto.setFont(new Font("Arial", Font.PLAIN, tamanhoFonte));
        texto.setBounds(x, y, altura, largura);
        return texto;
    }
     
     public ImageIcon buscaImagem(String nomeArquivo) {
        ImageIcon imagem = new ImageIcon(getClass().getResource("/br/com/unip/sicc/ColorDetectorRGB/image/" + nomeArquivo));
        return imagem;
    }
}
