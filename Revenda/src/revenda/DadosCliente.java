package revenda;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DadosCliente extends javax.swing.JFrame {

    public DadosCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
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
        jLabel18 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        idade = new javax.swing.JTextField();
        investimento = new javax.swing.JTextField();
        novo_radio = new javax.swing.JRadioButton();
        semi_radio = new javax.swing.JRadioButton();
        capacidade = new javax.swing.JTextField();
        usado_radio = new javax.swing.JRadioButton();
        autonomia = new javax.swing.JTextField();
        tamanho_bagageiro = new javax.swing.JTextField();
        pavimentada_radio = new javax.swing.JRadioButton();
        esburaca_radio = new javax.swing.JRadioButton();
        hatches = new javax.swing.JRadioButton();
        sedas = new javax.swing.JRadioButton();
        familiares = new javax.swing.JRadioButton();
        picapes = new javax.swing.JRadioButton();
        suvs = new javax.swing.JRadioButton();
        cupes = new javax.swing.JRadioButton();
        conversiveis = new javax.swing.JRadioButton();
        vans = new javax.swing.JRadioButton();
        ano = new javax.swing.JTextField();
        marca = new javax.swing.JTextField();
        modelo = new javax.swing.JTextField();
        radio2 = new javax.swing.JRadioButton();
        radio3 = new javax.swing.JRadioButton();
        radio4 = new javax.swing.JRadioButton();
        automatico_radio = new javax.swing.JRadioButton();
        manual_radio = new javax.swing.JRadioButton();
        radio_hidraulica = new javax.swing.JRadioButton();
        radio_mecanica = new javax.swing.JRadioButton();
        cor = new javax.swing.JTextField();
        go = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        sair = new javax.swing.JButton();
        peso_porta = new javax.swing.JTextField();
        peso_ano = new javax.swing.JTextField();
        peso_marca = new javax.swing.JTextField();
        peso_modelo = new javax.swing.JTextField();
        peso_cambio = new javax.swing.JTextField();
        peso_direcao = new javax.swing.JTextField();
        peso_cor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setText("Coleta de Dados do Cliente");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel3.setText("Capacidade");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel4.setText("Tipo Estrada");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel5.setText("Investimento");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel6.setText("Tipo de Veículo");

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel7.setText("Autonomia");

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel8.setText("Idade");

        jLabel9.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel9.setText("Estado Conservação");

        jLabel10.setText("jLabel3");

        jLabel11.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel11.setText("Tamanho Bagageiro");

        jLabel12.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel12.setText("Ano");

        jLabel13.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel13.setText("Marca");

        jLabel14.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel14.setText("Modelo");

        jLabel15.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel15.setText("Cambio");

        jLabel16.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel16.setText("Direção");

        jLabel17.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel17.setText("Cor");

        jLabel18.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel18.setText("Número de Portas");

        nome.setText("Ex: João da Silva");
        nome.setToolTipText("");

        idade.setText("Ex: 21");

        investimento.setText("Ex: 50000 para R$ 50.000,00");

        novo_radio.setText("Novo");
        novo_radio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                novo_radioMouseClicked(evt);
            }
        });

        semi_radio.setText("Semi-Novo");
        semi_radio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                semi_radioMouseClicked(evt);
            }
        });

        capacidade.setText("Ex: 5 para 5 passageiros");

        usado_radio.setText("Usado");
        usado_radio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usado_radioMouseClicked(evt);
            }
        });

        autonomia.setText("Ex: 5 para 5km/l");

        tamanho_bagageiro.setText("Ex: 100 para 100litros");

        pavimentada_radio.setText("Pavimentada");
        pavimentada_radio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pavimentada_radioMouseClicked(evt);
            }
        });

        esburaca_radio.setText("Esburacada");
        esburaca_radio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                esburaca_radioMouseClicked(evt);
            }
        });

        hatches.setText("Hatches");
        hatches.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hatchesMouseClicked(evt);
            }
        });

        sedas.setText("Sedâs");
        sedas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sedasMouseClicked(evt);
            }
        });

        familiares.setText("Familiares");
        familiares.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                familiaresMouseClicked(evt);
            }
        });

        picapes.setText("Picapes");
        picapes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                picapesMouseClicked(evt);
            }
        });

        suvs.setText("SUVs");
        suvs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                suvsMouseClicked(evt);
            }
        });

        cupes.setText("Cupês");
        cupes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cupesMouseClicked(evt);
            }
        });

        conversiveis.setText("Conversíveis");
        conversiveis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                conversiveisMouseClicked(evt);
            }
        });

        vans.setText("Vans");
        vans.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vansMouseClicked(evt);
            }
        });

        ano.setText("Ex: 2015");

        marca.setText("Ex: Renault, Chevrolet, Ford, Etc");

        modelo.setText("Ex: Gol, Palio, Corsa, Etc");

        radio2.setText("2");
        radio2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio2MouseClicked(evt);
            }
        });

        radio3.setText("3");
        radio3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio3MouseClicked(evt);
            }
        });

        radio4.setText("4");
        radio4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio4MouseClicked(evt);
            }
        });

        automatico_radio.setText("Automático");
        automatico_radio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                automatico_radioMouseClicked(evt);
            }
        });

        manual_radio.setText("Manual");
        manual_radio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manual_radioMouseClicked(evt);
            }
        });

        radio_hidraulica.setText("Hidráulica");
        radio_hidraulica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_hidraulicaMouseClicked(evt);
            }
        });

        radio_mecanica.setText("Mecânica");
        radio_mecanica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_mecanicaMouseClicked(evt);
            }
        });

        cor.setText("Ex: Vermelho, Azul, Preto, Etc");

        go.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        go.setText("Buscar Melhor Veículo");
        go.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goMouseClicked(evt);
            }
        });

        jLabel19.setText("Alunos: Ayslan Zoletti e Fernando Luiz Gaya");

        sair.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        sair.setText("Sair");
        sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sairMouseClicked(evt);
            }
        });

        peso_porta.setText("Peso: 0 a 1");

        peso_ano.setText("Peso: 0 a 1");

        peso_marca.setText("Peso: 0 a 1");

        peso_modelo.setText("Peso: 0 a 1");

        peso_cambio.setText("Peso: 0 a 1");

        peso_direcao.setText("Peso: 0 a 1");

        peso_cor.setText("Peso: 0 a 1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel19))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(go, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel8)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel11)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(capacidade)
                                    .addComponent(nome)
                                    .addComponent(investimento, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                                    .addComponent(idade)
                                    .addComponent(tamanho_bagageiro)
                                    .addComponent(autonomia)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(novo_radio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(semi_radio)
                                .addGap(18, 18, 18)
                                .addComponent(usado_radio))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)
                                .addComponent(radio2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radio3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radio4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(peso_porta, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pavimentada_radio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(esburaca_radio))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hatches)
                                    .addComponent(picapes)
                                    .addComponent(suvs))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(conversiveis)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cupes)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(vans))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(sedas)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(familiares))))
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(marca)
                                    .addComponent(ano)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(modelo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(automatico_radio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(manual_radio))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radio_hidraulica)
                                        .addGap(18, 18, 18)
                                        .addComponent(radio_mecanica))
                                    .addComponent(cor))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(peso_ano)
                            .addComponent(peso_marca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                            .addComponent(peso_modelo, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                            .addComponent(peso_cambio, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                            .addComponent(peso_direcao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                            .addComponent(peso_cor, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(62, 62, 62)
                    .addComponent(jLabel10)
                    .addContainerGap(750, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(pavimentada_radio)
                    .addComponent(esburaca_radio))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(investimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(novo_radio)
                            .addComponent(semi_radio)
                            .addComponent(usado_radio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(capacidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(autonomia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(tamanho_bagageiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(radio2)
                            .addComponent(radio3)
                            .addComponent(radio4)
                            .addComponent(peso_porta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sedas)
                            .addComponent(hatches)
                            .addComponent(familiares))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(picapes)
                            .addComponent(cupes)
                            .addComponent(vans))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(suvs)
                            .addComponent(conversiveis))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(peso_ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(peso_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(peso_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(automatico_radio)
                            .addComponent(manual_radio)
                            .addComponent(peso_cambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(radio_hidraulica)
                            .addComponent(radio_mecanica)
                            .addComponent(peso_direcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(cor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(peso_cor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(go)
                    .addComponent(sair))
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addGap(7, 7, 7))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(159, 159, 159)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(412, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void novo_radioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_novo_radioMouseClicked
        // TODO add your handling code here:
        if (novo_radio.isSelected() == true) {
            usado_radio.setSelected(false);
            semi_radio.setSelected(false);
        }
    }//GEN-LAST:event_novo_radioMouseClicked

    private void semi_radioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semi_radioMouseClicked
        // TODO add your handling code here:
        if (semi_radio.isSelected() == true) {
            usado_radio.setSelected(false);
            novo_radio.setSelected(false);
        }
    }//GEN-LAST:event_semi_radioMouseClicked

    private void usado_radioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usado_radioMouseClicked
        // TODO add your handling code here:
        if (usado_radio.isSelected() == true) {
            semi_radio.setSelected(false);
            novo_radio.setSelected(false);
        }
    }//GEN-LAST:event_usado_radioMouseClicked

    private void radio2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio2MouseClicked
        // TODO add your handling code here:
        if (radio2.isSelected() == true) {
            radio3.setSelected(false);
            radio4.setSelected(false);
        }
    }//GEN-LAST:event_radio2MouseClicked

    private void radio3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio3MouseClicked
        // TODO add your handling code here:
        if (radio3.isSelected() == true) {
            radio2.setSelected(false);
            radio4.setSelected(false);
        }
    }//GEN-LAST:event_radio3MouseClicked

    private void radio4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio4MouseClicked
        // TODO add your handling code here:
        if (radio4.isSelected() == true) {
            radio3.setSelected(false);
            radio2.setSelected(false);
        }
    }//GEN-LAST:event_radio4MouseClicked

    private void radio_hidraulicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_hidraulicaMouseClicked
        // TODO add your handling code here:
        if (radio_hidraulica.isSelected() == true) {
            radio_mecanica.setSelected(false);
        }
    }//GEN-LAST:event_radio_hidraulicaMouseClicked

    private void radio_mecanicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_mecanicaMouseClicked
        // TODO add your handling code here:
        if (radio_mecanica.isSelected() == true) {
            radio_hidraulica.setSelected(false);
        }
    }//GEN-LAST:event_radio_mecanicaMouseClicked

    private void manual_radioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manual_radioMouseClicked
        // TODO add your handling code here:
        if (manual_radio.isSelected() == true) {
            automatico_radio.setSelected(false);
        }
    }//GEN-LAST:event_manual_radioMouseClicked

    private void automatico_radioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_automatico_radioMouseClicked
        // TODO add your handling code here:
        if (automatico_radio.isSelected() == true) {
            manual_radio.setSelected(false);
        }
    }//GEN-LAST:event_automatico_radioMouseClicked

    private void esburaca_radioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_esburaca_radioMouseClicked
        // TODO add your handling code here:
        if (esburaca_radio.isSelected() == true) {
            pavimentada_radio.setSelected(false);
        }
    }//GEN-LAST:event_esburaca_radioMouseClicked

    private void pavimentada_radioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pavimentada_radioMouseClicked
        // TODO add your handling code here:
        if (pavimentada_radio.isSelected() == true) {
            esburaca_radio.setSelected(false);
        }

    }//GEN-LAST:event_pavimentada_radioMouseClicked

    private void hatchesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hatchesMouseClicked
        // TODO add your handling code here:
        if (hatches.isSelected() == true) {
            sedas.setSelected(false);
            familiares.setSelected(false);
            picapes.setSelected(false);
            cupes.setSelected(false);
            vans.setSelected(false);
            suvs.setSelected(false);
            conversiveis.setSelected(false);
        }
    }//GEN-LAST:event_hatchesMouseClicked

    private void sedasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sedasMouseClicked
        // TODO add your handling code here:
        if (sedas.isSelected() == true) {
            hatches.setSelected(false);
            familiares.setSelected(false);
            picapes.setSelected(false);
            cupes.setSelected(false);
            vans.setSelected(false);
            suvs.setSelected(false);
            conversiveis.setSelected(false);
        }
    }//GEN-LAST:event_sedasMouseClicked

    private void familiaresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_familiaresMouseClicked
        // TODO add your handling code here:
        if (familiares.isSelected() == true) {
            sedas.setSelected(false);
            hatches.setSelected(false);
            picapes.setSelected(false);
            cupes.setSelected(false);
            vans.setSelected(false);
            suvs.setSelected(false);
            conversiveis.setSelected(false);
        }
    }//GEN-LAST:event_familiaresMouseClicked

    private void picapesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_picapesMouseClicked
        // TODO add your handling code here:
        if (picapes.isSelected() == true) {
            sedas.setSelected(false);
            familiares.setSelected(false);
            hatches.setSelected(false);
            cupes.setSelected(false);
            vans.setSelected(false);
            suvs.setSelected(false);
            conversiveis.setSelected(false);
        }
    }//GEN-LAST:event_picapesMouseClicked

    private void cupesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cupesMouseClicked
        // TODO add your handling code here:
        if (cupes.isSelected() == true) {
            sedas.setSelected(false);
            familiares.setSelected(false);
            picapes.setSelected(false);
            hatches.setSelected(false);
            vans.setSelected(false);
            suvs.setSelected(false);
            conversiveis.setSelected(false);
        }
    }//GEN-LAST:event_cupesMouseClicked

    private void vansMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vansMouseClicked
        // TODO add your handling code here:
        if (vans.isSelected() == true) {
            sedas.setSelected(false);
            familiares.setSelected(false);
            picapes.setSelected(false);
            cupes.setSelected(false);
            hatches.setSelected(false);
            suvs.setSelected(false);
            conversiveis.setSelected(false);
        }
    }//GEN-LAST:event_vansMouseClicked

    private void suvsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suvsMouseClicked
        // TODO add your handling code here:
        if (suvs.isSelected() == true) {
            sedas.setSelected(false);
            familiares.setSelected(false);
            picapes.setSelected(false);
            cupes.setSelected(false);
            vans.setSelected(false);
            hatches.setSelected(false);
            conversiveis.setSelected(false);
        }
    }//GEN-LAST:event_suvsMouseClicked

    private void conversiveisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conversiveisMouseClicked
        // TODO add your handling code here:
        if (conversiveis.isSelected() == true) {
            sedas.setSelected(false);
            familiares.setSelected(false);
            picapes.setSelected(false);
            cupes.setSelected(false);
            vans.setSelected(false);
            suvs.setSelected(false);
            hatches.setSelected(false);
        }
    }//GEN-LAST:event_conversiveisMouseClicked

    private void goMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goMouseClicked
        // TODO add your handling code here:
        Banco conexao = new Banco();
        ResultSet rs = null;
        ClienteDados a = new ClienteDados();

        a.setNome(nome.getText());
        a.setIdade(Integer.parseInt(idade.getText()));
        a.setInvestimento(Float.parseFloat(investimento.getText()));
        a.setCapacidade(Integer.parseInt(capacidade.getText()));
        a.setAutonomia(Float.parseFloat(autonomia.getText()));
        a.setTamanho_bagageiro(Float.parseFloat(tamanho_bagageiro.getText()));
        a.setAno(Integer.parseInt(ano.getText()));
        a.setMarca(marca.getText().toUpperCase());
        a.setModelo(modelo.getText().toUpperCase());
        a.setCor(cor.getText().toUpperCase());
        a.setPeso_porta(Float.parseFloat(peso_porta.getText()));
        a.setPeso_ano(Float.parseFloat(peso_ano.getText()));
        a.setPeso_marca(Float.parseFloat(peso_marca.getText()));
        a.setPeso_modelo(Float.parseFloat(peso_modelo.getText()));
        a.setPeso_cor(Float.parseFloat(peso_cor.getText()));
        a.setPeso_direcao(Float.parseFloat(peso_direcao.getText()));
        a.setPeso_cambio(Float.parseFloat(peso_cambio.getText()));

        if (pavimentada_radio.isSelected()) {
            a.setTipo_estrada("PAVIMENTADA");
        } else {
            a.setTipo_estrada("ESBURACADA");
        }

        if (radio2.isSelected()) {
            a.setNum_portas(2);
        } else if (radio3.isSelected()) {
            a.setNum_portas(3);
        } else {
            a.setNum_portas(4);
        }

        if (novo_radio.isSelected()) {
            a.setEstado_conservacao("NOVO");
        } else if (semi_radio.isSelected()) {
            a.setEstado_conservacao("SEMINOVO");
        } else {
            a.setEstado_conservacao("USADO");
        }

        if (hatches.isSelected()) {
            a.setTipo_veiculo("HATCHES");
        } else if (sedas.isSelected()) {
            a.setTipo_veiculo("SEDAS");
        } else if (familiares.isSelected()) {
            a.setTipo_veiculo("FAMILIARES");
        } else if (picapes.isSelected()) {
            a.setTipo_veiculo("PICAPES");
        } else if (cupes.isSelected()) {
            a.setTipo_veiculo("CUPES");
        } else if (vans.isSelected()) {
            a.setTipo_veiculo("VANS");
        } else if (suvs.isSelected()) {
            a.setTipo_veiculo("SUVS");
        } else {
            a.setTipo_veiculo("CONVERSIVEIS");
        }

        if (automatico_radio.isSelected()) {
            a.setCambio("AUTOMATICO");
        } else {
            a.setCambio("MANUAL");
        }

        if (radio_hidraulica.isSelected()) {
            a.setDirecao("HIDRÁULICA");
        } else {
            a.setDirecao("MECANICA");
        }

        rs = conexao.retornaTabelaCompleta(a);
        try {
            verificaSimilaridade(rs, a);
        } catch (SQLException ex) {
            Logger.getLogger(DadosCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

        conexao.insereDadosCliente(a);

        Resultado b;
        try {
            b = new Resultado();
            b.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(DadosCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.dispose();

    }//GEN-LAST:event_goMouseClicked

    private void sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_sairMouseClicked

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
            java.util.logging.Logger.getLogger(DadosCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DadosCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DadosCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DadosCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DadosCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ano;
    private javax.swing.JRadioButton automatico_radio;
    private javax.swing.JTextField autonomia;
    private javax.swing.JTextField capacidade;
    private javax.swing.JRadioButton conversiveis;
    private javax.swing.JTextField cor;
    private javax.swing.JRadioButton cupes;
    private javax.swing.JRadioButton esburaca_radio;
    private javax.swing.JRadioButton familiares;
    private javax.swing.JButton go;
    private javax.swing.JRadioButton hatches;
    private javax.swing.JTextField idade;
    private javax.swing.JTextField investimento;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton manual_radio;
    private javax.swing.JTextField marca;
    private javax.swing.JTextField modelo;
    private javax.swing.JTextField nome;
    private javax.swing.JRadioButton novo_radio;
    private javax.swing.JRadioButton pavimentada_radio;
    private javax.swing.JTextField peso_ano;
    private javax.swing.JTextField peso_cambio;
    private javax.swing.JTextField peso_cor;
    private javax.swing.JTextField peso_direcao;
    private javax.swing.JTextField peso_marca;
    private javax.swing.JTextField peso_modelo;
    private javax.swing.JTextField peso_porta;
    private javax.swing.JRadioButton picapes;
    private javax.swing.JRadioButton radio2;
    private javax.swing.JRadioButton radio3;
    private javax.swing.JRadioButton radio4;
    private javax.swing.JRadioButton radio_hidraulica;
    private javax.swing.JRadioButton radio_mecanica;
    private javax.swing.JButton sair;
    private javax.swing.JRadioButton sedas;
    private javax.swing.JRadioButton semi_radio;
    private javax.swing.JRadioButton suvs;
    private javax.swing.JTextField tamanho_bagageiro;
    private javax.swing.JRadioButton usado_radio;
    private javax.swing.JRadioButton vans;
    // End of variables declaration//GEN-END:variables

    private void verificaSimilaridade(ResultSet rs, ClienteDados a) throws SQLException {
        Banco conexao = new Banco();
        int idRetornado = 0;
        rs.isFirst();

        while (rs.next()) {
            double similaridadeTotal = 0;
            double investimento = 0;
            double investimentoAbaixo = 0;
            double investimentoAcima = 0;
            double idadeMatch = 0, similaridadeIdade = 0;
            double capacidadeMatch = 0, similaridadeCapacidade = 0;
            double estadoConservacaoMatch = 0, similaridadeestadoConservacao = 0;
            double estadoAutonomiaMatch = 0, similaridadeAutonomia = 0;
            double tamanhoBagageiroMatch = 0, similaridadeBagageiro = 0;
            double tipoEstradaMatch = 0, similaridadeTipoEstrada = 0;
            double tipoVeiculoMatch = 0, similaridadeTipoVeiculo = 0;
            double anoMatch = 0, similaridadeAno = 0;
            double marcaMatch = 0, similaridadeMarca = 0;
            double modeloMatch = 0, similaridadeModelo = 0;
            double cambioMatch = 0, similaridadeCambio = 0;
            double direcaoMatch = 0, similaridadeDirecao = 0;
            double corMatch = 0, similaridadeCor = 0;
            double numPortasMatch = 0, similaridadeNumPortas = 0;
            double investimentoMatch = 0, similaridadeInvestimento = 0;

            investimento = a.getInvestimento();
            investimentoAbaixo = (investimento * 0.15) - investimento;
            investimentoAcima = (investimento * 0.15) + investimento;

            idRetornado = rs.getInt("id");
            if (a.getIdade() == rs.getInt("idade")) {
                idadeMatch = 1;
                similaridadeIdade = idadeMatch * rs.getDouble("peso_idade");
                similaridadeTotal = similaridadeTotal + similaridadeIdade;
            }
            if (a.getCapacidade() == rs.getInt("capacidade")) {
                capacidadeMatch = 1;
                similaridadeCapacidade = capacidadeMatch * rs.getDouble("peso_capacidade");
                similaridadeTotal = similaridadeTotal + similaridadeCapacidade;
            }
            if (a.getEstado_conservacao().equals(rs.getString("estado_conservacao"))) {
                estadoConservacaoMatch = 1;
                similaridadeestadoConservacao = estadoConservacaoMatch * rs.getDouble("peso_estado_conservacao");
                similaridadeTotal = similaridadeTotal + similaridadeestadoConservacao;
            }
            if (a.getAutonomia() == rs.getDouble("autonomia")) {
                estadoAutonomiaMatch = 1;
                similaridadeAutonomia = estadoAutonomiaMatch * rs.getDouble("peso_autonomia");
                similaridadeTotal = similaridadeTotal + similaridadeAutonomia;
            }
            if (a.getTamanho_bagageiro() == rs.getDouble("tamanho_bagageiro")) {
                tamanhoBagageiroMatch = 1;
                similaridadeBagageiro = tamanhoBagageiroMatch * rs.getDouble("peso_tamanho_bagageiro");
                similaridadeTotal = similaridadeTotal + similaridadeBagageiro;
            }
            if (a.getTipo_estrada().equals(rs.getString("tipo_estrada"))) {
                tipoEstradaMatch = 1;
                similaridadeTipoEstrada = tipoEstradaMatch * rs.getDouble("peso_tipo_estrada");
                similaridadeTotal = similaridadeTotal + similaridadeTipoEstrada;
            }
            if (a.getTipo_veiculo().equals(rs.getString("tipo_veiculo"))) {
                tipoVeiculoMatch = 1;
                similaridadeTipoVeiculo = tipoVeiculoMatch * rs.getDouble("peso_tipo_veiculo");
                similaridadeTotal = similaridadeTotal + similaridadeTipoVeiculo;
            }
            if (a.getAno() == rs.getInt("ano")) {
                anoMatch = 1;
                similaridadeAno = anoMatch * rs.getDouble("peso_ano");
                similaridadeTotal = similaridadeTotal + similaridadeAno;
            }
            if (a.getMarca().equals(rs.getString("marca"))) {
                marcaMatch = 1;
                similaridadeMarca = marcaMatch * rs.getDouble("peso_marca");
                similaridadeTotal = similaridadeTotal + similaridadeMarca;
            }
            if (a.getModelo().equals(rs.getString("modelo"))) {
                modeloMatch = 1;
                similaridadeModelo = modeloMatch * rs.getDouble("peso_modelo");
                similaridadeTotal = similaridadeTotal + similaridadeModelo;
            }
            if (a.getCambio().equals(rs.getString("cambio"))) {
                cambioMatch = 1;
                similaridadeCambio = cambioMatch * rs.getDouble("peso_cambio");
                similaridadeTotal = similaridadeTotal + similaridadeCambio;
            }
            if (a.getDirecao().equals(rs.getString("direcao"))) {
                direcaoMatch = 1;
                similaridadeDirecao = direcaoMatch * rs.getDouble("peso_direcao");
                similaridadeTotal = similaridadeTotal + similaridadeDirecao;
            }
            if (a.getCor().equals(rs.getString("cor"))) {
                corMatch = 1;
                similaridadeCor = corMatch * rs.getDouble("peso_cor");
                similaridadeTotal = similaridadeTotal + similaridadeCor;
            }
            if (a.getCor().equals(rs.getString("numero_portas"))) {
                corMatch = 1;
                similaridadeCor = corMatch * rs.getDouble("peso_numero_portas");
                similaridadeTotal = similaridadeTotal + similaridadeCor;
            }

            if (investimento < investimentoAcima || investimento > investimentoAbaixo) {
                investimentoMatch = 1;
                similaridadeInvestimento = investimentoMatch * rs.getDouble("peso_investimento");
                similaridadeTotal = similaridadeTotal + similaridadeInvestimento;
            }
            similaridadeTotal = similaridadeTotal / 15;

            conexao.insereSimilaridade(idRetornado, similaridadeTotal);
        }

    }
}
