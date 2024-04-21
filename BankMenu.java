package nky;

import java.util.HashMap;
import javax.swing.JOptionPane;


public class BankMenu extends javax.swing.JFrame {

    private HashMap<String, Double> balances;
    private String username;

    public BankMenu() {
        initComponents();
    }

     public void setBalances(HashMap<String, Double> balances) {
        this.balances = balances;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ViewBalance = new javax.swing.JButton();
        Deposity = new javax.swing.JButton();
        Transfery = new javax.swing.JButton();
        Withdrawy = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Exity = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel1.setText("Welcome!");

        ViewBalance.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        ViewBalance.setText("View Balance");
        ViewBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewBalanceActionPerformed(evt);
            }
        });

        Deposity.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        Deposity.setText("Deposit");
        Deposity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeposityActionPerformed(evt);
            }
        });

        Transfery.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        Transfery.setText("Transfer");
        Transfery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransferyActionPerformed(evt);
            }
        });

        Withdrawy.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        Withdrawy.setText("Withdraw");
        Withdrawy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WithdrawyActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel2.setText("ScamBank Corporation");

        Exity.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        Exity.setText("Exit");
        Exity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ViewBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Transfery, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Withdrawy, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Deposity, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(Exity, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(144, 144, 144))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(ViewBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Transfery, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Withdrawy, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Deposity, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(Exity, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeposityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeposityActionPerformed
         String depositAmountString = JOptionPane.showInputDialog(null, "Enter amount to deposit:");
    

    if (depositAmountString == null) {
        return; 
    }

    double depositAmount;
    try {
        depositAmount = Double.parseDouble(depositAmountString);
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Invalid amount entered. Please enter a valid number.");
        return; 
    }
    

    if (depositAmount <= 0) {
        JOptionPane.showMessageDialog(null, "Deposit amount must be a positive number.");
        return; 
    }
    
    // Check if the username exists in the balances HashMap
    if (balances.containsKey(username)) {
        // Get the current balance
        double currentBalance = balances.get(username);
        
        // Add the deposit amount to the current balance
        double newBalance = currentBalance + depositAmount;
        
        // Update the balance in the balances HashMap
        balances.put(username, newBalance);
        
        // Display a message to inform the user about the successful deposit
        JOptionPane.showMessageDialog(null, "Deposit successful! Your new balance is: ₱" + newBalance);
    } else {
        JOptionPane.showMessageDialog(null, "Insufficient balance" + username);
    }                                 
    }//GEN-LAST:event_DeposityActionPerformed

    private void ViewBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewBalanceActionPerformed
        if (balances.containsKey(username)) {
            double balance = balances.get(username);
            JOptionPane.showMessageDialog(null, "Balance for " + username + ": ₱" + balance);
        } else {
            JOptionPane.showMessageDialog(null, "No balance found for " + username);
        }
    }//GEN-LAST:event_ViewBalanceActionPerformed

    public BankMenu(String username) {
    this.username = username;
    initComponents();
    }
    
    private void TransferyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransferyActionPerformed
      String accountname;
    do {
    accountname = JOptionPane.showInputDialog(null, "Enter the account username:");
    if (accountname == null) {
        return; // Exit the method if the user canceled
    } else if (accountname.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please enter an account name you want to transfer.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    } while (accountname.isEmpty());
    String transferAmountString = JOptionPane.showInputDialog(null, "Enter amount to transfer:");

    if (transferAmountString == null) {
    return; 
    }

     double transferAmount;
     try {
     transferAmount = Double.parseDouble(transferAmountString);
    } catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(null, "Please enter a valid amount.", "Error", JOptionPane.ERROR_MESSAGE);
    return;
    }

    if (transferAmount <= 0) {
    JOptionPane.showMessageDialog(null, "Transfer amount must be a positive number.");
    return; 
    }

     if (balances.containsKey(username)) {
    double currentBalance = balances.get(username);
    
    if (transferAmount > currentBalance) {
        JOptionPane.showMessageDialog(null, "Insufficient funds. You cannot transfer more than your current balance.");
        return; 
    }
    
    double newBalance = currentBalance - transferAmount;
    
    balances.put(username, newBalance);
    
    JOptionPane.showMessageDialog(null, "Transfer successful! Your new balance is: ₱" + newBalance);
} else {
    JOptionPane.showMessageDialog(null, "Insufficient balance ");
}
    }//GEN-LAST:event_TransferyActionPerformed

    private void WithdrawyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WithdrawyActionPerformed
        String withdrawAmountString = JOptionPane.showInputDialog(null, "Enter amount to withdraw:");
    
    if (withdrawAmountString == null) {
        return; 
    }
    double withdrawAmount;
    try {
        withdrawAmount = Double.parseDouble(withdrawAmountString);
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Invalid amount entered. Please try again.");
        return; 
    }
    
    if (withdrawAmount <= 0) {
        JOptionPane.showMessageDialog(null, "Withdrawal amount must be a positive number.");
        return; 
    }
    
    if (balances.containsKey(username)) {
  
        double currentBalance = balances.get(username);
        
        if (withdrawAmount > currentBalance) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please try again.");

        }
        
        double newBalance = currentBalance - withdrawAmount;
        
        balances.put(username, newBalance);
        
        JOptionPane.showMessageDialog(null, "Success, Your new balance is: ₱" + newBalance);
    } else {
        JOptionPane.showMessageDialog(null, "Insufficient balance");
    }
    }//GEN-LAST:event_WithdrawyActionPerformed

    private void ExityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExityActionPerformed
        int result = JOptionPane.showConfirmDialog(null,"Exit?", "Admin",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.WARNING_MESSAGE);
            if(result == JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(null , "Gappi, Rien Miro M. IT232");
                System.exit(0);
            }
    }//GEN-LAST:event_ExityActionPerformed

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
            java.util.logging.Logger.getLogger(BankMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BankMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BankMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BankMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Deposity;
    private javax.swing.JButton Exity;
    private javax.swing.JButton Transfery;
    private javax.swing.JButton ViewBalance;
    private javax.swing.JButton Withdrawy;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}