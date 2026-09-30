package view;

import com.mycompany.atvd3.Podcast;
import com.mycompany.atvd3.PodcastJPA;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class PodcastListagem extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PodcastListagem.class.getName());


    public PodcastListagem() {
        initComponents();
        
        tblListagem.setModel(
        montarTabela(PodcastJPA.filtrarTodos())
    );
}

public PodcastListagem(String tipoUsuario) {
    initComponents();

    tblListagem.setModel(
        montarTabela(PodcastJPA.filtrarTodos())
    );

    configurarPermissoes(tipoUsuario);
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFundo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblSubtitulo = new javax.swing.JLabel();
        lblPesquisar = new javax.swing.JLabel();
        pnlPesquisa = new javax.swing.JScrollPane();
        txtPesquisa = new javax.swing.JTextPane();
        btnBuscar = new javax.swing.JButton();
        pnlTabelaListagem = new javax.swing.JScrollPane();
        tblListagem = new javax.swing.JTable();
        btnCadastrar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        pnlFundo.setBackground(new java.awt.Color(204, 204, 204));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo.setText("CENAFLIX");

        lblSubtitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblSubtitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblSubtitulo.setText("LISTAGEM");

        lblPesquisar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPesquisar.setForeground(new java.awt.Color(0, 0, 0));
        lblPesquisar.setText("Pesquisar podcast por produtor");

        pnlPesquisa.setBackground(new java.awt.Color(255, 255, 255));

        txtPesquisa.setBackground(new java.awt.Color(255, 255, 255));
        pnlPesquisa.setViewportView(txtPesquisa);

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscar.addActionListener(this::btnBuscarActionPerformed);

        tblListagem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        pnlTabelaListagem.setViewportView(tblListagem);

        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(0, 0, 0));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCadastrar.addActionListener(this::btnCadastrarActionPerformed);

        btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(0, 0, 0));
        btnExcluir.setText("Excluir");
        btnExcluir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnExcluir.addActionListener(this::btnExcluirActionPerformed);

        javax.swing.GroupLayout pnlFundoLayout = new javax.swing.GroupLayout(pnlFundo);
        pnlFundo.setLayout(pnlFundoLayout);
        pnlFundoLayout.setHorizontalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(lblTitulo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlFundoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFundoLayout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnlFundoLayout.createSequentialGroup()
                                    .addGap(287, 287, 287)
                                    .addComponent(lblSubtitulo))
                                .addGroup(pnlFundoLayout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(pnlTabelaListagem, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlFundoLayout.createSequentialGroup()
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        pnlFundoLayout.setVerticalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFundoLayout.createSequentialGroup()
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFundoLayout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSubtitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlPesquisa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPesquisar, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(pnlFundoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBuscar)))
                .addGap(25, 25, 25)
                .addComponent(pnlTabelaListagem, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnExcluir))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFundo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void configurarPermissoes(String tipoUsuario) {

    if (tipoUsuario == null) {
        return;
    }

    if (tipoUsuario.equalsIgnoreCase("Administrador")) {

        btnCadastrar.setEnabled(true);
        btnExcluir.setEnabled(true);

    } else if (tipoUsuario.equalsIgnoreCase("Operador")) {

        btnCadastrar.setEnabled(true);
        btnExcluir.setEnabled(false);

    } else if (tipoUsuario.equalsIgnoreCase("Usuario")) {

        btnCadastrar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }
}
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        List<Podcast> lista = PodcastJPA.filtrarPorProdutor(txtPesquisa.getText());
        tblListagem.setModel(montarTabela(lista));
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        PodcastCadastro tela =new PodcastCadastro();
        tela.setVisible(true);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        List<Podcast> lista = PodcastJPA.filtrarTodos();
        tblListagem.setModel(montarTabela(lista));
    }//GEN-LAST:event_formWindowGainedFocus

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        String id = getIdItemSelecionado();

    if (id == null) {
        return;
    }

    int resposta = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir este podcast?", "Confirmar exclusão", JOptionPane.YES_NO_OPTION);

    if (resposta == JOptionPane.YES_OPTION) {

        PodcastJPA.excluir(Integer.parseInt(id));

        JOptionPane.showMessageDialog(this, "Podcast excluído com sucesso!");

        tblListagem.setModel(montarTabela(PodcastJPA.filtrarTodos()));
      }
    }//GEN-LAST:event_btnExcluirActionPerformed

 
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new PodcastListagem().setVisible(true));
    }

    private DefaultTableModel montarTabela(List<Podcast> lista) {
        String[] colunas = {"ID", "Produtor", "Nome do Episódio", "Nº do Espisódio", "Duração", "URL do Repositório"};
        DefaultTableModel tabela = new DefaultTableModel();
        tabela.setColumnIdentifiers(colunas);
        
        for (int i = 0; lista.size() > i;i++) {
            Podcast p = lista.get(i);
            
            String[] linha = {
                Integer.toString(p.getId()),
                p.getProdutor(),
                p.getNome(),
                Integer.toString(p.getNum()),
                p.getDuracao().toString(),
                p.getUrl()
            };
            tabela.addRow(linha);
        }
        return tabela;
    }

    private String getIdItemSelecionado() {

    int posicao = tblListagem.getSelectedRow();

    if (posicao == -1) {
        JOptionPane.showMessageDialog(this, "Selecione um item da tabela.");
        
        return null;
    }

    return tblListagem.getValueAt(posicao, 0).toString();
}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JLabel lblPesquisar;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlFundo;
    private javax.swing.JScrollPane pnlPesquisa;
    private javax.swing.JScrollPane pnlTabelaListagem;
    private javax.swing.JTable tblListagem;
    private javax.swing.JTextPane txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
