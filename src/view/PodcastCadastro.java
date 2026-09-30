
package view;

import com.mycompany.atvd3.Podcast;
import com.mycompany.atvd3.PodcastJPA;
import javax.swing.JOptionPane;


public class PodcastCadastro extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PodcastCadastro.class.getName());

    public PodcastCadastro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFundo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblSubtitulo = new javax.swing.JLabel();
        lblProdutor = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        lblDuracao = new javax.swing.JLabel();
        lblURL = new javax.swing.JLabel();
        pnlProdutor = new javax.swing.JScrollPane();
        txtProdutor = new javax.swing.JTextPane();
        pnlEpisodio = new javax.swing.JScrollPane();
        txtEpisodio = new javax.swing.JTextPane();
        pnlNum = new javax.swing.JScrollPane();
        txtNum = new javax.swing.JTextPane();
        pnlDuracao = new javax.swing.JScrollPane();
        txtDuracao = new javax.swing.JTextPane();
        pnlURL = new javax.swing.JScrollPane();
        txtURL = new javax.swing.JTextPane();
        btnListagem = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlFundo.setBackground(new java.awt.Color(204, 204, 204));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo.setText("CENAFLIX");

        lblSubtitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblSubtitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblSubtitulo.setText("CADASTRAR PODCAST");

        lblProdutor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblProdutor.setForeground(new java.awt.Color(0, 0, 0));
        lblProdutor.setText("Produtor");

        lblNome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNome.setForeground(new java.awt.Color(0, 0, 0));
        lblNome.setText("Nome do Episódio");

        lblNumero.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNumero.setForeground(new java.awt.Color(0, 0, 0));
        lblNumero.setText("Nº do Episódio");

        lblDuracao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDuracao.setForeground(new java.awt.Color(0, 0, 0));
        lblDuracao.setText("Duração");

        lblURL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblURL.setForeground(new java.awt.Color(0, 0, 0));
        lblURL.setText("URL do Repositório");

        txtProdutor.setBackground(new java.awt.Color(255, 255, 255));
        pnlProdutor.setViewportView(txtProdutor);

        txtEpisodio.setBackground(new java.awt.Color(255, 255, 255));
        pnlEpisodio.setViewportView(txtEpisodio);

        txtNum.setBackground(new java.awt.Color(255, 255, 255));
        pnlNum.setViewportView(txtNum);

        txtDuracao.setBackground(new java.awt.Color(255, 255, 255));
        pnlDuracao.setViewportView(txtDuracao);

        txtURL.setBackground(new java.awt.Color(255, 255, 255));
        pnlURL.setViewportView(txtURL);

        btnListagem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnListagem.setForeground(new java.awt.Color(0, 0, 0));
        btnListagem.setText("Ver Listagem");
        btnListagem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnListagem.addActionListener(this::btnListagemActionPerformed);

        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(0, 0, 0));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCadastrar.addActionListener(this::btnCadastrarActionPerformed);

        javax.swing.GroupLayout pnlFundoLayout = new javax.swing.GroupLayout(pnlFundo);
        pnlFundo.setLayout(pnlFundoLayout);
        pnlFundoLayout.setHorizontalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(pnlEpisodio, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pnlProdutor, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFundoLayout.createSequentialGroup()
                                .addGap(185, 185, 185)
                                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblDuracao)
                                    .addComponent(lblProdutor)
                                    .addComponent(lblNome)
                                    .addGroup(pnlFundoLayout.createSequentialGroup()
                                        .addComponent(lblNumero)
                                        .addGap(18, 18, 18)
                                        .addComponent(pnlNum, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblURL)
                                    .addComponent(pnlDuracao)
                                    .addComponent(pnlURL)))
                            .addGroup(pnlFundoLayout.createSequentialGroup()
                                .addGap(193, 193, 193)
                                .addComponent(lblTitulo))
                            .addGroup(pnlFundoLayout.createSequentialGroup()
                                .addGap(174, 174, 174)
                                .addComponent(lblSubtitulo))))
                    .addGroup(pnlFundoLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(btnListagem, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        pnlFundoLayout.setVerticalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(8, 8, 8)
                .addComponent(lblSubtitulo)
                .addGap(18, 18, 18)
                .addComponent(lblProdutor)
                .addGap(7, 7, 7)
                .addComponent(pnlProdutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlEpisodio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNumero)
                    .addComponent(pnlNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(lblURL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlURL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListagem)
                    .addComponent(btnCadastrar))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        try {

        Podcast p = new Podcast();

        p.setProdutor(txtProdutor.getText());
        p.setNome(txtEpisodio.getText());
        p.setNum(Integer.parseInt(txtNum.getText()));
        p.setDuracao(java.time.LocalTime.parse(txtDuracao.getText()));
        p.setUrl(txtURL.getText());

        PodcastJPA.cadastrar(p);

        JOptionPane.showMessageDialog(this, "Podcast cadastrado com sucesso!");

        this.dispose();

        } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "O número do episódio deve ser um número inteiro!", "Erro", JOptionPane.ERROR_MESSAGE);

        } catch (java.time.format.DateTimeParseException e) {
        JOptionPane.showMessageDialog(this, "A duração deve estar no formato HH:mm:ss.\nExemplo: 00:45:30", "Erro", JOptionPane.ERROR_MESSAGE);
      }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListagemActionPerformed
        PodcastListagem tela = new PodcastListagem();
        tela.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btnListagemActionPerformed
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new PodcastCadastro().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnListagem;
    private javax.swing.JLabel lblDuracao;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblProdutor;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblURL;
    private javax.swing.JScrollPane pnlDuracao;
    private javax.swing.JScrollPane pnlEpisodio;
    private javax.swing.JPanel pnlFundo;
    private javax.swing.JScrollPane pnlNum;
    private javax.swing.JScrollPane pnlProdutor;
    private javax.swing.JScrollPane pnlURL;
    private javax.swing.JTextPane txtDuracao;
    private javax.swing.JTextPane txtEpisodio;
    private javax.swing.JTextPane txtNum;
    private javax.swing.JTextPane txtProdutor;
    private javax.swing.JTextPane txtURL;
    // End of variables declaration//GEN-END:variables
}
