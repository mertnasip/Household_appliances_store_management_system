package Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Entities.Admin;
import Helpers.Helper;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;

public class PersonalAddGui extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldId;
	private JTextField textFieldName;
	private JTextField textFieldFiliale;
	private JTextField textFieldGeschlecht;
	private JTextField textFieldAdress;
	private JTextField textFieldPasswort;
	private JTextField textFieldTelnr;
	private JTextField textFieldGeburtsdatum;
	private JTextField textFieldNachname;
	private JTextField textFieldPersonalId;
	private JPasswordField passwordField;

	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PersonalAddGui frame = new PersonalAddGui(new Admin());
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/
	
	public PersonalAddGui(Admin admin) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(600, 200, 560, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Personal Informationen");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 14));
		lblNewLabel.setBounds(148, 22, 250, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(53, 77, 48, 15);
		contentPane.add(lblNewLabel_1);
		
		textFieldId = new JTextField((String) null);
		textFieldId.setColumns(10);
		textFieldId.setBounds(43, 102, 200, 30);
		contentPane.add(textFieldId);
		
		textFieldName = new JTextField((String) null);
		textFieldName.setColumns(10);
		textFieldName.setBounds(43, 177, 200, 30);
		contentPane.add(textFieldName);
		
		JLabel lblNewLabel_1_1 = new JLabel("Name:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(53, 152, 48, 15);
		contentPane.add(lblNewLabel_1_1);
		
		textFieldFiliale = new JTextField((String) null);
		textFieldFiliale.setColumns(10);
		textFieldFiliale.setBounds(43, 252, 200, 30);
		contentPane.add(textFieldFiliale);
		
		JLabel lblNewLabel_1_2 = new JLabel("Filiale:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(53, 227, 48, 15);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Geschlecht:");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_3.setBounds(53, 302, 190, 15);
		contentPane.add(lblNewLabel_1_3);
		
		textFieldGeschlecht = new JTextField((String) null);
		textFieldGeschlecht.setColumns(10);
		textFieldGeschlecht.setBounds(43, 327, 200, 30);
		contentPane.add(textFieldGeschlecht);
		
		JLabel lblNewLabel_1_4 = new JLabel("Adress:");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_4.setBounds(53, 377, 48, 15);
		contentPane.add(lblNewLabel_1_4);
		
		textFieldAdress = new JTextField((String) null);
		textFieldAdress.setColumns(10);
		textFieldAdress.setBounds(43, 402, 200, 30);
		contentPane.add(textFieldAdress);
		
		textFieldPasswort = new JTextField((String) null);
		textFieldPasswort.setColumns(10);
		textFieldPasswort.setBounds(293, 402, 200, 30);
		contentPane.add(textFieldPasswort);
		
		JLabel lblNewLabel_1_5 = new JLabel("Passwort");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_5.setBounds(303, 377, 82, 15);
		contentPane.add(lblNewLabel_1_5);
		
		textFieldTelnr = new JTextField((String) null);
		textFieldTelnr.setColumns(10);
		textFieldTelnr.setBounds(293, 327, 200, 30);
		contentPane.add(textFieldTelnr);
		
		JLabel lblNewLabel_1_6 = new JLabel("Telefon Nummer:");
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_6.setBounds(303, 302, 190, 15);
		contentPane.add(lblNewLabel_1_6);
		
		textFieldGeburtsdatum = new JTextField((String) null);
		textFieldGeburtsdatum.setColumns(10);
		textFieldGeburtsdatum.setBounds(293, 252, 200, 30);
		contentPane.add(textFieldGeburtsdatum);
		
		JLabel lblNewLabel_1_7 = new JLabel("Geburtsdatum:");
		lblNewLabel_1_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_7.setBounds(303, 227, 190, 15);
		contentPane.add(lblNewLabel_1_7);
		
		textFieldNachname = new JTextField((String) null);
		textFieldNachname.setColumns(10);
		textFieldNachname.setBounds(293, 177, 200, 30);
		contentPane.add(textFieldNachname);
		
		JLabel lblNewLabel_1_8 = new JLabel("Nachname:");
		lblNewLabel_1_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_8.setBounds(303, 152, 190, 15);
		contentPane.add(lblNewLabel_1_8);
		
		textFieldPersonalId = new JTextField((String) null);
		textFieldPersonalId.setColumns(10);
		textFieldPersonalId.setBounds(293, 102, 200, 30);
		contentPane.add(textFieldPersonalId);
		
		JLabel lblNewLabel_2 = new JLabel("Personal ID:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(303, 77, 190, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Ihr Passwort:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(153, 497, 240, 15);
		contentPane.add(lblNewLabel_3);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		passwordField.setBounds(143, 522, 250, 30);
		contentPane.add(passwordField);
		
		JRadioButton btnVerkaeufer = new JRadioButton("Verk\u00E4ufer");
		btnVerkaeufer.setBounds(216, 456, 82, 23);
		contentPane.add(btnVerkaeufer);
		
		JRadioButton btnTechniker = new JRadioButton("Techniker");
		btnTechniker.setBounds(300, 456, 110, 23);
		contentPane.add(btnTechniker);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(btnVerkaeufer);
		bg.add(btnTechniker);
		
		JButton btnPersonalAdd = new JButton("Personal Addieren");
		btnPersonalAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Helper.confirm("add_personal")) {
					if(passwordField.getText().equals(admin.getPasswort())) {
						if(btnVerkaeufer.isSelected()) {
							boolean control = admin.addPersonal(textFieldId.getText(), textFieldPersonalId.getText(), textFieldPasswort.getText(), textFieldName.getText(), textFieldNachname.getText(), textFieldFiliale.getText(), textFieldGeburtsdatum.getText(), textFieldGeschlecht.getText(), textFieldAdress.getText(), textFieldTelnr.getText(), '1');
							if(control) {
								JOptionPane.showMessageDialog(null, "Personal wird erfolgreich addiert!!!");
								dispose();
							} else {
								JOptionPane.showMessageDialog(null, "Addierung des Personals fehlgeschlagen!!!");
							}
						} else if(btnTechniker.isSelected()) {
							boolean control = admin.addPersonal(textFieldId.getText(), textFieldPersonalId.getText(), textFieldPasswort.getText(), textFieldName.getText(), textFieldNachname.getText(), textFieldFiliale.getText(), textFieldGeburtsdatum.getText(), textFieldGeschlecht.getText(), textFieldAdress.getText(), textFieldTelnr.getText(), '2');
							if(control) {
								
							} else {
								JOptionPane.showMessageDialog(null, "Addierung des Personals fehlgeschlagen!!!");
							}
						} else {
							JOptionPane.showMessageDialog(null, "Bitte wählen Sie eine Personalrolle!");
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
		btnPersonalAdd.setBounds(143, 563, 250, 30);
		contentPane.add(btnPersonalAdd);
		
		
		
		JLabel lblNewLabel_4 = new JLabel("Personal Rolle:");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(110, 460, 100, 14);
		contentPane.add(lblNewLabel_4);
	}
}
