package view;

import control.ControlBasic;
import control.ControlGeneral;
import control.ControlUseful;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Product;
import model.Sale;
import model.Sale_Product;
import model.UserSession;
import useful.Several;

public class ViewPDV extends javax.swing.JFrame {
    
    private final String title;
    private final ControlBasic cP, cS;
    private final ControlUseful cU;
    private List<Object> listSP;
    private final ViewPaymentPDV paymentForm;
    int item = 0, amount = 1;

    public ViewPDV() {
        initComponents();
        this.title = "PDV - System";
        this.cP = new ControlGeneral(1);
        this.cS = new ControlGeneral(2);
        this.cU = new ControlUseful();
        this.paymentForm = new ViewPaymentPDV(this, true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlLogo = new java.awt.Panel();
        LblLogo = new javax.swing.JLabel();
        ContentPane = new java.awt.Panel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblProducts = new javax.swing.JTable();
        TxtProducts = new javax.swing.JTextField();
        PnlContainer = new java.awt.Panel();
        PnlInfo = new java.awt.Panel();
        LblCaixa = new javax.swing.JLabel();
        Lblcaixa = new javax.swing.JLabel();
        LblOperator = new javax.swing.JLabel();
        Lbloperator = new javax.swing.JLabel();
        LblStatus = new javax.swing.JLabel();
        Lblstatus = new javax.swing.JLabel();
        PnlTools = new java.awt.Panel();
        LblValue = new javax.swing.JLabel();
        TxtValue = new javax.swing.JTextField();
        LblComands = new javax.swing.JLabel();
        LblUpdateAmount = new javax.swing.JLabel();
        LblFinallySale = new javax.swing.JLabel();
        LblSearchProduct = new javax.swing.JLabel();
        LblExit = new javax.swing.JLabel();
        LblDelete = new javax.swing.JLabel();
        LblCancel = new javax.swing.JLabel();
        MnbMenu = new javax.swing.JMenuBar();
        MniFile = new javax.swing.JMenu();
        MniExit = new javax.swing.JMenuItem();
        MniComands = new javax.swing.JMenu();
        MniCancel = new javax.swing.JMenuItem();
        MniDelete = new javax.swing.JMenuItem();
        MniUpdateAmount = new javax.swing.JMenuItem();
        MniFinallySale = new javax.swing.JMenuItem();
        MniSearchProduct = new javax.swing.JMenuItem();
        MniReturn = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PDV");
        setExtendedState(MAXIMIZED_BOTH);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        PnlLogo.setBackground(new java.awt.Color(204, 255, 204));

        LblLogo.setFont(new java.awt.Font("JetBrains Mono", 0, 25)); // NOI18N
        LblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblLogo.setText("Logo da empresa o_O");

        javax.swing.GroupLayout PnlLogoLayout = new javax.swing.GroupLayout(PnlLogo);
        PnlLogo.setLayout(PnlLogoLayout);
        PnlLogoLayout.setHorizontalGroup(
            PnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlLogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PnlLogoLayout.setVerticalGroup(
            PnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlLogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addContainerGap())
        );

        ContentPane.setBackground(new java.awt.Color(255, 255, 255));

        TblProducts.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        TblProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Código", "Descrição", "Quantidade", "Valor Uni.", "Valor Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TblProducts.setShowHorizontalLines(true);
        TblProducts.setShowVerticalLines(true);
        jScrollPane1.setViewportView(TblProducts);
        if (TblProducts.getColumnModel().getColumnCount() > 0) {
            TblProducts.getColumnModel().getColumn(0).setMinWidth(20);
            TblProducts.getColumnModel().getColumn(0).setPreferredWidth(20);
            TblProducts.getColumnModel().getColumn(1).setMinWidth(30);
            TblProducts.getColumnModel().getColumn(1).setPreferredWidth(30);
            TblProducts.getColumnModel().getColumn(2).setMinWidth(250);
            TblProducts.getColumnModel().getColumn(2).setPreferredWidth(260);
        }

        TxtProducts.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        TxtProducts.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtProducts.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        TxtProducts.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtProductsKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout ContentPaneLayout = new javax.swing.GroupLayout(ContentPane);
        ContentPane.setLayout(ContentPaneLayout);
        ContentPaneLayout.setHorizontalGroup(
            ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
                    .addComponent(TxtProducts))
                .addContainerGap())
        );
        ContentPaneLayout.setVerticalGroup(
            ContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PnlContainer.setBackground(new java.awt.Color(204, 255, 204));

        PnlInfo.setBackground(new java.awt.Color(255, 255, 255));

        LblCaixa.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        LblCaixa.setText("Caixa :");

        Lblcaixa.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        Lblcaixa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lblcaixa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        LblOperator.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        LblOperator.setText("Operador :");

        Lbloperator.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        Lbloperator.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbloperator.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        LblStatus.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        LblStatus.setText("Status :");

        Lblstatus.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        Lblstatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lblstatus.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        javax.swing.GroupLayout PnlInfoLayout = new javax.swing.GroupLayout(PnlInfo);
        PnlInfo.setLayout(PnlInfoLayout);
        PnlInfoLayout.setHorizontalGroup(
            PnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlInfoLayout.createSequentialGroup()
                        .addComponent(LblCaixa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Lblcaixa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PnlInfoLayout.createSequentialGroup()
                        .addComponent(LblOperator)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Lbloperator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PnlInfoLayout.createSequentialGroup()
                        .addComponent(LblStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Lblstatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PnlInfoLayout.setVerticalGroup(
            PnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LblCaixa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Lblcaixa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LblOperator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Lbloperator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Lblstatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PnlTools.setBackground(new java.awt.Color(255, 255, 255));

        LblValue.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        LblValue.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LblValue.setText("Valor Total :");

        TxtValue.setEditable(false);
        TxtValue.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        TxtValue.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtValue.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        LblComands.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        LblComands.setText("Comandos");

        LblUpdateAmount.setText("F3 Quantidade");

        LblFinallySale.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        LblFinallySale.setText("F4 Finalizar Venda");

        LblSearchProduct.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        LblSearchProduct.setText("F5 Pesquisar Produto");

        LblExit.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        LblExit.setText("F9 Sair");

        LblDelete.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        LblDelete.setText("F2 Excluir");

        LblCancel.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        LblCancel.setText("F1 Cancelar");

        javax.swing.GroupLayout PnlToolsLayout = new javax.swing.GroupLayout(PnlTools);
        PnlTools.setLayout(PnlToolsLayout);
        PnlToolsLayout.setHorizontalGroup(
            PnlToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlToolsLayout.createSequentialGroup()
                .addGroup(PnlToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlToolsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PnlToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtValue)
                            .addGroup(PnlToolsLayout.createSequentialGroup()
                                .addGroup(PnlToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblComands)
                                    .addComponent(LblUpdateAmount)
                                    .addComponent(LblFinallySale)
                                    .addComponent(LblSearchProduct)
                                    .addComponent(LblExit)
                                    .addComponent(LblDelete))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(PnlToolsLayout.createSequentialGroup()
                        .addGroup(PnlToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnlToolsLayout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(LblValue))
                            .addGroup(PnlToolsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(LblCancel)))
                        .addGap(0, 77, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PnlToolsLayout.setVerticalGroup(
            PnlToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlToolsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblValue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtValue, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblComands)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblCancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblUpdateAmount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblFinallySale)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblSearchProduct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblExit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PnlContainerLayout = new javax.swing.GroupLayout(PnlContainer);
        PnlContainer.setLayout(PnlContainerLayout);
        PnlContainerLayout.setHorizontalGroup(
            PnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PnlTools, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PnlInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PnlContainerLayout.setVerticalGroup(
            PnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PnlInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PnlTools, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        MniFile.setText("Arquivo");
        MniFile.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N

        MniExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        MniExit.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        MniExit.setText("Sair");
        MniExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MniExitActionPerformed(evt);
            }
        });
        MniFile.add(MniExit);

        MnbMenu.add(MniFile);

        MniComands.setText("Comandos");
        MniComands.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N

        MniCancel.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        MniCancel.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        MniCancel.setText("Cancelar");
        MniCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MniCancelActionPerformed(evt);
            }
        });
        MniComands.add(MniCancel);

        MniDelete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        MniDelete.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        MniDelete.setText("Excluir");
        MniDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MniDeleteActionPerformed(evt);
            }
        });
        MniComands.add(MniDelete);

        MniUpdateAmount.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        MniUpdateAmount.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        MniUpdateAmount.setText("Alterar Quantidade");
        MniUpdateAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MniUpdateAmountActionPerformed(evt);
            }
        });
        MniComands.add(MniUpdateAmount);

        MniFinallySale.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        MniFinallySale.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        MniFinallySale.setText("Finalizar Venda");
        MniFinallySale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MniFinallySaleActionPerformed(evt);
            }
        });
        MniComands.add(MniFinallySale);

        MniSearchProduct.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        MniSearchProduct.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        MniSearchProduct.setText("Pesquisar Produto");
        MniSearchProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MniSearchProductActionPerformed(evt);
            }
        });
        MniComands.add(MniSearchProduct);

        MniReturn.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F9, 0));
        MniReturn.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        MniReturn.setText("Retornar");
        MniReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MniReturnActionPerformed(evt);
            }
        });
        MniComands.add(MniReturn);

        MnbMenu.add(MniComands);

        setJMenuBar(MnbMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ContentPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PnlLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PnlContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PnlLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ContentPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(PnlContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MniExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MniExitActionPerformed
        if (Several.confirm("Deseja finalizar? :´(", title))
        System.exit(0);
    }//GEN-LAST:event_MniExitActionPerformed

    private void TxtProductsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtProductsKeyReleased
        getText(evt);        
    }//GEN-LAST:event_TxtProductsKeyReleased

    private void MniFinallySaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MniFinallySaleActionPerformed
        DefaultTableModel table = (DefaultTableModel) TblProducts.getModel();
        if (table.getRowCount() < 1)
            Several.showData("Favor adicionar um produto 0_0", title, true);
        else {
            paymentForm.setValueTotal(Float.parseFloat(TxtValue.getText()));
            paymentForm.setValue();
            paymentForm.setVisible(true);
            TxtValue.setText(Several.twoDigits(true).format(paymentForm.getValueTotal()));        
            if (paymentForm.isPago())
                finallySale();
            else 
                Several.showData("Venda cancelada", title, true);
        }
        clean();
    }//GEN-LAST:event_MniFinallySaleActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        clean();
        setOperator();
    }//GEN-LAST:event_formWindowOpened

    private void MniReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MniReturnActionPerformed
        if (Several.confirm("Deseja retornar ao menu?", title)) {
            ViewMain frame = new ViewMain();
            frame.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_MniReturnActionPerformed

    private void MniUpdateAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MniUpdateAmountActionPerformed
        updateAmount();
    }//GEN-LAST:event_MniUpdateAmountActionPerformed

    private void MniDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MniDeleteActionPerformed
        removeItem();
    }//GEN-LAST:event_MniDeleteActionPerformed

    private void MniSearchProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MniSearchProductActionPerformed
        searchProduct();
    }//GEN-LAST:event_MniSearchProductActionPerformed

    private void MniCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MniCancelActionPerformed
        if (Several.confirm("Cancelar venda?", title))
            clean();
    }//GEN-LAST:event_MniCancelActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new ViewPDV().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Panel ContentPane;
    private javax.swing.JLabel LblCaixa;
    private javax.swing.JLabel LblCancel;
    private javax.swing.JLabel LblComands;
    private javax.swing.JLabel LblDelete;
    private javax.swing.JLabel LblExit;
    private javax.swing.JLabel LblFinallySale;
    private javax.swing.JLabel LblLogo;
    private javax.swing.JLabel LblOperator;
    private javax.swing.JLabel LblSearchProduct;
    private javax.swing.JLabel LblStatus;
    private javax.swing.JLabel LblUpdateAmount;
    private javax.swing.JLabel LblValue;
    private javax.swing.JLabel Lblcaixa;
    private javax.swing.JLabel Lbloperator;
    private javax.swing.JLabel Lblstatus;
    private javax.swing.JMenuBar MnbMenu;
    private javax.swing.JMenuItem MniCancel;
    private javax.swing.JMenu MniComands;
    private javax.swing.JMenuItem MniDelete;
    private javax.swing.JMenuItem MniExit;
    private javax.swing.JMenu MniFile;
    private javax.swing.JMenuItem MniFinallySale;
    private javax.swing.JMenuItem MniReturn;
    private javax.swing.JMenuItem MniSearchProduct;
    private javax.swing.JMenuItem MniUpdateAmount;
    private java.awt.Panel PnlContainer;
    private java.awt.Panel PnlInfo;
    private java.awt.Panel PnlLogo;
    private java.awt.Panel PnlTools;
    private javax.swing.JTable TblProducts;
    private javax.swing.JTextField TxtProducts;
    private javax.swing.JTextField TxtValue;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void clean() {
        TxtProducts.setText("");
        TxtValue.setText("");
        DefaultTableModel table = (DefaultTableModel) TblProducts.getModel();
        table.setNumRows(0);
        TxtProducts.requestFocus();
        amount = 1;
        item = 0;
        Lblstatus.setText("Caixa Livre");
    }
    
    private void getText(java.awt.event.KeyEvent e) {
        DefaultTableModel table = (DefaultTableModel) TblProducts.getModel();
        if (e.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {               
            if (!Several.testNum(TxtProducts.getText(), title))
                TxtProducts.setText("");
            else {
                Object o = cP.getRead("", Integer.parseInt(TxtProducts.getText()));
                if (o != null) {       
                    Lblstatus.setText("Em Venda");
                    Product p = (Product) o;
                    table.addRow(new Object[] {
                        item,
                        p.getCode(),
                        p.getDescription(),
                        amount,
                        Several.twoDigits(true).format(p.getValue()),
                        Several.twoDigits(true).format(p.getValue() * amount)
                    });
                    item += 1;
                    subTotal();
                }
                else
                    Several.showData("Produto não localizado ou inexistente", title, false);
                TxtProducts.setText("");
            }
        }
    }
    
    private void removeItem() {
        DefaultTableModel table = (DefaultTableModel) TblProducts.getModel();
        if (table.getRowCount() < 1)
            Several.showData("Nenhum item na tabela", title, true);
        else {
            String removeItem = Several.readData("digite o nº do item para remover", title);
            if (!Several.testNum(removeItem, title))
                Several.showData("Digite um caractere numérico", title, false);
            else {
                int row = Integer.parseInt(removeItem);
                if (row > table.getRowCount()) 
                    Several.showData("Nº de item fora da lista", title, false);
                else {
                    table.removeRow(row);
                    subTotal();
                    int rowsAmount = table.getRowCount();
                    for (int i = 0; i < rowsAmount; i++)
                        table.setValueAt(i, i, 0);
                }
            }
        }
    }
    
    private void updateAmount() {
        amount = Integer.parseInt(Several.readData("Digite a quantidade(antes de adicionar)", title));
    }
    
    private void subTotal() {
        float sum = 0;
        int cont = TblProducts.getRowCount();
        for (int i = 0; i < cont; i++) 
            sum += Float.parseFloat(TblProducts.getValueAt(i, 5).toString()); 
        TxtValue.setText(Several.twoDigits(true).format(sum));
    }
    
    private void finallySale() {
        String resp = "";                
        Sale s = new Sale();
        s.setDate(new Date(System.currentTimeMillis()));
        s.setDiscount(paymentForm.getDiscount());
        s.setValue(paymentForm.getValueTotal());
        listSP = new ArrayList<>();
        int code = cU.create(s);
        if (code > 0) {
            int cont = TblProducts.getRowCount();
            for (int i = 0; i < cont; i++) {
                Object p = cP.getRead("", Integer.parseInt(TblProducts.getValueAt(i, 1).toString()));
                Product pro = (Product) p;
                Object a = cS.getRead("", code);
                Sale salep = (Sale) a;
                Sale_Product sale = new Sale_Product();
                sale.setProduct(pro);
                sale.setAmount(Integer.parseInt(TblProducts.getValueAt(i, 3).toString()));                            
                sale.setSale(salep);
                sale.setValue(Float.parseFloat(Several.convertValue(String.valueOf(TblProducts.getValueAt(i, 4)))));
                listSP.add(sale);
            }
            if (cU.create(listSP))
                resp = "Venda salva com sucesso";
            else
                resp = "Problemas ao tentar lista da venda";
        }
        else 
            resp = "Problemas ao tentar salvar dados da venda";        
        Several.showData(resp, title, (resp.charAt(0) != 'P'));
        clean();
    }
    
    private void setOperator() {
        Lblcaixa.setText("Caixa 1");
        Lbloperator.setText(UserSession.name);
    }
    
    private void searchProduct() {
        String description = Several.readData("Digite a descrição", title);
        Object o = cU.getReadProductDescription(description);
        if (o != null) {
            Product p = (Product) o;
            TxtProducts.setText(String.valueOf(p.getCode()));
        }
        else
            Several.showData("Produto não localizado o u inexistente", title, false);
    }
}