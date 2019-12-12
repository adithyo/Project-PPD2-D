
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.*;
import java.text.DateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class BookRoom extends javax.swing.JFrame {

    Connection con;
    Statement smt1, smt2, smt3;
    ResultSet rs;
    DateFormat formatter;
    String roomno, bed, roomt, rate, strdtver1, strdtver2;
    String cname, cadd, ccity, cstat, ccoun, cph, cproof;
    String cadult, cchild, cmars, cidno, cnation, cpur, cbill;
    String diffd;
    int amt, bookid;
    String dt1, dt2;

    //Koneksi ke Database dan Tanggal Peminjaman Cek In dan Cek Out
    public BookRoom(Object o1, Object o2, Object o3, Object o4, Date o5, Date o6, String diff) {
        initComponents();
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
            roomno = o1.toString();
            bed = o2.toString();
            roomt = o3.toString();
            rate = o4.toString();
            strdtver1 = (String) sdf.format(o5.getTime());
            strdtver2 = (String) sdf.format(o6.getTime());
            Calendar c1 = Calendar.getInstance();
            c1.setTime(o5);
            dt1 = (String) sdf1.format(c1.getTime());
            Calendar c2 = Calendar.getInstance();
            c2.setTime(o6);
            dt2 = (String) sdf1.format(c2.getTime());
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
            smt1 = con.createStatement();
            diffd = diff;
        } catch (Exception ex) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtCusName = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtAddreas = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtCountry = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtNationality = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtPurpose = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtIdentity = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtIDNumber = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtChild = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtBill = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtDays = new javax.swing.JTextField();
        btnBook = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        cmbAdult = new javax.swing.JComboBox<>();
        txtAdult = new javax.swing.JTextField();
        cmbCountry = new javax.swing.JComboBox<>();
        cmbChild = new javax.swing.JComboBox<>();
        cmbID = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Booking Form");
        setBackground(new java.awt.Color(204, 204, 204));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 475));

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Customer Info"));
        jPanel2.setPreferredSize(new java.awt.Dimension(550, 350));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("Address");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("Customer Name");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("City");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setText("State");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setText("Country");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setText("Phone");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setText("Nationality");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setText("Purpose");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setText("Identity");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel25.setText("ID Number");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel26.setText("Adult");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel27.setText("Child");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel29.setText("Status");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(204, 204, 0));
        jLabel30.setText("Bill (Tax 10%)");

        txtBill.setEnabled(false);
        txtBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBillActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel28.setText("No of days");

        txtDays.setEnabled(false);
        txtDays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDaysActionPerformed(evt);
            }
        });

        btnBook.setText("Book Room");
        btnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jRadioButton1.setBackground(new java.awt.Color(0, 102, 204));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jRadioButton1.setText("Belum Menikah");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(0, 102, 204));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jRadioButton2.setText("Menikah");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        cmbAdult.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---", "1", "2", "3" }));
        cmbAdult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAdultActionPerformed(evt);
            }
        });

        cmbCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Choose ---", "Indonesia", "Malaysia", "Thailand", "Singapura", "Filipina", "Brunei Darussalam", "Vietnam", "Kamboja", "Laos", "Myanmar", "Timor Leste", " " }));
        cmbCountry.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cmbCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCountryActionPerformed(evt);
            }
        });

        cmbChild.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---", "1", "2", "3" }));
        cmbChild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbChildActionPerformed(evt);
            }
        });

        cmbID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Choose ---", "Identity Card (ID)", "Driving License", "Passport", "Student Card", "Family Card" }));
        cmbID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbCountry, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtState)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(44, 44, 44)
                        .addComponent(txtNationality))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(80, 80, 80)
                        .addComponent(txtCity))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(13, 13, 13)
                        .addComponent(txtCusName))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel29))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton2))
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(57, 57, 57)
                        .addComponent(txtAddreas, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtCountry, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel25)
                                    .addGap(38, 38, 38))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel24)
                                    .addGap(54, 54, 54)))
                            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.LEADING))
                        .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel23)
                    .addComponent(jLabel28)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBill)
                    .addComponent(txtDays)
                    .addComponent(txtPurpose)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(cmbChild, 0, 43, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtChild, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(cmbAdult, 0, 43, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAdult, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtIDNumber, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtIdentity)
                    .addComponent(cmbID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBook)
                .addGap(12, 12, 12))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCusName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel24)
                                .addComponent(cmbID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(txtAddreas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtIdentity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel25)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIDNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(txtState, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmbAdult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAdult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26)))))
                    .addComponent(jLabel20))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbChild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtChild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel23)
                        .addComponent(txtPurpose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(txtNationality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addComponent(txtDays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Room No.");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Room No.");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Room Type");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Room Type");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Check In");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Check In");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Check Out");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Check Out");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Bed Type");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Tarif");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Tariff");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Bed Type");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel7)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel9)
                                .addGap(44, 44, 44)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel11)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);
        getContentPane().add(jLabel1, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>                        

    private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
        Opened();
    }                                 

    private void btnBookActionPerformed(java.awt.event.ActionEvent evt) {                                        
        Book();
    }                                       

    private void txtDaysActionPerformed(java.awt.event.ActionEvent evt) {                                        

    }                                       

    private void txtBillActionPerformed(java.awt.event.ActionEvent evt) {                                        

    }                                       

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Reset();
    }                                        

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                              

    }                                             

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                              

    }                                             

    private void cmbAdultActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String text;
        text = (String) cmbAdult.getSelectedItem();
        txtAdult.setText(text);
    }                                        

    private void cmbChildActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String text;
        text = (String) cmbChild.getSelectedItem();
        txtChild.setText(text);
    }                                        

    private void cmbCountryActionPerformed(java.awt.event.ActionEvent evt) {                                           
        String text;
        text = (String) cmbCountry.getSelectedItem();
        txtCountry.setText(text);
    }                                          

    private void cmbIDActionPerformed(java.awt.event.ActionEvent evt) {                                      
        String text;
        text = (String) cmbID.getSelectedItem();
        txtIdentity.setText(text);
    }                                     

    //Menampilkan Identitas Room di yg ingin dipesan
    private void Opened() {
        try {
            String bidsql = "SELECT book_id FROM bookingtable;";
            smt3 = con.createStatement();
            rs = smt3.executeQuery(bidsql);
            int row = 0;
            int bid = 0;
            while (rs.next()) {
                bid = rs.getInt(1);
                row++;
            }
            if (row == 0) {
                bid++;
            } else {
                rs.last();
                bid = rs.getInt(1);
                bid = bid + 1;
            }
            bookid = bid;
            jLabel3.setText(roomno);
            jLabel6.setText(bed);
            jLabel8.setText(roomt);
            jLabel10.setText(rate);
            jLabel12.setText(strdtver1);
            jLabel14.setText(strdtver2);

            txtDays.setText(diffd + " day(s)");
            int r = Integer.parseInt(rate);
            int day = Integer.parseInt(diffd);
            int tax = (r * day) * 10 / 100;
            amt = (r * day) + tax;
            txtBill.setText("Rp" + Integer.toString(amt) + ".00");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    //Menampung Data-Data Penyewa
    private void Book() {
        try {
            cname = txtCusName.getText();
            cadd = txtAddreas.getText();
            ccity = txtCity.getText();
            cstat = txtState.getText();
            ccoun = txtCountry.getText();
            cph = txtPhone.getText();
            cproof = txtIdentity.getText();
            cadult = txtAdult.getText();
            cchild = txtChild.getText();
            cmars = jRadioButton1.getText();
            cmars = jRadioButton2.getText();
            cidno = txtIDNumber.getText();
            cnation = txtNationality.getText();
            cpur = txtPurpose.getText();
            int code = JOptionPane.showConfirmDialog(this, "Room No. " + roomno + " is booked for Mr./Ms. " + cname + " for "
                    + "diffd..!", "Confirmation", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if (code == JOptionPane.YES_NO_OPTION) {
                String insqlcust = "INSERT INTO custdetail (Cust_name,Cust_add,Cust_city,Cust_state,Cust_country,Cust_ph,Cust_proof,"
                        + "Cust_adult,Cust_child,Cust_mar_stat,Cust_id_no,Cust_nation,Cust_purpos,Cust_bill,book_id) "
                        + "values ('" + cname + "','" + cadd + "','" + ccity + "','" + cstat + "','" + ccoun + "','" + cph + "','" + cproof
                        + "','" + cadult + "','" + cchild + "','" + cmars + "','" + cidno + "','" + cnation + "','" + cpur + "'," + amt
                        + ",'" + bookid + "');";
                String status;
                if (jRadioButton1.isSelected()) {
                    status = "Belum Menikah";
                } else if (jRadioButton2.isSelected()) {
                    status = "Menikah";
                }
                smt1 = con.createStatement();
                int ins = smt1.executeUpdate(insqlcust);
                String insqlbook = "INSERT INTO bookingtable (book_id,room_no,date_fro,date_to,no_of_day) values( '"
                        + bookid + "','" + roomno + "','" + dt1 + "','" + dt2 + "','" + diffd + "');";
                smt2 = con.createStatement();
                int ins1 = smt1.executeUpdate(insqlbook);
                JOptionPane.showMessageDialog(this, "Room Booked...!");
            } else {

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

//Mereset semua Text Fields
    private void Reset() {
        txtCusName.setText("");
        txtAddreas.setText("");
        txtCity.setText("");
        txtState.setText("");
        txtCountry.setText("");
        txtPhone.setText("");
        jRadioButton1.setText("");
        jRadioButton2.setText("");
        txtNationality.setText("");
        txtIdentity.setText("");
        txtIDNumber.setText("");
        txtAdult.setText("");
        txtChild.setText("");
        txtPurpose.setText("");
    }
    // Variables declaration - do not modify                     
    private javax.swing.JButton btnBook;
    private javax.swing.JButton btnReset;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbAdult;
    private javax.swing.JComboBox<String> cmbChild;
    private javax.swing.JComboBox<String> cmbCountry;
    private javax.swing.JComboBox<String> cmbID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField txtAddreas;
    private javax.swing.JTextField txtAdult;
    private javax.swing.JTextField txtBill;
    private javax.swing.JTextField txtChild;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtCusName;
    private javax.swing.JTextField txtDays;
    private javax.swing.JTextField txtIDNumber;
    private javax.swing.JTextField txtIdentity;
    private javax.swing.JTextField txtNationality;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtPurpose;
    private javax.swing.JTextField txtState;
    // End of variables declaration                   
}
