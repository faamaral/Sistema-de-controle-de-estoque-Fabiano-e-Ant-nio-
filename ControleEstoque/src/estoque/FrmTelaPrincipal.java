/*
 * Tela de acesso ao sistema
 */
package estoque;

import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import javax.swing.AbstractAction;
import javax.swing.JMenuItem;

/**
 *
 * @author Fabiano
 */
public class FrmTelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmTelaPrincipal
     */
    
    FrmCadastroProduto fcp = null;
    FrmSobre fs = null;
    public FrmTelaPrincipal() {
        initComponents();
        lblUsuarioLogado.setText("Bem Vindo "+ FrmTelaLoginEstoque.usuario);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        lblUsuarioLogado = new javax.swing.JLabel();
        lblFundoLogin = new javax.swing.JLabel();
        mnbMenupricipal = new javax.swing.JMenuBar();
        mnCadastro = new javax.swing.JMenu();
        mniProduto = new javax.swing.JMenuItem();
        mnJanela = new javax.swing.JMenu();
        mnSobre = new javax.swing.JMenu();
        mnSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Controle de Estoque");

        pnlPrincipal.setBackground(new java.awt.Color(51, 255, 255));
        pnlPrincipal.setPreferredSize(new java.awt.Dimension(758, 434));
        pnlPrincipal.setLayout(null);

        lblUsuarioLogado.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblUsuarioLogado.setForeground(new java.awt.Color(0, 204, 0));
        pnlPrincipal.add(lblUsuarioLogado);
        lblUsuarioLogado.setBounds(420, 50, 310, 90);

        lblFundoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/veja-o-que-um-armazem-precisa-para-ser-efetivo.jpg"))); // NOI18N
        lblFundoLogin.setText("jLabel1");
        pnlPrincipal.add(lblFundoLogin);
        lblFundoLogin.setBounds(0, 0, 760, 434);

        mnCadastro.setText("Cadastro");

        mniProduto.setText("Produto");
        mniProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniProdutoActionPerformed(evt);
            }
        });
        mnCadastro.add(mniProduto);

        mnbMenupricipal.add(mnCadastro);

        mnJanela.setText("Janela");
        mnJanela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnJanelaMouseClicked(evt);
            }
        });
        mnbMenupricipal.add(mnJanela);

        mnSobre.setText("Sobre");
        mnSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnSobreMouseClicked(evt);
            }
        });
        mnbMenupricipal.add(mnSobre);

        mnSair.setText("Sair");
        mnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnSairMouseClicked(evt);
            }
        });
        mnbMenupricipal.add(mnSair);

        setJMenuBar(mnbMenupricipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mniProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniProdutoActionPerformed
        if(fcp == null)
        {
            fcp = new FrmCadastroProduto();
            fcp.setVisible(true);
        }
        else
        {
            fcp.requestFocus();
            fcp.setVisible(true);
        }
    }//GEN-LAST:event_mniProdutoActionPerformed

    private void mnSobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnSobreMouseClicked
        if(fs == null)
        {
            fs = new FrmSobre();
            fs.setVisible(true);
        }
        else
        {
            fs.requestFocus();
            fs.setVisible(true);
        }
    }//GEN-LAST:event_mnSobreMouseClicked

    private void mnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnSairMouseClicked
        WindowEvent we = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(we);
    }//GEN-LAST:event_mnSairMouseClicked

    private void mnJanelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnJanelaMouseClicked
        mnJanela.removeAll();
        for(Frame frame : Frame.getFrames())
        {
            mnJanela.add(new JMenuItem(new AbstractAction(frame.getTitle()) 
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    frame.requestFocus(); //To change body of generated methods, choose Tools | Templates.
                }
            }));
            
  
        }
    }//GEN-LAST:event_mnJanelaMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblFundoLogin;
    private javax.swing.JLabel lblUsuarioLogado;
    private javax.swing.JMenu mnCadastro;
    private javax.swing.JMenu mnJanela;
    private javax.swing.JMenu mnSair;
    private javax.swing.JMenu mnSobre;
    private javax.swing.JMenuBar mnbMenupricipal;
    private javax.swing.JMenuItem mniProduto;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables
}
