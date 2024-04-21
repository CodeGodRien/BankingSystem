package nky;


import java.util.HashMap;
import javax.swing.JOptionPane;

public class Nky extends javax.swing.JFrame {

      HashMap<String, String> credentials = new HashMap<>();
    
    HashMap<String, Double> balances = new HashMap<>();
    
    public Nky() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Accounty = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Creaty = new javax.swing.JButton();
        Loginy = new javax.swing.JButton();
        Passy = new javax.swing.JPasswordField();
        Showy = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel1.setText("ScamBank Corporation");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setText("Account:");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setText("Password:");

        Accounty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountyActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setText("LOGIN");

        Creaty.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        Creaty.setText("Create Account");
        Creaty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreatyActionPerformed(evt);
            }
        });

        Loginy.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        Loginy.setText("Login");
        Loginy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginyActionPerformed(evt);
            }
        });

        Passy.setText("jPasswordField1");

        Showy.setText("Show Password");
        Showy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Creaty))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Loginy)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Showy))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Passy, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Accounty, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Creaty)
                    .addComponent(jLabel4))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Accounty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Passy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Loginy)
                    .addComponent(Showy))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginyActionPerformed
         String username = Accounty.getText();
        String password = new String(Passy.getPassword());
        
 
        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Username or password cannot be empty. (CREATE ONE FIRST, if you dont have an account.)\n *JUST TYPE ANYTHING IN THE USERNAME & PASSWORD THEN PRESS CREATE ACCOUNT*\n *ACCOUNT WILL BE SAVED*");
            return;
        }
        
        if (credentials.containsKey(username)) {
            if (credentials.get(username).equals(password)) {
                JOptionPane.showMessageDialog(null, "Login successful!");
               
               BankMenu menu = new BankMenu(username);
               menu.setBalances(balances);
               menu.setVisible(true);
                dispose();
          
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect password!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Account does not exist.(CREATE ONE FIRST.)\n *JUST TYPE ANYTHING IN THE USERNAME & PASSWORD THEN PRESS CREATE ACCOUNT*\n *ACCOUNT WILL BE SAVED*");
        }
    }//GEN-LAST:event_LoginyActionPerformed

    private void CreatyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreatyActionPerformed
         String username = Accounty.getText();
        String password = new String(Passy.getPassword());
        // Check if username or password is empty
        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Username or password cannot be empty!");
            return;
        }       
        // Check if username already exists
        if (credentials.containsKey(username)) {
            JOptionPane.showMessageDialog(null, "Account already exists!");
        } else {
            // Add username-password pair to credentials
            credentials.put(username, password);
            // Set initial balance for the new account
            balances.put(username, 5000.0);
            JOptionPane.showMessageDialog(null, "Account created successfully!");
        }
    }//GEN-LAST:event_CreatyActionPerformed

    private void ShowyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowyActionPerformed
      if (Showy.isSelected()){
            Passy.setEchoChar((char)0);
        } else
            //code for hide the password or the information
          Passy.setEchoChar('*');
    }//GEN-LAST:event_ShowyActionPerformed

    private void AccountyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AccountyActionPerformed


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
            java.util.logging.Logger.getLogger(Nky.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nky.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nky.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nky.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nky().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Accounty;
    private javax.swing.JButton Creaty;
    private javax.swing.JButton Loginy;
    private javax.swing.JPasswordField Passy;
    private javax.swing.JCheckBox Showy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
