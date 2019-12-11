
import java.awt.Color;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    //Koneksi ke Database
    Connection con;
    Statement stmt, smt1;
    ResultSet rs;
    java.util.Date dt1;

    public Login() {
        initComponents();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        this.getContentPane().setBackground(Color.black);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        username = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        showpassword = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setIconImage(new ImageIcon("F:\\IP\\Hotel\\src\\cbsecsnip.jpg").getImage());
        setMinimumSize(new java.awt.Dimension(300, 200));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setPreferredSize(new java.awt.Dimension(250, 150));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        username.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        username.setText("Username");
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));

        password.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        password.setText("Password");
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, -1));

        txtUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 190, -1));

        txtPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 190, -1));

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 90, -1));

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 90, -1));

        showpassword.setBackground(new java.awt.Color(0, 102, 204));
        showpassword.setText("Show Password");
        showpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpasswordActionPerformed(evt);
            }
        });
        jPanel1.add(showpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stiki.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 280));

        jButton1.setText("About");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 90, -1));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SISTEM INFORMASI HOTEL");
        getContentPane().add(jLabel1, java.awt.BorderLayout.PAGE_START);

        setSize(new java.awt.Dimension(624, 394));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  

    }                                 

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Login();
    }                                        

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {                                          
        Cancel();
    }                                         

    private void showpasswordActionPerformed(java.awt.event.ActionEvent evt) {                                             
        Show();
    }                                            

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        JOptionPane.showMessageDialog(null, "Adithyo Mordikay Pratama       161-111-019\n"
                + "Muhammad Rizki Mahmudi  161-111-028");
    }                                        

    //Run Login
    public static void main(String args[]) {
        JOptionPane.showMessageDialog(null, "Welcome To Hotel  !");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    //Untuk Menampung Data Username dan Password
    private void Login() {
        try {
            int flag = 0;
            String sql = "SELECT * FROM login;";
            smt1 = con.createStatement();
            rs = smt1.executeQuery(sql);
            String log = txtUser.getText();
            String pass = new String(txtPass.getPassword());
            while (rs.next()) {
                if (log.equals(rs.getString(1)) && pass.equals(rs.getString(2))) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                txtUser.setEnabled(false);
                txtPass.setEnabled(false);
                btnLogin.setEnabled(false);
                btnCancel.setEnabled(false);
                NavigationFrame nf = new NavigationFrame(this);
                nf.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Please Check Username / Password", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
        }
    }

    //Menampilkan Password
    private void Show() {
        if (showpassword.isSelected()) {
            txtPass.setEchoChar('\u0000');
        } else {
            txtPass.setEchoChar('*');
        }
    }

    //Keluar Program
    private void Cancel() {
        this.dispose();
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel password;
    private javax.swing.JCheckBox showpassword;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    private javax.swing.JLabel username;
    // End of variables declaration                   
}
