package visao;

import java.awt.Color;
import java.util.ArrayList;
import controlador.Controlador;

public class PrincipalFrame extends javax.swing.JFrame {
    
    private Controlador ctrl;

    public PrincipalFrame() {
        initComponents();
        ctrl = new Controlador();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelVendas = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jSpinnerEstimativa = new javax.swing.JSpinner();
        jButtonCalcular = new javax.swing.JButton();
        jTextFieldMargemContribuicao = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jTextFieldLucro = new javax.swing.JFormattedTextField();
        jTextFieldQtdEquilibrio = new javax.swing.JFormattedTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextFieldPreco = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldEnergia = new javax.swing.JTextField();
        jTextFieldAgua = new javax.swing.JTextField();
        jTextFieldInternet = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldFolha = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldImpostos = new javax.swing.JTextField();
        jTextFieldAluguel = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldCelim = new javax.swing.JTextField();
        jTextFieldQuadro = new javax.swing.JTextField();
        jTextFieldGuidao = new javax.swing.JTextField();
        jTextFieldPneu = new javax.swing.JTextField();
        jTextFieldPedau = new javax.swing.JTextField();
        jTextFieldCoroa = new javax.swing.JTextField();
        jTextFieldAro = new javax.swing.JTextField();
        jTextFieldGrafo = new javax.swing.JTextField();
        jTextFieldFreio = new javax.swing.JTextField();
        jTextFieldCambioDianteiro = new javax.swing.JTextField();
        jTextFieldCambioTraseiro = new javax.swing.JTextField();
        jSpinnerCelim = new javax.swing.JSpinner();
        jSpinnerGuidao = new javax.swing.JSpinner();
        jSpinnerQuadro = new javax.swing.JSpinner();
        jSpinnerPneu = new javax.swing.JSpinner();
        jSpinnerPedau = new javax.swing.JSpinner();
        jSpinnerCoroa = new javax.swing.JSpinner();
        jSpinnerAro = new javax.swing.JSpinner();
        jSpinnerGarfo = new javax.swing.JSpinner();
        jSpinnerFreio = new javax.swing.JSpinner();
        jSpinnerCambioDianteiro = new javax.swing.JSpinner();
        jSpinnerCambioTraseiro = new javax.swing.JSpinner();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Controle Financeiro");

        jLabel29.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 255));
        jLabel29.setText("Estimativa Venda:");

        jSpinnerEstimativa.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        jSpinnerEstimativa.setModel(new javax.swing.SpinnerNumberModel(1500, 0, null, 1));
        jSpinnerEstimativa.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerEstimativaStateChanged(evt);
            }
        });

        jButtonCalcular.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jButtonCalcular.setForeground(new java.awt.Color(0, 0, 255));
        jButtonCalcular.setText("Calcular");
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });

        jTextFieldMargemContribuicao.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jTextFieldMargemContribuicao.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldMargemContribuicao.setText("20");
        jTextFieldMargemContribuicao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldMargemContribuicaoFocusLost(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(51, 51, 255));
        jLabel30.setText("Lucro/Prejuízo:");

        jLabel31.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(51, 51, 255));
        jLabel31.setText("Preço:");

        jLabel32.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(51, 51, 255));
        jLabel32.setText("Margem Contrib. (%):");

        jTextFieldLucro.setEditable(false);
        jTextFieldLucro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        jTextFieldLucro.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldLucro.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N

        jTextFieldQtdEquilibrio.setEditable(false);
        jTextFieldQtdEquilibrio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00;(¤#,##0.00)"))));
        jTextFieldQtdEquilibrio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldQtdEquilibrio.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/caloi-logo-4.png"))); // NOI18N
        jLabel39.setText("jLabel39");

        jLabel40.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 0, 255));
        jLabel40.setText("Qtd Equilíbrio:");

        jLabel41.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 0, 255));
        jLabel41.setText("R$");

        jLabel43.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 0, 255));
        jLabel43.setText("R$");

        jLabel44.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 0, 255));
        jLabel44.setText("R$");

        jLabel45.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 0, 255));
        jLabel45.setText("R$");

        jTextFieldPreco.setEditable(false);
        jTextFieldPreco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00;(¤#,##0.00)"))));
        jTextFieldPreco.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldPreco.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanelVendasLayout = new javax.swing.GroupLayout(jPanelVendas);
        jPanelVendas.setLayout(jPanelVendasLayout);
        jPanelVendasLayout.setHorizontalGroup(
            jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVendasLayout.createSequentialGroup()
                .addGroup(jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVendasLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelVendasLayout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel41)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinnerEstimativa, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVendasLayout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel43)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldMargemContribuicao, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVendasLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel40)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel30))
                                .addGap(132, 132, 132)
                                .addComponent(jTextFieldQtdEquilibrio, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVendasLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldLucro)
                            .addGroup(jPanelVendasLayout.createSequentialGroup()
                                .addComponent(jLabel44)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVendasLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelVendasLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58))
        );
        jPanelVendasLayout.setVerticalGroup(
            jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVendasLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVendasLayout.createSequentialGroup()
                        .addGroup(jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(jSpinnerEstimativa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(jTextFieldMargemContribuicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVendasLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel40))
                    .addComponent(jTextFieldQtdEquilibrio, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelVendasLayout.createSequentialGroup()
                        .addGroup(jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldLucro, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30)))
                    .addComponent(jButtonCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Vendas", jPanelVendas);

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Energia");

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Água");

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Internet");

        jTextFieldEnergia.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jTextFieldEnergia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldEnergia.setText("1000.00");

        jTextFieldAgua.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jTextFieldAgua.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldAgua.setText("500.00");

        jTextFieldInternet.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jTextFieldInternet.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldInternet.setText("300.00");

        jLabel4.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Folha Pagto");

        jTextFieldFolha.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jTextFieldFolha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldFolha.setText("10000.00");
        jTextFieldFolha.setPreferredSize(new java.awt.Dimension(96, 38));

        jLabel5.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("Impostos");

        jLabel6.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("Aluguel");

        jTextFieldImpostos.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jTextFieldImpostos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldImpostos.setText("2000.00");

        jTextFieldAluguel.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jTextFieldAluguel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldAluguel.setText("20000.00");

        jLabel18.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 255));
        jLabel18.setText("R$");

        jLabel19.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 255));
        jLabel19.setText("R$");

        jLabel20.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 255));
        jLabel20.setText("R$");

        jLabel21.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 255));
        jLabel21.setText("R$");

        jLabel22.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 255));
        jLabel22.setText("R$");

        jLabel23.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 255));
        jLabel23.setText("R$");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel6)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldFolha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldImpostos)
                    .addComponent(jTextFieldAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldInternet)
                    .addComponent(jTextFieldEnergia)
                    .addComponent(jTextFieldAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(jTextFieldEnergia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(jTextFieldFolha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(jTextFieldAgua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(jTextFieldImpostos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addComponent(jTextFieldInternet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addContainerGap(149, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Custos fixos", jPanel2);

        jLabel7.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setText("Guidão");

        jLabel8.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 255));
        jLabel8.setText("Quadro");

        jLabel9.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 255));
        jLabel9.setText("Celim");

        jLabel10.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 255));
        jLabel10.setText("Pneu");

        jLabel11.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 255));
        jLabel11.setText("Pedau");

        jLabel12.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 255));
        jLabel12.setText("Coroa");

        jLabel13.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 255));
        jLabel13.setText("Aro");

        jLabel14.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 255));
        jLabel14.setText("Garfo");

        jLabel15.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 255));
        jLabel15.setText("Freio");

        jLabel16.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 255));
        jLabel16.setText("Cambio traseiro");

        jLabel17.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 255));
        jLabel17.setText("Cambio diânteiro");

        jTextFieldCelim.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jTextFieldCelim.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCelim.setText("15.00");

        jTextFieldQuadro.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jTextFieldQuadro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldQuadro.setText("65.00");

        jTextFieldGuidao.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jTextFieldGuidao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldGuidao.setText("20.00");

        jTextFieldPneu.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jTextFieldPneu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldPneu.setText("30.00");

        jTextFieldPedau.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jTextFieldPedau.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldPedau.setText("15.00");

        jTextFieldCoroa.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jTextFieldCoroa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCoroa.setText("20.00");

        jTextFieldAro.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jTextFieldAro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldAro.setText("35.00");

        jTextFieldGrafo.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jTextFieldGrafo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldGrafo.setText("25.00");

        jTextFieldFreio.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jTextFieldFreio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldFreio.setText("15.00");

        jTextFieldCambioDianteiro.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jTextFieldCambioDianteiro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCambioDianteiro.setText("45.00");

        jTextFieldCambioTraseiro.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jTextFieldCambioTraseiro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCambioTraseiro.setText("65.00");

        jSpinnerCelim.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jSpinnerCelim.setModel(new javax.swing.SpinnerNumberModel(1, 0, null, 1));

        jSpinnerGuidao.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jSpinnerGuidao.setModel(new javax.swing.SpinnerNumberModel(1, 0, null, 1));

        jSpinnerQuadro.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jSpinnerQuadro.setModel(new javax.swing.SpinnerNumberModel(1, 0, null, 1));

        jSpinnerPneu.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jSpinnerPneu.setModel(new javax.swing.SpinnerNumberModel(2, 0, null, 1));

        jSpinnerPedau.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jSpinnerPedau.setModel(new javax.swing.SpinnerNumberModel(2, 0, null, 1));

        jSpinnerCoroa.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jSpinnerCoroa.setModel(new javax.swing.SpinnerNumberModel(1, 0, null, 1));

        jSpinnerAro.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jSpinnerAro.setModel(new javax.swing.SpinnerNumberModel(2, 0, null, 1));

        jSpinnerGarfo.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jSpinnerGarfo.setModel(new javax.swing.SpinnerNumberModel(1, 0, null, 1));

        jSpinnerFreio.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jSpinnerFreio.setModel(new javax.swing.SpinnerNumberModel(2, 0, null, 1));

        jSpinnerCambioDianteiro.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jSpinnerCambioDianteiro.setModel(new javax.swing.SpinnerNumberModel(1, 0, null, 1));

        jSpinnerCambioTraseiro.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jSpinnerCambioTraseiro.setModel(new javax.swing.SpinnerNumberModel(1, 0, null, 1));

        jLabel24.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 255));
        jLabel24.setText("R$");

        jLabel25.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 255));
        jLabel25.setText("R$");

        jLabel26.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 51, 255));
        jLabel26.setText("R$");

        jLabel27.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 51, 255));
        jLabel27.setText("R$");

        jLabel28.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(51, 51, 255));
        jLabel28.setText("R$");

        jLabel33.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(51, 51, 255));
        jLabel33.setText("R$");

        jLabel34.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(51, 51, 255));
        jLabel34.setText("R$");

        jLabel35.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(51, 51, 255));
        jLabel35.setText("R$");

        jLabel36.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(51, 51, 255));
        jLabel36.setText("R$");

        jLabel37.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(51, 51, 255));
        jLabel37.setText("R$");

        jLabel38.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(51, 51, 255));
        jLabel38.setText("R$");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel8)
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCoroa)
                    .addComponent(jTextFieldPedau, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldPneu)
                    .addComponent(jTextFieldCelim, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldGuidao)
                    .addComponent(jTextFieldQuadro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinnerCoroa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerGuidao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerQuadro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerCelim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerPneu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerPedau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel16))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextFieldAro)
                        .addComponent(jTextFieldGrafo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldCambioDianteiro)
                    .addComponent(jTextFieldFreio)
                    .addComponent(jTextFieldCambioTraseiro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSpinnerGarfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSpinnerAro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSpinnerCambioDianteiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSpinnerFreio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSpinnerCambioTraseiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jSpinnerAro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinnerGarfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinnerFreio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinnerCambioDianteiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinnerCambioTraseiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldCelim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSpinnerCelim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldGuidao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSpinnerGuidao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldQuadro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSpinnerQuadro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldPneu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSpinnerPneu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSpinnerPedau, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldPedau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jTextFieldAro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextFieldGrafo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextFieldFreio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextFieldCambioDianteiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextFieldCambioTraseiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9))
                            .addGap(158, 158, 158)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11)))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(158, 158, 158)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16)))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(43, 43, 43)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel8)
                                    .addGap(17, 17, 17)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10)))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel15))
                                    .addGap(14, 14, 14)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel17)))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldCoroa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSpinnerCoroa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12))
                .addGap(62, 62, 62))
        );

        jTabbedPane1.addTab("Custos Variáveis", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed
       
        ArrayList<Float> custosFixos = listarCustosFixos();
        ArrayList<Float> custosVariaveis = listarCustosVariaveis();
        ArrayList<Integer> custosMateriaPrima = listarMateriasPrimas();
                  
        float custoFixoTotal = ctrl.calcularCustosFixos(custosFixos);
        float custoVariavelTotal = ctrl.calcularCustosVariaveis(custosVariaveis, custosMateriaPrima);
        int estimativaVenda = Integer.parseInt(jSpinnerEstimativa.getValue().toString());
        float margemContribuicao = Float.parseFloat(jTextFieldMargemContribuicao.getText());
        
        float preco = ctrl.calcularPreco(custoVariavelTotal, margemContribuicao);
        float lucro = ctrl.calcularLucro(custoFixoTotal, custoVariavelTotal, estimativaVenda, preco);
        float qtdPontoEquilibrio = ctrl.calcularPontoEquilibrio(custoFixoTotal, custoVariavelTotal, preco);
        
        jTextFieldPreco.setText(String.valueOf(preco));
        jTextFieldLucro.setText(String.valueOf(lucro));
        jTextFieldQtdEquilibrio.setText(String.valueOf(qtdPontoEquilibrio));
        if (lucro > 0)
            jTextFieldLucro.setForeground(Color.GREEN);
        else
            jTextFieldLucro.setForeground(Color.RED);
    }//GEN-LAST:event_jButtonCalcularActionPerformed

    private void jSpinnerEstimativaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerEstimativaStateChanged
        jButtonCalcularActionPerformed(null);
    }//GEN-LAST:event_jSpinnerEstimativaStateChanged

    private void jTextFieldMargemContribuicaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldMargemContribuicaoFocusLost
        jButtonCalcularActionPerformed(null);
    }//GEN-LAST:event_jTextFieldMargemContribuicaoFocusLost

    public ArrayList<Float> listarCustosFixos(){
        
        ArrayList<Float> custosFixos = new ArrayList<>();
        
        custosFixos.add(Float.parseFloat(jTextFieldAgua.getText()));
        custosFixos.add(Float.parseFloat(jTextFieldAluguel.getText()));
        custosFixos.add(Float.parseFloat(jTextFieldEnergia.getText()));
        custosFixos.add(Float.parseFloat(jTextFieldFolha.getText()));
        custosFixos.add(Float.parseFloat(jTextFieldImpostos.getText()));
        custosFixos.add(Float.parseFloat(jTextFieldInternet.getText()));
         
        return custosFixos;
    }
    
    public ArrayList<Float> listarCustosVariaveis(){
        
        ArrayList<Float> custosVariaveis = new ArrayList<>();
        
        custosVariaveis.add(Float.parseFloat(jTextFieldAro.getText()));
        custosVariaveis.add(Float.parseFloat(jTextFieldCambioDianteiro.getText()));
        custosVariaveis.add(Float.parseFloat(jTextFieldCambioTraseiro.getText()));
        custosVariaveis.add(Float.parseFloat(jTextFieldCelim.getText()));
        custosVariaveis.add(Float.parseFloat(jTextFieldCoroa.getText()));
        custosVariaveis.add(Float.parseFloat(jTextFieldFreio.getText()));
        custosVariaveis.add(Float.parseFloat(jTextFieldGrafo.getText()));
        custosVariaveis.add(Float.parseFloat(jTextFieldGuidao.getText()));
        custosVariaveis.add(Float.parseFloat(jTextFieldPedau.getText()));
        custosVariaveis.add(Float.parseFloat(jTextFieldPneu.getText()));
        custosVariaveis.add(Float.parseFloat(jTextFieldQuadro.getText()));
        
        return custosVariaveis;
    }
    
    public ArrayList<Integer> listarMateriasPrimas(){
        
        ArrayList<Integer> custosMateriaPrima = new ArrayList<>();
        
        custosMateriaPrima.add(Integer.parseInt(jSpinnerAro.getValue().toString()));
        custosMateriaPrima.add(Integer.parseInt(jSpinnerCambioDianteiro.getValue().toString()));
        custosMateriaPrima.add(Integer.parseInt(jSpinnerCambioTraseiro.getValue().toString()));
        custosMateriaPrima.add(Integer.parseInt(jSpinnerCelim.getValue().toString()));
        custosMateriaPrima.add(Integer.parseInt(jSpinnerCoroa.getValue().toString()));
        custosMateriaPrima.add(Integer.parseInt(jSpinnerFreio.getValue().toString()));
        custosMateriaPrima.add(Integer.parseInt(jSpinnerGarfo.getValue().toString()));
        custosMateriaPrima.add(Integer.parseInt(jSpinnerGuidao.getValue().toString()));
        custosMateriaPrima.add(Integer.parseInt(jSpinnerPedau.getValue().toString()));
        custosMateriaPrima.add(Integer.parseInt(jSpinnerPneu.getValue().toString()));
        custosMateriaPrima.add(Integer.parseInt(jSpinnerQuadro.getValue().toString()));

        return custosMateriaPrima;
    }
    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelVendas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinnerAro;
    private javax.swing.JSpinner jSpinnerCambioDianteiro;
    private javax.swing.JSpinner jSpinnerCambioTraseiro;
    private javax.swing.JSpinner jSpinnerCelim;
    private javax.swing.JSpinner jSpinnerCoroa;
    private javax.swing.JSpinner jSpinnerEstimativa;
    private javax.swing.JSpinner jSpinnerFreio;
    private javax.swing.JSpinner jSpinnerGarfo;
    private javax.swing.JSpinner jSpinnerGuidao;
    private javax.swing.JSpinner jSpinnerPedau;
    private javax.swing.JSpinner jSpinnerPneu;
    private javax.swing.JSpinner jSpinnerQuadro;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldAgua;
    private javax.swing.JTextField jTextFieldAluguel;
    private javax.swing.JTextField jTextFieldAro;
    private javax.swing.JTextField jTextFieldCambioDianteiro;
    private javax.swing.JTextField jTextFieldCambioTraseiro;
    private javax.swing.JTextField jTextFieldCelim;
    private javax.swing.JTextField jTextFieldCoroa;
    private javax.swing.JTextField jTextFieldEnergia;
    private javax.swing.JTextField jTextFieldFolha;
    private javax.swing.JTextField jTextFieldFreio;
    private javax.swing.JTextField jTextFieldGrafo;
    private javax.swing.JTextField jTextFieldGuidao;
    private javax.swing.JTextField jTextFieldImpostos;
    private javax.swing.JTextField jTextFieldInternet;
    private javax.swing.JFormattedTextField jTextFieldLucro;
    private javax.swing.JTextField jTextFieldMargemContribuicao;
    private javax.swing.JTextField jTextFieldPedau;
    private javax.swing.JTextField jTextFieldPneu;
    private javax.swing.JFormattedTextField jTextFieldPreco;
    private javax.swing.JFormattedTextField jTextFieldQtdEquilibrio;
    private javax.swing.JTextField jTextFieldQuadro;
    // End of variables declaration//GEN-END:variables
}
