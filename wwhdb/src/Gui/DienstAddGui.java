package Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Entities.Techniker;
import Helpers.Helper;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class DienstAddGui extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldId;
	private JTextField textFieldKunde;
	private JTextField textFieldProdukt;
	private JTextField textFieldDatum;
	private JTextField textFieldPersonal;
	private JTextField textFieldPreis;
	private JTextField textFieldGarantiezeit;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DienstAddGui frame = new DienstAddGui();
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
	public DienstAddGui(Techniker techniker) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(600, 200, 560, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDienstaufzeichnungInformationen = new JLabel("Dienstaufzeichnung Informationen");
		lblDienstaufzeichnungInformationen.setHorizontalAlignment(SwingConstants.CENTER);
		lblDienstaufzeichnungInformationen.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 14));
		lblDienstaufzeichnungInformationen.setBounds(121, 11, 297, 30);
		contentPane.add(lblDienstaufzeichnungInformationen);
		
		JLabel lblNewLabel_1 = new JLabel("ID:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(56, 66, 48, 15);
		contentPane.add(lblNewLabel_1);
		
		Random rnd = new Random();
	    int number = rnd.nextInt(999999);
		
		textFieldId = new JTextField("10"+String.format("%06d", number));
		textFieldId.setColumns(10);
		textFieldId.setBounds(46, 91, 200, 30);
		contentPane.add(textFieldId);
		
		JLabel lblNewLabel_2 = new JLabel("Kunde ID:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(306, 66, 159, 15);
		contentPane.add(lblNewLabel_2);
		
		textFieldKunde = new JTextField((String) null);
		textFieldKunde.setColumns(10);
		textFieldKunde.setBounds(296, 91, 200, 30);
		contentPane.add(textFieldKunde);
		
		JLabel lblNewLabel_1_8 = new JLabel("Produkt ID:");
		lblNewLabel_1_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_8.setBounds(306, 141, 190, 15);
		contentPane.add(lblNewLabel_1_8);
		
		textFieldProdukt = new JTextField((String) null);
		textFieldProdukt.setColumns(10);
		textFieldProdukt.setBounds(296, 166, 200, 30);
		contentPane.add(textFieldProdukt);
		
		JLabel lblNewLabel_1_7 = new JLabel("Datum:");
		lblNewLabel_1_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_7.setBounds(306, 216, 190, 15);
		contentPane.add(lblNewLabel_1_7);
		
		textFieldDatum = new JTextField((String) null);
		textFieldDatum.setColumns(10);
		textFieldDatum.setBounds(296, 241, 200, 30);
		contentPane.add(textFieldDatum);
		
		JLabel lblNewLabel_1_1 = new JLabel("Personal ID:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(56, 141, 154, 15);
		contentPane.add(lblNewLabel_1_1);
		
		textFieldPersonal = new JTextField((String) null);
		textFieldPersonal.setColumns(10);
		textFieldPersonal.setBounds(46, 166, 200, 30);
		contentPane.add(textFieldPersonal);
		
		JLabel lblNewLabel_1_2 = new JLabel("Preis:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(56, 216, 86, 15);
		contentPane.add(lblNewLabel_1_2);
		
		textFieldPreis = new JTextField((String) null);
		textFieldPreis.setColumns(10);
		textFieldPreis.setBounds(46, 241, 200, 30);
		contentPane.add(textFieldPreis);
		
		JLabel lblNewLabel_1_3 = new JLabel("Garantiezeit:");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_3.setBounds(178, 293, 190, 15);
		contentPane.add(lblNewLabel_1_3);
		
		textFieldGarantiezeit = new JTextField((String) null);
		textFieldGarantiezeit.setColumns(10);
		textFieldGarantiezeit.setBounds(168, 318, 200, 30);
		contentPane.add(textFieldGarantiezeit);
		
		JLabel lblNewLabel = new JLabel("Weitere Informationen:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(56, 367, 190, 14);
		contentPane.add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(46, 391, 449, 130);
		contentPane.add(textArea);
		
		JLabel lblNewLabel_3 = new JLabel("Ihr Passwort:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(56, 537, 240, 15);
		contentPane.add(lblNewLabel_3);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		passwordField.setBounds(46, 562, 250, 30);
		contentPane.add(passwordField);
		
		JButton btnDienstAddieren = new JButton("Dienst Addieren");
		btnDienstAddieren.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Helper.confirm("add_dienst")) {
					if(passwordField.getText().equals(techniker.getPasswort())) {
						if(textFieldId.getText().length() == 8 && textFieldKunde.getText().length() == 11 && textFieldPersonal.getText().length() == 8 && textFieldProdukt.getText().length() == 8 && textFieldPreis.getText().length() != 0 && textFieldDatum.getText().length() == 10 && textFieldGarantiezeit.getText().length() == 10) {
							if(techniker.addAufzeichnung(textFieldId.getText(), textFieldKunde.getText(), textFieldPersonal.getText(), textFieldProdukt.getText(), textFieldPreis.getText(), textFieldDatum.getText(), textFieldGarantiezeit.getText(), textArea.getText(), '1')){
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
		btnDienstAddieren.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnDienstAddieren.setBounds(306, 562, 190, 30);
		contentPane.add(btnDienstAddieren);
	}
}
