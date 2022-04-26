package Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import Helpers.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.*;

import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

public class LoginGui extends JFrame {

    private JPanel contentPane;
    private JTextField adminPid;
    private JPasswordField adminPasswort;
    private JTextField verkaeuferPid;
    private JPasswordField verkaeuferPasswort;
    private JTextField technikerPid;
    private JPasswordField technikerPasswort;
    private DBManager dbm = new DBManager();

    public LoginGui() {
        setResizable(false);
        setTitle("System Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 700, 450);
        contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("System Login: Biite w\u00E4hlen Sie eine Login Methode und geben Sie ihre Personal Id und Passwort...");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(46, 75, 580, 31);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("WILKOMMEN!");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setBounds(245, 33, 169, 31);
        contentPane.add(lblNewLabel_1);

        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        tabbedPane.setBounds(10, 155, 668, 249);
        contentPane.add(tabbedPane);

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        tabbedPane.addTab("Admin Login", null, panel, null);
        panel.setLayout(null);

        JLabel lblPersonalId = new JLabel("Personal Id:");
        lblPersonalId.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPersonalId.setBounds(51, 59, 92, 27);
        panel.add(lblPersonalId);

        JLabel lblNewLabel_2 = new JLabel("Passwort:");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_2.setBounds(51, 102, 92, 39);
        panel.add(lblNewLabel_2);

        adminPid = new JTextField();
        adminPid.setBounds(146, 64, 180, 20);
        panel.add(adminPid);
        adminPid.setColumns(10);

        adminPasswort = new JPasswordField();
        adminPasswort.setBounds(146, 113, 180, 20);
        panel.add(adminPasswort);

        JButton btnAdminLogin = new JButton("Login");
        btnAdminLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(adminPid.getText().length()!=8 || adminPasswort.getText().length() == 0) {
                    JOptionPane.showMessageDialog(null,"Nicht gültige Id oder Passwort!!!");
                } else {
                    try {
                        Connection con = dbm.getConnection();
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery("SELECT * FROM whdb.admin");
                        boolean cont = false;
                        while(rs.next()) {
                            if(adminPid.getText().equals(rs.getString("personalId")) && adminPasswort.getText().equals(rs.getString("passwort"))) {
                                Entities.Admin admin = new Entities.Admin(rs.getString("id"),rs.getString("personalId"),rs.getString("passwort"));
                                System.out.println(rs.getString("name")+" "+rs.getString("nachname"));
                                cont = true;

                            }
                        }
                        if(!cont) {
                            JOptionPane.showMessageDialog(null,"Nicht gültige Id oder Passwort!!!");
                        }
                    } catch (SQLException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                }
            }
        });
        btnAdminLogin.setBounds(445, 77, 103, 39);
        panel.add(btnAdminLogin);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(Color.WHITE);
        tabbedPane.addTab("Verkaeufer Login", null, panel_1, null);
        panel_1.setLayout(null);

        JLabel lblNewLabel_2_1 = new JLabel("Passwort:");
        lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_2_1.setBounds(51, 102, 92, 39);
        panel_1.add(lblNewLabel_2_1);

        JLabel lblPersonalId_1 = new JLabel("Personal Id:");
        lblPersonalId_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPersonalId_1.setBounds(51, 59, 92, 27);
        panel_1.add(lblPersonalId_1);

        verkaeuferPid = new JTextField();
        verkaeuferPid.setBackground(Color.WHITE);
        verkaeuferPid.setColumns(10);
        verkaeuferPid.setBounds(146, 64, 180, 20);
        panel_1.add(verkaeuferPid);

        verkaeuferPasswort = new JPasswordField();
        verkaeuferPasswort.setBounds(146, 113, 180, 20);
        panel_1.add(verkaeuferPasswort);

        JButton btnNewButton_1 = new JButton("Login");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(verkaeuferPid.getText().length()!=8 || verkaeuferPasswort.getText().length() == 0) {
                    JOptionPane.showMessageDialog(null,"Nicht gültige Id oder Passwort!!!");
                } else {
                    try {
                        Connection con = dbm.getConnection();
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery("SELECT * FROM whdb.verkaeufer");
                        boolean cont = false;
                        while(rs.next()) {
                            if(verkaeuferPid.getText().equals(rs.getString("personalId")) && verkaeuferPasswort.getText().equals(rs.getString("passwort"))) {
                                Entities.Verkaeufer verkaeufer = new Entities.Verkaeufer(rs.getString("id"),rs.getString("personalId"),rs.getString("passwort"));
                                System.out.println(rs.getString("name")+" "+rs.getString("nachname"));
                                cont = true;

                            }
                        }
                        if(!cont) {
                            JOptionPane.showMessageDialog(null,"Nicht gültige Id oder Passwort!!!");
                        }
                    } catch (SQLException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                }
            }
        });
        btnNewButton_1.setBounds(445, 77, 103, 39);
        panel_1.add(btnNewButton_1);

        JPanel panel_2 = new JPanel();
        panel_2.setBackground(Color.WHITE);
        tabbedPane.addTab("Techniker Login", null, panel_2, null);
        panel_2.setLayout(null);

        JLabel lblNewLabel_2_2 = new JLabel("Passwort:");
        lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_2_2.setBounds(51, 102, 92, 39);
        panel_2.add(lblNewLabel_2_2);

        JLabel lblPersonalId_2 = new JLabel("Personal Id:");
        lblPersonalId_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPersonalId_2.setBounds(51, 59, 92, 27);
        panel_2.add(lblPersonalId_2);

        technikerPid = new JTextField();
        technikerPid.setColumns(10);
        technikerPid.setBounds(146, 64, 180, 20);
        panel_2.add(technikerPid);

        technikerPasswort = new JPasswordField();
        technikerPasswort.setBounds(146, 113, 180, 20);
        panel_2.add(technikerPasswort);

        JButton btnNewButton_2 = new JButton("Login");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(technikerPid.getText().length()!=8 || technikerPasswort.getText().length() == 0) {
                    JOptionPane.showMessageDialog(null,"Nicht gültige Id oder Passwort!!!");
                } else {
                    try {
                        Connection con = dbm.getConnection();
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery("SELECT * FROM whdb.techniker");
                        boolean cont = false;
                        while(rs.next()) {
                            if(technikerPid.getText().equals(rs.getString("personalId")) && technikerPasswort.getText().equals(rs.getString("passwort"))) {
                                Entities.Techniker techniker = new Entities.Techniker(rs.getString("id"),rs.getString("personalId"),rs.getString("passwort"));
                                System.out.println(rs.getString("name")+" "+rs.getString("nachname"));
                                cont = true;

                            }
                        }
                        if(!cont) {
                            JOptionPane.showMessageDialog(null,"Nicht gültige Id oder Passwort!!!");
                        }
                    } catch (SQLException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                }
            }
        });
        btnNewButton_2.setBounds(445, 77, 103, 39);
        panel_2.add(btnNewButton_2);

        System.out.println("hi");


    }
}

