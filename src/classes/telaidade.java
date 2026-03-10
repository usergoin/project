/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package classes;
import java.time.Year;
import javax.swing.JOptionPane;

public class telaidade extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(telaidade.class.getName());

    /**
     * Creates new form telaidade
     */
    public telaidade() {
        initComponents();
        lblBalao.setVisible(false);
        lblCuriosidade.setVisible(false);
        javax.swing.JSpinner.NumberEditor editor = new javax.swing.JSpinner.NumberEditor(txtAN, "#");
        txtAN.setEditor(editor);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCuriosidade = new javax.swing.JLabel();
        lblBalao = new javax.swing.JLabel();
        lblIdade = new javax.swing.JLabel();
        lblAnodeNascimento = new javax.swing.JLabel();
        lblBalaoNascimento = new javax.swing.JLabel();
        txtAN = new javax.swing.JSpinner();
        btnCalc = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblBalaoIdade = new javax.swing.JLabel();
        lblFig1 = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCuriosidade.setBackground(new java.awt.Color(255, 255, 255));
        lblCuriosidade.setFont(new java.awt.Font("Arial Nova", 0, 12)); // NOI18N
        lblCuriosidade.setForeground(new java.awt.Color(255, 255, 255));
        lblCuriosidade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCuriosidade.setText("Curiosidade");
        getContentPane().add(lblCuriosidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 270, 100));

        lblBalao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/classes/Design_sem_nome__4_-removebg-preview.png"))); // NOI18N
        getContentPane().add(lblBalao, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 290, 130));

        lblIdade.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblIdade.setForeground(new java.awt.Color(0, 0, 0));
        lblIdade.setText("0 ");
        getContentPane().add(lblIdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 110, 40));

        lblAnodeNascimento.setBackground(new java.awt.Color(255, 255, 255));
        lblAnodeNascimento.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblAnodeNascimento.setForeground(new java.awt.Color(255, 255, 255));
        lblAnodeNascimento.setText("Ano de Nascimento");
        getContentPane().add(lblAnodeNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 220, -1));

        lblBalaoNascimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/classes/image-removebg-preview (1).png"))); // NOI18N
        getContentPane().add(lblBalaoNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 270, -1));

        txtAN.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtAN.setModel(new javax.swing.SpinnerNumberModel(1500, 1500, 2026, 1));
        getContentPane().add(txtAN, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 130, -1));

        btnCalc.setBackground(new java.awt.Color(0, 0, 0));
        btnCalc.setForeground(new java.awt.Color(255, 255, 255));
        btnCalc.setText("Calcular");
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalc, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Idade");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 50, 40));

        lblBalaoIdade.setBackground(new java.awt.Color(255, 255, 255));
        lblBalaoIdade.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblBalaoIdade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/classes/image-removebg-preview.png"))); // NOI18N
        getContentPane().add(lblBalaoIdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 120, 80));

        lblFig1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/classes/Design_sem_nome-removebg-preview.png"))); // NOI18N
        getContentPane().add(lblFig1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, -10, 408, 126));

        lblFundo.setBackground(new java.awt.Color(255, 255, 255));
        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/classes/ChatGPT Image 19 de fev. de 2026, 19_13_04.png"))); // NOI18N
        getContentPane().add(lblFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcActionPerformed
       int an = Integer.parseInt(txtAN.getValue().toString());
       int id = 2026 - an;
       lblIdade.setText(Integer.toString(id));
 

    try {

  
        int anoNascimento = Integer.parseInt(txtAN.getValue().toString());
        int anoAtual = java.time.Year.now().getValue();
        int idade = anoAtual - anoNascimento;

        lblIdade.setText(String.valueOf(idade));

        String textoCuriosidade = CuriosidadeHistorica.obterTextoCuriosidade(anoNascimento);
    
        lblCuriosidade.setText(textoCuriosidade);
        
        lblBalao.setVisible(true);
        lblCuriosidade.setVisible(true);
        
        } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Erro ao calcular: " + e.getMessage());
        }
       
       
    }//GEN-LAST:event_btnCalcActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new telaidade().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAnodeNascimento;
    private javax.swing.JLabel lblBalao;
    private javax.swing.JLabel lblBalaoIdade;
    private javax.swing.JLabel lblBalaoNascimento;
    private javax.swing.JLabel lblCuriosidade;
    private javax.swing.JLabel lblFig1;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JSpinner txtAN;
    // End of variables declaration//GEN-END:variables
}
