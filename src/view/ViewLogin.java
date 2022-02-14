package view;

import control.ControlBasic;
import control.ControlGeneral;
import control.ControlUseful;
import java.awt.Color;
import javax.swing.UIManager;
import model.User;
import model.UserSession;
import useful.Several;

public class ViewLogin extends javax.swing.JFrame {
    
    private final String title;
    private final ControlBasic cUser, cS, cP;
    private final ControlUseful cU;

    public ViewLogin() {
        initComponents();
        title = "System login";
        cUser = new ControlGeneral(3);
        cP = new ControlGeneral(1);
        cS = new ControlGeneral(2);
        cU = new ControlUseful();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ContentPane = new javax.swing.JPanel();
        LblLogin = new javax.swing.JLabel();
        TxtLogin = new javax.swing.JTextField();
        LblPassword = new javax.swing.JLabel();
        TxtPassword = new javax.swing.JPasswordField();
        BtnEnter = new javax.swing.JButton();
        BtnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        ContentPane.setBackground(new java.awt.Color(255, 255, 255));
        ContentPane.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        LblLogin.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        LblLogin.setText("Login :");

        TxtLogin.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        TxtLogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtLogin.setToolTipText("");
        TxtLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        TxtLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtLoginKeyReleased(evt);
            }
        });

        LblPassword.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        LblPassword.setText("Senha :");

        TxtPassword.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        TxtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        TxtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtPasswordKeyReleased(evt);
            }
        });

        BtnEnter.setBackground(new java.awt.Color(153, 255, 153));
        BtnEnter.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        BtnEnter.setText("Entrar");
        BtnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEnterActionPerformed(evt);
            }
        });

        BtnExit.setBackground(new java.awt.Color(255, 51, 51));
        BtnExit.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        BtnExit.setText("Sair");
        BtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContentPaneLayout = new javax.swing.GroupLayout(ContentPane);
        ContentPane.setLayout(ContentPaneLayout);
        ContentPaneLayout.setHorizontalGroup(
            ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentPaneLayout.createSequentialGroup()
                .addGroup(ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContentPaneLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(TxtLogin))
                            .addGroup(ContentPaneLayout.createSequentialGroup()
                                .addGroup(ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblLogin)
                                    .addComponent(LblPassword))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(ContentPaneLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(TxtPassword))
                    .addGroup(ContentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtnEnter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnExit)
                        .addGap(0, 111, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ContentPaneLayout.setVerticalGroup(
            ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnEnter)
                    .addComponent(BtnExit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContentPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContentPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExitActionPerformed
        if (Several.confirm("Deseja sair? :(", title))
            System.exit(0);
    }//GEN-LAST:event_BtnExitActionPerformed

    private void BtnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEnterActionPerformed
        validateLogin();
    }//GEN-LAST:event_BtnEnterActionPerformed

    private void TxtLoginKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtLoginKeyReleased
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER)
            TxtPassword.requestFocus();
    }//GEN-LAST:event_TxtLoginKeyReleased

    private void TxtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPasswordKeyReleased
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER)
            validateLogin();
    }//GEN-LAST:event_TxtPasswordKeyReleased

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        UIManager.put("nimbusBase", new Color(80, 100, 242));
        UIManager.put("nimbusBlueGrey", new Color(190, 189, 170));
        UIManager.put("control", new Color(242, 242, 242));        

        java.awt.EventQueue.invokeLater(() -> {
            new ViewLogin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEnter;
    private javax.swing.JButton BtnExit;
    private javax.swing.JPanel ContentPane;
    private javax.swing.JLabel LblLogin;
    private javax.swing.JLabel LblPassword;
    private javax.swing.JTextField TxtLogin;
    private javax.swing.JPasswordField TxtPassword;
    // End of variables declaration//GEN-END:variables

    private void validateLogin() {
        User u = new User();
        u.setLogin(TxtLogin.getText());
        u.setPassword(String.valueOf(TxtPassword.getPassword()));
        boolean validate = cU.validateUser(u);
        if (validate) {
            Object o = cU.readUserLogin(TxtLogin.getText());
            User a = (User) o;
            UserSession session = new UserSession();
            session.code = a.getCode();
            session.name = a.getName();
            session.login = a.getLogin();
            ViewMain view = new ViewMain();
            view.setVisible(true);
            this.dispose();
        }
        else {
            Several.showData("Usuário ou senha inválidos", title, false);
            TxtLogin.setText("");
            TxtPassword.setText("");
        }
    }
}