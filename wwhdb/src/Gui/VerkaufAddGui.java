package Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Entities.Personal;
import Helpers.Helper;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class VerkaufAddGui extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldId;
	private JTextField textFieldPersonal;
	private JTextField textFieldPreis;
	private JTextField textFieldGarantiezeit;
	private JTextField textFieldKunde;
	private JTextField textFieldProdukt;
	private JTextField textFieldDatum;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VerkaufAddGui frame = new VerkaufAddGui();
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
	public VerkaufAddGui(Personal personal) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(600, 200, 560, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVerkaufaufzeichnungInformationen = new JLabel("Verkaufaufzeichnung Informationen");
		lblVerkaufaufzeichnungInformationen.setHorizontalAlignment(SwingConstants.CENTER);
		lblVerkaufaufzeichnungInformationen.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 14));
		lblVerkaufaufzeichnungInformationen.setBounds(123, 11, 297, 30);
		contentPane.add(lblVerkaufaufzeichnungInformationen);
		
		JLabel lblNewLabel_1 = new JLabel("ID:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(58, 66, 48, 15);
		contentPane.add(lblNewLabel_1);
		
		Random rnd = new Random();
	    int number = rnd.nextInt(999999);
		
		textFieldId = new JTextField("00"+String.format("%06d", number));
		textFieldId.setColumns(10);
		textFieldId.setBounds(48, 91, 200, 30);
		contentPane.add(textFieldId);
		
		JLabel lblNewLabel_1_1 = new JLabel("Personal ID:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(58, 141, 154, 15);
		contentPane.add(lblNewLabel_1_1);
		
		textFieldPersonal = new JTextField((String) null);
		textFieldPersonal.setColumns(10);
		textFieldPersonal.setBounds(48, 166, 200, 30);
		contentPane.add(textFieldPersonal);
		
		JLabel lblNewLabel_1_2 = new JLabel("Preis:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(58, 216, 86, 15);
		contentPane.add(lblNewLabel_1_2);
		
		textFieldPreis = new JTextField((String) null);
		textFieldPreis.setColumns(10);
		textFieldPreis.setBounds(48, 241, 200, 30);
		contentPane.add(textFieldPreis);
		
		JLabel lblNewLabel_1_3 = new JLabel("Garantiezeit:");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_3.setBounds(180, 293, 190, 15);
		contentPane.add(lblNewLabel_1_3);
		
		textFieldGarantiezeit = new JTextField((String) null);
		textFieldGarantiezeit.setColumns(10);
		textFieldGarantiezeit.setBounds(170, 318, 200, 30);
		contentPane.add(textFieldGarantiezeit);
		
		JLabel lblNewLabel_2 = new JLabel("Kunde ID:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(308, 66, 159, 15);
		contentPane.add(lblNewLabel_2);
		
		textFieldKunde = new JTextField((String) null);
		textFieldKunde.setColumns(10);
		textFieldKunde.setBounds(298, 91, 200, 30);
		contentPane.add(textFieldKunde);
		
		JLabel lblNewLabel_1_8 = new JLabel("Produkt ID:");
		lblNewLabel_1_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_8.setBounds(308, 141, 190, 15);
		contentPane.add(lblNewLabel_1_8);
		
		textFieldProdukt = new JTextField((String) null);
		textFieldProdukt.setColumns(10);
		textFieldProdukt.setBounds(298, 166, 200, 30);
		contentPane.add(textFieldProdukt);
		
		JLabel lblNewLabel_1_7 = new JLabel("Datum:");
		lblNewLabel_1_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_7.setBounds(308, 216, 190, 15);
		contentPane.add(lblNewLabel_1_7);
		
		textFieldDatum = new JTextField((String) null);
		textFieldDatum.setColumns(10);
		textFieldDatum.setBounds(298, 241, 200, 30);
		contentPane.add(textFieldDatum);
		
		JLabel lblNewLabel_3 = new JLabel("Ihr Passwort:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(58, 537, 240, 15);
		contentPane.add(lblNewLabel_3);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(48, 391, 449, 130);
		contentPane.add(textArea);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		passwordField.setBounds(48, 562, 250, 30);
		contentPane.add(passwordField);

		JButton btnVerkaufAdd = new JButton("Verkauf Addieren");
		btnVerkaufAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Helper.confirm("add_verkauf")) {
					if(passwordField.getText().equals(personal.getPasswort())) {
						if(textFieldId.getText().length() == 8 && textFieldKunde.getText().length() == 11 && textFieldPersonal.getText().length() == 8 && textFieldProdukt.getText().length() == 8 && textFieldPreis.getText().length() != 0 && textFieldDatum.getText().length() == 10 && textFieldGarantiezeit.getText().length() == 10) {
							if(personal.addAufzeichnung(textFieldId.getText(), textFieldKunde.getText(), textFieldPersonal.getText(), textFieldProdukt.getText(), textFieldPreis.getText(), textFieldDatum.getText(), textFieldGarantiezeit.getText(), textArea.getText(), '0')){
								JOptionPane.showMessageDialog(null, "Verkauf wird erfolgreich addiert!!!");
								dispose();
							} else {
								JOptionPane.showMessageDialog(null, "Verkauf wird nicht erfolgreich addiert!!!");
							}
						} else {
							JOptionPane.showMessageDialog(null, "Bitte geben Sie richtige Eingaben!!!");
						}
					}else {
						JOptionPane.showMessageDialog(null, "Falsch Passwort!!!");
						passwordField.setText(null);
					}
				}
			}
		});
		btnVerkaufAdd.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnVerkaufAdd.setBounds(308, 562, 190, 30);
		contentPane.add(btnVerkaufAdd);
		
		JLabel lblNewLabel = new JLabel("Weitere Informationen:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(58, 367, 190, 14);
		contentPane.add(lblNewLabel);
		
		
	}
}
