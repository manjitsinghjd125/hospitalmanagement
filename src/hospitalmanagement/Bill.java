/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagement;

import java.awt.event.KeyEvent;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author manjitsingh
 */
public class Bill extends javax.swing.JFrame {

    /**
     * Creates new form Bill
     */
    public Bill() {
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

        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel7.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        jLabel7.setText("Hospital Bills");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(150, 20, 120, 20);

        jLabel1.setText("Bill Id:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 100, 39, 16);

        jLabel2.setText("Doctor charges:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 130, 100, 16);

        jLabel3.setText("Medicine charges:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 160, 113, 16);

        jLabel4.setText("Treatment charges:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 190, 121, 16);

        jLabel5.setText("Room charges:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 220, 93, 16);

        jLabel6.setText("Other charges:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(70, 250, 92, 16);

        jLabel8.setText("Total bill:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(110, 320, 60, 16);

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(170, 100, 90, 26);

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(170, 130, 90, 26);

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(170, 160, 90, 26);

        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(170, 190, 90, 26);

        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(170, 220, 90, 26);

        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField6);
        jTextField6.setBounds(170, 250, 90, 26);

        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField7KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField7);
        jTextField7.setBounds(170, 280, 90, 26);

        jLabel9.setText("Tax:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(130, 280, 30, 16);

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(110, 360, 88, 29);

        jButton2.setText("Home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(210, 360, 81, 29);
        getContentPane().add(jLabel10);
        jLabel10.setBounds(180, 310, 80, 22);

        setSize(new java.awt.Dimension(389, 477));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       this.setVisible(false);
        new Info().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       int bill,doc,treat,medi,room,other,tax;
        if(jTextField1.getText().equals("")&&jTextField2.getText().equals("")&&jTextField3.getText().equals("")&&jTextField4.getText().equals("")&&jTextField5.getText().equals("")&&jTextField6.getText().equals("")&&jTextField7.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Fill all Fields", "Error", JOptionPane.ERROR_MESSAGE);
        }
       else{
            
           doc=Integer.parseInt(jTextField2.getText());
           treat=Integer.parseInt(jTextField3.getText());
           medi=Integer.parseInt(jTextField4.getText());
           room=Integer.parseInt(jTextField5.getText());
           other=Integer.parseInt(jTextField6.getText());
           tax=Integer.parseInt(jTextField7.getText());
           jLabel10.setText(Integer.toString(doc+treat+medi+room+other+tax));
           int dialogButton = JOptionPane.YES_NO_OPTION;
           int dialogResult = JOptionPane.showConfirmDialog (null, "Would You Like to Save and generate this bill File?","Warning",dialogButton);
             if(dialogResult == JOptionPane.YES_OPTION){
  try{
           
            FileWriter writer= new FileWriter("bill.txt",true);
            

                writer.write("Bill id:-"+jTextField1.getText());
                writer.write("\r\n");
                writer.write("Doctor charges:-"+jTextField2.getText());
                writer.write("\r\n");
                writer.write("Treatment charges:-"+jTextField3.getText());
                writer.write("\r\n");
                writer.write("Medicine charges:-"+jTextField4.getText());
                writer.write("\r\n");
                writer.write("Room charges:-"+jTextField5.getText());
                writer.write("\r\n");
                writer.write("other charges:-"+jTextField6.getText());
                writer.write("\r\n");
                writer.write("Tax:-"+jTextField7.getText());
                writer.write("\r\n");
                writer.write("Total Bill:-"+jLabel10.getText());
                writer.write("\r\n");
           
            writer.close();
            JOptionPane.showMessageDialog(null, "File is generated", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(IOException e){
            e.printStackTrace();
        }
             }
           
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        char vchar = evt.getKeyChar();
        if (!(Character.isDigit(vchar)
            || (vchar == KeyEvent.VK_BACK_SPACE)
            || (vchar == KeyEvent.VK_DELETE))
        ||(jTextField1.getText().length()>=4)) {
        evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
         char vchar = evt.getKeyChar();
        if (!(Character.isDigit(vchar)
            || (vchar == KeyEvent.VK_BACK_SPACE)
            || (vchar == KeyEvent.VK_DELETE))
        ||(jTextField2.getText().length()>=4)) {
        evt.consume();
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
       char vchar = evt.getKeyChar();
        if (!(Character.isDigit(vchar)
            || (vchar == KeyEvent.VK_BACK_SPACE)
            || (vchar == KeyEvent.VK_DELETE))
        ||(jTextField3.getText().length()>=4)) {
        evt.consume();
        }
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        char vchar = evt.getKeyChar();
        if (!(Character.isDigit(vchar)
            || (vchar == KeyEvent.VK_BACK_SPACE)
            || (vchar == KeyEvent.VK_DELETE))
        ||(jTextField4.getText().length()>=4)) {
        evt.consume();
        }
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        char vchar = evt.getKeyChar();
        if (!(Character.isDigit(vchar)
            || (vchar == KeyEvent.VK_BACK_SPACE)
            || (vchar == KeyEvent.VK_DELETE))
        ||(jTextField5.getText().length()>=4)) {
        evt.consume();
        }
    }//GEN-LAST:event_jTextField5KeyTyped

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
       char vchar = evt.getKeyChar();
        if (!(Character.isDigit(vchar)
            || (vchar == KeyEvent.VK_BACK_SPACE)
            || (vchar == KeyEvent.VK_DELETE))
        ||(jTextField6.getText().length()>=4)) {
        evt.consume();
        }
    }//GEN-LAST:event_jTextField6KeyTyped

    private void jTextField7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyTyped
        char vchar = evt.getKeyChar();
        if (!(Character.isDigit(vchar)
            || (vchar == KeyEvent.VK_BACK_SPACE)
            || (vchar == KeyEvent.VK_DELETE))
        ||(jTextField7.getText().length()>=4)) {
        evt.consume();
        }
    }//GEN-LAST:event_jTextField7KeyTyped

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
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}