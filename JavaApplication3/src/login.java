/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewJFrame.java
 *
 * Created on 22 Oct, 2019, 9:56:20 AM
 */

/**
 *
 * @author Mridul Jadon
 */
import java.sql.*;
import javax.swing.*;
public class login extends javax.swing.JFrame {
    /** Creates new form NewJFrame */
    public login() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(-1,true));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(-16777216,true)));
        jPanel1.setLayout(null);

        jLabel1.setText("USERNAME");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 100, 64, 16);

        jLabel2.setText("PASSWORD");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 160, 130, 16);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(190, 100, 126, 22);
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(190, 160, 126, 22);

        jButton1.setText("CLEAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(40, 330, 80, 25);

        jButton2.setText("LOG IN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(180, 330, 90, 25);

        jButton3.setText("EXIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(310, 330, 100, 25);

        jLabel3.setText("                              WELCOME TO DAS AUTOS");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 26, 423, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mridul Jadon\\Desktop\\DAS.JPG")); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(320, 20, 290, 230);

        jRadioButton1.setBackground(new java.awt.Color(-1,true));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("STAFF");
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(110, 270, 70, 25);

        jRadioButton2.setBackground(new java.awt.Color(-1,true));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("ADMIN");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(270, 270, 90, 20);

        jCheckBox1.setText("SHOW PASSWORD");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1);
        jCheckBox1.setBounds(180, 220, 150, 25);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jPasswordField1.setText("");
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String w=new String(jPasswordField1.getPassword());
        if((jTextField1.getText().equals(""))||w.equals(""))
        {
            JOptionPane.showMessageDialog(null,"ENTER ALL THE FIELDS");
        }
        if(jTextField1.getText().length()>0 && w.length()>0)
        {
        if(jRadioButton2.isSelected())
        {
        try
        {
            Class.forName("java.sql.DriverManager");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost/das autos","root","12345");
            Statement s=c.createStatement();
            String sql="SELECT * FROM admin_details WHERE ADMIN_ID='"+jTextField1.getText()+"';";
            ResultSet rs=s.executeQuery(sql);
            if(rs.next())
            {
                String p=rs.getString("PASSWORD_");
                String ps=jPasswordField1.getText();
                if(ps.equals(p))
                {
                    JOptionPane.showMessageDialog(null,"logged in successfully");
                    new admin().setVisible(true);
                    this.dispose();
                }
                else{
                    JOptionPane.showMessageDialog(null,"INVALID DETAILS");
                }
                    
            }
            else{
                    JOptionPane.showMessageDialog(null,"INVALID DETAILS");
                }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
            }
            else if(jRadioButton1.isSelected())
        {
        try
        {
            Class.forName("java.sql.DriverManager");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost/das autos","root","12345");
            Statement s=c.createStatement();
            String sql="SELECT * FROM staff_details WHERE STAFF_ID='"+jTextField1.getText()+"';";
            ResultSet rs=s.executeQuery(sql);
            if(rs.next())
            {
                String p=rs.getString("PASSWORD_");
                String ps=new String(jPasswordField1.getPassword());
                if(ps.equals(p))
                {
                    JOptionPane.showMessageDialog(null,"logged in successfully");
                    new staff().setVisible(true);
                    this.dispose();
                }
                else
                    JOptionPane.showMessageDialog(null,"INVALID DETAILS");
                
            }
            else
                    JOptionPane.showMessageDialog(null,"INVALID DETAILS");

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
            }
 else
     JOptionPane.showMessageDialog(null,"ENTER ALL THE DEATILS");

 }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox1.isSelected())
        {
            jPasswordField1.setEchoChar((char)0);
        }
        else
        {
            jPasswordField1.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}