/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package galilea;

import javax.swing.JOptionPane;

/**
 *
 * @author jaret
 */
public class inicio extends javax.swing.JFrame {

    /**
     * Creates new form inicio
     */
    public inicio() {
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

        jLabel2 = new javax.swing.JLabel();
        USER = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        PASS = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/kisspng-human-behavior-head-neck-jaw-thumb-male-user-5ab0a37a328242.6294260515215256262069.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, 450, 510));

        USER.setBackground(new java.awt.Color(0, 51, 102));
        USER.setFont(new java.awt.Font("Segoe UI Black", 2, 36)); // NOI18N
        USER.setForeground(new java.awt.Color(255, 255, 255));
        USER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                USERActionPerformed(evt);
            }
        });
        getContentPane().add(USER, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 530, 90));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 51));
        jLabel3.setText("CONTRASE??A");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 430, 100));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 51));
        jLabel4.setText("USUARIO");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 430, 100));

        jButton1.setBackground(new java.awt.Color(255, 102, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI Historic", 1, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 102));
        jButton1.setText("INGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 540, 250, 100));

        PASS.setBackground(new java.awt.Color(0, 51, 102));
        PASS.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        PASS.setForeground(new java.awt.Color(255, 255, 255));
        PASS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PASSActionPerformed(evt);
            }
        });
        getContentPane().add(PASS, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 530, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1280x720-991510-texture-abstract-blue-white-digital-art.jpg"))); // NOI18N
        jLabel1.setText("  ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1276, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void USERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_USERActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_USERActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String admin = USER.getText();
        String contra = PASS.getText();
        if(admin.isEmpty() || contra.isEmpty()){
            JOptionPane.showMessageDialog(null, "algun campo esta vacio");
        }else{
            if(admin.equals("Jareth Franco")&&contra.equals("201807378")){
            // aca tengo que llamar al siguiente jframe
            dispose();
            info call = new info();
            call.setVisible(true);
            }else{
            JOptionPane.showMessageDialog(null,"alguno de los campos es incorrecto");
            }
        
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void PASSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PASSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PASSActionPerformed

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
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PASS;
    private javax.swing.JTextField USER;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
