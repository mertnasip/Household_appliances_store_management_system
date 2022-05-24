package Gui;

import Entities.*;
import Helpers.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import javax.swing.border.*;

public class TechnikerGui extends JFrame {
	
	static Techniker techniker = new Techniker();
	
	private JPanel contentPane;
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
	private JTextField textField_12;
	private JTextField textField_13;
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
	private JTextField textField_26;
	private JTextField textField_27;
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
	private JTextField textField_40;
	private JTextField textField_41;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TechnikerGui frame = new TechnikerGui(techniker);
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
	public TechnikerGui(Entities.Techniker techniker) {
		setTitle("Weißwarenhändler Managment System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 50, 970, 654);
		contentPane.add(tabbedPane);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		tabbedPane.addTab("Produkt Verwaltung", null, panel_4, null);
		
		JScrollPane adminPanel_3 = new JScrollPane();
		adminPanel_3.setBounds(10, 41, 660, 574);
		panel_4.add(adminPanel_3);
		
		JPanel panel_11 = new JPanel();
		panel_11.setLayout(null);
		panel_11.setBounds(680, 41, 275, 401);
		panel_4.add(panel_11);
		
		JLabel lblNewLabel_4_3 = new JLabel("Neu Produkt Hinzuf\u00FCgung");
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4_3.setBounds(70, 11, 135, 14);
		panel_11.add(lblNewLabel_4_3);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(130, 46, 135, 20);
		panel_11.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(130, 77, 135, 20);
		panel_11.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(130, 108, 135, 20);
		panel_11.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(130, 139, 135, 20);
		panel_11.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(130, 170, 135, 20);
		panel_11.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(130, 201, 135, 20);
		panel_11.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(130, 232, 135, 20);
		panel_11.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(130, 263, 135, 20);
		panel_11.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(130, 294, 135, 20);
		panel_11.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(130, 325, 135, 20);
		panel_11.add(textField_9);
		
		JButton btnAdminAdd_3 = new JButton("Produkt hinzuf\u00FCgen");
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
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(10, 54, 255, 20);
		panel_8_3.add(textField_10);
		
		JLabel lblNewLabel_8_3 = new JLabel("Ihr Passwort:");
		lblNewLabel_8_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_8_3.setBounds(10, 85, 255, 14);
		panel_8_3.add(lblNewLabel_8_3);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(10, 103, 255, 20);
		panel_8_3.add(textField_11);
		
		JButton btnNewButton_4 = new JButton("L\u00F6schen");
		btnNewButton_4.setBounds(95, 135, 85, 20);
		panel_8_3.add(btnNewButton_4);
		
		JLabel lblNewLabel_1_3 = new JLabel("Suchen Sie mit ->");
		lblNewLabel_1_3.setBounds(10, 10, 108, 20);
		panel_4.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_2_3 = new JLabel("Produkt Id: ");
		lblNewLabel_2_3.setBounds(130, 13, 77, 14);
		panel_4.add(lblNewLabel_2_3);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(200, 10, 120, 20);
		panel_4.add(textField_12);
		
		JLabel lblNewLabel_9_3 = new JLabel("oder");
		lblNewLabel_9_3.setBounds(348, 13, 27, 14);
		panel_4.add(lblNewLabel_9_3);
		
		JLabel lblNewLabel_3_3 = new JLabel("Name:");
		lblNewLabel_3_3.setBounds(399, 13, 48, 14);
		panel_4.add(lblNewLabel_3_3);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(444, 10, 96, 20);
		panel_4.add(textField_13);
		
		JButton btnNewButton_1_3 = new JButton("Suche");
		btnNewButton_1_3.setBounds(570, 10, 89, 20);
		panel_4.add(btnNewButton_1_3);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		tabbedPane.addTab("Kunde Verwaltung", null, panel_5, null);
		
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
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(130, 46, 135, 20);
		panel_12.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(130, 77, 135, 20);
		panel_12.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(130, 108, 135, 20);
		panel_12.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(130, 139, 135, 20);
		panel_12.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(130, 170, 135, 20);
		panel_12.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(130, 201, 135, 20);
		panel_12.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(130, 232, 135, 20);
		panel_12.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(130, 263, 135, 20);
		panel_12.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(130, 294, 135, 20);
		panel_12.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(130, 325, 135, 20);
		panel_12.add(textField_23);
		
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
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(10, 54, 255, 20);
		panel_8_4.add(textField_24);
		
		JLabel lblNewLabel_8_4 = new JLabel("Ihr Passwort:");
		lblNewLabel_8_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_8_4.setBounds(10, 85, 255, 14);
		panel_8_4.add(lblNewLabel_8_4);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(10, 103, 255, 20);
		panel_8_4.add(textField_25);
		
		JButton btnNewButton_5 = new JButton("L\u00F6schen");
		btnNewButton_5.setBounds(95, 135, 85, 20);
		panel_8_4.add(btnNewButton_5);
		
		JLabel lblNewLabel_1_4 = new JLabel("Suchen Sie mit ->");
		lblNewLabel_1_4.setBounds(10, 10, 108, 20);
		panel_5.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_2_4 = new JLabel("Personal Id: ");
		lblNewLabel_2_4.setBounds(130, 13, 77, 14);
		panel_5.add(lblNewLabel_2_4);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(200, 10, 120, 20);
		panel_5.add(textField_26);
		
		JLabel lblNewLabel_9_4 = new JLabel("oder");
		lblNewLabel_9_4.setBounds(348, 13, 27, 14);
		panel_5.add(lblNewLabel_9_4);
		
		JLabel lblNewLabel_3_4 = new JLabel("Name:");
		lblNewLabel_3_4.setBounds(399, 13, 48, 14);
		panel_5.add(lblNewLabel_3_4);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(444, 10, 96, 20);
		panel_5.add(textField_27);
		
		JButton btnNewButton_1_4 = new JButton("Suche");
		btnNewButton_1_4.setBounds(570, 10, 89, 20);
		panel_5.add(btnNewButton_1_4);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		tabbedPane.addTab("Dienst Verwaltung", null, panel_7, null);
		
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
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(130, 46, 135, 20);
		panel_14.add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(130, 77, 135, 20);
		panel_14.add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(130, 108, 135, 20);
		panel_14.add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(130, 139, 135, 20);
		panel_14.add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(130, 170, 135, 20);
		panel_14.add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBounds(130, 201, 135, 20);
		panel_14.add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBounds(130, 232, 135, 20);
		panel_14.add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBounds(130, 263, 135, 20);
		panel_14.add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setColumns(10);
		textField_36.setBounds(130, 294, 135, 20);
		panel_14.add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setColumns(10);
		textField_37.setBounds(130, 325, 135, 20);
		panel_14.add(textField_37);
		
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
		
		textField_38 = new JTextField();
		textField_38.setColumns(10);
		textField_38.setBounds(10, 54, 255, 20);
		panel_8_6.add(textField_38);
		
		JLabel lblNewLabel_8_6 = new JLabel("Ihr Passwort:");
		lblNewLabel_8_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_8_6.setBounds(10, 85, 255, 14);
		panel_8_6.add(lblNewLabel_8_6);
		
		textField_39 = new JTextField();
		textField_39.setColumns(10);
		textField_39.setBounds(10, 103, 255, 20);
		panel_8_6.add(textField_39);
		
		JButton btnNewButton_7 = new JButton("L\u00F6schen");
		btnNewButton_7.setBounds(95, 135, 85, 20);
		panel_8_6.add(btnNewButton_7);
		
		JLabel lblNewLabel_1_6 = new JLabel("Suchen Sie mit ->");
		lblNewLabel_1_6.setBounds(10, 10, 108, 20);
		panel_7.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_2_6 = new JLabel("Personal Id: ");
		lblNewLabel_2_6.setBounds(130, 13, 77, 14);
		panel_7.add(lblNewLabel_2_6);
		
		textField_40 = new JTextField();
		textField_40.setColumns(10);
		textField_40.setBounds(200, 10, 120, 20);
		panel_7.add(textField_40);
		
		JLabel lblNewLabel_9_6 = new JLabel("oder");
		lblNewLabel_9_6.setBounds(348, 13, 27, 14);
		panel_7.add(lblNewLabel_9_6);
		
		JLabel lblNewLabel_3_6 = new JLabel("Name:");
		lblNewLabel_3_6.setBounds(399, 13, 48, 14);
		panel_7.add(lblNewLabel_3_6);
		
		textField_41 = new JTextField();
		textField_41.setColumns(10);
		textField_41.setBounds(444, 10, 96, 20);
		panel_7.add(textField_41);
		
		JButton btnNewButton_1_6 = new JButton("Suche");
		btnNewButton_1_6.setBounds(570, 10, 89, 20);
		panel_7.add(btnNewButton_1_6);
		
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
		btnQuit.setBounds(878, 11, 100, 30);
		contentPane.add(btnQuit);
		
		if(techniker.getGeschlecht().equals("M")) {
			JLabel lblNewLabel = new JLabel("Willkommen "+ "Herr " + techniker.getNachname());
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblNewLabel.setBounds(0, 0, 880, 14);
			contentPane.add(lblNewLabel);
		} else if (techniker.getGeschlecht().equals("F")) {
			JLabel lblNewLabel = new JLabel("Willkommen "+ "Frau " + techniker.getNachname());
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblNewLabel.setBounds(0, 0, 880, 14);
			contentPane.add(lblNewLabel);
		} else {
			JLabel lblNewLabel = new JLabel("Willkommen "+ "Sehr Geehrte " + techniker.getNachname());
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblNewLabel.setBounds(0, 0, 880, 14);
			contentPane.add(lblNewLabel);
		}
	}

}
