/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author hello
 */
public class signup extends javax.swing.JFrame {

    /**
     * Creates new form signup
     */
      Random rd=new Random();
    int vk=rd.nextInt(9999+1000)-1000;
    public signup() {
        initComponents();
        randoml.setText(Integer.toString(vk));
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        randlabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        nextbutton = new javax.swing.JButton();
        nametf = new javax.swing.JTextField();
        fathernametf = new javax.swing.JTextField();
        emailtf = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        citytf = new javax.swing.JTextField();
        addresstf = new javax.swing.JTextField();
        pincodetf = new javax.swing.JTextField();
        statetf = new javax.swing.JTextField();
        malerb = new javax.swing.JRadioButton();
        femalerb = new javax.swing.JRadioButton();
        datecb = new javax.swing.JComboBox<>();
        monthcb = new javax.swing.JComboBox<>();
        yearcb = new javax.swing.JComboBox<>();
        marriedrb = new javax.swing.JRadioButton();
        unmarriedrb = new javax.swing.JRadioButton();
        otherrb = new javax.swing.JRadioButton();
        randoml = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        randlabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        randlabel.setText("APPLICATION FORM NO. ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Page 1: Personal Details");

        jLabel3.setText("Name:");

        jLabel4.setText("Father's Name:");

        jLabel5.setText("Date of Birth:");

        jLabel6.setText("Date");

        jLabel7.setText("Month");

        jLabel8.setText("Year");

        jLabel9.setText("Gender:");

        jLabel10.setText("Email Address:");

        jLabel11.setText("Martial Status:");

        jLabel12.setText("Address:");

        jLabel13.setText("City:");

        jLabel14.setText("Pin Code:");

        nextbutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nextbutton.setText("Next");
        nextbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextbuttonActionPerformed(evt);
            }
        });

        nametf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametfActionPerformed(evt);
            }
        });

        jLabel15.setText("State:");

        statetf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statetfActionPerformed(evt);
            }
        });

        buttonGroup1.add(malerb);
        malerb.setText("Male");

        buttonGroup1.add(femalerb);
        femalerb.setText("Female");
        femalerb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femalerbActionPerformed(evt);
            }
        });

        String vk1[]=new String[31];
        for(int i=0;i<31;i++)
        vk1[i]=Integer.toString(i+1);
        datecb.setModel(new javax.swing.DefaultComboBoxModel<>(vk1));

        monthcb.setMaximumRowCount(12);
        monthcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "Febrauray", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        yearcb.setMaximumRowCount(100);
        String vk[]=new String[100];
        for(int i=0;i<100;i++)
        vk[i]=Integer.toString(1901+i);
        yearcb.setModel(new javax.swing.DefaultComboBoxModel<>(vk));
        yearcb.setMaximumRowCount(12);
        yearcb.setSelectedIndex(0);
        yearcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearcbActionPerformed(evt);
            }
        });

        buttonGroup2.add(marriedrb);
        marriedrb.setText("married");
        marriedrb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marriedrbActionPerformed(evt);
            }
        });

        buttonGroup2.add(unmarriedrb);
        unmarriedrb.setText("unmarried");

        buttonGroup2.add(otherrb);
        otherrb.setText("other");

        randoml.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel11)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel15))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(malerb, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(femalerb))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(randlabel)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(randoml, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(89, 89, 89))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(addresstf, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(citytf, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(emailtf, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addComponent(marriedrb)
                                                        .addGap(40, 40, 40)
                                                        .addComponent(unmarriedrb)
                                                        .addGap(36, 36, 36)
                                                        .addComponent(otherrb))))
                                            .addComponent(pincodetf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(statetf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(nametf, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(fathernametf, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(18, 18, 18)
                                            .addComponent(datecb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(47, 47, 47)
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(monthcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(40, 40, 40)
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(yearcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(116, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(nextbutton)
                .addGap(268, 268, 268))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(randlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(randoml, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nametf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fathernametf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(datecb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(malerb)
                    .addComponent(femalerb))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(emailtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(marriedrb)
                    .addComponent(unmarriedrb)
                    .addComponent(otherrb))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(addresstf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(citytf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(pincodetf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statetf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nextbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void femalerbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femalerbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femalerbActionPerformed

    private void marriedrbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marriedrbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marriedrbActionPerformed

    private void nametfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nametfActionPerformed

    private void yearcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearcbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearcbActionPerformed

    private void nextbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextbuttonActionPerformed
        // TODO add your handling code here:
        String name=nametf.getText();
        String fathername=fathernametf.getText();
        String date=(String)datecb.getSelectedItem();
        String month=(String)monthcb.getSelectedItem();
        String year=(String)yearcb.getSelectedItem();
        String gender="",marriedstatus="";
        if(malerb.isSelected() && femalerb.isSelected())
        {
            JOptionPane.showMessageDialog(null,"please selct one of male,female");
        }
        else
        {
            if(malerb.isSelected())
            gender="male";
            else
            gender="female";
        }
        String email=emailtf.getText();
        int coun=0;
        if(marriedrb.isSelected()){
        marriedstatus="married";
        coun++;
        }
        if(unmarriedrb.isSelected()){
        marriedstatus="unmarried";coun++;}
        if(otherrb.isSelected()){
        marriedstatus="other";coun++;}
        if(coun>1)
        JOptionPane.showMessageDialog(null,"Please select any one of married,unmarried,other");
        String address=addresstf.getText();
        String city=citytf.getText();
        String pincode=pincodetf.getText();
        String state=statetf.getText();
        if(email.equals("") || marriedstatus.equals("") || address.equals("") || city.equals("")|| pincode.equals("") || state.equals("")
                || name.equals("") || fathername.equals("") || date.equals("") || month.equals("")
               || year.equals(""))
        JOptionPane.showMessageDialog(this,"Please Fill All Details");
            try{
           Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb","root","Vamshi@31");
           Statement s=c.createStatement();
           s.executeUpdate("insert into signuptable values('"+name+"','"+fathername+"','"+date+"','"+month+"','"+year+"','"+gender+"','"+
                   email+"','"+marriedstatus+"','"+address+"','"+city+"','"+pincode+"','"+state+"')");
           new signup2().setVisible(true);
           setVisible(false);
    }
        catch(SQLException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_nextbuttonActionPerformed

    private void statetfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statetfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statetfActionPerformed

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
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addresstf;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JTextField citytf;
    private javax.swing.JComboBox<String> datecb;
    private javax.swing.JTextField emailtf;
    private javax.swing.JTextField fathernametf;
    private javax.swing.JRadioButton femalerb;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton malerb;
    private javax.swing.JRadioButton marriedrb;
    private javax.swing.JComboBox<String> monthcb;
    private javax.swing.JTextField nametf;
    private javax.swing.JButton nextbutton;
    private javax.swing.JRadioButton otherrb;
    private javax.swing.JTextField pincodetf;
    private javax.swing.JLabel randlabel;
    private javax.swing.JLabel randoml;
    private javax.swing.JTextField statetf;
    private javax.swing.JRadioButton unmarriedrb;
    private javax.swing.JComboBox<String> yearcb;
    // End of variables declaration//GEN-END:variables
}
