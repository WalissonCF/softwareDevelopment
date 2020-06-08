package br.com.unip.sicc.ColorDetectorRGB.viewer;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.text.MaskFormatter;

public class TelaPadrao {

    private PainelPadrao pnlPadrao = new PainelPadrao();
    private JFrame telaPadrao = new JFrame();
    private Componentes componentes = new Componentes();

    String cor;
    String coresRGB;
    private JLabel imagemBlackAndWhite;
    
    private final String actionName = "TECLA_ENTER";
    private JTextField txfDigiteCor;

    public TelaPadrao() {
        telaPadrao.setSize(900, 500);
        telaPadrao.add(montaTelaPadrao());
        telaPadrao.setLocationRelativeTo(null);
        telaPadrao.setUndecorated(true);
        telaPadrao.setVisible(true);
    }

    public JPanel montaTelaPadrao() {
        JTextArea txaMenu = new JTextArea();
        txaMenu.setEditable(false);
        txaMenu.setBorder(null);
        txaMenu.setBounds(0, 0, 250, 600);
        txaMenu.setBackground(new Color(17, 17, 17));

        JLabel lblTitulo = new JLabel();
        lblTitulo.setBounds(270, -20, 300, 100);
        lblTitulo.setFont(new Font("Arial", Font.PLAIN, 20));
        lblTitulo.setText("Color detector - RGB em binário");
        lblTitulo.setForeground(new Color(17, 17, 17));

        JLabel lblCorEscolhida = new JLabel();
        lblCorEscolhida.setBounds(320, 320, 600, 100);
        lblCorEscolhida.setFont(new Font("Arial", Font.PLAIN, 14));
        lblCorEscolhida.setForeground(new Color(17, 17, 17));

        JLabel lblDigiteCor = new JLabel();
        lblDigiteCor.setBounds(20, 41, 250, 100);
        lblDigiteCor.setFont(new Font("Arial", Font.PLAIN, 13));
        lblDigiteCor.setText("Digite o RGB em binário:");
        lblDigiteCor.setForeground(Color.WHITE);

        txfDigiteCor = new JTextField();
        try {
            txfDigiteCor = new JFormattedTextField(new MaskFormatter("#, #, #"));
        } catch (ParseException ex) {
        }
        txfDigiteCor.setBorder(null);
        txfDigiteCor.setForeground(Color.WHITE);
        txfDigiteCor.setBackground(new Color(17, 17, 17));
        txfDigiteCor.setBounds(20, 100, 208, 30);

        JLabel lblImageCor = new JLabel();
        lblImageCor.setBounds(320, 380, 500, 50);

//        imagemBlackAndWhite = new JLabel();
//        imagemBlackAndWhite.setBounds(200, 50, 400, 400);
//        
        
        JButton btnConsulta = new JButton();
        btnConsulta.setText("Consultar");
        btnConsulta.setBorder(null);
        btnConsulta.setFocusPainted(false);
        btnConsulta.setBackground(new Color(41, 41, 41));
        btnConsulta.setFont(new Font("Arial", Font.BOLD, 15));
        btnConsulta.setForeground(Color.WHITE);
        btnConsulta.setBounds(20, 140, 208, 25);
        btnConsulta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                cor = txfDigiteCor.getText();

                switch (cor) {
                    case "0, 0, 0":
                        coresRGB = "Preto";
                        lblImageCor.setIcon(componentes.buscaImagem("preto.png"));
                        lblCorEscolhida.setText("Cor resultante: " + coresRGB);
                        lblImageCor.setVisible(true);
                        break;
                    case "1, 0, 0":
                        coresRGB = "Vermelho";
                        lblImageCor.setIcon(componentes.buscaImagem("vermelho.png"));
                        lblCorEscolhida.setText("Cor resultante: " + coresRGB);
                        lblImageCor.setVisible(true);
                        break;
                    case "0, 1, 0":
                        coresRGB = "Verde";
                        lblImageCor.setIcon(componentes.buscaImagem("verde.png"));
                        lblCorEscolhida.setText("Cor resultante: " + coresRGB);
                        lblImageCor.setVisible(true);
                        break;
                    case "0, 0, 1":
                        coresRGB = "Azul";
                        lblImageCor.setIcon(componentes.buscaImagem("azul.png"));
                        lblCorEscolhida.setText("Cor resultante: " + coresRGB);
                        lblImageCor.setVisible(true);
                        break;
                    case "1, 1, 0":
                        coresRGB = "Amarelo";
                        lblImageCor.setIcon(componentes.buscaImagem("amarelo.png"));
                        lblCorEscolhida.setText("Cor resultante: " + coresRGB);
                        lblImageCor.setVisible(true);
                        break;
                    case "1, 0, 1":
                        coresRGB = "Magenta";
                        lblImageCor.setIcon(componentes.buscaImagem("magenta.png"));
                        lblCorEscolhida.setText("Cor resultante: " + coresRGB);
                        lblImageCor.setVisible(true);
                        break;
                    case "0, 1, 1":
                        coresRGB = "Ciano";
                        lblImageCor.setIcon(componentes.buscaImagem("ciano.png"));
                        lblCorEscolhida.setText("Cor resultante: " + coresRGB);
                        lblImageCor.setVisible(true);
                        break;
                    case "1, 1, 1":
                        coresRGB = "Branco";
                        lblImageCor.setIcon(componentes.buscaImagem("branco.png"));
                        lblCorEscolhida.setText("Cor resultante: " + coresRGB);
                        lblImageCor.setVisible(true);
                        break;
                     default:
                         lblCorEscolhida.setText("<html><font color='yellow'><b>Alerta:</b></font> Isso não corresponde a uma cor em binário. Por favor siga o exemplo abaixo<br> "
                                 + "entrando com dados de 0 a 1.<br>"
                                 + "Exemplo:(1, 0, 0) e em seguida clique em \"Consultar\".</html>"); 
                         lblImageCor.setVisible(false);
                         break;
                }
            }
        });
        
        Action actionTecla = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                btnConsulta.doClick();
            }
        };
        KeyStroke keyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0);
        InputMap inputMap = btnConsulta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(keyStroke, actionName);
        ActionMap actionMap = btnConsulta.getActionMap();
        actionMap.put(actionName, actionTecla);

        JLabel lblExemploCor = new JLabel();
        lblExemploCor.setBounds(271, 75, 300, 50);
        lblExemploCor.setFont(new Font("Arial", Font.BOLD, 14));
        lblExemploCor.setText("Exemplo: ");
        lblExemploCor.setForeground(new Color(17, 17, 17));

        pnlPadrao.add(componentes.montaTexto("<html><b>Desenvolvido por: </b><br>"
                + "Walisson Carvalho Ferreira <b>RA:</br> D62EBA-0</b><br>"
                + "<b>Turma:</b> CC05P06</html>", 14, Color.BLACK, 271, 105, 300, 120));
        pnlPadrao.add(lblImageCor);
        pnlPadrao.add(componentes.montaTexto("<html> Software desenvolvido com base em conteúdo apresentado em aula de Computação<br>"
                + "Gráfica, onde o intuito do mesmo é executar a verificação de cores RGB em binário.</html>", 14, Color.BLACK, 271, 10, 600, 100));
        pnlPadrao.add(componentes.montaTexto("<html>digite o código RGB em binário: (0, 0, 0) e logo a cor será representada abaixo.</html>", 14, Color.BLACK, 271, 93, 600, 50));
        pnlPadrao.add(lblExemploCor);
        pnlPadrao.add(btnConsulta);
        pnlPadrao.add(txfDigiteCor);
        pnlPadrao.add(lblDigiteCor);
        pnlPadrao.add(componentes.montaSeparadora(20, 132, 208, 1));
        pnlPadrao.add(componentes.montaTexto("Software desenvolvido por aluno da universidade paulista (UNIP)", 12, Color.BLACK, 400, 475, 600, 13));
        pnlPadrao.add(componentes.montaTexto("- São Paulo - Alphaville, 2020 -", 12, Color.BLACK, 485, 450, 600, 13));
        pnlPadrao.add(componentes.montaSeparadoraAlteraCor(300, 470, 550, 1));
        pnlPadrao.add(lblCorEscolhida);
        pnlPadrao.add(lblTitulo);
        pnlPadrao.add(txaMenu);

        return pnlPadrao;
    }
}
