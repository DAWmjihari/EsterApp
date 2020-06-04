package view;

import com.placeholder.PlaceHolder;
import database.Client;
import database.Reservation;
import database.Service;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mjihari
 */
public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        PlaceHolder holder = new PlaceHolder(jtf_date, "DD/MM/YYYY");
        this.setTitle("Inici - EsterApp");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectedList = new javax.swing.ButtonGroup();
        container = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        panelContent = new javax.swing.JTabbedPane();
        list = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jrb_clients = new javax.swing.JRadioButton();
        jrb_service = new javax.swing.JRadioButton();
        jrb_future_r = new javax.swing.JRadioButton();
        jrb_past_r_aprv = new javax.swing.JRadioButton();
        jrb_past_r_canc = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_content = new javax.swing.JTable();
        search = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jbtn_search = new javax.swing.JButton();
        jbtn_clear = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jtf_name_client = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jtf_type_service = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jtf_date = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jcbx_type_rsv = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_content_search = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        container.setBackground(new java.awt.Color(255, 255, 255));

        header.setBackground(new java.awt.Color(255, 255, 255));

        Title.setBackground(new java.awt.Color(255, 255, 255));
        Title.setFont(new java.awt.Font("Tw Cen MT", 3, 45)); // NOI18N
        Title.setForeground(new java.awt.Color(64, 131, 201));
        Title.setText("Benvingut a EsterApp");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
        );

        panelContent.setBackground(new java.awt.Color(255, 255, 255));
        panelContent.setToolTipText("");
        panelContent.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N

        list.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jLabel1.setText("Selecciona una de les opcions per poder realitzar una llista de resultats emmagatzemats :");

        selectedList.add(jrb_clients);
        jrb_clients.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jrb_clients.setText("Clients");
        jrb_clients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedOptionRadio(evt);
            }
        });

        selectedList.add(jrb_service);
        jrb_service.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jrb_service.setText("Serveis");
        jrb_service.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedOptionRadio(evt);
            }
        });

        selectedList.add(jrb_future_r);
        jrb_future_r.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jrb_future_r.setText("Reserves futures");
        jrb_future_r.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedOptionRadio(evt);
            }
        });

        selectedList.add(jrb_past_r_aprv);
        jrb_past_r_aprv.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jrb_past_r_aprv.setText("Reserves passades (Aprovades)");
        jrb_past_r_aprv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedOptionRadio(evt);
            }
        });

        selectedList.add(jrb_past_r_canc);
        jrb_past_r_canc.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jrb_past_r_canc.setText("Reserves passades (Cancel·lades)");
        jrb_past_r_canc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedOptionRadio(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(64, 131, 201));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jt_content.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jt_content.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jt_content.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jt_content.setEnabled(false);
        jt_content.setFocusable(false);
        jt_content.setShowGrid(false);
        jt_content.setSurrendersFocusOnKeystroke(true);
        jScrollPane1.setViewportView(jt_content);

        javax.swing.GroupLayout listLayout = new javax.swing.GroupLayout(list);
        list.setLayout(listLayout);
        listLayout.setHorizontalGroup(
            listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listLayout.createSequentialGroup()
                .addGroup(listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(listLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jrb_past_r_canc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jrb_past_r_aprv)
                            .addComponent(jrb_future_r)
                            .addComponent(jrb_service)
                            .addComponent(jrb_clients, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 787, Short.MAX_VALUE)))
                    .addGroup(listLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        listLayout.setVerticalGroup(
            listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrb_clients)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrb_service)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrb_future_r)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrb_past_r_aprv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrb_past_r_canc)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(231, 231, 231))
        );

        panelContent.addTab("LListar", list);

        search.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jLabel2.setText("Realitza una cerca de reserves pels següents criteris de cerca :");

        jbtn_search.setBackground(new java.awt.Color(64, 131, 201));
        jbtn_search.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jbtn_search.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_search.setText("Cercar");
        jbtn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_searchActionPerformed(evt);
            }
        });

        jbtn_clear.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jbtn_clear.setForeground(new java.awt.Color(64, 131, 201));
        jbtn_clear.setText("Netejar");
        jbtn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_clearActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nom complet client", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 0, 16), new java.awt.Color(64, 131, 201))); // NOI18N

        jtf_name_client.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jtf_name_client.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtf_name_client, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jtf_name_client, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipus servei", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 0, 16), new java.awt.Color(64, 131, 201))); // NOI18N

        jtf_type_service.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jtf_type_service.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtf_type_service, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jtf_type_service, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 0, 16), new java.awt.Color(64, 131, 201))); // NOI18N

        jtf_date.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jtf_date.setBorder(null);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtf_date, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jtf_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipus cita", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 0, 16), new java.awt.Color(64, 131, 201))); // NOI18N

        jcbx_type_rsv.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jcbx_type_rsv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Totes", "Aceptada", "Cancel·lada" }));
        jcbx_type_rsv.setToolTipText("");
        jcbx_type_rsv.setBorder(null);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jcbx_type_rsv, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jcbx_type_rsv, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jSeparator2.setForeground(new java.awt.Color(64, 131, 201));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        jt_content_search.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jt_content_search.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jt_content_search.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jt_content_search.setEnabled(false);
        jt_content_search.setFocusable(false);
        jt_content_search.setShowGrid(false);
        jt_content_search.setSurrendersFocusOnKeystroke(true);
        jScrollPane2.setViewportView(jt_content_search);

        javax.swing.GroupLayout searchLayout = new javax.swing.GroupLayout(search);
        search.setLayout(searchLayout);
        searchLayout.setHorizontalGroup(
            searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchLayout.createSequentialGroup()
                .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(searchLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 787, Short.MAX_VALUE)
                            .addGroup(searchLayout.createSequentialGroup()
                                .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(48, 48, 48)
                                .addComponent(jbtn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbtn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 787, Short.MAX_VALUE))))
                .addGap(33, 33, 33))
        );
        searchLayout.setVerticalGroup(
            searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(searchLayout.createSequentialGroup()
                .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))
        );

        panelContent.addTab("Cerca", search);

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(panelContent, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelContent, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        panelContent.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectedOptionRadio(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectedOptionRadio
        Client cli = new Client();
        Reservation rsv = new Reservation();
        Service srv = new Service();

        if (evt.getSource() == jrb_clients) {
            jt_content.setModel(cli.getClients());
        } else if (evt.getSource() == jrb_service) {
            jt_content.setModel(srv.getServices());

        } else if (evt.getSource() == jrb_future_r) {
            jt_content.setModel(rsv.getFutureReservations());

        } else if (evt.getSource() == jrb_past_r_aprv) {
            jt_content.setModel(rsv.getPastAprovedReservations());
        } else {
            jt_content.setModel(rsv.getPastCancelledReservations());
        }
    }//GEN-LAST:event_selectedOptionRadio

    private void jbtn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_searchActionPerformed
        Reservation rsv = new Reservation();
        String full_name_client = jtf_name_client.getText();
        String name_service = jtf_type_service.getText();
        String date_rsv = jtf_date.getText();
        String typeService = (jcbx_type_rsv.getSelectedIndex() == 0 ? "" : jcbx_type_rsv.getSelectedIndex() == 1 ? "approved" : "cancelled");
        Boolean formOkey = true;

        if (date_rsv.equals("DD/MM/YYYY")) {
            date_rsv = "";
        } else {
            if (date_rsv.matches("(^(((0[1-9]|1[0-9]|2[0-8])[\\/](0[1-9]|1[012]))|((29|30|31)[\\/](0[13578]|1[02]))|((29|30)[\\/](0[4,6,9]|11)))[\\/](19|[2-9][0-9])\\d\\d$)|(^29[\\/]02[\\/](19|[2-9][0-9])(00|04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)$)")) {
                System.out.println("OKDATE");
                SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
                SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
                Date date = null;
                try {
                    date = format1.parse(date_rsv);
                } catch (ParseException ex) {
                    throw new RuntimeException("Could not date format : " + ex.getMessage());

                }
                date_rsv = format2.format(date);
            } else {
                formOkey = false;
                JOptionPane.showMessageDialog(null, "Eps!! revisa el format de la data, ja que no és valida, recorda ha de ser tipus DD/MM/YYYY", "Error en la cerca", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (formOkey) {
            jt_content_search.setModel(rsv.getReservationsFromSearch(full_name_client, name_service, date_rsv, typeService));
        }
    }//GEN-LAST:event_jbtn_searchActionPerformed

    private void jbtn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_clearActionPerformed
        jtf_name_client.setText("");
        jtf_type_service.setText("");
        jtf_date.setText("");
        PlaceHolder holder = new PlaceHolder(jtf_date, "DD/MM/YYYY");
        jcbx_type_rsv.setSelectedIndex(0);
        jt_content_search.setModel(new DefaultTableModel());
    }//GEN-LAST:event_jbtn_clearActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JPanel container;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbtn_clear;
    private javax.swing.JButton jbtn_search;
    private javax.swing.JComboBox<String> jcbx_type_rsv;
    private javax.swing.JRadioButton jrb_clients;
    private javax.swing.JRadioButton jrb_future_r;
    private javax.swing.JRadioButton jrb_past_r_aprv;
    private javax.swing.JRadioButton jrb_past_r_canc;
    private javax.swing.JRadioButton jrb_service;
    private javax.swing.JTable jt_content;
    private javax.swing.JTable jt_content_search;
    private javax.swing.JTextField jtf_date;
    private javax.swing.JTextField jtf_name_client;
    private javax.swing.JTextField jtf_type_service;
    private javax.swing.JPanel list;
    private javax.swing.JTabbedPane panelContent;
    private javax.swing.JPanel search;
    private javax.swing.ButtonGroup selectedList;
    // End of variables declaration//GEN-END:variables
}
