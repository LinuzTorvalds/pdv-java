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
import model.Product;
import useful.Several;

public class ViewProduct extends javax.swing.JFrame {

    private final String title;
    private final ControlBasic cP;
    private List<Object> listP;
    
    public ViewProduct() {
        initComponents();
        title = "Produtos";
        cP = new ControlGeneral(1);
        listP = new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ContentPane = new javax.swing.JPanel();
        LblCode = new javax.swing.JLabel();
        TxtCode = new javax.swing.JTextField();
        LblDescription = new javax.swing.JLabel();
        TxtDescription = new javax.swing.JTextField();
        LblValue = new javax.swing.JLabel();
        TxtValue = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblProducts = new javax.swing.JTable();
        LblSearch = new javax.swing.JLabel();
        TxtSearch = new javax.swing.JTextField();
        BtnSearch = new javax.swing.JButton();
        BtnCreate = new javax.swing.JButton();
        BtnUpdate = new javax.swing.JButton();
        BtnDelete = new javax.swing.JButton();
        BtnExport = new javax.swing.JButton();
        BtnCancel = new javax.swing.JButton();
        BtnReturn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Produtos");
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
        ContentPane.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N

        LblCode.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        LblCode.setText("Código :");

        TxtCode.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        TxtCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtCode.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        TxtCode.setEnabled(false);

        LblDescription.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        LblDescription.setText("Descrição :");

        TxtDescription.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        TxtDescription.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtDescription.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        LblValue.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        LblValue.setText("Valor :");

        TxtValue.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        TxtValue.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtValue.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        TblProducts.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        TblProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TblProducts.setShowHorizontalLines(true);
        TblProducts.setShowVerticalLines(true);
        TblProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblProductsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TblProducts);
        if (TblProducts.getColumnModel().getColumnCount() > 0) {
            TblProducts.getColumnModel().getColumn(0).setMinWidth(70);
            TblProducts.getColumnModel().getColumn(0).setPreferredWidth(70);
            TblProducts.getColumnModel().getColumn(0).setMaxWidth(70);
            TblProducts.getColumnModel().getColumn(1).setMinWidth(320);
            TblProducts.getColumnModel().getColumn(1).setPreferredWidth(320);
            TblProducts.getColumnModel().getColumn(1).setMaxWidth(350);
        }

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

