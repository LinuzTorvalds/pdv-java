package view;

import control.ControlBasic;
import control.ControlGeneral;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.User;
import useful.Several;

public class ViewUser extends javax.swing.JFrame {
    
    private final String title;
    private final ControlBasic cU;
    private List<Object> listU;

    public ViewUser() {
        initComponents();
        title = "Users";
        cU = new ControlGeneral(3);
        listU = new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ContentPane = new javax.swing.JPanel();
        LblCode = new javax.swing.JLabel();
        TxtCode = new javax.swing.JTextField();
        LblName = new javax.swing.JLabel();
        TxtName = new javax.swing.JTextField();
        LblLogin = new javax.swing.JLabel();
        TxtLogin = new javax.swing.JTextField();
        LblPassword = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblUsers = new javax.swing.JTable();
        BtnCancel = new javax.swing.JButton();
        BtnCreate = new javax.swing.JButton();
        BtnUpdate = new javax.swing.JButton();
        BtnDelete = new javax.swing.JButton();
        BtnExport = new javax.swing.JButton();
        LblSearch = new javax.swing.JLabel();
        TxtSearch = new javax.swing.JTextField();
        BtnSearch = new javax.swing.JButton();
        TxtPassword = new javax.swing.JTextField();
        BtnReturn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Users");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        ContentPane.setBackground(new java.awt.Color(255, 255, 255));
        ContentPane.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        LblCode.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        LblCode.setText("Código :");

        TxtCode.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        TxtCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtCode.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        TxtCode.setEnabled(false);

        LblName.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        LblName.setText("Nome :");

        TxtName.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        TxtName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        LblLogin.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        LblLogin.setText("Login :");

        TxtLogin.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        TxtLogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        LblPassword.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        LblPassword.setText("Senha :");

        TblUsers.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        TblUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Login"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TblUsers.setShowHorizontalLines(true);
        TblUsers.setShowVerticalLines(true);
        TblUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblUsersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TblUsers);
        if (TblUsers.getColumnModel().getColumnCount() > 0) {
            TblUsers.getColumnModel().getColumn(0).setMinWidth(30);
            TblUsers.getColumnModel().getColumn(0).setPreferredWidth(30);
        }

