package br.com.unip.sicc.ColorDetectorRGB.viewer;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PainelPadrao extends JPanel {
    
    public PainelPadrao() {
        montaPainelPadrao();     
    }
    
    public void montaPainelPadrao() {
        JLabel btnFechar = new JLabel("X");
        btnFechar.setForeground(new Color(17, 17, 17));
        btnFechar.setFont(new Font("Arial", Font.BOLD, 25));
        btnFechar.setBounds(870, 10, 25, 25);
        btnFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                System.exit(0);
            }
        });
        
        this.setLayout(null);
        this.add(btnFechar);
        this.setBackground(new Color(245, 245, 245));
    }

    void add(ImageIcon buscaImagem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
