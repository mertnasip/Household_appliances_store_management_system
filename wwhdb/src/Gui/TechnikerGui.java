package Gui;

import Entities.*;
import Helpers.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import javax.swing.border.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class TechnikerGui extends JFrame {
	
	static Techniker techniker = new Techniker();
	
	private JPanel contentPane;
	private JTextField textFieldProduktId;
	private JTextField textFieldProduktTitel;
	private JTextField textFieldProduktName;
	private JTextField textFieldMinPreis;
	private JTextField textFieldMaxPreis;
	private JTextField textFieldProduktFiliale;
	private JTextField textFieldProduktFarbe;
	private static JTable produktTable;
	private static JTable kundeTable;
	private static JTable aufzeichnungTable;
	private static DefaultTableModel produktModel = null;
	private static DefaultTableModel kundeModel = null;
	private static DefaultTableModel aufzeichnungModel = null;
	private static Object[] produktData = new Object[8];
	private static Object[] kundeData = new Object[8];
	private static Object[] aufzeichnungData = new Object[8];
	private static int produktSum = 0;
	private static int kundeSum = 0;
	private static int aufzeichnungSum = 0;
	private static JLabel textProduktSum = new JLabel(produktSum + " Produkt gefunden");
	private static JLabel textKundeSum = new JLabel(kundeSum + " Kunde gefunden");
	private static JLabel textAufzeichnungSum = new JLabel(aufzeichnungSum + " Aufzeichnung gefunden");
	private static String bufferProdukt;
	private JTextField textFieldKundeId;
	private JTextField textFieldKundeName;
	private JTextField textFieldKundeNachname;
	private JTextField textFieldKundeFiliale;
	private JTextField textFieldAufzeichnungId;
	private JTextField textFieldAufzeichnungPersonal;
	private JTextField textFieldAufzeichnungKunde;
	private JTextField textFieldAufzeichnungProdukt;
	private JTextField textFieldAufzeichnungIdDelete;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
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
	}*/

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public TechnikerGui(Entities.Techniker techniker) throws SQLException {
		setTitle("Weiﬂwarenh‰ndler Managment System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 200, 1250, 850);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		produktModel = new DefaultTableModel();
		Object[] colProduktName = new Object[7];
		colProduktName[0] = "ID";
		colProduktName[1] = "TITEL";
		colProduktName[2] = "NAME";
		colProduktName[3] = "PREIS";
		colProduktName[4] = "GARANTIEZEIT";
		colProduktName[5] = "FILIALE";
		colProduktName[6] = "FARBE";
		produktModel.setColumnIdentifiers(colProduktName);
		for(int i = 0; i<techniker.getProduktList().size(); i++) {
			produktData[0] = techniker.getProduktList().get(i).getProduktId();
			produktData[1] = techniker.getProduktList().get(i).getProduktTitel();
			produktData[2] = techniker.getProduktList().get(i).getProduktName();
			produktData[3] = techniker.getProduktList().get(i).getPreis();
			produktData[4] = techniker.getProduktList().get(i).getGarantiezeit();
			produktData[5] = techniker.getProduktList().get(i).getFiliale();
			produktData[6] = techniker.getProduktList().get(i).getFarbe();
			produktModel.addRow(produktData);
			produktSum++;
			textProduktSum.setText(produktSum + " Produkt gefunden");
		}
		kundeModel = new DefaultTableModel();
		Object[] colKundeName = new Object[8];
		colKundeName[0] = "ID";
		colKundeName[1] = "NAME";
		colKundeName[2] = "NACHNAME";
		colKundeName[3] = "FILIALE";
		colKundeName[4] = "GEBURTSDATUM";
		colKundeName[5] = "GESCHLECHT";
		colKundeName[6] = "ADRESS";
		colKundeName[7] = "TEL Nr.";
		kundeModel.setColumnIdentifiers(colKundeName);
		for(int i = 0; i<techniker.getKundeList().size(); i++) {
			kundeData[0] = techniker.getKundeList().get(i).getId();
			kundeData[1] = techniker.getKundeList().get(i).getName();
			kundeData[2] = techniker.getKundeList().get(i).getNachname();
			kundeData[3] = techniker.getKundeList().get(i).getFiliale();
			kundeData[4] = techniker.getKundeList().get(i).getGeburtsdatum();
			kundeData[5] = techniker.getKundeList().get(i).getGeschlecht();
			kundeData[6] = techniker.getKundeList().get(i).getAdress();
			kundeData[7] = techniker.getKundeList().get(i).getTelNr();
			kundeModel.addRow(kundeData);
			kundeSum++;
			textKundeSum.setText(kundeSum + " Kunde gefunden");
		}
		aufzeichnungModel = new DefaultTableModel();
		Object[] colAufzeichnungName = new Object[8];
		colAufzeichnungName[0] = "ID";
		colAufzeichnungName[1] = "KUNDE ID";
		colAufzeichnungName[2] = "PERSONAL ID";
		colAufzeichnungName[3] = "PRODUKT ID";
		colAufzeichnungName[4] = "PRE›S";
		colAufzeichnungName[5] = "DATUM";
		colAufzeichnungName[6] = "GARANT›EZE›T";
		colAufzeichnungName[7] = "INFOS";
		aufzeichnungModel.setColumnIdentifiers(colAufzeichnungName);
		for(int i = 0; i<techniker.getAufzeichnungList().size(); i++) {
			aufzeichnungData[0] = techniker.getAufzeichnungList().get(i).getId();
			aufzeichnungData[1] = techniker.getAufzeichnungList().get(i).getKunde();
			aufzeichnungData[2] = techniker.getAufzeichnungList().get(i).getPersonal();
			aufzeichnungData[3] = techniker.getAufzeichnungList().get(i).getProdukt();
			aufzeichnungData[4] = techniker.getAufzeichnungList().get(i).getPreis();
			aufzeichnungData[5] = techniker.getAufzeichnungList().get(i).getDatum();
			aufzeichnungData[6] = techniker.getAufzeichnungList().get(i).getGarantiezeit();
			aufzeichnungData[7] = techniker.getAufzeichnungList().get(i).getInfos();
			aufzeichnungModel.addRow(aufzeichnungData);
			aufzeichnungSum++;
			textAufzeichnungSum.setText(aufzeichnungSum + " Aufzeichnung gefunden");
		}
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 50, 1218, 754);
		contentPane.add(tabbedPane);
		
		JPanel ProduktVerwaltung = new JPanel();
		tabbedPane.addTab("Produkt Verwaltung", null, ProduktVerwaltung, null);
		ProduktVerwaltung.setLayout(null);
		
		JScrollPane produktListe = new JScrollPane();
		produktListe.setBounds(10, 11, 927, 706);
		ProduktVerwaltung.add(produktListe);
		
		produktTable = new JTable(produktModel);
		produktListe.setViewportView(produktTable);
		
		JLabel lblNewLabel_8 = new JLabel("Produkt Suche");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_8.setBounds(1029, 22, 109, 14);
		ProduktVerwaltung.add(lblNewLabel_8);
		
		JLabel lblNewLabel_7_4 = new JLabel("Produkt ID:");
		lblNewLabel_7_4.setBounds(972, 65, 181, 15);
		ProduktVerwaltung.add(lblNewLabel_7_4);
		
		textFieldProduktId = new JTextField();
		textFieldProduktId.setColumns(10);
		textFieldProduktId.setBounds(957, 85, 237, 18);
		ProduktVerwaltung.add(textFieldProduktId);
		
		JLabel lblNewLabel_7_1_3 = new JLabel("Produkt Titel:");
		lblNewLabel_7_1_3.setBounds(972, 118, 181, 15);
		ProduktVerwaltung.add(lblNewLabel_7_1_3);
		
		textFieldProduktTitel = new JTextField();
		textFieldProduktTitel.setColumns(10);
		textFieldProduktTitel.setBounds(957, 138, 237, 18);
		ProduktVerwaltung.add(textFieldProduktTitel);
		
		JLabel lblNewLabel_7_2_1 = new JLabel("Produkt Name:");
		lblNewLabel_7_2_1.setBounds(972, 170, 122, 15);
		ProduktVerwaltung.add(lblNewLabel_7_2_1);
		
		textFieldProduktName = new JTextField();
		textFieldProduktName.setColumns(10);
		textFieldProduktName.setBounds(957, 190, 237, 18);
		ProduktVerwaltung.add(textFieldProduktName);
		
		textFieldMinPreis = new JTextField();
		textFieldMinPreis.setColumns(10);
		textFieldMinPreis.setBounds(957, 240, 90, 18);
		//ProduktVerwaltung.add(textFieldMinPreis);
		
		textFieldMaxPreis = new JTextField();
		textFieldMaxPreis.setColumns(10);
		textFieldMaxPreis.setBounds(1104, 239, 90, 18);
		//ProduktVerwaltung.add(textFieldMaxPreis);
		
		JLabel lblNewLabel_7_3_1 = new JLabel("Filiale:");
		lblNewLabel_7_3_1.setBounds(972, 219, 48, 15);
		ProduktVerwaltung.add(lblNewLabel_7_3_1);
		
		textFieldProduktFiliale = new JTextField();
		textFieldProduktFiliale.setColumns(10);
		textFieldProduktFiliale.setBounds(957, 239, 237, 18);
		ProduktVerwaltung.add(textFieldProduktFiliale);
		
		JLabel lblNewLabel_7_3_1_1 = new JLabel("Farbe:");
		lblNewLabel_7_3_1_1.setBounds(972, 268, 208, 15);
		ProduktVerwaltung.add(lblNewLabel_7_3_1_1);
		
		textFieldProduktFarbe = new JTextField();
		textFieldProduktFarbe.setColumns(10);
		textFieldProduktFarbe.setBounds(957, 288, 237, 18);
		ProduktVerwaltung.add(textFieldProduktFarbe);
		
		ButtonGroup produktSucheBtnGroup = new ButtonGroup();
		
		JRadioButton rdbtnUnverkaufte = new JRadioButton("unverkaufte");
		rdbtnUnverkaufte.setSelected(true);
		rdbtnUnverkaufte.setBounds(972, 321, 109, 23);
		ProduktVerwaltung.add(rdbtnUnverkaufte);
		produktSucheBtnGroup.add(rdbtnUnverkaufte);
		
		JRadioButton rdbtnAlleProdukte = new JRadioButton("alle Produkte");
		rdbtnAlleProdukte.setBounds(1022, 347, 116, 23);
		ProduktVerwaltung.add(rdbtnAlleProdukte);
		produktSucheBtnGroup.add(rdbtnAlleProdukte);
		
		JRadioButton rdbtnVerkaufte = new JRadioButton("verkaufte");
		rdbtnVerkaufte.setBounds(1083, 321, 111, 23);
		ProduktVerwaltung.add(rdbtnVerkaufte);
		produktSucheBtnGroup.add(rdbtnVerkaufte);
		
		JButton btnProduktSuche = new JButton("Produkt Suche");
		btnProduktSuche.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(rdbtnUnverkaufte.isSelected()) {
						sucheProduktModel(textFieldProduktId.getText(),textFieldProduktTitel.getText(),textFieldProduktName.getText(),"","",textFieldProduktFiliale.getText(),textFieldProduktFarbe.getText(), '1');
					} else if(rdbtnVerkaufte.isSelected()) {
						sucheProduktModel(textFieldProduktId.getText(),textFieldProduktTitel.getText(),textFieldProduktName.getText(),"","",textFieldProduktFiliale.getText(),textFieldProduktFarbe.getText(), '2');
					} else {	
						sucheProduktModel(textFieldProduktId.getText(),textFieldProduktTitel.getText(),textFieldProduktName.getText(),"","",textFieldProduktFiliale.getText(),textFieldProduktFarbe.getText(), '9');
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
			}
		});
		btnProduktSuche.setBounds(972, 377, 208, 25);
		ProduktVerwaltung.add(btnProduktSuche);
		
		textProduktSum.setHorizontalAlignment(SwingConstants.CENTER);
		textProduktSum.setBounds(995, 407, 158, 14);
		ProduktVerwaltung.add(textProduktSum);
		
		JPanel kundeVerwaltung = new JPanel();
		tabbedPane.addTab("Kunde Verwaltung", null, kundeVerwaltung, null);
		kundeVerwaltung.setLayout(null);
		
		JScrollPane kundeListe = new JScrollPane();
		kundeListe.setBounds(10, 11, 927, 706);
		kundeVerwaltung.add(kundeListe);
		
		kundeTable = new JTable(kundeModel);
		kundeListe.setViewportView(kundeTable);
		
		JLabel lblNewLabel_8_1 = new JLabel("Kunde Suche");
		lblNewLabel_8_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_8_1.setBounds(1029, 22, 109, 14);
		kundeVerwaltung.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_7_4_1 = new JLabel("Kunde ID:");
		lblNewLabel_7_4_1.setBounds(972, 65, 181, 15);
		kundeVerwaltung.add(lblNewLabel_7_4_1);
		
		textFieldKundeId = new JTextField();
		textFieldKundeId.setColumns(10);
		textFieldKundeId.setBounds(957, 85, 237, 18);
		kundeVerwaltung.add(textFieldKundeId);
		
		JLabel lblNewLabel_7_1_3_1 = new JLabel("Name:");
		lblNewLabel_7_1_3_1.setBounds(972, 118, 181, 15);
		kundeVerwaltung.add(lblNewLabel_7_1_3_1);
		
		textFieldKundeName = new JTextField();
		textFieldKundeName.setColumns(10);
		textFieldKundeName.setBounds(957, 138, 237, 18);
		kundeVerwaltung.add(textFieldKundeName);
		
		JLabel lblNewLabel_7_2_1_1 = new JLabel("Nachname:");
		lblNewLabel_7_2_1_1.setBounds(972, 170, 122, 15);
		kundeVerwaltung.add(lblNewLabel_7_2_1_1);
		
		textFieldKundeNachname = new JTextField();
		textFieldKundeNachname.setColumns(10);
		textFieldKundeNachname.setBounds(957, 190, 237, 18);
		kundeVerwaltung.add(textFieldKundeNachname);
		
		JLabel lblNewLabel_7_3_1_2 = new JLabel("Filiale:");
		lblNewLabel_7_3_1_2.setBounds(972, 227, 48, 15);
		kundeVerwaltung.add(lblNewLabel_7_3_1_2);
		
		textFieldKundeFiliale = new JTextField();
		textFieldKundeFiliale.setColumns(10);
		textFieldKundeFiliale.setBounds(957, 247, 237, 18);
		kundeVerwaltung.add(textFieldKundeFiliale);
		
		JButton btnKundeSuche = new JButton("Kunde Suche");
		btnKundeSuche.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					sucheKundeModel(textFieldKundeId.getText(),textFieldKundeName.getText(),textFieldKundeNachname.getText(),textFieldKundeFiliale.getText());
					textFieldKundeId.setText(null);
					textFieldKundeName.setText(null);
					textFieldKundeNachname.setText(null);
					textFieldKundeFiliale.setText(null);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnKundeSuche.setBounds(972, 294, 208, 25);
		kundeVerwaltung.add(btnKundeSuche);
		
		textKundeSum.setHorizontalAlignment(SwingConstants.CENTER);
		textKundeSum.setBounds(1020, 330, 107, 14);
		kundeVerwaltung.add(textKundeSum);
		
		JPanel verkaufVerwaltung = new JPanel();
		tabbedPane.addTab("Verkauf Verwaltung", null, verkaufVerwaltung, null);
		verkaufVerwaltung.setLayout(null);
		
		JScrollPane aufzeichnungListe = new JScrollPane();
		aufzeichnungListe.setBounds(10, 11, 927, 706);
		verkaufVerwaltung.add(aufzeichnungListe);
		
		aufzeichnungTable = new JTable(aufzeichnungModel);
		aufzeichnungListe.setViewportView(aufzeichnungTable);
		aufzeichnungTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				try {
					textFieldAufzeichnungIdDelete.setText(aufzeichnungTable.getValueAt(aufzeichnungTable.getSelectedRow(),0).toString());
					bufferProdukt = aufzeichnungTable.getValueAt(aufzeichnungTable.getSelectedRow(),3).toString();
				}catch(Exception ex) {
					
				}
				
			}
			
		});
		
		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setLayout(null);
		panel_1_1_1_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1_1_1_1.setBounds(947, 11, 256, 705);
		verkaufVerwaltung.add(panel_1_1_1_1);
		
		JLabel lblNewLabel_7_4_1_1 = new JLabel("Aufzeichnung ID:");
		lblNewLabel_7_4_1_1.setBounds(25, 54, 181, 15);
		panel_1_1_1_1.add(lblNewLabel_7_4_1_1);
		
		textFieldAufzeichnungId = new JTextField();
		textFieldAufzeichnungId.setColumns(10);
		textFieldAufzeichnungId.setBounds(10, 74, 237, 18);
		panel_1_1_1_1.add(textFieldAufzeichnungId);
		
		JLabel lblNewLabel_7_1_3_1_1 = new JLabel("Personal ID:");
		lblNewLabel_7_1_3_1_1.setBounds(25, 107, 181, 15);
		panel_1_1_1_1.add(lblNewLabel_7_1_3_1_1);
		
		textFieldAufzeichnungPersonal = new JTextField();
		textFieldAufzeichnungPersonal.setColumns(10);
		textFieldAufzeichnungPersonal.setBounds(10, 127, 237, 18);
		panel_1_1_1_1.add(textFieldAufzeichnungPersonal);
		
		JLabel lblNewLabel_7_2_1_1_1 = new JLabel("Kunde ID:");
		lblNewLabel_7_2_1_1_1.setBounds(25, 159, 122, 15);
		panel_1_1_1_1.add(lblNewLabel_7_2_1_1_1);
		
		textFieldAufzeichnungKunde = new JTextField();
		textFieldAufzeichnungKunde.setColumns(10);
		textFieldAufzeichnungKunde.setBounds(10, 179, 237, 18);
		panel_1_1_1_1.add(textFieldAufzeichnungKunde);
		
		JLabel lblNewLabel_7_3_1_2_1 = new JLabel("Produkt ID:");
		lblNewLabel_7_3_1_2_1.setBounds(25, 216, 122, 15);
		panel_1_1_1_1.add(lblNewLabel_7_3_1_2_1);
		
		textFieldAufzeichnungProdukt = new JTextField();
		textFieldAufzeichnungProdukt.setColumns(10);
		textFieldAufzeichnungProdukt.setBounds(10, 236, 237, 18);
		panel_1_1_1_1.add(textFieldAufzeichnungProdukt);
		
		JRadioButton rdbtnVerkauf = new JRadioButton("Verkauf");
		rdbtnVerkauf.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnVerkauf.setBounds(46, 271, 90, 23);
		panel_1_1_1_1.add(rdbtnVerkauf);
		
		JRadioButton rdbtnDienst = new JRadioButton("Dienst");
		rdbtnDienst.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnDienst.setBounds(138, 271, 109, 23);
		panel_1_1_1_1.add(rdbtnDienst);
		
		JRadioButton rdbtnNewAufzeichnungAlle = new JRadioButton("Alle");
		rdbtnNewAufzeichnungAlle.setSelected(true);
		rdbtnNewAufzeichnungAlle.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnNewAufzeichnungAlle.setBounds(103, 299, 66, 23);
		panel_1_1_1_1.add(rdbtnNewAufzeichnungAlle);
		
		ButtonGroup Button_Group = new ButtonGroup();
		Button_Group.add(rdbtnVerkauf);
        Button_Group.add(rdbtnDienst);
        Button_Group.add(rdbtnNewAufzeichnungAlle);
        
		JButton btnAufzeichnungSuche = new JButton("Aufzeichnung Suche");
		btnAufzeichnungSuche.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(rdbtnVerkauf.isSelected()) {
						sucheAufzeichnungModel(textFieldAufzeichnungId.getText(),textFieldAufzeichnungKunde.getText(),textFieldAufzeichnungPersonal.getText(),textFieldAufzeichnungProdukt.getText(), '1');
					} else if(rdbtnDienst.isSelected()) {
						sucheAufzeichnungModel(textFieldAufzeichnungId.getText(),textFieldAufzeichnungKunde.getText(),textFieldAufzeichnungPersonal.getText(),textFieldAufzeichnungProdukt.getText(), '2');
					} else {	
						sucheAufzeichnungModel(textFieldAufzeichnungId.getText(),textFieldAufzeichnungKunde.getText(),textFieldAufzeichnungPersonal.getText(),textFieldAufzeichnungProdukt.getText(), '9');
					}
				} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
				}
			}
		});
		btnAufzeichnungSuche.setBounds(25, 331, 208, 25);
		panel_1_1_1_1.add(btnAufzeichnungSuche);
		
		JButton btnAufzeichnungAddieren = new JButton("Dienstaufzeichnung Addieren");
		btnAufzeichnungAddieren.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DienstAddGui pag = new DienstAddGui(techniker);
				pag.setVisible(true);
				pag.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosed(WindowEvent e) {
						updateAufzeichnungModel();
						updateProduktModel();
					}
				});
			}
		});
		btnAufzeichnungAddieren.setBounds(10, 568, 237, 30);
		panel_1_1_1_1.add(btnAufzeichnungAddieren);
		
		JLabel lblNewLabel_8_1_1 = new JLabel("Aufzeichnung Suche");
		lblNewLabel_8_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_8_1_1.setBounds(55, 11, 151, 14);
		panel_1_1_1_1.add(lblNewLabel_8_1_1);
		
		JButton btnAufzeichnungLschen = new JButton("Aufzeichnung L\u00F6schen");
		btnAufzeichnungLschen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textFieldAufzeichnungIdDelete.getText().length() != 0) {
					if(techniker.deleteAufzeichnung(textFieldAufzeichnungIdDelete.getText(), bufferProdukt)) {
						JOptionPane.showMessageDialog(null, "Aufzeichnung wird erfolgreich gelˆscht.");
						textFieldAufzeichnungIdDelete.setText(null);
						updateAufzeichnungModel();
						updateProduktModel();
					}
				} else {
					JOptionPane.showMessageDialog(null, "Bitte geben Sie ein Aufzeichnung ID!!!");
				}
			}
		});
		btnAufzeichnungLschen.setBounds(10, 471, 237, 30);
		panel_1_1_1_1.add(btnAufzeichnungLschen);
		
		JLabel lblNewLabel_11_1_1_1 = new JLabel("Aufzeichnung ID:");
		lblNewLabel_11_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_11_1_1_1.setBounds(10, 417, 126, 14);
		panel_1_1_1_1.add(lblNewLabel_11_1_1_1);
		
		textFieldAufzeichnungIdDelete = new JTextField();
		textFieldAufzeichnungIdDelete.setColumns(10);
		textFieldAufzeichnungIdDelete.setBounds(10, 437, 237, 23);
		panel_1_1_1_1.add(textFieldAufzeichnungIdDelete);
		
		textAufzeichnungSum.setHorizontalAlignment(SwingConstants.CENTER);
		textAufzeichnungSum.setBounds(55, 367, 151, 14);
		panel_1_1_1_1.add(textAufzeichnungSum);
		
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
		btnQuit.setBounds(1115, 22, 100, 30);
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
	public static void updateProduktModel()  {
		DefaultTableModel clearModel = (DefaultTableModel) produktTable.getModel();
		clearModel.setRowCount(0);
		produktSum = 0;
		try {
			for(int i = 0; i<techniker.getProduktList().size(); i++) {
				produktData[0] = techniker.getProduktList().get(i).getProduktId();
				produktData[1] = techniker.getProduktList().get(i).getProduktTitel();
				produktData[2] = techniker.getProduktList().get(i).getProduktName();
				produktData[3] = techniker.getProduktList().get(i).getPreis();
				produktData[4] = techniker.getProduktList().get(i).getGarantiezeit();
				produktData[5] = techniker.getProduktList().get(i).getFiliale();
				produktData[6] = techniker.getProduktList().get(i).getFarbe();
				produktModel.addRow(produktData);
				produktSum++;
				
			}
			textProduktSum.setText(produktSum + " Produkt gefunden");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void sucheProduktModel(String id, String titel,String name, String minPreis, String maxPreis, String filiale, String farbe, char pt) throws SQLException {
		DefaultTableModel clearModel = (DefaultTableModel) produktTable.getModel();
		clearModel.setRowCount(0);
		produktSum = 0;
		for(int i = 0; i<techniker.produktSuche(id, titel, name, minPreis, maxPreis, filiale, farbe, pt).size(); i++) {
			produktData[0] = techniker.produktSuche(id, titel, name, minPreis, maxPreis, filiale, farbe, pt).get(i).getProduktId();
			produktData[1] = techniker.produktSuche(id, titel, name, minPreis, maxPreis, filiale, farbe, pt).get(i).getProduktTitel();
			produktData[2] = techniker.produktSuche(id, titel, name, minPreis, maxPreis, filiale, farbe, pt).get(i).getProduktName();
			produktData[3] = techniker.produktSuche(id, titel, name, minPreis, maxPreis, filiale, farbe, pt).get(i).getPreis();
			produktData[4] = techniker.produktSuche(id, titel, name, minPreis, maxPreis, filiale, farbe, pt).get(i).getGarantiezeit();
			produktData[5] = techniker.produktSuche(id, titel, name, minPreis, maxPreis, filiale, farbe, pt).get(i).getFiliale();
			produktData[6] = techniker.produktSuche(id, titel, name, minPreis, maxPreis, filiale, farbe, pt).get(i).getFarbe();
			produktModel.addRow(produktData);
			produktSum++;
			
		}
		textProduktSum.setText(produktSum + " Personal gefunden");
	}
	public static void updateKundeModel()  {
		DefaultTableModel clearModel = (DefaultTableModel) kundeTable.getModel();
		clearModel.setRowCount(0);
		kundeSum = 0;
		try {
			for(int i = 0; i<techniker.getKundeList().size(); i++) {
				kundeData[0] = techniker.getKundeList().get(i).getId();
				kundeData[1] = techniker.getKundeList().get(i).getName();
				kundeData[2] = techniker.getKundeList().get(i).getNachname();
				kundeData[3] = techniker.getKundeList().get(i).getFiliale();
				kundeData[4] = techniker.getKundeList().get(i).getGeburtsdatum();
				kundeData[5] = techniker.getKundeList().get(i).getGeschlecht();
				kundeData[6] = techniker.getKundeList().get(i).getAdress();
				kundeData[7] = techniker.getKundeList().get(i).getTelNr();
				kundeModel.addRow(kundeData);
				kundeSum++;
				
			}
			textKundeSum.setText(kundeSum + " Kunde gefunden");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void sucheKundeModel(String id,String name, String nachname, String filiale) throws SQLException {
		DefaultTableModel clearModel = (DefaultTableModel) kundeTable.getModel();
		clearModel.setRowCount(0);
		kundeSum = 0;
		for(int i = 0; i<techniker.kundeSuche(id, name, nachname, filiale).size(); i++) {
			kundeData[0] = techniker.kundeSuche(id, name, nachname, filiale).get(i).getId();
			kundeData[1] = techniker.kundeSuche(id, name, nachname, filiale).get(i).getName();
			kundeData[2] = techniker.kundeSuche(id, name, nachname, filiale).get(i).getNachname();
			kundeData[3] = techniker.kundeSuche(id, name, nachname, filiale).get(i).getFiliale();
			kundeData[4] = techniker.kundeSuche(id, name, nachname, filiale).get(i).getGeburtsdatum();
			kundeData[5] = techniker.kundeSuche(id, name, nachname, filiale).get(i).getGeschlecht();
			kundeData[6] = techniker.kundeSuche(id, name, nachname, filiale).get(i).getAdress();
			kundeData[7] = techniker.kundeSuche(id, name, nachname, filiale).get(i).getTelNr();
			kundeModel.addRow(kundeData);
			kundeSum++;
			
		}
		textKundeSum.setText(kundeSum + " Kunde gefunden");
	}
	
	public static void sucheAufzeichnungModel(String id, String kunde,String personal, String produkt, char pt) throws SQLException {
		DefaultTableModel clearModel = (DefaultTableModel) aufzeichnungTable.getModel();
		clearModel.setRowCount(0);
		aufzeichnungSum = 0;
		for(int i = 0; i<techniker.aufzeichnungSuche(id, kunde, personal, produkt, pt).size(); i++) {
			aufzeichnungData[0] = techniker.aufzeichnungSuche(id, kunde, personal, produkt, pt).get(i).getId();
			aufzeichnungData[1] = techniker.aufzeichnungSuche(id, kunde, personal, produkt, pt).get(i).getKunde();
			aufzeichnungData[2] = techniker.aufzeichnungSuche(id, kunde, personal, produkt, pt).get(i).getPersonal();
			aufzeichnungData[3] = techniker.aufzeichnungSuche(id, kunde, personal, produkt, pt).get(i).getProdukt();
			aufzeichnungData[4] = techniker.aufzeichnungSuche(id, kunde, personal, produkt, pt).get(i).getPreis();
			aufzeichnungData[5] = techniker.aufzeichnungSuche(id, kunde, personal, produkt, pt).get(i).getDatum();
			aufzeichnungData[6] = techniker.aufzeichnungSuche(id, kunde, personal, produkt, pt).get(i).getGarantiezeit();
			aufzeichnungData[7] = techniker.aufzeichnungSuche(id, kunde, personal, produkt, pt).get(i).getInfos();
			aufzeichnungModel.addRow(aufzeichnungData);
			aufzeichnungSum++;
			
		}
		textAufzeichnungSum.setText(aufzeichnungSum + " Aufzeichnung gefunden");
	}
	
	public static void updateAufzeichnungModel()  {
		DefaultTableModel clearModel = (DefaultTableModel) aufzeichnungTable.getModel();
		clearModel.setRowCount(0);
		aufzeichnungSum = 0;
		try {
			for(int i = 0; i<techniker.getAufzeichnungList().size(); i++) {
				aufzeichnungData[0] = techniker.getAufzeichnungList().get(i).getId();
				aufzeichnungData[1] = techniker.getAufzeichnungList().get(i).getKunde();
				aufzeichnungData[2] = techniker.getAufzeichnungList().get(i).getPersonal();
				aufzeichnungData[3] = techniker.getAufzeichnungList().get(i).getProdukt();
				aufzeichnungData[4] = techniker.getAufzeichnungList().get(i).getPreis();
				aufzeichnungData[5] = techniker.getAufzeichnungList().get(i).getDatum();
				aufzeichnungData[6] = techniker.getAufzeichnungList().get(i).getGarantiezeit();
				aufzeichnungData[7] = techniker.getAufzeichnungList().get(i).getInfos();
				aufzeichnungModel.addRow(aufzeichnungData);
				aufzeichnungSum++;
				
			}
			textAufzeichnungSum.setText(aufzeichnungSum + " Aufzeichnung gefunden");
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
