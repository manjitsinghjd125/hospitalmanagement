/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagement;


import java.awt.event.KeyEvent;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author manjitsingh
 */
public class Inpatients extends javax.swing.JFrame {
List title= new ArrayList();
filegenreate file=new filegenreate();
    int index;
         List name=new ArrayList();
    List Age=new ArrayList();
    List Gender=new ArrayList();
    List Bloodgroup=new ArrayList();
    List Address=new ArrayList();
    List Postal=new ArrayList();
    List country=new ArrayList();
    List status=new ArrayList();
    List contact=new ArrayList();
    /**
     * Creates new form Inpatients
     */
    public Inpatients() {
        initComponents();
        name=file.data("name.txt");
            Age=file.data("age.txt");
             Gender=file.data("gender.txt");
              Bloodgroup=file.data("blood.txt");
               Address=file.data("address.txt");
                Postal=file.data("postal.txt");
                country=file.data("country.txt");
                contact=file.data("contact.txt");
                status=file.data("status.txt");
         tabledata();
    }
    public void tabledata(){
  
         DefaultTableModel model =(DefaultTableModel)jTable1.getModel();
    model.setColumnCount(0);
    model.setRowCount(0);
    
      model.addColumn("Name");
              model.addColumn("Age");
                    model.addColumn("Gender");
                    model.addColumn("Blood Group");
                            model.addColumn("Address");
                            model.addColumn("Postal");
                            model.addColumn("Country");
                            model.addColumn("Status");
                            model.addColumn("Contact");
                            
       
   for(int x=0;x<name.size();x++){
          if(status.get(x).equals("inpatient")){
                model.addRow(new Object[]{name.get(x),Age.get(x),Gender.get(x),Bloodgroup.get(x),Address.get(x),Postal.get(x),country.get(x),status.get(x),contact.get(x)});
                } 
    }
         
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(27, 82, 660, 450);

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(740, 500, 75, 29);

        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(850, 500, 75, 29);

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(960, 500, 84, 29);

        jLabel1.setText("Full Name:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(730, 90, 67, 16);

        jLabel2.setText("Age:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(770, 110, 28, 16);

        jLabel3.setText("Gender:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(750, 140, 48, 16);

        jLabel4.setText("Blood Group:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(710, 180, 81, 16);

        jLabel5.setText("Address:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(740, 220, 60, 16);

        jLabel6.setText("Postal code: ");
        jLabel6.setMinimumSize(new java.awt.Dimension(79, 16));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(730, 330, 80, 16);

        jLabel8.setText("Home country:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(710, 360, 93, 20);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Male");
        jRadioButton1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton1ItemStateChanged(evt);
            }
        });
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(800, 140, 61, 23);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Female");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(860, 140, 76, 23);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(800, 80, 117, 26);

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(800, 110, 130, 26);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select blood Group:", "A", "B", "O", "AB" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(800, 180, 179, 27);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(810, 220, 244, 84);

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(810, 320, 142, 26);

        jLabel9.setText("Status:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(760, 390, 43, 20);

        jLabel10.setText("Contact No.:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(720, 430, 79, 20);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(810, 360, 160, 30);

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField6);
        jTextField6.setBounds(810, 420, 170, 30);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Status:", "inpatient", "outpatient" }));
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(810, 390, 140, 30);

        jButton4.setText("Generate whole data in single File");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(290, 550, 250, 29);

        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(920, 0, 75, 29);

        jButton6.setText("Log out");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(990, 0, 92, 29);

        jLabel7.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        jLabel7.setText("InPatients Management");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(480, 30, 210, 20);

        setSize(new java.awt.Dimension(1080, 737));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try{
            int x = name.size();
            int row = jTable1.getSelectedRow();
            String data = (jTable1.getModel().getValueAt(row, 0).toString());
            //System.out.print(data);
            for(int i=0;i<x;i++){
                if(name.get(i)==data){
                    index=i;
                    //System.out.print((String)name.get(i));
                    jTextField1.setText((String)name.get(i));
                    jTextField2.setText((String)Age.get(i));
                    jTextField3.setText((String)Postal.get(i));
                    jTextField5.setText((String)country.get(i));
                    jTextField6.setText((String)contact.get(i));
                    jTextArea1.setText((String)Address.get(i));
                    if(Gender.get(i)=="Male"){
                        jRadioButton1.setSelected(true);
                    }
                    else if(Gender.get(i)=="Female"){
                        jRadioButton3.setSelected(true);
                    }
                    jComboBox1.setSelectedItem((String)Bloodgroup.get(i));
                    jComboBox2.setSelectedItem((String)status.get(i));
                }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(jTextField1.getText().equals("")&&jTextField2.getText().equals("")&&jTextField3.getText().equals("")&&jTextField5.getText().equals("")&&jTextField6.getText().equals("")&&jTextArea1.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Fill all Fields", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            
            name.add(jTextField1.getText());

            Age.add(jTextField2.getText());

            Gender.add(gender);

            Bloodgroup.add((String)jComboBox1.getSelectedItem());
           
            Address.add(jTextArea1.getText());
           
            Postal.add(jTextField3.getText());
           

            country.add(jTextField5.getText());

            status.add((String)jComboBox2.getSelectedItem());
           
            contact.add(jTextField6.getText());
            DefaultTableModel model =(DefaultTableModel)jTable1.getModel();
            model.setColumnCount(0);
            model.setRowCount(0);

            model.addColumn("Name");
            model.addColumn("Age");
            model.addColumn("Gender");
            model.addColumn("Blood Group");
            model.addColumn("Address");
            model.addColumn("Postal");
            model.addColumn("Country");
            model.addColumn("Status");
            model.addColumn("Contact");

            for(int x=0;x<name.size();x++){
                if(status.get(x).equals("inpatient")){
                model.addRow(new Object[]{name.get(x),Age.get(x),Gender.get(x),Bloodgroup.get(x),Address.get(x),Postal.get(x),country.get(x),status.get(x),contact.get(x)});
                } }
        }
        file.file("name.txt", name);
        file.file("age.txt", Age);
        file.file("gender.txt", Gender);
        file.file("blood.txt", Bloodgroup);
        file.file("country.txt", country);
        file.file("postal.txt", Postal);
        file.file("status.txt", status);
        file.file("address.txt", Address);
        file.file("contact.txt", contact);
        //jLabel1.setText("yes");
       JOptionPane.showMessageDialog(null, "File is updated", "Info", JOptionPane.INFORMATION_MESSAGE);
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(jTextField1.getText().equals("")&&jTextField2.getText().equals("")&&jTextField3.getText().equals("")&&jTextField5.getText().equals("")&&jTextField6.getText().equals("")&&jTextArea1.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Fill all Fields", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            name.set(index, jTextField1.getText());
            Age.set(index, jTextField2.getText());
            Postal.set(index, jTextField3.getText());
            country.set(index, jTextField5.getText());
            contact.set(index, jTextField6.getText());
            Address.set(index, jTextArea1.getText());
            Gender.set(index, gender);
            Bloodgroup.set(index, (String)jComboBox1.getSelectedItem());
            status.set(index, (String)jComboBox2.getSelectedItem());
            jTextArea1.setText("");
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField5.setText("");
            jTextField6.setText("");
            DefaultTableModel model =(DefaultTableModel)jTable1.getModel();
            model.setColumnCount(0);
            model.setRowCount(0);

            model.addColumn("Name");
            model.addColumn("Age");
            model.addColumn("Gender");
            model.addColumn("Blood Group");
            model.addColumn("Address");
            model.addColumn("Postal");
            model.addColumn("Country");
            model.addColumn("Status");
            model.addColumn("Contact");

            //        JTable table = new JTable(model);
            //         DefaultTableModel model1 = (DefaultTableModel) table.getModel();
            //       table.getModel();
            // model.addRow(new Object[]{"Column 1", "Column 2", "Column 3","Column 4","Column 5","hell"});
            for(int x=0;x<name.size();x++){
               if(status.get(x).equals("inpatient")){
                model.addRow(new Object[]{name.get(x),Age.get(x),Gender.get(x),Bloodgroup.get(x),Address.get(x),Postal.get(x),country.get(x),status.get(x),contact.get(x)});
                } }
        }
         file.file("name.txt", name);
        file.file("age.txt", Age);
        file.file("gender.txt", Gender);
        file.file("blood.txt", Bloodgroup);
        file.file("country.txt", country);
        file.file("postal.txt", Postal);
        file.file("status.txt", status);
        file.file("address.txt", Address);
        file.file("contact.txt", contact);
        //jLabel1.setText("yes");
       JOptionPane.showMessageDialog(null, "File is updated", "Info", JOptionPane.INFORMATION_MESSAGE);
  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(jTextField1.getText().equals("")&&jTextField2.getText().equals("")&&jTextField3.getText().equals("")&&jTextField5.getText().equals("")&&jTextField6.getText().equals("")&&jTextArea1.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Select value From table", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else {
            jTextArea1.setText("");
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField5.setText("");
            jTextField6.setText("");
            name.remove(index);
            Age.remove(index);
            Postal.remove(index);
            country.remove(index);
            contact.remove(index);
            Address.remove(index);
            Gender.remove(index);
            Bloodgroup.remove(index);
            status.remove(index);
            DefaultTableModel model =(DefaultTableModel)jTable1.getModel();
            model.setColumnCount(0);
            model.setRowCount(0);

            model.addColumn("Name");
            model.addColumn("Age");
            model.addColumn("Gender");
            model.addColumn("Blood Group");
            model.addColumn("Address");
            model.addColumn("Postal");
            model.addColumn("Country");
            model.addColumn("Status");
            model.addColumn("Contact");

            //        JTable table = new JTable(model);
            //         DefaultTableModel model1 = (DefaultTableModel) table.getModel();
            //       table.getModel();
            // model.addRow(new Object[]{"Column 1", "Column 2", "Column 3","Column 4","Column 5","hell"});
            for(int x=0;x<name.size();x++){
                if(status.get(x).equals("inpatient")){
                model.addRow(new Object[]{name.get(x),Age.get(x),Gender.get(x),Bloodgroup.get(x),Address.get(x),Postal.get(x),country.get(x),status.get(x),contact.get(x)});
                }
                else{
                    
                }
            }
        }
         file.file("name.txt", name);
        file.file("age.txt", Age);
        file.file("gender.txt", Gender);
        file.file("blood.txt", Bloodgroup);
        file.file("country.txt", country);
        file.file("postal.txt", Postal);
        file.file("status.txt", status);
        file.file("address.txt", Address);
        file.file("contact.txt", contact);
        //jLabel1.setText("yes");
       JOptionPane.showMessageDialog(null, "File is updated", "Info", JOptionPane.INFORMATION_MESSAGE);
  
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jRadioButton1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton1ItemStateChanged

    }//GEN-LAST:event_jRadioButton1ItemStateChanged

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        gender="Male";
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        gender="Female";
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped

    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        char vchar = evt.getKeyChar();
        if (!(Character.isDigit(vchar)
            || (vchar == KeyEvent.VK_BACK_SPACE)
            || (vchar == KeyEvent.VK_DELETE))
        ||(jTextField2.getText().length()>=3)) {
        evt.consume();
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        char vchar = evt.getKeyChar();
        if (jTextField3.getText().length()>=6) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
        char vchar = evt.getKeyChar();
        if (!(Character.isDigit(vchar)
            || (vchar == KeyEvent.VK_BACK_SPACE)
            || (vchar == KeyEvent.VK_DELETE))
        ||(jTextField6.getText().length()>=10)) {
        evt.consume();
        }
    }//GEN-LAST:event_jTextField6KeyTyped

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try{
            int n = name.size();
            FileWriter writer= new FileWriter("InPatient.txt",true);
            for(int i = 0;i<n;i++){

                writer.write((String)name.get(i));
                writer.write("\t\t");
                writer.write((String)Age.get(i));
                writer.write("\t\t");
                writer.write((String)Gender.get(i));
                writer.write("\t\t");
                writer.write((String)Bloodgroup.get(i));
                writer.write("\t\t");
                writer.write((String)Address.get(i));
                writer.write("\t\t");
                writer.write((String)Postal.get(i));
                writer.write("\t\t");
                writer.write((String)country.get(i));
                writer.write("\t\t");
                writer.write((String)status.get(i));
                writer.write("\t\t");
                writer.write((String)contact.get(i));
                writer.write("\r\n");
            }
            writer.close();
            JOptionPane.showMessageDialog(null, "File is generated", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.setVisible(false);
        new Adminmenu().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(Inpatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inpatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inpatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inpatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inpatients().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
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
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
private String gender="";
}
