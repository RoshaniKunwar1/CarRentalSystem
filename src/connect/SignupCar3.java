package connect;


import connect.login;
import connect.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class SignupCar3 extends javax.swing.JFrame {

  
    public SignupCar3() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        FullName = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        Phone = new javax.swing.JTextField();
        policy = new javax.swing.JCheckBox();
        signup = new javax.swing.JButton();
        Username = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        login_here = new javax.swing.JLabel();
        close1 = new javax.swing.JLabel();
        PassWord = new javax.swing.JPasswordField();
        PassWord1 = new javax.swing.JPasswordField();
        PasswordShow = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(650, 670));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Sign Up");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        id.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 18)); // NOI18N
        id.setForeground(new java.awt.Color(153, 153, 153));
        id.setText("Id");
        id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                idFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                idFocusLost(evt);
            }
        });
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        FullName.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 18)); // NOI18N
        FullName.setForeground(new java.awt.Color(153, 153, 153));
        FullName.setText("Fullname");
        FullName.setOpaque(true);
        FullName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FullNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FullNameFocusLost(evt);
            }
        });
        FullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FullNameActionPerformed(evt);
            }
        });

        Email.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 18)); // NOI18N
        Email.setForeground(new java.awt.Color(153, 153, 153));
        Email.setText("Email");
        Email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                EmailFocusLost(evt);
            }
        });
        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });

        Phone.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 18)); // NOI18N
        Phone.setForeground(new java.awt.Color(153, 153, 153));
        Phone.setText("Phone Number");
        Phone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PhoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PhoneFocusLost(evt);
            }
        });
        Phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneActionPerformed(evt);
            }
        });

        policy.setBackground(new java.awt.Color(0, 102, 102));
        policy.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        policy.setForeground(new java.awt.Color(255, 255, 255));
        policy.setText("I accept the Terms of Use & Privacy Policy");
        policy.setOpaque(true);

        signup.setBackground(new java.awt.Color(153, 153, 153));
        signup.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        signup.setForeground(new java.awt.Color(255, 255, 255));
        signup.setText("signup");
        signup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });

        Username.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 18)); // NOI18N
        Username.setForeground(new java.awt.Color(153, 153, 153));
        Username.setText("Username");
        Username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                UsernameFocusLost(evt);
            }
        });
        Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Already have an account?");

        login_here.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        login_here.setForeground(new java.awt.Color(153, 0, 51));
        login_here.setText("Login here");
        login_here.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_hereMouseClicked(evt);
            }
        });

        close1.setBackground(new java.awt.Color(153, 0, 51));
        close1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 48)); // NOI18N
        close1.setForeground(new java.awt.Color(255, 255, 255));
        close1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close1.setText("x");
        close1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        close1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close1MouseClicked(evt);
            }
        });

        PassWord.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        PassWord.setForeground(new java.awt.Color(153, 153, 153));
        PassWord.setText("123");
        PassWord.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PassWordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PassWordFocusLost(evt);
            }
        });
        PassWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassWordActionPerformed(evt);
            }
        });

        PassWord1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        PassWord1.setForeground(new java.awt.Color(153, 153, 153));
        PassWord1.setText("123");
        PassWord1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PassWord1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PassWord1FocusLost(evt);
            }
        });

        PasswordShow.setBackground(new java.awt.Color(0, 102, 102));
        PasswordShow.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        PasswordShow.setForeground(new java.awt.Color(255, 255, 255));
        PasswordShow.setText("Show Password");
        PasswordShow.setOpaque(true);
        PasswordShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordShowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(193, 193, 193)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(close1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Email, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Phone, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(PassWord, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(PassWord1))
                                    .addComponent(FullName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(33, 33, 33))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(227, 227, 227)
                                .addComponent(PasswordShow))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(login_here, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(signup, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(policy, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(124, 124, 124))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(close1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(FullName, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PassWord, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PassWord1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(PasswordShow)
                .addGap(28, 28, 28)
                .addComponent(Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(policy)
                .addGap(18, 18, 18)
                .addComponent(signup)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login_here, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idFocusGained
        if (id.getText().trim().toLowerCase().equals("id")) {
            id.setText(null);
        }
    }//GEN-LAST:event_idFocusGained

    private void idFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idFocusLost
        if (id.getText().isEmpty()) {
            id.setText("Id");
        }
    }//GEN-LAST:event_idFocusLost

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void FullNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FullNameFocusGained
        if (FullName.getText().trim().toLowerCase().equals("fullname")) {
            FullName.setText(null);
        }
    }//GEN-LAST:event_FullNameFocusGained

    private void FullNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FullNameFocusLost
        if (FullName.getText().isEmpty()) {
            FullName.setText("Full name");
        }
    }//GEN-LAST:event_FullNameFocusLost

    private void FullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FullNameActionPerformed

    private void EmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmailFocusGained
        if (Email.getText().trim().toLowerCase().equals("email")) {
            Email.setText(null);
        }
    }//GEN-LAST:event_EmailFocusGained

    private void EmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmailFocusLost
        if (Email.getText().isEmpty()) {
            Email.setText("Email");
        }
    }//GEN-LAST:event_EmailFocusLost

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

    private void PhoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PhoneFocusGained
        if (Phone.getText().trim().toLowerCase().equals("phone number")) {
            Phone.setText(null);
        }
    }//GEN-LAST:event_PhoneFocusGained

    private void PhoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PhoneFocusLost
        if (Phone.getText().isEmpty()) {
            Phone.setText("Phone Number");
        }
    }//GEN-LAST:event_PhoneFocusLost

    private void PhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneActionPerformed

    
     public void login1() {
        int login = JOptionPane.showConfirmDialog(this, "Account Saved! Do you want to login now");
        if (login == JOptionPane.YES_OPTION) {
            new login().setVisible(true);
            this.dispose();
        }
    }
     
    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
        if (Username.getText().isEmpty() || id.getText().isEmpty() || FullName.getText().isEmpty() || PassWord.getText().isEmpty() || PassWord1.getPassword().equals("") || Phone.getText().isEmpty() || Email.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Information");
        } else if (!PassWord.getText().equals(PassWord1.getText())) {
            JOptionPane.showMessageDialog(this, "Incorrect password");
        } else if (!policy.isSelected()) {
            JOptionPane.showMessageDialog(this, "Please accept Privacy Policy");
        } else {
            try {
                String sql = "Insert into user values (?, ?, ?, ?, ?, ?)";
                Connection con = DB.getConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);

                pstmt.setInt(1, Integer.parseInt(id.getText()));
                pstmt.setString(2, FullName.getText());
                pstmt.setString(3, Username.getText());
                pstmt.setString(4, PassWord1.getText());
                pstmt.setString(5, Phone.getText());
                pstmt.setString(6, Email.getText());
                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Account Saved! You can click on Login here");
                login1();

                con.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_signupActionPerformed

    private void UsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameFocusGained
        if (Username.getText().trim().toLowerCase().equals("username")) {
            Username.setText(null);
        }
    }//GEN-LAST:event_UsernameFocusGained

    private void UsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameFocusLost
        if (Username.getText().isEmpty()) {
            Username.setText("Username");
        }
    }//GEN-LAST:event_UsernameFocusLost

    private void UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameActionPerformed

    private void login_hereMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_hereMouseClicked
        new login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_login_hereMouseClicked

    private void close1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_close1MouseClicked

    private void PassWordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PassWordFocusGained
        String password = String.valueOf(PassWord.getPassword());
        if (password.trim().toLowerCase().equals("Password")) {
            PassWord.setText("");

        }
    }//GEN-LAST:event_PassWordFocusGained

    private void PassWordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PassWordFocusLost
        if (PassWord.getText().trim().toLowerCase().equals("password") || PassWord.getText().trim().equals("")) {
            PassWord.setText("New password");
        }
    }//GEN-LAST:event_PassWordFocusLost

    private void PassWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassWordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassWordActionPerformed

    private void PassWord1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PassWord1FocusGained
        // String password=String.valueOf(PassWord.getPassword());
        if (PassWord1.getText().trim().toLowerCase().equals("password")) {
            PassWord.setText("");

        }
    }//GEN-LAST:event_PassWord1FocusGained

    private void PassWord1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PassWord1FocusLost
        if (PassWord1.getText().trim().toLowerCase().equals("password") || PassWord1.getText().trim().equals("")) {
            PassWord1.setText("Confirm Password");
        }
    }//GEN-LAST:event_PassWord1FocusLost

    private void PasswordShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordShowActionPerformed
        if (PasswordShow.isSelected()) {
            PassWord.setEchoChar((char) 0);
            PassWord1.setEchoChar((char) 0);
        } else {
            PassWord.setEchoChar('*');
            PassWord1.setEchoChar('*');
        }
    }//GEN-LAST:event_PasswordShowActionPerformed

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
            java.util.logging.Logger.getLogger(SignupCar3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignupCar3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignupCar3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignupCar3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignupCar3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTextField Email;
    private static javax.swing.JTextField FullName;
    private javax.swing.JPasswordField PassWord;
    private javax.swing.JPasswordField PassWord1;
    private javax.swing.JCheckBox PasswordShow;
    private static javax.swing.JTextField Phone;
    private static javax.swing.JTextField Username;
    private javax.swing.JLabel close1;
    private static javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel login_here;
    private javax.swing.JCheckBox policy;
    private javax.swing.JButton signup;
    // End of variables declaration//GEN-END:variables
}