        BtnCancel.setBackground(new java.awt.Color(255, 255, 255));
        BtnCancel.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        BtnCancel.setText("Cancelar");
        BtnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelActionPerformed(evt);
            }
        });

        BtnCreate.setBackground(new java.awt.Color(255, 255, 255));
        BtnCreate.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        BtnCreate.setText("Salvar");
        BtnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCreateActionPerformed(evt);
            }
        });

        BtnUpdate.setBackground(new java.awt.Color(255, 255, 255));
        BtnUpdate.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        BtnUpdate.setText("Alterar");
        BtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUpdateActionPerformed(evt);
            }
        });

        BtnDelete.setBackground(new java.awt.Color(255, 255, 255));
        BtnDelete.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        BtnDelete.setText("Excluir");
        BtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeleteActionPerformed(evt);
            }
        });

        BtnExport.setBackground(new java.awt.Color(255, 255, 255));
        BtnExport.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        BtnExport.setText("Export");
        BtnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExportActionPerformed(evt);
            }
        });

        LblSearch.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        LblSearch.setText("Localizar :");

        TxtSearch.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        TxtSearch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtSearch.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        BtnSearch.setBackground(new java.awt.Color(255, 255, 255));
        BtnSearch.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        BtnSearch.setText("Localizar");
        BtnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSearchActionPerformed(evt);
            }
        });

        TxtPassword.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        TxtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        BtnReturn.setBackground(new java.awt.Color(255, 255, 255));
        BtnReturn.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        BtnReturn.setText("Voltar");
        BtnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContentPaneLayout = new javax.swing.GroupLayout(ContentPane);
        ContentPane.setLayout(ContentPaneLayout);
        ContentPaneLayout.setHorizontalGroup(
            ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentPaneLayout.createSequentialGroup()
                .addGroup(ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContentPaneLayout.createSequentialGroup()
                        .addGroup(ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContentPaneLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(TxtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TxtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ContentPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(LblSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnSearch)))
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(ContentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContentPaneLayout.createSequentialGroup()
                                .addComponent(BtnCancel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnCreate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnExport)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnReturn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(ContentPaneLayout.createSequentialGroup()
                                .addGroup(ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ContentPaneLayout.createSequentialGroup()
                                        .addComponent(LblLogin)
                                        .addGap(161, 161, 161)
                                        .addComponent(LblPassword))
                                    .addGroup(ContentPaneLayout.createSequentialGroup()
                                        .addComponent(LblCode)
                                        .addGap(61, 61, 61)
                                        .addComponent(LblName))
                                    .addGroup(ContentPaneLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(TxtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(TxtName, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        ContentPaneLayout.setVerticalGroup(
            ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblCode)
                    .addComponent(LblName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtName, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblLogin)
                    .addComponent(LblPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblSearch)
                    .addComponent(TxtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCreate)
                    .addComponent(BtnUpdate)
                    .addComponent(BtnDelete)
                    .addComponent(BtnExport)
                    .addComponent(BtnCancel)
                    .addComponent(BtnReturn))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContentPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContentPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelActionPerformed
        clean();
    }//GEN-LAST:event_BtnCancelActionPerformed

    private void BtnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCreateActionPerformed
        manipulate('C');
    }//GEN-LAST:event_BtnCreateActionPerformed

    private void BtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUpdateActionPerformed
        manipulate('U');
    }//GEN-LAST:event_BtnUpdateActionPerformed

    private void BtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeleteActionPerformed
        manipulate('D');
    }//GEN-LAST:event_BtnDeleteActionPerformed

    private void BtnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExportActionPerformed
        exportData();
    }//GEN-LAST:event_BtnExportActionPerformed

    private void BtnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSearchActionPerformed
        search();
    }//GEN-LAST:event_BtnSearchActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        TxtName.requestFocus();
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        clean();
    }//GEN-LAST:event_formWindowOpened

    private void TblUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblUsersMouseClicked
        searchTable();
    }//GEN-LAST:event_TblUsersMouseClicked

    private void BtnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReturnActionPerformed
        if (Several.confirm("Deseja retornar ao menu?", title)) {
            ViewMain frame = new ViewMain();
            frame.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_BtnReturnActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new ViewUser().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancel;
    private javax.swing.JButton BtnCreate;
    private javax.swing.JButton BtnDelete;
    private javax.swing.JButton BtnExport;
    private javax.swing.JButton BtnReturn;
    private javax.swing.JButton BtnSearch;
    private javax.swing.JButton BtnUpdate;
    private javax.swing.JPanel ContentPane;
    private javax.swing.JLabel LblCode;
    private javax.swing.JLabel LblLogin;
    private javax.swing.JLabel LblName;
    private javax.swing.JLabel LblPassword;
    private javax.swing.JLabel LblSearch;
    private javax.swing.JTable TblUsers;
    private javax.swing.JTextField TxtCode;
    private javax.swing.JTextField TxtLogin;
    private javax.swing.JTextField TxtName;
    private javax.swing.JTextField TxtPassword;
    private javax.swing.JTextField TxtSearch;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void clean() {
        JTextField txt[] = { TxtCode, TxtName, TxtLogin, TxtPassword, TxtSearch };
        for (JTextField t : txt)
            t.setText("");
        JButton btn[] = { BtnUpdate, BtnDelete };
        for (JButton b : btn)
            b.setEnabled(false);
        TxtName.requestFocus();
        carriesUsers();
        BtnCreate.setEnabled(true);
    }
    
    private void exportData() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(this);
        File path = fileChooser.getSelectedFile();
        boolean verify = cU.export(path.getPath());
        if (verify)
            Several.showData("Dados exportados com sucessos", title, true);
        else
            Several.showData("Erro na exportação dos dados", title, false);
    }
    
    private void carriesObjects(User u) {
        TxtCode.setText(String.valueOf(u.getCode()));
        TxtName.setText(String.valueOf(u.getName()));
        TxtLogin.setText(u.getLogin());
        TxtPassword.setText(u.getPassword());
        BtnUpdate.setEnabled(true);
        BtnDelete.setEnabled(true);
    }
    
    private void carriesUsers() {
        DefaultTableModel table = (DefaultTableModel) TblUsers.getModel();
        table.setNumRows(0);
        listU = cU.getList();
        listU.stream().map(o -> (User) o).forEachOrdered(u -> {
            table.addRow(new Object[] {
                u.getCode(),
                u.getName(),
                u.getLogin(),
            });
        });
    }
    
    private void search() {
        DefaultTableModel table = (DefaultTableModel) TblUsers.getModel();
        final TableRowSorter<TableModel> classify = new TableRowSorter<>(table);
        TblUsers.setRowSorter(classify);
        String text = TxtSearch.getText();
        classify.setRowFilter(RowFilter.regexFilter(text, 1));
    }
    
    private void searchTable() {
        BtnCreate.setEnabled(false);
        int row = TblUsers.getSelectedRow();
        DefaultTableModel table = (DefaultTableModel) TblUsers.getModel();
        int code = (int) table.getValueAt(row, 0);
        Object o = cU.getRead("", code);
        User u = (User) o;
        carriesObjects(u);
    }
    
    private void manipulate(char option) {
        String resp = "";
        if (TxtName.getText().isEmpty() || TxtLogin.getText().isEmpty() || TxtPassword.getText().equals(""))
            resp = "Favor preencher todos os campos";
        else {
            User u = new User();
            u.setName(TxtName.getText());
            u.setLogin(TxtLogin.getText());
            u.setPassword(TxtPassword.getText());
            switch (option) {
                case 'C' : {
                    if (cU.setManipulate(u, option))
                        resp = "Os dados do usuario : " + TxtName.getText() + "\nForam Persistidos com sucesso";
                    else
                        resp = "Problemas ao tentar persistir os dados do usuario :( \n" + TxtName.getText();
                    clean();
                }
                    break;
                case 'D' : {
                    u.setCode(Integer.parseInt(TxtCode.getText()));
                    if (cU.setManipulate(u, option))
                        resp = "Os dados do usuario : " + TxtName.getText() + "\nForam removidos com sucesso";
                    else
                        resp = "Problemas ao tentar remover os dados do usuario :( \n" + TxtName.getText();
                    clean();
                }
                    break;
                case 'U' : {
                    u.setCode(Integer.parseInt(TxtCode.getText()));
                    if (cU.setManipulate(u, option))
                        resp = "Os dados do usuario : " + TxtName.getText() + "\nForam atualizados com sucesso";
                    else
                        resp = "Problemas ao tentar atualizar os dados do usuario :( \n" + TxtName.getText();
                    clean();
                }
            }
        }
        Several.showData(resp, title, (resp.charAt(0) != 'F' && resp.charAt(0) != 'P'));
    }
}