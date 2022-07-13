package Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Entities.Kunde;
import Entities.Personal;
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

public class KundeAddGui extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldId;
	private JTextField textFieldName;
	private JTextField textFieldNachname;
	private JTextField textFieldFiliale;
	private JTextField textFieldGeburtsdatum;
	private JTextField textFieldGeschlecht;
	private JTextField textFieldTelnr;
	private JTextField textFieldAdress;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KundeAddGui frame = new KundeAddGui();
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
	public KundeAddGui(Personal personal) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(600, 200, 560, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblKundeInformationen = new JLabel("Kunde Informationen");
		lblKundeInformationen.setHorizontalAlignment(SwingConstants.CENTER);
		lblKundeInformationen.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 14));
		lblKundeInformationen.setBounds(143, 25, 250, 30);
		contentPane.add(lblKundeInformationen);
		
		JLabel lblNewLabel_1 = new JLabel("ID:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(59, 86, 48, 15);
		contentPane.add(lblNewLabel_1);
		
		textFieldId = new JTextField((String) null);
		textFieldId.setColumns(10);
		textFieldId.setBounds(49, 111, 200, 30);
		contentPane.add(textFieldId);
		
		JLabel lblNewLabel_1_1 = new JLabel("Name:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(309, 86, 48, 15);
		contentPane.add(lblNewLabel_1_1);
		
		textFieldName = new JTextField((String) null);
		textFieldName.setColumns(10);
		textFieldName.setBounds(299, 111, 200, 30);
		contentPane.add(textFieldName);
		
		JLabel lblNewLabel_1_8 = new JLabel("Nachname:");
		lblNewLabel_1_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_8.setBounds(59, 158, 190, 15);
		contentPane.add(lblNewLabel_1_8);
		
		textFieldNachname = new JTextField((String) null);
		textFieldNachname.setColumns(10);
		textFieldNachname.setBounds(49, 183, 200, 30);
		contentPane.add(textFieldNachname);
		
		JLabel lblNewLabel_1_2 = new JLabel("Filiale:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(309, 158, 48, 15);
		contentPane.add(lblNewLabel_1_2);
		
		textFieldFiliale = new JTextField((String) null);
		textFieldFiliale.setColumns(10);
		textFieldFiliale.setBounds(299, 183, 200, 30);
		contentPane.add(textFieldFiliale);
		
		JLabel lblNewLabel_1_7 = new JLabel("Geburtsdatum:");
		lblNewLabel_1_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_7.setBounds(59, 234, 190, 15);
		contentPane.add(lblNewLabel_1_7);
		
		textFieldGeburtsdatum = new JTextField((String) null);
		textFieldGeburtsdatum.setColumns(10);
		textFieldGeburtsdatum.setBounds(49, 259, 200, 30);
		contentPane.add(textFieldGeburtsdatum);
		
		JLabel lblNewLabel_1_3 = new JLabel("Geschlecht:");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_3.setBounds(309, 234, 190, 15);
		contentPane.add(lblNewLabel_1_3);
		
		textFieldGeschlecht = new JTextField((String) null);
		textFieldGeschlecht.setColumns(10);
		textFieldGeschlecht.setBounds(299, 259, 200, 30);
		contentPane.add(textFieldGeschlecht);
		
		JLabel lblNewLabel_1_6 = new JLabel("Telefon Nummer:");
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_6.setBounds(309, 311, 190, 15);
		contentPane.add(lblNewLabel_1_6);
		
		textFieldTelnr = new JTextField((String) null);
		textFieldTelnr.setColumns(10);
		textFieldTelnr.setBounds(299, 336, 200, 30);
		contentPane.add(textFieldTelnr);
		
		JLabel lblNewLabel_1_4 = new JLabel("Adress:");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_4.setBounds(59, 311, 48, 15);
		contentPane.add(lblNewLabel_1_4);
		
		textFieldAdress = new JTextField((String) null);
		textFieldAdress.setColumns(10);
		textFieldAdress.setBounds(49, 336, 200, 30);
		contentPane.add(textFieldAdress);
		
		JLabel lblNewLabel_3 = new JLabel("Ihr Passwort:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(164, 436, 240, 15);
		contentPane.add(lblNewLabel_3);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		passwordField.setBounds(154, 461, 250, 30);
		contentPane.add(passwordField);
		
		JButton btnKundeAdd = new JButton("Personal Addieren");
		btnKundeAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Helper.confirm("add_kunde")) {
					if(passwordField.getText().length() == 8) {
						if(textFieldId.getText().length() == 11 && textFieldName.getText().length() != 0 && textFieldNachname.getText().length() !=0 && textFieldFiliale.getText().length() !=0 && textFieldGeburtsdatum.getText().length() !=0 && textFieldGeschlecht.getText().length() !=0 && textFieldAdress.getText().length() !=0 && textFieldTelnr.getText().length() !=0) {
							Kunde kunde = new Kunde(textFieldId.getText(),textFieldName.getText(),textFieldNachname.getText(),textFieldFiliale.getText(),textFieldGeburtsdatum.getText(),textFieldGeschlecht.getText(),textFieldAdress.getText(),textFieldTelnr.getText());
							if(personal.addKunde(kunde)) {
								JOptionPane.showMessageDialog(null, "Kunde wird erfolgreich addiert!!!");
								dispose();
							} else {
								JOptionPane.showMessageDialog(null, "Addierung des Kundes fehlgeschlagen!!!");
							}
						} else {
							JOptionPane.showMessageDialog(null, "Bitte geben Sie richtige Informationen!!");
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
		btnKundeAdd.setBounds(154, 502, 250, 30);
		contentPane.add(btnKundeAdd);
	}

}
