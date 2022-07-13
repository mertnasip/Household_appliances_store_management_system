package Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JRadioButton;

public class ProduktInfos extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldID;
	private JTextField textFieldtÝTEL;
	private JTextField textFieldPreis;
	private JTextField textField_3;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textFieldName;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProduktInfos frame = new ProduktInfos();
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
	public ProduktInfos() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(600, 200, 560, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblProduktInformationen = new JLabel("Produkt Informationen");
		lblProduktInformationen.setHorizontalAlignment(SwingConstants.CENTER);
		lblProduktInformationen.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 14));
		lblProduktInformationen.setBounds(160, 27, 250, 30);
		contentPane.add(lblProduktInformationen);
		
		textFieldID = new JTextField((String) null);
		textFieldID.setColumns(10);
		textFieldID.setBounds(55, 107, 200, 30);
		contentPane.add(textFieldID);
		
		JLabel lblNewLabel_1 = new JLabel("ID:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(65, 82, 48, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Titel:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(315, 82, 190, 15);
		contentPane.add(lblNewLabel_2);
		
		textFieldtÝTEL = new JTextField((String) null);
		textFieldtÝTEL.setColumns(10);
		textFieldtÝTEL.setBounds(305, 107, 200, 30);
		contentPane.add(textFieldtÝTEL);
		
		JLabel lblNewLabel_1_8 = new JLabel("Preis:");
		lblNewLabel_1_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_8.setBounds(315, 157, 190, 15);
		contentPane.add(lblNewLabel_1_8);
		
		textFieldPreis = new JTextField((String) null);
		textFieldPreis.setColumns(10);
		textFieldPreis.setBounds(305, 182, 200, 30);
		contentPane.add(textFieldPreis);
		
		JLabel lblNewLabel_1_7 = new JLabel("Farbe:");
		lblNewLabel_1_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_7.setBounds(315, 232, 190, 15);
		contentPane.add(lblNewLabel_1_7);
		
		textField_3 = new JTextField((String) null);
		textField_3.setColumns(10);
		textField_3.setBounds(305, 257, 200, 30);
		contentPane.add(textField_3);
		
		textField_7 = new JTextField((String) null);
		textField_7.setColumns(10);
		textField_7.setBounds(55, 332, 200, 30);
		contentPane.add(textField_7);
		
		JLabel lblNewLabel_1_3 = new JLabel("Garnantiezeit:");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_3.setBounds(65, 307, 190, 15);
		contentPane.add(lblNewLabel_1_3);
		
		textField_8 = new JTextField((String) null);
		textField_8.setColumns(10);
		textField_8.setBounds(55, 257, 200, 30);
		contentPane.add(textField_8);
		
		JLabel lblNewLabel_1_2 = new JLabel("Filiale:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(65, 232, 48, 15);
		contentPane.add(lblNewLabel_1_2);
		
		textFieldName = new JTextField((String) null);
		textFieldName.setColumns(10);
		textFieldName.setBounds(55, 182, 200, 30);
		contentPane.add(textFieldName);
		
		JLabel lblNewLabel_1_1 = new JLabel("Produkt Name:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(65, 157, 161, 15);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("Ihr Passwort:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(170, 428, 240, 15);
		contentPane.add(lblNewLabel_3);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		passwordField.setBounds(160, 453, 250, 30);
		contentPane.add(passwordField);
		
		JButton btnPersonalAktualisieren = new JButton("Personal Aktualisieren");
		btnPersonalAktualisieren.setBounds(55, 515, 200, 30);
		contentPane.add(btnPersonalAktualisieren);
		
		JButton btnPersonalLöschen = new JButton("Personal L\u00F6schen");
		btnPersonalLöschen.setBounds(305, 515, 200, 30);
		contentPane.add(btnPersonalLöschen);
		
		JLabel lblNewLabel_4 = new JLabel("*Bitte \u00E4ndern Sie die Informationen nicht");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_4.setBounds(305, 547, 200, 14);
		contentPane.add(lblNewLabel_4);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Unverkaufte");
		rdbtnNewRadioButton.setBounds(301, 336, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Verkaufte");
		rdbtnNewRadioButton_1.setBounds(412, 336, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
	}
}
