package pacote;

import java.util.Arrays;
import javax.swing.DefaultListModel;

public class TelaVetor extends javax.swing.JFrame {
    
    int vetor[] = new int[5];
    DefaultListModel lista = new DefaultListModel();
    int itemSelecionado = 0;
    
    public TelaVetor() {
        initComponents();
        
        for (int cont = 0; cont < vetor.length; cont++){
            lista.addElement(vetor[cont]);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spiNumero = new javax.swing.JSpinner();
        btnAdicionar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblPosicaoVetor = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstVetor = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        spiNumero.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnAdicionar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnRemover.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnOrdenar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnOrdenar.setText("Ordenar");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Vetor");

        lblPosicaoVetor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPosicaoVetor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPosicaoVetor.setText("[0]");

        lstVetor.setModel(lista);
        lstVetor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstVetorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstVetor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(spiNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOrdenar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 14, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(46, 46, 46)
                        .addComponent(lblPosicaoVetor, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spiNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionar))
                .addGap(18, 18, 18)
                .addComponent(btnRemover)
                .addGap(18, 18, 18)
                .addComponent(btnOrdenar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblPosicaoVetor))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        vetor[itemSelecionado] = 0;
        
        lista.removeAllElements();
        for (int cont = 0; cont < vetor.length; cont++){
            lista.addElement(vetor[cont]);
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        Arrays.sort(vetor);
        
        lista.removeAllElements();
        for (int cont = 0; cont < vetor.length; cont++){
            lista.addElement(vetor[cont]);
        }
    }//GEN-LAST:event_btnOrdenarActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        vetor[itemSelecionado] = Integer.parseInt(spiNumero.getValue().toString());
        lista.removeAllElements();
        
        for (int cont = 0; cont < vetor.length; cont++){
            lista.addElement(vetor[cont]);
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void lstVetorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstVetorMouseClicked
        itemSelecionado = lstVetor.getSelectedIndex();
        lblPosicaoVetor.setText("[" + itemSelecionado + "]");
    }//GEN-LAST:event_lstVetorMouseClicked

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
            java.util.logging.Logger.getLogger(TelaVetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVetor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPosicaoVetor;
    private javax.swing.JList<String> lstVetor;
    private javax.swing.JSpinner spiNumero;
    // End of variables declaration//GEN-END:variables
}
