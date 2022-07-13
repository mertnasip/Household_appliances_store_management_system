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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProduktAddGui extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldId;
	private JTextField textFieldName;
	private JTextField textFieldFiliale;
	private JTextField textFieldTitel;
	private JTextField textFieldPreis;
	private JTextField textFieldFarbe;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProduktAddGui frame = new ProduktAddGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public ProduktAddGui(Admin admin) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(600, 200, 560, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Produkt Informationen");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 14));
		lblNewLabel.setBounds(145, 22, 250, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Produkt ID:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(54, 92, 126, 15);
		contentPane.add(lblNewLabel_1);
		
		textFieldId = new JTextField((String) null);
		textFieldId.setColumns(10);
		textFieldId.setBounds(44, 117, 200, 30);
		contentPane.add(textFieldId);
		
		JLabel lblNewLabel_1_1 = new JLabel("Produkt Name:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(54, 167, 100, 15);
		contentPane.add(lblNewLabel_1_1);
		
		textFieldName = new JTextField((String) null);
		textFieldName.setColumns(10);
		textFieldName.setBounds(44, 192, 200, 30);
		contentPane.add(textFieldName);
		
		JLabel lblNewLabel_1_2 = new JLabel("Filiale:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(54, 242, 73, 15);
		contentPane.add(lblNewLabel_1_2);
		
		textFieldFiliale = new JTextField((String) null);
		textFieldFiliale.setColumns(10);
		textFieldFiliale.setBounds(44, 267, 200, 30);
		contentPane.add(textFieldFiliale);
		
		JLabel lblNewLabel_2 = new JLabel("Produkt Titel:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(304, 92, 190, 15);
		contentPane.add(lblNewLabel_2);
		
		textFieldTitel = new JTextField((String) null);
		textFieldTitel.setColumns(10);
		textFieldTitel.setBounds(294, 117, 200, 30);
		contentPane.add(textFieldTitel);
		
		JLabel lblNewLabel_1_8 = new JLabel("Preis:");
		lblNewLabel_1_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_8.setBounds(304, 167, 190, 15);
		contentPane.add(lblNewLabel_1_8);
		
		textFieldPreis = new JTextField((String) null);
		textFieldPreis.setColumns(10);
		textFieldPreis.setBounds(294, 192, 200, 30);
		contentPane.add(textFieldPreis);
		
		JLabel lblNewLabel_1_7 = new JLabel("Farbe:");
		lblNewLabel_1_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_7.setBounds(304, 242, 190, 15);
		contentPane.add(lblNewLabel_1_7);
		
		textFieldFarbe = new JTextField((String) null);
		textFieldFarbe.setColumns(10);
		textFieldFarbe.setBounds(294, 267, 200, 30);
		contentPane.add(textFieldFarbe);
		
		JLabel lblNewLabel_3 = new JLabel("Ihr Passwort:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(155, 360, 240, 15);
		contentPane.add(lblNewLabel_3);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		passwordField.setBounds(145, 385, 250, 30);
		contentPane.add(passwordField);
		
		JButton btnPersonalAdd = new JButton("Produkt Addieren");
		btnPersonalAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Helper.confirm("add_produkt")) {
					if(textFieldId.getText().length() == 8 && textFieldName.getText().length() !=0 && textFieldTitel.getText().length() !=0 && textFieldFiliale.getText().length() ==1 && textFieldPreis.getText().length() !=0 && textFieldFarbe.getText().length() !=0) {
						if(passwordField.getText().equals(admin.getPasswort())) {
							boolean control = admin.addProdukt(textFieldId.getText(),textFieldTitel.getText(),textFieldName.getText(),Double.parseDouble(textFieldPreis.getText()),textFieldFiliale.getText(),textFieldFarbe.getText());
							if(control) {
								JOptionPane.showMessageDialog(null, "Personal wird erfolgreich addiert!!!");
							} else {
								JOptionPane.showMessageDialog(null, "Addierung des Personals fehlgeschlagen!!!");
								passwordField.setText(null);
							}
						} else {
							JOptionPane.showMessageDialog(null, "Falsch Passwort!!!");
							passwordField.setText(null);
						}
					} else {
						JOptionPane.showMessageDialog(null, "Bitte geben Sie alle Informationen!!!");
						passwordField.setText(null);
					}
				} else {
					passwordField.setText(null);
				}
				
				
			}
		});
		btnPersonalAdd.setBounds(145, 426, 250, 30);
		contentPane.add(btnPersonalAdd);
		
	}
}