        BtnCancel.setBackground(new java.awt.Color(255, 255, 255));
        BtnCancel.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        BtnCancel.setText("Cancelar");
        BtnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelActionPerformed(evt);
            }
        });

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
                .addContainerGap()
                .addGroup(ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(ContentPaneLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtDescription)
                            .addGroup(ContentPaneLayout.createSequentialGroup()
                                .addComponent(TxtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TxtValue, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(ContentPaneLayout.createSequentialGroup()
                        .addComponent(LblSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnSearch))
                    .addGroup(ContentPaneLayout.createSequentialGroup()
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
                        .addComponent(BtnReturn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ContentPaneLayout.createSequentialGroup()
                        .addGroup(ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblDescription)
                            .addGroup(ContentPaneLayout.createSequentialGroup()
                                .addComponent(LblCode)
                                .addGap(95, 95, 95)
                                .addComponent(LblValue)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ContentPaneLayout.setVerticalGroup(
            ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblCode)
                    .addComponent(LblValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblDescription)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblSearch)
                    .addComponent(TxtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(ContentPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSearchActionPerformed
        search();
    }//GEN-LAST:event_BtnSearchActionPerformed

    private void BtnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCreateActionPerformed
        manipulate('C');
    }//GEN-LAST:event_BtnCreateActionPerformed

    private void BtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUpdateActionPerformed
        manipulate('U');
    }//GEN-LAST:event_BtnUpdateActionPerformed

    private void BtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeleteActionPerformed
        manipulate('D');
    }//GEN-LAST:event_BtnDeleteActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        TxtDescription.requestFocus();
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        clean();
    }//GEN-LAST:event_formWindowOpened

    private void BtnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExportActionPerformed
        exportData();
    }//GEN-LAST:event_BtnExportActionPerformed

    private void TblProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblProductsMouseClicked
        searchTable();
    }//GEN-LAST:event_TblProductsMouseClicked

    private void BtnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelActionPerformed
        clean();
    }//GEN-LAST:event_BtnCancelActionPerformed

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
            java.util.logging.Logger.getLogger(ViewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new ViewProduct().setVisible(true);
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
    private javax.swing.JLabel LblDescription;
    private javax.swing.JLabel LblSearch;
    private javax.swing.JLabel LblValue;
    private javax.swing.JTable TblProducts;
    private javax.swing.JTextField TxtCode;
    private javax.swing.JTextField TxtDescription;
    private javax.swing.JTextField TxtSearch;
    private javax.swing.JTextField TxtValue;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void clean() {
        JTextField txt[] = { TxtCode, TxtDescription, TxtValue, TxtSearch };
        for (JTextField t : txt)
            t.setText("");
        JButton btn[] = { BtnUpdate, BtnDelete };
        for (JButton b : btn)
            b.setEnabled(false);
        TxtDescription.requestFocus();
        carriesProducts();
        BtnCreate.setEnabled(true);
    }
    
    private void exportData() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(this);
        File path = fileChooser.getSelectedFile();
        boolean verify = cP.export(path.getPath());
        if (verify)
            Several.showData("Dados exportados com sucessos", title, true);
        else
            Several.showData("Erro na exportação dos dados", title, false);
    }
    
    private void carriesObjects(Product p) {
        TxtCode.setText(String.valueOf(p.getCode()));
        TxtValue.setText(String.valueOf(p.getValue()));
        TxtDescription.setText(p.getDescription());
        BtnUpdate.setEnabled(true);
        BtnDelete.setEnabled(true);
    }
    
    private void carriesProducts() {
        DefaultTableModel table = (DefaultTableModel) TblProducts.getModel();
        table.setNumRows(0);
        listP = cP.getList();
        listP.stream().map(o -> (Product) o).forEachOrdered(p -> {
            table.addRow(new Object[] {
                p.getCode(),
                p.getDescription(),
                Several.twoDigits(false).format(p.getValue()),
            });
        });
    }
    
    private void search() {
        DefaultTableModel table = (DefaultTableModel) TblProducts.getModel();
        final TableRowSorter<TableModel> classify = new TableRowSorter<>(table);
        TblProducts.setRowSorter(classify);
        String text = TxtSearch.getText();
        classify.setRowFilter(RowFilter.regexFilter(text, 1));
    }
    
    private void searchTable() {
        BtnCreate.setEnabled(false);
        int row = TblProducts.getSelectedRow();
        DefaultTableModel table = (DefaultTableModel) TblProducts.getModel();
        int code = (int) table.getValueAt(row, 0);
        Object o = cP.getRead("", code);
        Product p = (Product) o;
        carriesObjects(p);
    }
    
    private void manipulate(char option) {
        String resp = "";
        if (TxtDescription.getText().isEmpty() || TxtValue.getText().isEmpty())
            resp = "Favor preencher todos os campos";
        else {
            Product p = new Product();            
            p.setDescription(TxtDescription.getText());
            p.setValue(Float.parseFloat(Several.convertValue(TxtValue.getText())));
            switch (option) {
                case 'C' : {
                    if (cP.setManipulate(p, option))
                        resp = "Os dados do item : " + TxtDescription.getText() + "\nForam Persistidos com sucesso";
                    else
                        resp = "Problemas ao tentar persistir os dados do item :( \n" + TxtDescription.getText();
                    clean();
                }
                    break;
                case 'D' : {
                    p.setCode(Integer.parseInt(TxtCode.getText()));
                    if (cP.setManipulate(p, option))
                        resp = "Os dados do item : " + TxtDescription.getText() + "\nForam removidos com sucesso";
                    else
                        resp = "Problemas ao tentar remover os dados do item :( \n" + TxtDescription.getText();
                    clean();
                }
                    break;
                case 'U' : {
                    p.setCode(Integer.parseInt(TxtCode.getText()));
                    if (cP.setManipulate(p, option))
                        resp = "Os dados do item : " + TxtDescription.getText() + "\nForam atualizados com sucesso";
                    else
                        resp = "Problemas ao tentar atualizar os dados do item :( \n" + TxtDescription.getText();
                    clean();
                }
            }
        }
        Several.showData(resp, title, (resp.charAt(0) != 'F' && resp.charAt(0) != 'P'));
    }
}