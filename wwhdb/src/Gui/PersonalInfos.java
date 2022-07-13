package Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import Entities.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Helpers.*;
import Entities.Admin;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class PersonalInfos extends JFrame {
	
	private JPanel contentPane;
	private JTextField textFieldId;
	private JTextField textFieldName;
	private JTextField textFieldFiliale;
	private JTextField textFieldGeschlecht;
	private JTextField textFieldAdress;
	private JTextField textFieldPasswort;
	private JLabel lblNewLabel_1_5;
	private JTextField textFieldTelnr;
	private JLabel lblNewLabel_1_6;
	private JTextField textFieldGeburtsdatum;
	private JLabel lblNewLabel_1_7;
	private JTextField textFieldNachname;
	private JLabel lblNewLabel_1_8;
	private JTextField textFieldPersonalId;
	private JLabel lblNewLabel_2;
	private JPasswordField passwordField;
	private JLabel lblNewLabel_3;
	String personalType;

	public PersonalInfos(Personal personal, Admin admin) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(600, 200, 560, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/*
		textFieldId.setText(personal.getId());
		System.out.println(personal.getId());
		textFieldPersonalId.setText(personal.getPersonalId());
		textFieldName.setText(personal.getName());
		textFieldNachname.setText(personal.getNachname());
		textFieldFiliale.setText(personal.getFiliale());
		textFieldGeburtsdatum.setText(personal.getGeburtsdatum());
		textFieldGeschlecht.setText(personal.getGeschlecht());
		textFieldAdress.setText(personal.getAdress());
		textFieldTelnr.setText(personal.getTelNr());
		textFieldPasswort.setText(personal.getPasswort());
		*/
		
		JLabel lblNewLabel = new JLabel("Personal Informationen");
		lblNewLabel.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(155, 20, 250, 30);
		contentPane.add(lblNewLabel);
		
		
		
		
		
		JLabel lblNewLabel_1 = new JLabel("ID:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(60, 75, 48, 15);
		contentPane.add(lblNewLabel_1);
		
		textFieldId = new JTextField(personal.getId());
		textFieldId.setBounds(50, 100, 200, 30);
		contentPane.add(textFieldId);
		textFieldId.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Name:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(60, 150, 48, 15);
		contentPane.add(lblNewLabel_1_1);
		
		textFieldName = new JTextField(personal.getName());
		textFieldName.setColumns(10);
		textFieldName.setBounds(50, 175, 200, 30);
		contentPane.add(textFieldName);
		
		JLabel lblNewLabel_1_2 = new JLabel("Filiale:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(60, 225, 48, 15);
		contentPane.add(lblNewLabel_1_2);
		
		textFieldFiliale = new JTextField(personal.getFiliale());
		textFieldFiliale.setColumns(10);
		textFieldFiliale.setBounds(50, 250, 200, 30);
		contentPane.add(textFieldFiliale);
		
		JLabel lblNewLabel_1_3 = new JLabel("Geschlecht:");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_3.setBounds(60, 300, 190, 15);
		contentPane.add(lblNewLabel_1_3);
		
		textFieldGeschlecht = new JTextField(personal.getGeschlecht());
		textFieldGeschlecht.setColumns(10);
		textFieldGeschlecht.setBounds(50, 325, 200, 30);
		contentPane.add(textFieldGeschlecht);
		
		JLabel lblNewLabel_1_4 = new JLabel("Adress:");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_4.setBounds(60, 375, 48, 15);
		contentPane.add(lblNewLabel_1_4);
		
		textFieldAdress = new JTextField(personal.getAdress());
		textFieldAdress.setColumns(10);
		textFieldAdress.setBounds(50, 400, 200, 30);
		contentPane.add(textFieldAdress);
		
		textFieldPasswort = new JTextField(personal.getPasswort());
		textFieldPasswort.setColumns(10);
		textFieldPasswort.setBounds(300, 400, 200, 30);
		contentPane.add(textFieldPasswort);
		
		lblNewLabel_1_5 = new JLabel("Passwort");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_5.setBounds(310, 375, 82, 15);
		contentPane.add(lblNewLabel_1_5);
		
		textFieldTelnr = new JTextField(personal.getTelNr());
		textFieldTelnr.setColumns(10);
		textFieldTelnr.setBounds(300, 325, 200, 30);
		contentPane.add(textFieldTelnr);
		
		lblNewLabel_1_6 = new JLabel("Telefon Nummer:");
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_6.setBounds(310, 300, 190, 15);
		contentPane.add(lblNewLabel_1_6);
		
		textFieldGeburtsdatum = new JTextField(personal.getGeburtsdatum());
		textFieldGeburtsdatum.setColumns(10);
		textFieldGeburtsdatum.setBounds(300, 250, 200, 30);
		contentPane.add(textFieldGeburtsdatum);
		
		lblNewLabel_1_7 = new JLabel("Geburtsdatum:");
		lblNewLabel_1_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_7.setBounds(310, 225, 190, 15);
		contentPane.add(lblNewLabel_1_7);
		
		textFieldNachname = new JTextField(personal.getNachname());
		textFieldNachname.setColumns(10);
		textFieldNachname.setBounds(300, 175, 200, 30);
		contentPane.add(textFieldNachname);
		
		lblNewLabel_1_8 = new JLabel("Nachname:");
		lblNewLabel_1_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_8.setBounds(310, 150, 190, 15);
		contentPane.add(lblNewLabel_1_8);
		
		textFieldPersonalId = new JTextField(personal.getPersonalId());
		textFieldPersonalId.setColumns(10);
		textFieldPersonalId.setBounds(300, 100, 200, 30);
		contentPane.add(textFieldPersonalId);
		
		lblNewLabel_2 = new JLabel("Personal ID:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(310, 75, 190, 15);
		contentPane.add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		passwordField.setBounds(150, 490, 250, 30);
		contentPane.add(passwordField);
		
		char pt = personal.getPersonalId().charAt(0);
		
		if(pt == '1') {
			lblNewLabel.setText("Verkäufer Informationen");
		} else if (pt == '2') {
			lblNewLabel.setText("Techniker Informationen");
		}
		
		JButton btnPersonalAktualisieren = new JButton("Personal Aktualisieren");
		btnPersonalAktualisieren.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Helper.confirm("update_personal")) {
					if(admin.getPasswort().equals(passwordField.getText())) {
						boolean control = admin.updatePersonal(textFieldId.getText(), textFieldPersonalId.getText(), textFieldPasswort.getText(), textFieldName.getText(), textFieldNachname.getText(), textFieldFiliale.getText(), textFieldGeburtsdatum.getText(), textFieldGeschlecht.getText(), textFieldAdress.getText(), textFieldTelnr.getText(), pt);
						if(control) {
							JOptionPane.showMessageDialog(null, "Personal wird erfolgreich aktualisiert!!!");
							dispose();

						} else {
							JOptionPane.showMessageDialog(null, "Aktualisierung des Personals fehlgeschlagen!!!");
						}
					} else {
						JOptionPane.showMessageDialog(null, "Falsch Passwort");
					}
				} 
				passwordField.setText(null);
			}
		});
		
		btnPersonalAktualisieren.setBounds(50, 537, 200, 30);
		contentPane.add(btnPersonalAktualisieren);
		
		JButton btnPersonalLöschen = new JButton("Personal L\u00F6schen");
		btnPersonalLöschen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Helper.confirm("delete_personal")) {
					if(admin.getPasswort().equals(passwordField.getText())) {
						boolean control = admin.deletePersonal(personal.getPersonalId(), pt);
						if(control) {
							JOptionPane.showMessageDialog(null, "Personal wird erfolgreich gelöscht!!!");
							dispose();
						} else {
							JOptionPane.showMessageDialog(null, "Löschen des Personals fehlgeschlagen!!!");
							passwordField.setText(null);
						}
					} else {
						JOptionPane.showMessageDialog(null, "Falsch Passwort!!");
						passwordField.setText(null);
					}
				} else {
					passwordField.setText(null);
				}
			}
		});
		btnPersonalLöschen.setBounds(300, 537, 200, 30);
		contentPane.add(btnPersonalLöschen);
		
		lblNewLabel_3 = new JLabel("Ihr Passwort:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(160, 465, 240, 15);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("*Bitte \u00E4ndern Sie die Informationen nicht");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setBounds(300, 569, 200, 14);
		contentPane.add(lblNewLabel_4);
		
		
	}
}
