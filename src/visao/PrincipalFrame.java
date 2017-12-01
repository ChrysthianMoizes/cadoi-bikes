package visao;

import controlador.Controlador;
import java.awt.List;
import java.util.ArrayList;

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
        jTextFieldPreco = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jTextFieldLucro = new javax.swing.JTextField();
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

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel29.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 255));
        jLabel29.setText("Estimativa de Venda:");

        jSpinnerEstimativa.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        jSpinnerEstimativa.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jButtonCalcular.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jButtonCalcular.setForeground(new java.awt.Color(0, 0, 255));
        jButtonCalcular.setText("Calcular");
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });

        jTextFieldMargemContribuicao.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jTextFieldMargemContribuicao.setForeground(new java.awt.Color(51, 51, 255));
        jTextFieldMargemContribuicao.setText("20");

        jLabel30.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(51, 51, 255));
        jLabel30.setText("Lucro/Prejuízo:");

        jLabel31.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(51, 51, 255));
        jLabel31.setText("Preço:");

        jTextFieldPreco.setEditable(false);
        jTextFieldPreco.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jTextFieldPreco.setForeground(new java.awt.Color(51, 51, 255));

        jLabel32.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(51, 51, 255));
        jLabel32.setText("Margem de Contribuição (%):");

        jTextFieldLucro.setEditable(false);
        jTextFieldLucro.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jTextFieldLucro.setForeground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout jPanelVendasLayout = new javax.swing.GroupLayout(jPanelVendas);
        jPanelVendas.setLayout(jPanelVendasLayout);
        jPanelVendasLayout.setHorizontalGroup(
            jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVendasLayout.createSequentialGroup()
                .addGroup(jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVendasLayout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addGroup(jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelVendasLayout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldMargemContribuicao, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelVendasLayout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSpinnerEstimativa, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelVendasLayout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel31)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel30)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldLucro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(98, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVendasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(301, 301, 301))
        );
        jPanelVendasLayout.setVerticalGroup(
            jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVendasLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jSpinnerEstimativa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jTextFieldMargemContribuicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                .addGroup(jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(jTextFieldLucro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addComponent(jButtonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
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
        jTextFieldEnergia.setForeground(new java.awt.Color(51, 51, 255));
        jTextFieldEnergia.setText("0");
        jTextFieldEnergia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEnergiaActionPerformed(evt);
            }
        });

        jTextFieldAgua.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jTextFieldAgua.setForeground(new java.awt.Color(51, 51, 255));
        jTextFieldAgua.setText("0");

        jTextFieldInternet.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jTextFieldInternet.setForeground(new java.awt.Color(51, 51, 255));
        jTextFieldInternet.setText("0");

        jLabel4.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Folha Pagamento");

        jTextFieldFolha.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jTextFieldFolha.setForeground(new java.awt.Color(51, 51, 255));
        jTextFieldFolha.setText("0");

        jLabel5.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("Impostos");

        jLabel6.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("Aluguel");

        jTextFieldImpostos.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jTextFieldImpostos.setForeground(new java.awt.Color(51, 51, 255));
        jTextFieldImpostos.setText("0");

        jTextFieldAluguel.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jTextFieldAluguel.setForeground(new java.awt.Color(51, 51, 255));
        jTextFieldAluguel.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addComponent(jLabel6)))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldImpostos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldInternet, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEnergia, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldFolha, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(184, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEnergia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAgua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jTextFieldInternet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFolha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldImpostos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
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
        jTextFieldCelim.setForeground(new java.awt.Color(0, 0, 255));
        jTextFieldCelim.setText("0");

        jTextFieldQuadro.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jTextFieldQuadro.setForeground(new java.awt.Color(0, 0, 255));
        jTextFieldQuadro.setText("0");

        jTextFieldGuidao.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jTextFieldGuidao.setForeground(new java.awt.Color(0, 0, 255));
        jTextFieldGuidao.setText("0");
        jTextFieldGuidao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldGuidaoActionPerformed(evt);
            }
        });

        jTextFieldPneu.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jTextFieldPneu.setForeground(new java.awt.Color(0, 0, 255));
        jTextFieldPneu.setText("0");

        jTextFieldPedau.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jTextFieldPedau.setForeground(new java.awt.Color(0, 0, 255));
        jTextFieldPedau.setText("0");

        jTextFieldCoroa.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jTextFieldCoroa.setForeground(new java.awt.Color(0, 0, 255));
        jTextFieldCoroa.setText("0");

        jTextFieldAro.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jTextFieldAro.setForeground(new java.awt.Color(0, 0, 255));
        jTextFieldAro.setText("0");

        jTextFieldGrafo.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jTextFieldGrafo.setForeground(new java.awt.Color(0, 0, 255));
        jTextFieldGrafo.setText("0");

        jTextFieldFreio.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jTextFieldFreio.setForeground(new java.awt.Color(0, 0, 255));
        jTextFieldFreio.setText("0");

        jTextFieldCambioDianteiro.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jTextFieldCambioDianteiro.setForeground(new java.awt.Color(0, 0, 255));
        jTextFieldCambioDianteiro.setText("0");

        jTextFieldCambioTraseiro.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jTextFieldCambioTraseiro.setForeground(new java.awt.Color(0, 0, 255));
        jTextFieldCambioTraseiro.setText("0");

        jSpinnerCelim.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jSpinnerCelim.setModel(new javax.swing.SpinnerNumberModel(1, 0, null, 1));

        jSpinnerGuidao.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jSpinnerGuidao.setModel(new javax.swing.SpinnerNumberModel(1, 0, null, 1));

        jSpinnerQuadro.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jSpinnerQuadro.setModel(new javax.swing.SpinnerNumberModel(1, 0, null, 1));

        jSpinnerPneu.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jSpinnerPneu.setModel(new javax.swing.SpinnerNumberModel(1, 0, null, 1));

        jSpinnerPedau.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jSpinnerPedau.setModel(new javax.swing.SpinnerNumberModel(1, 0, null, 1));

        jSpinnerCoroa.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jSpinnerCoroa.setModel(new javax.swing.SpinnerNumberModel(1, 0, null, 1));

        jSpinnerAro.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jSpinnerAro.setModel(new javax.swing.SpinnerNumberModel(1, 0, null, 1));

        jSpinnerGarfo.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jSpinnerGarfo.setModel(new javax.swing.SpinnerNumberModel(1, 0, null, 1));

        jSpinnerFreio.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jSpinnerFreio.setModel(new javax.swing.SpinnerNumberModel(1, 0, null, 1));

        jSpinnerCambioDianteiro.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jSpinnerCambioDianteiro.setModel(new javax.swing.SpinnerNumberModel(1, 0, null, 1));

        jSpinnerCambioTraseiro.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jSpinnerCambioTraseiro.setModel(new javax.swing.SpinnerNumberModel(1, 0, null, 1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldCoroa, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(jTextFieldPedau, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldPneu)
                    .addComponent(jTextFieldQuadro)
                    .addComponent(jTextFieldCelim)
                    .addComponent(jTextFieldGuidao))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jSpinnerCelim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(jLabel13))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSpinnerGuidao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinnerQuadro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinnerPneu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinnerPedau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinnerCoroa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(103, 103, 103)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16)
                            .addComponent(jLabel14))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldGrafo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldAro, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSpinnerGarfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinnerAro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldFreio, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCambioDianteiro, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCambioTraseiro, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSpinnerCambioDianteiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinnerFreio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinnerCambioTraseiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(74, 74, 74))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldCelim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jTextFieldAro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerCelim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerAro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldGuidao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSpinnerGuidao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldGrafo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSpinnerGarfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldQuadro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSpinnerQuadro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(jTextFieldPneu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinnerPneu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(jTextFieldPedau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinnerPedau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldCoroa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)
                                    .addComponent(jSpinnerCoroa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTextFieldFreio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSpinnerFreio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTextFieldCambioDianteiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel17)
                                            .addComponent(jSpinnerCambioDianteiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldCambioTraseiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16)
                                    .addComponent(jSpinnerCambioTraseiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel14))
                .addContainerGap(259, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldGuidaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldGuidaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldGuidaoActionPerformed

    private void jTextFieldEnergiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEnergiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEnergiaActionPerformed

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
        
        jTextFieldPreco.setText(String.valueOf(preco));
        jTextFieldLucro.setText(String.valueOf(lucro));
      
    }//GEN-LAST:event_jButtonCalcularActionPerformed

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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelVendas;
    private javax.swing.JScrollPane jScrollPane1;
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
    private javax.swing.JTextField jTextFieldLucro;
    private javax.swing.JTextField jTextFieldMargemContribuicao;
    private javax.swing.JTextField jTextFieldPedau;
    private javax.swing.JTextField jTextFieldPneu;
    private javax.swing.JTextField jTextFieldPreco;
    private javax.swing.JTextField jTextFieldQuadro;
    // End of variables declaration//GEN-END:variables
}
