package view;

import control.ControlBasic;
import control.ControlGeneral;
import java.util.ArrayList;
import java.util.List;
import model.PaymentForm;
import useful.Several;

public class ViewPaymentPDV extends javax.swing.JDialog {
    
    private final String title;
    private final ControlBasic cPF;
    private List<Object> listPF;
    private float valueTotal, troco, receiveValue;
    private int discount;
    private String paymentForm;
    private boolean pago = false;

    public ViewPaymentPDV(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        title = "PaymentForms - PDV";
        cPF = new ControlGeneral(4);
        listPF = new ArrayList<>();        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlContentPane = new javax.swing.JPanel();
        LblDiscount = new javax.swing.JLabel();
        LblSubTotal = new javax.swing.JLabel();
        LblReceiveValue = new javax.swing.JLabel();
        PnlValues = new javax.swing.JPanel();
        LblTotal = new javax.swing.JLabel();
        TxtTroco = new javax.swing.JTextField();
        LblTroco = new javax.swing.JLabel();
        TxtValueTotal = new javax.swing.JTextField();
        TxtSubTotal = new javax.swing.JTextField();
        TxtDiscount = new javax.swing.JTextField();
        TxtReceiveValue = new javax.swing.JTextField();
        Btn0k = new javax.swing.JButton();
        BtnCancel = new javax.swing.JButton();
        CmbPayment = new javax.swing.JComboBox<>();
        LblPayment = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        PnlContentPane.setBackground(new java.awt.Color(204, 204, 255));
        PnlContentPane.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        LblDiscount.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        LblDiscount.setText("Desconto :");

        LblSubTotal.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        LblSubTotal.setText("Sub Total :");

        LblReceiveValue.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        LblReceiveValue.setText("Valor Recebido :");

        PnlValues.setBackground(new java.awt.Color(153, 255, 255));
        PnlValues.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        LblTotal.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        LblTotal.setText("Total a Pagar :");

        TxtTroco.setEditable(false);
        TxtTroco.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        TxtTroco.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtTroco.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        LblTroco.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        LblTroco.setText("Troco :");

        TxtValueTotal.setEditable(false);
        TxtValueTotal.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        TxtValueTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtValueTotal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        javax.swing.GroupLayout PnlValuesLayout = new javax.swing.GroupLayout(PnlValues);
        PnlValues.setLayout(PnlValuesLayout);
        PnlValuesLayout.setHorizontalGroup(
            PnlValuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlValuesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlValuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblTroco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlValuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtValueTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(TxtTroco))
                .addContainerGap())
        );
        PnlValuesLayout.setVerticalGroup(
            PnlValuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlValuesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlValuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlValuesLayout.createSequentialGroup()
                        .addComponent(LblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(TxtValueTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlValuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblTroco)
                    .addComponent(TxtTroco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        TxtSubTotal.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        TxtSubTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtSubTotal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        TxtSubTotal.setEnabled(false);

        TxtDiscount.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        TxtDiscount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtDiscount.setText("0");
        TxtDiscount.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        TxtDiscount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtDiscountFocusLost(evt);
            }
        });
        TxtDiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDiscountActionPerformed(evt);
            }
        });
        TxtDiscount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtDiscountKeyReleased(evt);
            }
        });

        TxtReceiveValue.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        TxtReceiveValue.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtReceiveValue.setText("0");
        TxtReceiveValue.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        TxtReceiveValue.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtReceiveValueFocusLost(evt);
            }
        });
        TxtReceiveValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtReceiveValueActionPerformed(evt);
            }
        });
        TxtReceiveValue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtReceiveValueKeyReleased(evt);
            }
        });

        Btn0k.setBackground(new java.awt.Color(153, 255, 153));
        Btn0k.setFont(new java.awt.Font("JetBrains Mono", 0, 15)); // NOI18N
        Btn0k.setText("0k");
        Btn0k.setToolTipText("");
        Btn0k.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn0kActionPerformed(evt);
            }
        });

        BtnCancel.setBackground(new java.awt.Color(255, 153, 153));
        BtnCancel.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        BtnCancel.setText("Cancelar");
        BtnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelActionPerformed(evt);
            }
        });

        CmbPayment.setBackground(new java.awt.Color(255, 255, 255));
        CmbPayment.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        CmbPayment.setMaximumRowCount(5);
        CmbPayment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CmbPaymentKeyReleased(evt);
            }
        });

        LblPayment.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        LblPayment.setText("Pagamento :");

        javax.swing.GroupLayout PnlContentPaneLayout = new javax.swing.GroupLayout(PnlContentPane);
        PnlContentPane.setLayout(PnlContentPaneLayout);
        PnlContentPaneLayout.setHorizontalGroup(
            PnlContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlContentPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlContentPaneLayout.createSequentialGroup()
                        .addGroup(PnlContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PnlValues, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PnlContentPaneLayout.createSequentialGroup()
                                .addComponent(LblSubTotal)
                                .addGap(7, 7, 7)
                                .addComponent(TxtSubTotal))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PnlContentPaneLayout.createSequentialGroup()
                                .addComponent(LblReceiveValue)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtReceiveValue))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PnlContentPaneLayout.createSequentialGroup()
                                .addComponent(LblDiscount)
                                .addGap(18, 18, 18)
                                .addComponent(TxtDiscount)))
                        .addContainerGap())
                    .addGroup(PnlContentPaneLayout.createSequentialGroup()
                        .addComponent(Btn0k, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PnlContentPaneLayout.createSequentialGroup()
                        .addComponent(LblPayment)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CmbPayment, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        PnlContentPaneLayout.setVerticalGroup(
            PnlContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlContentPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LblSubTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TxtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblPayment)
                    .addComponent(CmbPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(PnlContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblDiscount)
                    .addComponent(TxtDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblReceiveValue)
                    .addComponent(TxtReceiveValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PnlValues, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlContentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Btn0k, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlContentPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlContentPane, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        carriesPaymentForms();
        payment();
        CmbPayment.requestFocus();
    }//GEN-LAST:event_formWindowOpened

    private void TxtDiscountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtDiscountKeyReleased
        if (!Several.testNum(TxtDiscount.getText(), title))
            TxtDiscount.setText("");
    }//GEN-LAST:event_TxtDiscountKeyReleased

    private void TxtReceiveValueKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtReceiveValueKeyReleased
        if (!Several.testNum(TxtReceiveValue.getText(), title))
            TxtReceiveValue.setText("");
    }//GEN-LAST:event_TxtReceiveValueKeyReleased

    private void Btn0kActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn0kActionPerformed
        ok();
    }//GEN-LAST:event_Btn0kActionPerformed

    private void TxtReceiveValueFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtReceiveValueFocusLost
        payment();
    }//GEN-LAST:event_TxtReceiveValueFocusLost

    private void BtnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelActionPerformed
        if (Several.confirm("Deseja cancelar", title))
            this.dispose();
    }//GEN-LAST:event_BtnCancelActionPerformed

    private void TxtDiscountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtDiscountFocusLost
        payment();
    }//GEN-LAST:event_TxtDiscountFocusLost

    private void TxtDiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDiscountActionPerformed
        TxtReceiveValue.requestFocus();
    }//GEN-LAST:event_TxtDiscountActionPerformed

    private void TxtReceiveValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtReceiveValueActionPerformed
        ok();
    }//GEN-LAST:event_TxtReceiveValueActionPerformed

    private void CmbPaymentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CmbPaymentKeyReleased
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER)
            TxtDiscount.requestFocus();
    }//GEN-LAST:event_CmbPaymentKeyReleased

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPaymentPDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            ViewPaymentPDV dialog = new ViewPaymentPDV(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn0k;
    private javax.swing.JButton BtnCancel;
    private javax.swing.JComboBox<String> CmbPayment;
    private javax.swing.JLabel LblDiscount;
    private javax.swing.JLabel LblPayment;
    private javax.swing.JLabel LblReceiveValue;
    private javax.swing.JLabel LblSubTotal;
    private javax.swing.JLabel LblTotal;
    private javax.swing.JLabel LblTroco;
    private javax.swing.JPanel PnlContentPane;
    private javax.swing.JPanel PnlValues;
    private javax.swing.JTextField TxtDiscount;
    private javax.swing.JTextField TxtReceiveValue;
    private javax.swing.JTextField TxtSubTotal;
    private javax.swing.JTextField TxtTroco;
    private javax.swing.JTextField TxtValueTotal;
    // End of variables declaration//GEN-END:variables

    private void carriesPaymentForms() {
        int posi = CmbPayment.getSelectedIndex();
        listPF = cPF.getList();
        CmbPayment.removeAllItems();
        listPF.stream().map(o -> (PaymentForm) o).forEachOrdered(p -> {
            CmbPayment.addItem(p.getDescription());
        });
        if (posi > -1)
            CmbPayment.setSelectedIndex(0);
        else
            CmbPayment.setSelectedIndex(-1);
    }

    public float getValueTotal() {
        return valueTotal;
    }

    public void setValueTotal(float valueTotal) {
        this.valueTotal = valueTotal;
    }

    public float getTroco() {
        return troco;
    }

    public void setTroco(float troco) {
        this.troco = troco;
    }

    public float getReceiveValue() {
        return receiveValue;
    }

    public void setReceiveValue(float receiveValue) {
        this.receiveValue = receiveValue;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getPaymentForm() {
        return paymentForm;
    }

    public void setPaymentForm(String paymentForm) {
        this.paymentForm = paymentForm;
    }
    
    public void setValue() {
        TxtSubTotal.setText(Several.twoDigits(true).format(valueTotal));
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }
    
    private void ok() {
        discount = Integer.parseInt(TxtDiscount.getText());
        troco = Float.parseFloat(TxtTroco.getText());
        receiveValue = Float.parseFloat(TxtReceiveValue.getText());
        valueTotal = Float.parseFloat(TxtValueTotal.getText());
        paymentForm = CmbPayment.getSelectedItem().toString();
        pago = true;
        dispose();
    }
    
    private void payment() {
        float subTotal, discountN, receiveValueN, value, trocoN;
        
        subTotal = Float.parseFloat(TxtSubTotal.getText());
        
        if (!TxtDiscount.getText().isEmpty())
            discountN = Float.parseFloat(TxtDiscount.getText());
        else
            discountN = 0;
        
        if (!TxtReceiveValue.getText().isEmpty())
            receiveValueN = Float.parseFloat(TxtReceiveValue.getText());
        else
            receiveValueN = 0;
        
        value = subTotal - (subTotal * (discountN/100));
        
        TxtValueTotal.setText(Several.twoDigits(true).format(value));
        
        trocoN = receiveValueN - value;
        
        TxtTroco.setText(Several.twoDigits(true).format(trocoN));
    }
}