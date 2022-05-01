package Gui;

import Entities.*;
import Helpers.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import javax.swing.border.*;

public class AdminGui extends JFrame {
	
	static Admin admin = new Entities.Admin();
	
	private JPanel contentPane;
	private JTextField sucheAdminPid;
	private JTextField sucheAdminName;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_56;
	private JTextField textField_57;
	private JTextField textField_58;
	private JTextField textField_59;
	private JTextField textField_60;
	private JTextField textField_61;
	private JTextField textField_62;
	private JTextField textField_63;
	private JTextField textField_64;
	private JTextField textField_65;
	private JTextField textField_66;
	private JTextField textField_67;
	private JTextField textField_70;
	private JTextField textField_71;
	private JTextField textField_72;
	private JTextField textField_73;
	private JTextField textField_74;
	private JTextField textField_75;
	private JTextField textField_76;
	private JTextField textField_77;
	private JTextField textField_78;
	private JTextField textField_79;
	private JTextField textField_80;
	private JTextField textField_81;
	private JTextField textField_84;
	private JTextField textField_85;
	private JTextField textField_86;
	private JTextField textField_87;
	private JTextField textField_88;
	private JTextField textField_89;
	private JTextField textField_90;
	private JTextField textField_91;
	private JTextField textField_92;
	private JTextField textField_93;
	private JTextField textField_94;
	private JTextField textField_95;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_68;
	private JTextField textField_69;
	private JTextField textField_82;
	private JTextField textField_83;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminGui frame = new AdminGui(admin);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AdminGui(Admin admin) {
		setTitle("Weißwarenhändler Managment System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnQuit = new JButton("Abmelden");
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				LoginGui loginGui = new LoginGui();
				loginGui.setVisible(true);
			}
		});
		btnQuit.setForeground(Color.WHITE);
		btnQuit.setBackground(new Color(255, 0, 51));
		btnQuit.setBounds(880, 10, 100, 30);
		contentPane.add(btnQuit);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 50, 970, 654);
		contentPane.add(tabbedPane);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Admin Verwaltung", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Suchen Sie mit ->");
		lblNewLabel_1.setBounds(10, 10, 108, 20);
		panel_1.add(lblNewLabel_1);
		
		sucheAdminPid = new JTextField();
		sucheAdminPid.setBounds(200, 10, 120, 20);
		panel_1.add(sucheAdminPid);
		sucheAdminPid.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Personal Id: ");
		lblNewLabel_2.setBounds(130, 13, 77, 14);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Name:");
		lblNewLabel_3.setBounds(399, 13, 48, 14);
		panel_1.add(lblNewLabel_3);
		
		sucheAdminName = new JTextField();
		sucheAdminName.setBounds(444, 10, 96, 20);
		panel_1.add(sucheAdminName);
		sucheAdminName.setColumns(10);
		
		JScrollPane adminPanel = new JScrollPane();
		adminPanel.setBounds(10, 40, 660, 574);
		panel_1.add(adminPanel);
		
		JPanel panel = new JPanel();
		panel.setBounds(680, 40, 275, 401);
		panel_1.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Neu Admin Hinzufügung");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(70, 11, 135, 14);
		panel.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(130, 46, 135, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(130, 77, 135, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(130, 108, 135, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(130, 139, 135, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(130, 170, 135, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(130, 201, 135, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(130, 232, 135, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(130, 263, 135, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(130, 294, 135, 20);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(130, 325, 135, 20);
		panel.add(textField_9);
		textField_9.setColumns(10);
		
		JButton btnAdminAdd = new JButton("Admin hinzufügen");
		btnAdminAdd.setBounds(10, 356, 255, 23);
		panel.add(btnAdminAdd);
		
		JLabel lblNewLabel_5 = new JLabel("Id:");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(10, 49, 90, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("Personal Id:");
		lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1.setBounds(10, 80, 90, 14);
		panel.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("Passwort:");
		lblNewLabel_5_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_2.setBounds(10, 111, 90, 14);
		panel.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_5_3 = new JLabel("Name:");
		lblNewLabel_5_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_3.setBounds(10, 142, 90, 14);
		panel.add(lblNewLabel_5_3);
		
		JLabel lblNewLabel_5_4 = new JLabel("Nachname:");
		lblNewLabel_5_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_4.setBounds(10, 173, 90, 14);
		panel.add(lblNewLabel_5_4);
		
		JLabel lblNewLabel_5_5 = new JLabel("Filiale:");
		lblNewLabel_5_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_5.setBounds(10, 204, 90, 14);
		panel.add(lblNewLabel_5_5);
		
		JLabel lblNewLabel_5_6 = new JLabel("Geburtsdatum:");
		lblNewLabel_5_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_6.setBounds(10, 235, 90, 14);
		panel.add(lblNewLabel_5_6);
		
		JLabel lblNewLabel_5_7 = new JLabel("Geschlecht:");
		lblNewLabel_5_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_7.setBounds(10, 266, 90, 14);
		panel.add(lblNewLabel_5_7);
		
		JLabel lblNewLabel_5_8 = new JLabel("Adress:");
		lblNewLabel_5_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_8.setBounds(10, 297, 90, 14);
		panel.add(lblNewLabel_5_8);
		
		JLabel lblNewLabel_5_9 = new JLabel("Telefonnummer:");
		lblNewLabel_5_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_9.setBounds(10, 328, 90, 14);
		panel.add(lblNewLabel_5_9);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(680, 452, 275, 163);
		panel_1.add(panel_8);
		panel_8.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Admin Löschen");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(95, 11, 85, 14);
		panel_8.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Personal Id:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_7.setBounds(10, 36, 255, 14);
		panel_8.add(lblNewLabel_7);
		
		textField_10 = new JTextField();
		textField_10.setBounds(10, 54, 255, 20);
		panel_8.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Ihr Passwort:");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_8.setBounds(10, 85, 255, 14);
		panel_8.add(lblNewLabel_8);
		
		textField_11 = new JTextField();
		textField_11.setBounds(10, 103, 255, 20);
		panel_8.add(textField_11);
		textField_11.setColumns(10);
		
		JButton btnNewButton = new JButton("Löschen");
		btnNewButton.setBounds(95, 135, 85, 20);
		panel_8.add(btnNewButton);
		
		JLabel lblNewLabel_9 = new JLabel("oder");
		lblNewLabel_9.setBounds(348, 13, 27, 14);
		panel_1.add(lblNewLabel_9);
		
		JButton btnNewButton_1 = new JButton("Suche");
		btnNewButton_1.setBounds(570, 10, 89, 20);
		panel_1.add(btnNewButton_1);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Personal Verwaltung", null, panel_2, null);
		panel_2.setLayout(null);
		
		JScrollPane adminPanel_1 = new JScrollPane();
		adminPanel_1.setBounds(10, 41, 660, 574);
		panel_2.add(adminPanel_1);
		
		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBounds(680, 41, 275, 401);
		panel_2.add(panel_9);
		
		JLabel lblNewLabel_4_1 = new JLabel("Neu Personal Hinzuf\u00FCgung");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4_1.setBounds(59, 11, 153, 14);
		panel_9.add(lblNewLabel_4_1);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(130, 46, 135, 20);
		panel_9.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(130, 77, 135, 20);
		panel_9.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(130, 108, 135, 20);
		panel_9.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(130, 139, 135, 20);
		panel_9.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(130, 170, 135, 20);
		panel_9.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(130, 201, 135, 20);
		panel_9.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(130, 232, 135, 20);
		panel_9.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(130, 263, 135, 20);
		panel_9.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(130, 294, 135, 20);
		panel_9.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(130, 325, 135, 20);
		panel_9.add(textField_23);
		
		JButton btnAdminAdd_1 = new JButton("Personal hinzuf\u00FCgen");
		btnAdminAdd_1.setBounds(70, 356, 135, 23);
		panel_9.add(btnAdminAdd_1);
		
		JLabel lblNewLabel_5_10 = new JLabel("Id:");
		lblNewLabel_5_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_10.setBounds(10, 49, 90, 14);
		panel_9.add(lblNewLabel_5_10);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("Personal Id:");
		lblNewLabel_5_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1_1.setBounds(10, 80, 90, 14);
		panel_9.add(lblNewLabel_5_1_1);
		
		JLabel lblNewLabel_5_2_1 = new JLabel("Passwort:");
		lblNewLabel_5_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_2_1.setBounds(10, 111, 90, 14);
		panel_9.add(lblNewLabel_5_2_1);
		
		JLabel lblNewLabel_5_3_1 = new JLabel("Name:");
		lblNewLabel_5_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_3_1.setBounds(10, 142, 90, 14);
		panel_9.add(lblNewLabel_5_3_1);
		
		JLabel lblNewLabel_5_4_1 = new JLabel("Nachname:");
		lblNewLabel_5_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_4_1.setBounds(10, 173, 90, 14);
		panel_9.add(lblNewLabel_5_4_1);
		
		JLabel lblNewLabel_5_5_1 = new JLabel("Filiale:");
		lblNewLabel_5_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_5_1.setBounds(10, 204, 90, 14);
		panel_9.add(lblNewLabel_5_5_1);
		
		JLabel lblNewLabel_5_6_1 = new JLabel("Geburtsdatum:");
		lblNewLabel_5_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_6_1.setBounds(10, 235, 90, 14);
		panel_9.add(lblNewLabel_5_6_1);
		
		JLabel lblNewLabel_5_7_1 = new JLabel("Geschlecht:");
		lblNewLabel_5_7_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_7_1.setBounds(10, 266, 90, 14);
		panel_9.add(lblNewLabel_5_7_1);
		
		JLabel lblNewLabel_5_8_1 = new JLabel("Adress:");
		lblNewLabel_5_8_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_8_1.setBounds(10, 297, 90, 14);
		panel_9.add(lblNewLabel_5_8_1);
		
		JLabel lblNewLabel_5_9_1 = new JLabel("Telefonnummer:");
		lblNewLabel_5_9_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_9_1.setBounds(10, 328, 90, 14);
		panel_9.add(lblNewLabel_5_9_1);
		
		JPanel panel_8_1 = new JPanel();
		panel_8_1.setLayout(null);
		panel_8_1.setBounds(680, 453, 275, 163);
		panel_2.add(panel_8_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("Personal L\u00F6schen");
		lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6_1.setBounds(79, 11, 115, 14);
		panel_8_1.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_7_1 = new JLabel("Personal Id:");
		lblNewLabel_7_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_7_1.setBounds(10, 36, 255, 14);
		panel_8_1.add(lblNewLabel_7_1);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(10, 54, 255, 20);
		panel_8_1.add(textField_24);
		
		JLabel lblNewLabel_8_1 = new JLabel("Ihr Passwort:");
		lblNewLabel_8_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_8_1.setBounds(10, 85, 255, 14);
		panel_8_1.add(lblNewLabel_8_1);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(10, 103, 255, 20);
		panel_8_1.add(textField_25);
		
		JButton btnNewButton_2 = new JButton("L\u00F6schen");
		btnNewButton_2.setBounds(95, 135, 85, 20);
		panel_8_1.add(btnNewButton_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Suchen Sie mit ->");
		lblNewLabel_1_1.setBounds(10, 10, 108, 20);
		panel_2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Personal Id: ");
		lblNewLabel_2_1.setBounds(130, 13, 77, 14);
		panel_2.add(lblNewLabel_2_1);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(200, 10, 120, 20);
		panel_2.add(textField_12);
		
		JLabel lblNewLabel_9_1 = new JLabel("oder");
		lblNewLabel_9_1.setBounds(348, 13, 27, 14);
		panel_2.add(lblNewLabel_9_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Name:");
		lblNewLabel_3_1.setBounds(399, 13, 48, 14);
		panel_2.add(lblNewLabel_3_1);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(444, 10, 96, 20);
		panel_2.add(textField_13);
		
		JButton btnNewButton_1_1 = new JButton("Suche");
		btnNewButton_1_1.setBounds(570, 10, 89, 20);
		panel_2.add(btnNewButton_1_1);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Filiale Verwaltung", null, panel_3, null);
		panel_3.setLayout(null);
		
		JScrollPane adminPanel_2 = new JScrollPane();
		adminPanel_2.setBounds(10, 41, 660, 574);
		panel_3.add(adminPanel_2);
		
		JPanel panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBounds(680, 41, 275, 401);
		panel_3.add(panel_10);
		
		JLabel lblNewLabel_4_2 = new JLabel("Neu Filiale Hinzuf\u00FCgung");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4_2.setBounds(70, 11, 147, 20);
		panel_10.add(lblNewLabel_4_2);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(130, 46, 135, 20);
		panel_10.add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(130, 77, 135, 20);
		panel_10.add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(130, 108, 135, 20);
		panel_10.add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(130, 139, 135, 20);
		panel_10.add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(130, 170, 135, 20);
		panel_10.add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBounds(130, 201, 135, 20);
		panel_10.add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBounds(130, 232, 135, 20);
		panel_10.add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBounds(130, 263, 135, 20);
		panel_10.add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setColumns(10);
		textField_36.setBounds(130, 294, 135, 20);
		panel_10.add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setColumns(10);
		textField_37.setBounds(130, 325, 135, 20);
		panel_10.add(textField_37);
		
		JButton btnAdminAdd_2 = new JButton("Filiale hinzufügen");
		btnAdminAdd_2.setBounds(70, 356, 135, 23);
		panel_10.add(btnAdminAdd_2);
		
		JLabel lblNewLabel_5_11 = new JLabel("Id:");
		lblNewLabel_5_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_11.setBounds(10, 49, 90, 14);
		panel_10.add(lblNewLabel_5_11);
		
		JLabel lblNewLabel_5_1_2 = new JLabel("Personal Id:");
		lblNewLabel_5_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1_2.setBounds(10, 80, 90, 14);
		panel_10.add(lblNewLabel_5_1_2);
		
		JLabel lblNewLabel_5_2_2 = new JLabel("Passwort:");
		lblNewLabel_5_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_2_2.setBounds(10, 111, 90, 14);
		panel_10.add(lblNewLabel_5_2_2);
		
		JLabel lblNewLabel_5_3_2 = new JLabel("Name:");
		lblNewLabel_5_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_3_2.setBounds(10, 142, 90, 14);
		panel_10.add(lblNewLabel_5_3_2);
		
		JLabel lblNewLabel_5_4_2 = new JLabel("Nachname:");
		lblNewLabel_5_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_4_2.setBounds(10, 173, 90, 14);
		panel_10.add(lblNewLabel_5_4_2);
		
		JLabel lblNewLabel_5_5_2 = new JLabel("Filiale:");
		lblNewLabel_5_5_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_5_2.setBounds(10, 204, 90, 14);
		panel_10.add(lblNewLabel_5_5_2);
		
		JLabel lblNewLabel_5_6_2 = new JLabel("Geburtsdatum:");
		lblNewLabel_5_6_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_6_2.setBounds(10, 235, 90, 14);
		panel_10.add(lblNewLabel_5_6_2);
		
		JLabel lblNewLabel_5_7_2 = new JLabel("Geschlecht:");
		lblNewLabel_5_7_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_7_2.setBounds(10, 266, 90, 14);
		panel_10.add(lblNewLabel_5_7_2);
		
		JLabel lblNewLabel_5_8_2 = new JLabel("Adress:");
		lblNewLabel_5_8_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_8_2.setBounds(10, 297, 90, 14);
		panel_10.add(lblNewLabel_5_8_2);
		
		JLabel lblNewLabel_5_9_2 = new JLabel("Telefonnummer:");
		lblNewLabel_5_9_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_9_2.setBounds(10, 328, 90, 14);
		panel_10.add(lblNewLabel_5_9_2);
		
		JPanel panel_8_2 = new JPanel();
		panel_8_2.setLayout(null);
		panel_8_2.setBounds(680, 453, 275, 163);
		panel_3.add(panel_8_2);
		
		JLabel lblNewLabel_6_2 = new JLabel("Filiale Löschen");
		lblNewLabel_6_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_6_2.setBounds(95, 11, 85, 14);
		panel_8_2.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_7_2 = new JLabel("Personal Id:");
		lblNewLabel_7_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_7_2.setBounds(10, 36, 255, 14);
		panel_8_2.add(lblNewLabel_7_2);
		
		textField_38 = new JTextField();
		textField_38.setColumns(10);
		textField_38.setBounds(10, 54, 255, 20);
		panel_8_2.add(textField_38);
		
		JLabel lblNewLabel_8_2 = new JLabel("Ihr Passwort:");
		lblNewLabel_8_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_8_2.setBounds(10, 85, 255, 14);
		panel_8_2.add(lblNewLabel_8_2);
		
		textField_39 = new JTextField();
		textField_39.setColumns(10);
		textField_39.setBounds(10, 103, 255, 20);
		panel_8_2.add(textField_39);
		
		JButton btnNewButton_3 = new JButton("Löschen");
		btnNewButton_3.setBounds(95, 135, 85, 20);
		panel_8_2.add(btnNewButton_3);
		
		JLabel lblNewLabel_1_2 = new JLabel("Suchen Sie mit ->");
		lblNewLabel_1_2.setBounds(10, 10, 108, 20);
		panel_3.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("Filiale Id: ");
		lblNewLabel_2_2.setBounds(130, 13, 77, 14);
		panel_3.add(lblNewLabel_2_2);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(191, 10, 120, 20);
		panel_3.add(textField_26);
		
		JLabel lblNewLabel_9_2 = new JLabel("oder");
		lblNewLabel_9_2.setBounds(341, 13, 27, 14);
		panel_3.add(lblNewLabel_9_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("Name:");
		lblNewLabel_3_2.setBounds(391, 13, 48, 14);
		panel_3.add(lblNewLabel_3_2);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(436, 10, 96, 20);
		panel_3.add(textField_27);
		
		JButton btnNewButton_1_2 = new JButton("Suche");
		btnNewButton_1_2.setBounds(570, 10, 89, 20);
		panel_3.add(btnNewButton_1_2);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Produkt Verwaltung", null, panel_4, null);
		panel_4.setLayout(null);
		
		JScrollPane adminPanel_3 = new JScrollPane();
		adminPanel_3.setBounds(10, 41, 660, 574);
		panel_4.add(adminPanel_3);
		
		JPanel panel_11 = new JPanel();
		panel_11.setLayout(null);
		panel_11.setBounds(680, 41, 275, 401);
		panel_4.add(panel_11);
		
		JLabel lblNewLabel_4_3 = new JLabel("Neu Produkt Hinzufügung");
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4_3.setBounds(70, 11, 135, 14);
		panel_11.add(lblNewLabel_4_3);
		
		textField_42 = new JTextField();
		textField_42.setColumns(10);
		textField_42.setBounds(130, 46, 135, 20);
		panel_11.add(textField_42);
		
		textField_43 = new JTextField();
		textField_43.setColumns(10);
		textField_43.setBounds(130, 77, 135, 20);
		panel_11.add(textField_43);
		
		textField_44 = new JTextField();
		textField_44.setColumns(10);
		textField_44.setBounds(130, 108, 135, 20);
		panel_11.add(textField_44);
		
		textField_45 = new JTextField();
		textField_45.setColumns(10);
		textField_45.setBounds(130, 139, 135, 20);
		panel_11.add(textField_45);
		
		textField_46 = new JTextField();
		textField_46.setColumns(10);
		textField_46.setBounds(130, 170, 135, 20);
		panel_11.add(textField_46);
		
		textField_47 = new JTextField();
		textField_47.setColumns(10);
		textField_47.setBounds(130, 201, 135, 20);
		panel_11.add(textField_47);
		
		textField_48 = new JTextField();
		textField_48.setColumns(10);
		textField_48.setBounds(130, 232, 135, 20);
		panel_11.add(textField_48);
		
		textField_49 = new JTextField();
		textField_49.setColumns(10);
		textField_49.setBounds(130, 263, 135, 20);
		panel_11.add(textField_49);
		
		textField_50 = new JTextField();
		textField_50.setColumns(10);
		textField_50.setBounds(130, 294, 135, 20);
		panel_11.add(textField_50);
		
		textField_51 = new JTextField();
		textField_51.setColumns(10);
		textField_51.setBounds(130, 325, 135, 20);
		panel_11.add(textField_51);
		
		JButton btnAdminAdd_3 = new JButton("Produkt hinzufügen");
		btnAdminAdd_3.setBounds(70, 356, 135, 23);
		panel_11.add(btnAdminAdd_3);
		
		JLabel lblNewLabel_5_12 = new JLabel("Id:");
		lblNewLabel_5_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_12.setBounds(10, 49, 90, 14);
		panel_11.add(lblNewLabel_5_12);
		
		JLabel lblNewLabel_5_1_3 = new JLabel("Personal Id:");
		lblNewLabel_5_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1_3.setBounds(10, 80, 90, 14);
		panel_11.add(lblNewLabel_5_1_3);
		
		JLabel lblNewLabel_5_2_3 = new JLabel("Passwort:");
		lblNewLabel_5_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_2_3.setBounds(10, 111, 90, 14);
		panel_11.add(lblNewLabel_5_2_3);
		
		JLabel lblNewLabel_5_3_3 = new JLabel("Name:");
		lblNewLabel_5_3_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_3_3.setBounds(10, 142, 90, 14);
		panel_11.add(lblNewLabel_5_3_3);
		
		JLabel lblNewLabel_5_4_3 = new JLabel("Nachname:");
		lblNewLabel_5_4_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_4_3.setBounds(10, 173, 90, 14);
		panel_11.add(lblNewLabel_5_4_3);
		
		JLabel lblNewLabel_5_5_3 = new JLabel("Filiale:");
		lblNewLabel_5_5_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_5_3.setBounds(10, 204, 90, 14);
		panel_11.add(lblNewLabel_5_5_3);
		
		JLabel lblNewLabel_5_6_3 = new JLabel("Geburtsdatum:");
		lblNewLabel_5_6_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_6_3.setBounds(10, 235, 90, 14);
		panel_11.add(lblNewLabel_5_6_3);
		
		JLabel lblNewLabel_5_7_3 = new JLabel("Geschlecht:");
		lblNewLabel_5_7_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_7_3.setBounds(10, 266, 90, 14);
		panel_11.add(lblNewLabel_5_7_3);
		
		JLabel lblNewLabel_5_8_3 = new JLabel("Adress:");
		lblNewLabel_5_8_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_8_3.setBounds(10, 297, 90, 14);
		panel_11.add(lblNewLabel_5_8_3);
		
		JLabel lblNewLabel_5_9_3 = new JLabel("Telefonnummer:");
		lblNewLabel_5_9_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_9_3.setBounds(10, 328, 90, 14);
		panel_11.add(lblNewLabel_5_9_3);
		
		JPanel panel_8_3 = new JPanel();
		panel_8_3.setLayout(null);
		panel_8_3.setBounds(680, 453, 275, 163);
		panel_4.add(panel_8_3);
		
		JLabel lblNewLabel_6_3 = new JLabel("Produkt L\u00F6schen");
		lblNewLabel_6_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6_3.setBounds(84, 11, 96, 14);
		panel_8_3.add(lblNewLabel_6_3);
		
		JLabel lblNewLabel_7_3 = new JLabel("Produkt Id:");
		lblNewLabel_7_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_7_3.setBounds(10, 36, 255, 14);
		panel_8_3.add(lblNewLabel_7_3);
		
		textField_52 = new JTextField();
		textField_52.setColumns(10);
		textField_52.setBounds(10, 54, 255, 20);
		panel_8_3.add(textField_52);
		
		JLabel lblNewLabel_8_3 = new JLabel("Ihr Passwort:");
		lblNewLabel_8_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_8_3.setBounds(10, 85, 255, 14);
		panel_8_3.add(lblNewLabel_8_3);
		
		textField_53 = new JTextField();
		textField_53.setColumns(10);
		textField_53.setBounds(10, 103, 255, 20);
		panel_8_3.add(textField_53);
		
		JButton btnNewButton_4 = new JButton("L\u00F6schen");
		btnNewButton_4.setBounds(95, 135, 85, 20);
		panel_8_3.add(btnNewButton_4);
		
		JLabel lblNewLabel_1_3 = new JLabel("Suchen Sie mit ->");
		lblNewLabel_1_3.setBounds(10, 10, 108, 20);
		panel_4.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_2_3 = new JLabel("Produkt Id: ");
		lblNewLabel_2_3.setBounds(130, 13, 77, 14);
		panel_4.add(lblNewLabel_2_3);
		
		textField_40 = new JTextField();
		textField_40.setColumns(10);
		textField_40.setBounds(200, 10, 120, 20);
		panel_4.add(textField_40);
		
		JLabel lblNewLabel_9_3 = new JLabel("oder");
		lblNewLabel_9_3.setBounds(348, 13, 27, 14);
		panel_4.add(lblNewLabel_9_3);
		
		JLabel lblNewLabel_3_3 = new JLabel("Name:");
		lblNewLabel_3_3.setBounds(399, 13, 48, 14);
		panel_4.add(lblNewLabel_3_3);
		
		textField_41 = new JTextField();
		textField_41.setColumns(10);
		textField_41.setBounds(444, 10, 96, 20);
		panel_4.add(textField_41);
		
		JButton btnNewButton_1_3 = new JButton("Suche");
		btnNewButton_1_3.setBounds(570, 10, 89, 20);
		panel_4.add(btnNewButton_1_3);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Kunde Verwaltung", null, panel_5, null);
		panel_5.setLayout(null);
		
		JScrollPane adminPanel_4 = new JScrollPane();
		adminPanel_4.setBounds(10, 41, 660, 574);
		panel_5.add(adminPanel_4);
		
		JPanel panel_12 = new JPanel();
		panel_12.setLayout(null);
		panel_12.setBounds(680, 41, 275, 401);
		panel_5.add(panel_12);
		
		JLabel lblNewLabel_4_4 = new JLabel("Neu Admin Hinzuf\u00FCgung");
		lblNewLabel_4_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4_4.setBounds(70, 11, 135, 14);
		panel_12.add(lblNewLabel_4_4);
		
		textField_56 = new JTextField();
		textField_56.setColumns(10);
		textField_56.setBounds(130, 46, 135, 20);
		panel_12.add(textField_56);
		
		textField_57 = new JTextField();
		textField_57.setColumns(10);
		textField_57.setBounds(130, 77, 135, 20);
		panel_12.add(textField_57);
		
		textField_58 = new JTextField();
		textField_58.setColumns(10);
		textField_58.setBounds(130, 108, 135, 20);
		panel_12.add(textField_58);
		
		textField_59 = new JTextField();
		textField_59.setColumns(10);
		textField_59.setBounds(130, 139, 135, 20);
		panel_12.add(textField_59);
		
		textField_60 = new JTextField();
		textField_60.setColumns(10);
		textField_60.setBounds(130, 170, 135, 20);
		panel_12.add(textField_60);
		
		textField_61 = new JTextField();
		textField_61.setColumns(10);
		textField_61.setBounds(130, 201, 135, 20);
		panel_12.add(textField_61);
		
		textField_62 = new JTextField();
		textField_62.setColumns(10);
		textField_62.setBounds(130, 232, 135, 20);
		panel_12.add(textField_62);
		
		textField_63 = new JTextField();
		textField_63.setColumns(10);
		textField_63.setBounds(130, 263, 135, 20);
		panel_12.add(textField_63);
		
		textField_64 = new JTextField();
		textField_64.setColumns(10);
		textField_64.setBounds(130, 294, 135, 20);
		panel_12.add(textField_64);
		
		textField_65 = new JTextField();
		textField_65.setColumns(10);
		textField_65.setBounds(130, 325, 135, 20);
		panel_12.add(textField_65);
		
		JButton btnAdminAdd_4 = new JButton("Admin hinzuf\u00FCgen");
		btnAdminAdd_4.setBounds(70, 356, 135, 23);
		panel_12.add(btnAdminAdd_4);
		
		JLabel lblNewLabel_5_13 = new JLabel("Id:");
		lblNewLabel_5_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_13.setBounds(10, 49, 90, 14);
		panel_12.add(lblNewLabel_5_13);
		
		JLabel lblNewLabel_5_1_4 = new JLabel("Personal Id:");
		lblNewLabel_5_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1_4.setBounds(10, 80, 90, 14);
		panel_12.add(lblNewLabel_5_1_4);
		
		JLabel lblNewLabel_5_2_4 = new JLabel("Passwort:");
		lblNewLabel_5_2_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_2_4.setBounds(10, 111, 90, 14);
		panel_12.add(lblNewLabel_5_2_4);
		
		JLabel lblNewLabel_5_3_4 = new JLabel("Name:");
		lblNewLabel_5_3_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_3_4.setBounds(10, 142, 90, 14);
		panel_12.add(lblNewLabel_5_3_4);
		
		JLabel lblNewLabel_5_4_4 = new JLabel("Nachname:");
		lblNewLabel_5_4_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_4_4.setBounds(10, 173, 90, 14);
		panel_12.add(lblNewLabel_5_4_4);
		
		JLabel lblNewLabel_5_5_4 = new JLabel("Filiale:");
		lblNewLabel_5_5_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_5_4.setBounds(10, 204, 90, 14);
		panel_12.add(lblNewLabel_5_5_4);
		
		JLabel lblNewLabel_5_6_4 = new JLabel("Geburtsdatum:");
		lblNewLabel_5_6_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_6_4.setBounds(10, 235, 90, 14);
		panel_12.add(lblNewLabel_5_6_4);
		
		JLabel lblNewLabel_5_7_4 = new JLabel("Geschlecht:");
		lblNewLabel_5_7_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_7_4.setBounds(10, 266, 90, 14);
		panel_12.add(lblNewLabel_5_7_4);
		
		JLabel lblNewLabel_5_8_4 = new JLabel("Adress:");
		lblNewLabel_5_8_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_8_4.setBounds(10, 297, 90, 14);
		panel_12.add(lblNewLabel_5_8_4);
		
		JLabel lblNewLabel_5_9_4 = new JLabel("Telefonnummer:");
		lblNewLabel_5_9_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_9_4.setBounds(10, 328, 90, 14);
		panel_12.add(lblNewLabel_5_9_4);
		
		JPanel panel_8_4 = new JPanel();
		panel_8_4.setLayout(null);
		panel_8_4.setBounds(680, 453, 275, 163);
		panel_5.add(panel_8_4);
		
		JLabel lblNewLabel_6_4 = new JLabel("Admin L\u00F6schen");
		lblNewLabel_6_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6_4.setBounds(95, 11, 85, 14);
		panel_8_4.add(lblNewLabel_6_4);
		
		JLabel lblNewLabel_7_4 = new JLabel("Personal Id:");
		lblNewLabel_7_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_7_4.setBounds(10, 36, 255, 14);
		panel_8_4.add(lblNewLabel_7_4);
		
		textField_66 = new JTextField();
		textField_66.setColumns(10);
		textField_66.setBounds(10, 54, 255, 20);
		panel_8_4.add(textField_66);
		
		JLabel lblNewLabel_8_4 = new JLabel("Ihr Passwort:");
		lblNewLabel_8_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_8_4.setBounds(10, 85, 255, 14);
		panel_8_4.add(lblNewLabel_8_4);
		
		textField_67 = new JTextField();
		textField_67.setColumns(10);
		textField_67.setBounds(10, 103, 255, 20);
		panel_8_4.add(textField_67);
		
		JButton btnNewButton_5 = new JButton("L\u00F6schen");
		btnNewButton_5.setBounds(95, 135, 85, 20);
		panel_8_4.add(btnNewButton_5);
		
		JLabel lblNewLabel_1_4 = new JLabel("Suchen Sie mit ->");
		lblNewLabel_1_4.setBounds(10, 10, 108, 20);
		panel_5.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_2_4 = new JLabel("Personal Id: ");
		lblNewLabel_2_4.setBounds(130, 13, 77, 14);
		panel_5.add(lblNewLabel_2_4);
		
		textField_54 = new JTextField();
		textField_54.setColumns(10);
		textField_54.setBounds(200, 10, 120, 20);
		panel_5.add(textField_54);
		
		JLabel lblNewLabel_9_4 = new JLabel("oder");
		lblNewLabel_9_4.setBounds(348, 13, 27, 14);
		panel_5.add(lblNewLabel_9_4);
		
		JLabel lblNewLabel_3_4 = new JLabel("Name:");
		lblNewLabel_3_4.setBounds(399, 13, 48, 14);
		panel_5.add(lblNewLabel_3_4);
		
		textField_55 = new JTextField();
		textField_55.setColumns(10);
		textField_55.setBounds(444, 10, 96, 20);
		panel_5.add(textField_55);
		
		JButton btnNewButton_1_4 = new JButton("Suche");
		btnNewButton_1_4.setBounds(570, 10, 89, 20);
		panel_5.add(btnNewButton_1_4);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Verkauf Verwaltung", null, panel_6, null);
		panel_6.setLayout(null);
		
		JScrollPane adminPanel_5 = new JScrollPane();
		adminPanel_5.setBounds(10, 41, 660, 574);
		panel_6.add(adminPanel_5);
		
		JPanel panel_13 = new JPanel();
		panel_13.setLayout(null);
		panel_13.setBounds(680, 41, 275, 401);
		panel_6.add(panel_13);
		
		JLabel lblNewLabel_4_5 = new JLabel("Neu Admin Hinzuf\u00FCgung");
		lblNewLabel_4_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4_5.setBounds(70, 11, 135, 14);
		panel_13.add(lblNewLabel_4_5);
		
		textField_70 = new JTextField();
		textField_70.setColumns(10);
		textField_70.setBounds(130, 46, 135, 20);
		panel_13.add(textField_70);
		
		textField_71 = new JTextField();
		textField_71.setColumns(10);
		textField_71.setBounds(130, 77, 135, 20);
		panel_13.add(textField_71);
		
		textField_72 = new JTextField();
		textField_72.setColumns(10);
		textField_72.setBounds(130, 108, 135, 20);
		panel_13.add(textField_72);
		
		textField_73 = new JTextField();
		textField_73.setColumns(10);
		textField_73.setBounds(130, 139, 135, 20);
		panel_13.add(textField_73);
		
		textField_74 = new JTextField();
		textField_74.setColumns(10);
		textField_74.setBounds(130, 170, 135, 20);
		panel_13.add(textField_74);
		
		textField_75 = new JTextField();
		textField_75.setColumns(10);
		textField_75.setBounds(130, 201, 135, 20);
		panel_13.add(textField_75);
		
		textField_76 = new JTextField();
		textField_76.setColumns(10);
		textField_76.setBounds(130, 232, 135, 20);
		panel_13.add(textField_76);
		
		textField_77 = new JTextField();
		textField_77.setColumns(10);
		textField_77.setBounds(130, 263, 135, 20);
		panel_13.add(textField_77);
		
		textField_78 = new JTextField();
		textField_78.setColumns(10);
		textField_78.setBounds(130, 294, 135, 20);
		panel_13.add(textField_78);
		
		textField_79 = new JTextField();
		textField_79.setColumns(10);
		textField_79.setBounds(130, 325, 135, 20);
		panel_13.add(textField_79);
		
		JButton btnAdminAdd_5 = new JButton("Admin hinzuf\u00FCgen");
		btnAdminAdd_5.setBounds(70, 356, 135, 23);
		panel_13.add(btnAdminAdd_5);
		
		JLabel lblNewLabel_5_14 = new JLabel("Id:");
		lblNewLabel_5_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_14.setBounds(10, 49, 90, 14);
		panel_13.add(lblNewLabel_5_14);
		
		JLabel lblNewLabel_5_1_5 = new JLabel("Personal Id:");
		lblNewLabel_5_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1_5.setBounds(10, 80, 90, 14);
		panel_13.add(lblNewLabel_5_1_5);
		
		JLabel lblNewLabel_5_2_5 = new JLabel("Passwort:");
		lblNewLabel_5_2_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_2_5.setBounds(10, 111, 90, 14);
		panel_13.add(lblNewLabel_5_2_5);
		
		JLabel lblNewLabel_5_3_5 = new JLabel("Name:");
		lblNewLabel_5_3_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_3_5.setBounds(10, 142, 90, 14);
		panel_13.add(lblNewLabel_5_3_5);
		
		JLabel lblNewLabel_5_4_5 = new JLabel("Nachname:");
		lblNewLabel_5_4_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_4_5.setBounds(10, 173, 90, 14);
		panel_13.add(lblNewLabel_5_4_5);
		
		JLabel lblNewLabel_5_5_5 = new JLabel("Filiale:");
		lblNewLabel_5_5_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_5_5.setBounds(10, 204, 90, 14);
		panel_13.add(lblNewLabel_5_5_5);
		
		JLabel lblNewLabel_5_6_5 = new JLabel("Geburtsdatum:");
		lblNewLabel_5_6_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_6_5.setBounds(10, 235, 90, 14);
		panel_13.add(lblNewLabel_5_6_5);
		
		JLabel lblNewLabel_5_7_5 = new JLabel("Geschlecht:");
		lblNewLabel_5_7_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_7_5.setBounds(10, 266, 90, 14);
		panel_13.add(lblNewLabel_5_7_5);
		
		JLabel lblNewLabel_5_8_5 = new JLabel("Adress:");
		lblNewLabel_5_8_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_8_5.setBounds(10, 297, 90, 14);
		panel_13.add(lblNewLabel_5_8_5);
		
		JLabel lblNewLabel_5_9_5 = new JLabel("Telefonnummer:");
		lblNewLabel_5_9_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_9_5.setBounds(10, 328, 90, 14);
		panel_13.add(lblNewLabel_5_9_5);
		
		JPanel panel_8_5 = new JPanel();
		panel_8_5.setLayout(null);
		panel_8_5.setBounds(680, 453, 275, 163);
		panel_6.add(panel_8_5);
		
		JLabel lblNewLabel_6_5 = new JLabel("Admin L\u00F6schen");
		lblNewLabel_6_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6_5.setBounds(95, 11, 85, 14);
		panel_8_5.add(lblNewLabel_6_5);
		
		JLabel lblNewLabel_7_5 = new JLabel("Personal Id:");
		lblNewLabel_7_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_7_5.setBounds(10, 36, 255, 14);
		panel_8_5.add(lblNewLabel_7_5);
		
		textField_80 = new JTextField();
		textField_80.setColumns(10);
		textField_80.setBounds(10, 54, 255, 20);
		panel_8_5.add(textField_80);
		
		JLabel lblNewLabel_8_5 = new JLabel("Ihr Passwort:");
		lblNewLabel_8_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_8_5.setBounds(10, 85, 255, 14);
		panel_8_5.add(lblNewLabel_8_5);
		
		textField_81 = new JTextField();
		textField_81.setColumns(10);
		textField_81.setBounds(10, 103, 255, 20);
		panel_8_5.add(textField_81);
		
		JButton btnNewButton_6 = new JButton("L\u00F6schen");
		btnNewButton_6.setBounds(95, 135, 85, 20);
		panel_8_5.add(btnNewButton_6);
		
		JLabel lblNewLabel_1_5 = new JLabel("Suchen Sie mit ->");
		lblNewLabel_1_5.setBounds(10, 10, 108, 20);
		panel_6.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_2_5 = new JLabel("Personal Id: ");
		lblNewLabel_2_5.setBounds(130, 13, 77, 14);
		panel_6.add(lblNewLabel_2_5);
		
		textField_68 = new JTextField();
		textField_68.setColumns(10);
		textField_68.setBounds(200, 10, 120, 20);
		panel_6.add(textField_68);
		
		JLabel lblNewLabel_9_5 = new JLabel("oder");
		lblNewLabel_9_5.setBounds(348, 13, 27, 14);
		panel_6.add(lblNewLabel_9_5);
		
		JLabel lblNewLabel_3_5 = new JLabel("Name:");
		lblNewLabel_3_5.setBounds(399, 13, 48, 14);
		panel_6.add(lblNewLabel_3_5);
		
		textField_69 = new JTextField();
		textField_69.setColumns(10);
		textField_69.setBounds(444, 10, 96, 20);
		panel_6.add(textField_69);
		
		JButton btnNewButton_1_5 = new JButton("Suche");
		btnNewButton_1_5.setBounds(570, 10, 89, 20);
		panel_6.add(btnNewButton_1_5);
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("Dienst Verwaltung", null, panel_7, null);
		panel_7.setLayout(null);
		
		JScrollPane adminPanel_6 = new JScrollPane();
		adminPanel_6.setBounds(10, 41, 660, 574);
		panel_7.add(adminPanel_6);
		
		JPanel panel_14 = new JPanel();
		panel_14.setLayout(null);
		panel_14.setBounds(680, 41, 275, 401);
		panel_7.add(panel_14);
		
		JLabel lblNewLabel_4_6 = new JLabel("Neu Admin Hinzuf\u00FCgung");
		lblNewLabel_4_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4_6.setBounds(70, 11, 135, 14);
		panel_14.add(lblNewLabel_4_6);
		
		textField_84 = new JTextField();
		textField_84.setColumns(10);
		textField_84.setBounds(130, 46, 135, 20);
		panel_14.add(textField_84);
		
		textField_85 = new JTextField();
		textField_85.setColumns(10);
		textField_85.setBounds(130, 77, 135, 20);
		panel_14.add(textField_85);
		
		textField_86 = new JTextField();
		textField_86.setColumns(10);
		textField_86.setBounds(130, 108, 135, 20);
		panel_14.add(textField_86);
		
		textField_87 = new JTextField();
		textField_87.setColumns(10);
		textField_87.setBounds(130, 139, 135, 20);
		panel_14.add(textField_87);
		
		textField_88 = new JTextField();
		textField_88.setColumns(10);
		textField_88.setBounds(130, 170, 135, 20);
		panel_14.add(textField_88);
		
		textField_89 = new JTextField();
		textField_89.setColumns(10);
		textField_89.setBounds(130, 201, 135, 20);
		panel_14.add(textField_89);
		
		textField_90 = new JTextField();
		textField_90.setColumns(10);
		textField_90.setBounds(130, 232, 135, 20);
		panel_14.add(textField_90);
		
		textField_91 = new JTextField();
		textField_91.setColumns(10);
		textField_91.setBounds(130, 263, 135, 20);
		panel_14.add(textField_91);
		
		textField_92 = new JTextField();
		textField_92.setColumns(10);
		textField_92.setBounds(130, 294, 135, 20);
		panel_14.add(textField_92);
		
		textField_93 = new JTextField();
		textField_93.setColumns(10);
		textField_93.setBounds(130, 325, 135, 20);
		panel_14.add(textField_93);
		
		JButton btnAdminAdd_6 = new JButton("Admin hinzuf\u00FCgen");
		btnAdminAdd_6.setBounds(70, 356, 135, 23);
		panel_14.add(btnAdminAdd_6);
		
		JLabel lblNewLabel_5_15 = new JLabel("Id:");
		lblNewLabel_5_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_15.setBounds(10, 49, 90, 14);
		panel_14.add(lblNewLabel_5_15);
		
		JLabel lblNewLabel_5_1_6 = new JLabel("Personal Id:");
		lblNewLabel_5_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1_6.setBounds(10, 80, 90, 14);
		panel_14.add(lblNewLabel_5_1_6);
		
		JLabel lblNewLabel_5_2_6 = new JLabel("Passwort:");
		lblNewLabel_5_2_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_2_6.setBounds(10, 111, 90, 14);
		panel_14.add(lblNewLabel_5_2_6);
		
		JLabel lblNewLabel_5_3_6 = new JLabel("Name:");
		lblNewLabel_5_3_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_3_6.setBounds(10, 142, 90, 14);
		panel_14.add(lblNewLabel_5_3_6);
		
		JLabel lblNewLabel_5_4_6 = new JLabel("Nachname:");
		lblNewLabel_5_4_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_4_6.setBounds(10, 173, 90, 14);
		panel_14.add(lblNewLabel_5_4_6);
		
		JLabel lblNewLabel_5_5_6 = new JLabel("Filiale:");
		lblNewLabel_5_5_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_5_6.setBounds(10, 204, 90, 14);
		panel_14.add(lblNewLabel_5_5_6);
		
		JLabel lblNewLabel_5_6_6 = new JLabel("Geburtsdatum:");
		lblNewLabel_5_6_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_6_6.setBounds(10, 235, 90, 14);
		panel_14.add(lblNewLabel_5_6_6);
		
		JLabel lblNewLabel_5_7_6 = new JLabel("Geschlecht:");
		lblNewLabel_5_7_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_7_6.setBounds(10, 266, 90, 14);
		panel_14.add(lblNewLabel_5_7_6);
		
		JLabel lblNewLabel_5_8_6 = new JLabel("Adress:");
		lblNewLabel_5_8_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_8_6.setBounds(10, 297, 90, 14);
		panel_14.add(lblNewLabel_5_8_6);
		
		JLabel lblNewLabel_5_9_6 = new JLabel("Telefonnummer:");
		lblNewLabel_5_9_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_9_6.setBounds(10, 328, 90, 14);
		panel_14.add(lblNewLabel_5_9_6);
		
		JPanel panel_8_6 = new JPanel();
		panel_8_6.setLayout(null);
		panel_8_6.setBounds(680, 453, 275, 163);
		panel_7.add(panel_8_6);
		
		JLabel lblNewLabel_6_6 = new JLabel("Admin L\u00F6schen");
		lblNewLabel_6_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6_6.setBounds(95, 11, 85, 14);
		panel_8_6.add(lblNewLabel_6_6);
		
		JLabel lblNewLabel_7_6 = new JLabel("Personal Id:");
		lblNewLabel_7_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_7_6.setBounds(10, 36, 255, 14);
		panel_8_6.add(lblNewLabel_7_6);
		
		textField_94 = new JTextField();
		textField_94.setColumns(10);
		textField_94.setBounds(10, 54, 255, 20);
		panel_8_6.add(textField_94);
		
		JLabel lblNewLabel_8_6 = new JLabel("Ihr Passwort:");
		lblNewLabel_8_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_8_6.setBounds(10, 85, 255, 14);
		panel_8_6.add(lblNewLabel_8_6);
		
		textField_95 = new JTextField();
		textField_95.setColumns(10);
		textField_95.setBounds(10, 103, 255, 20);
		panel_8_6.add(textField_95);
		
		JButton btnNewButton_7 = new JButton("L\u00F6schen");
		btnNewButton_7.setBounds(95, 135, 85, 20);
		panel_8_6.add(btnNewButton_7);
		
		JLabel lblNewLabel_1_6 = new JLabel("Suchen Sie mit ->");
		lblNewLabel_1_6.setBounds(10, 10, 108, 20);
		panel_7.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_2_6 = new JLabel("Personal Id: ");
		lblNewLabel_2_6.setBounds(130, 13, 77, 14);
		panel_7.add(lblNewLabel_2_6);
		
		textField_82 = new JTextField();
		textField_82.setColumns(10);
		textField_82.setBounds(200, 10, 120, 20);
		panel_7.add(textField_82);
		
		JLabel lblNewLabel_9_6 = new JLabel("oder");
		lblNewLabel_9_6.setBounds(348, 13, 27, 14);
		panel_7.add(lblNewLabel_9_6);
		
		JLabel lblNewLabel_3_6 = new JLabel("Name:");
		lblNewLabel_3_6.setBounds(399, 13, 48, 14);
		panel_7.add(lblNewLabel_3_6);
		
		textField_83 = new JTextField();
		textField_83.setColumns(10);
		textField_83.setBounds(444, 10, 96, 20);
		panel_7.add(textField_83);
		
		JButton btnNewButton_1_6 = new JButton("Suche");
		btnNewButton_1_6.setBounds(570, 10, 89, 20);
		panel_7.add(btnNewButton_1_6);
		if(admin.getGeschlecht().equals("M")) {
			JLabel wilkommen = new JLabel("Willkommen "+ "Herr " + admin.getNachname());
			wilkommen.setFont(new Font("Tahoma", Font.PLAIN, 12));
			wilkommen.setBounds(10, 10, 500, 30);
			contentPane.add(wilkommen);
		} else if (admin.getGeschlecht().equals("F")) {
			JLabel wilkommen = new JLabel("Willkommen "+ "Frau " + admin.getNachname());
			wilkommen.setFont(new Font("Tahoma", Font.PLAIN, 12));
			wilkommen.setBounds(10, 10, 500, 30);
			contentPane.add(wilkommen);
		} else {
			JLabel wilkommen = new JLabel("Willkommen "+ "Sehr Geehrte " + admin.getNachname());
			wilkommen.setFont(new Font("Tahoma", Font.PLAIN, 12));
			wilkommen.setBounds(10, 10, 500, 500);
			contentPane.add(wilkommen);
		}
		
		
	}
}
