/*
 * Formulario com informações do projeto
 */
package estoque;

/**
 *
 * @author Fabiano, Antonio
 */
public class FrmSobre extends javax.swing.JFrame {

    /**
     * Creates new form FrmSobre
     */
    public FrmSobre() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSobre = new javax.swing.JPanel();
        pnlDescricao = new javax.swing.JPanel();
        lblDescricaoSistema = new javax.swing.JLabel();
        lblAutores = new javax.swing.JLabel();
        LblAutor1 = new javax.swing.JLabel();
        LblAutor2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sobre o Sistema");

        pnlSobre.setBackground(new java.awt.Color(0, 102, 102));

        pnlDescricao.setBackground(new java.awt.Color(0, 102, 102));
        pnlDescricao.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Descrição", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        lblDescricaoSistema.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDescricaoSistema.setForeground(new java.awt.Color(255, 255, 255));
        lblDescricaoSistema.setText("Este sistema é um protótipo utilizado para cadastro de produtos para uma loja de comércio eletrônico.");

        lblAutores.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAutores.setForeground(new java.awt.Color(255, 255, 255));
        lblAutores.setText("Autores:");

        LblAutor1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LblAutor1.setForeground(new java.awt.Color(255, 255, 255));
        LblAutor1.setText("Fabiano Amaral Alves");

        LblAutor2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LblAutor2.setForeground(new java.awt.Color(255, 255, 255));
        LblAutor2.setText("Antôno Carlos Ramos Filho");

        javax.swing.GroupLayout pnlDescricaoLayout = new javax.swing.GroupLayout(pnlDescricao);
        pnlDescricao.setLayout(pnlDescricaoLayout);
        pnlDescricaoLayout.setHorizontalGroup(
            pnlDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDescricaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescricaoSistema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlDescricaoLayout.createSequentialGroup()
                        .addComponent(lblAutores, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblAutor1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblAutor2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlDescricaoLayout.setVerticalGroup(
            pnlDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDescricaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDescricaoSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAutores, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblAutor2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblAutor1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlSobreLayout = new javax.swing.GroupLayout(pnlSobre);
        pnlSobre.setLayout(pnlSobreLayout);
        pnlSobreLayout.setHorizontalGroup(
            pnlSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSobreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlSobreLayout.setVerticalGroup(
            pnlSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSobreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSobre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSobre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FrmSobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSobre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblAutor1;
    private javax.swing.JLabel LblAutor2;
    private javax.swing.JLabel lblAutores;
    private javax.swing.JLabel lblDescricaoSistema;
    private javax.swing.JPanel pnlDescricao;
    private javax.swing.JPanel pnlSobre;
    // End of variables declaration//GEN-END:variables
}
