package Gui;

import Entities.*;
import Helpers.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;

import javax.swing.border.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

public class AdminGui extends JFrame {
	
	static Admin admin = new Entities.Admin();
	
	private JPanel contentPane;
	private JTextField sucheAdminPid;
	private JTextField sucheAdminName;
	private JTextField textFieldAdminId;
	private JTextField textFieldAdminPersonalId;
	private JTextField textFieldAdminPasswort;
	private JTextField textFieldAdminName;
	private JTextField textFieldAdminNachname;
	private JTextField textFieldAdminFiliale;
	private JTextField textFieldAdminGeburtsdatum;
	private JTextField textFieldAdminGeschlecht;
	private JTextField textFieldAdminAdress;
	private JTextField textFieldAdminTelNr;
	private JTextField fieldPasswortRemove;
	private static JTable adminTable;
	private static JTable personalTable;
	private static JTable produktTable;
	private static JTable kundeTable;
	private static JTable aufzeichnungTable;
	private static DefaultTableModel adminModel = null;
	private static DefaultTableModel personalModel = null;
	private static DefaultTableModel produktModel = null;
	private static DefaultTableModel kundeModel = null;
	private static DefaultTableModel aufzeichnungModel = null;
	private static Object[] adminData = new Object[10];
	private static Object[] personalData = new Object[10];
	private static Object[] produktData = new Object[8];
	private static Object[] kundeData = new Object[8];
	private static Object[] aufzeichnungData = new Object[8];
	private JPopupMenu personalMenu; 
	private JTextField textFieldId;
	private JTextField textFieldPersonalId;
	private JTextField textFieldName;
	private JTextField textFieldNachname;
	private JTextField textFieldFiliale;
	private static int adminSum = 0;
	private static int personalSum = 0;
	private static int produktSum = 0;
	private static int kundeSum = 0;
	private static int aufzeichnungSum = 0;
	private static String bufferProdukt;
	private static JLabel textAdminSum = new JLabel(adminSum + " Admin gefunden");
	private static JLabel textPersonalSum = new JLabel(personalSum + " Personal gefunden");
	private static JLabel textProduktSum = new JLabel(produktSum + " Produkt gefunden");
	private static JLabel textKundeSum = new JLabel(kundeSum + " Kunde gefunden");
	private static JLabel textAufzeichnungSum = new JLabel(aufzeichnungSum + " Aufzeichnung gefunden");
	private JTextField textFieldProduktId;
	private JTextField textFieldProduktTitel;
	private JTextField textFieldProduktName;
	private JTextField textFieldMinPreis;
	private JTextField textFieldProduktFiliale;
	private JTextField textFieldMaxPreis;
	private JTextField textFieldFarbe;
	private JTextField textFieldProduktIdDelete;
	private JTextField textFieldKundeId;
	private JTextField textFieldKundeName;
	private JTextField textFieldKundeNachname;
	private JTextField textFieldKundeFiliale;
	private JTextField textFieldKundeIdDelete;
	private JTextField textFieldAufzeichnungId;
	private JTextField textFieldAufzeichnungPersonal;
	private JTextField textFieldAufzeichnungKunde;
	private JTextField textFieldAufzeichnungProdukt;
	private JTextField textFieldAufzeichnungIdDelete;
	
	
	
	
	/*public static void main(String[] args) {
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
	}*/

	public AdminGui(Admin admin) throws SQLException {
		setResizable(false);
		
		adminModel = new DefaultTableModel();
		Object[] colAdminName = new Object[10];
		colAdminName[0] = "ID";
		colAdminName[1] = "PID";
		colAdminName[2] = "NAME";
		colAdminName[3] = "NACHNAME";
		colAdminName[4] = "FÝLÝALE";
		colAdminName[5] = "GEBURTSDATUM";
		colAdminName[6] = "GESCHLECHT";
		colAdminName[7] = "ADRESS";
		colAdminName[8] = "TEL Nr.";
		colAdminName[9] = "PASSWORT";
		adminModel.setColumnIdentifiers(colAdminName);
		for(int i = 0; i<admin.getAdminList().size(); i++) {
			adminData[0] = admin.getAdminList().get(i).getId();
			adminData[1] = admin.getAdminList().get(i).getPersonalId();
			adminData[2] = admin.getAdminList().get(i).getName();
			adminData[3] = admin.getAdminList().get(i).getNachname();//13ata 15-17//16göm 15-17//22algo 16-18//23mat 10-13//
			adminData[4] = admin.getAdminList().get(i).getFiliale();
			adminData[5] = admin.getAdminList().get(i).getGeburtsdatum();
			adminData[6] = admin.getAdminList().get(i).getGeschlecht();
			adminData[7] = admin.getAdminList().get(i).getAdress();
			adminData[8] = admin.getAdminList().get(i).getTelNr();
			adminData[9] = admin.getAdminList().get(i).getPasswort();
			adminModel.addRow(adminData);
			adminSum++;
			textAdminSum.setText(adminSum + " Admin gefunden");
		}
		
		personalModel = new DefaultTableModel();
		Object[] colpersonalName = new Object[10];
		colpersonalName[0] = "ID";
		colpersonalName[1] = "PID";
		colpersonalName[2] = "NAME";
		colpersonalName[3] = "NACHNAME";
		colpersonalName[4] = "FÝLÝALE";
		colpersonalName[5] = "GEBURTSDATUM";
		colpersonalName[6] = "GESCHLECHT";
		colpersonalName[7] = "ADRESS";
		colpersonalName[8] = "TEL Nr.";
		colpersonalName[9] = "PASSWORT";
		personalModel.setColumnIdentifiers(colpersonalName);
		for(int i = 0; i<admin.getPersonalList().size(); i++) {
			personalData[0] = admin.getPersonalList().get(i).getId();
			personalData[1] = admin.getPersonalList().get(i).getPersonalId();
			personalData[2] = admin.getPersonalList().get(i).getName();
			personalData[3] = admin.getPersonalList().get(i).getNachname();
			personalData[4] = admin.getPersonalList().get(i).getFiliale();
			personalData[5] = admin.getPersonalList().get(i).getGeburtsdatum();
			personalData[6] = admin.getPersonalList().get(i).getGeschlecht();
			personalData[7] = admin.getPersonalList().get(i).getAdress();
			personalData[8] = admin.getPersonalList().get(i).getTelNr();
			personalData[9] = admin.getPersonalList().get(i).getPasswort();
			personalModel.addRow(personalData);
			personalSum++;
			textPersonalSum.setText(personalSum + " Personal gefunden");
		}
		
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
		for(int i = 0; i<admin.getProduktList().size(); i++) {
			produktData[0] = admin.getProduktList().get(i).getProduktId();
			produktData[1] = admin.getProduktList().get(i).getProduktTitel();
			produktData[2] = admin.getProduktList().get(i).getProduktName();
			produktData[3] = admin.getProduktList().get(i).getPreis();
			produktData[4] = admin.getProduktList().get(i).getGarantiezeit();
			produktData[5] = admin.getProduktList().get(i).getFiliale();
			produktData[6] = admin.getProduktList().get(i).getFarbe();
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
		for(int i = 0; i<admin.getKundeList().size(); i++) {
			kundeData[0] = admin.getKundeList().get(i).getId();
			kundeData[1] = admin.getKundeList().get(i).getName();
			kundeData[2] = admin.getKundeList().get(i).getNachname();
			kundeData[3] = admin.getKundeList().get(i).getFiliale();
			kundeData[4] = admin.getKundeList().get(i).getGeburtsdatum();
			kundeData[5] = admin.getKundeList().get(i).getGeschlecht();
			kundeData[6] = admin.getKundeList().get(i).getAdress();
			kundeData[7] = admin.getKundeList().get(i).getTelNr();
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
		colAufzeichnungName[4] = "PREÝS";
		colAufzeichnungName[5] = "DATUM";
		colAufzeichnungName[6] = "GARANTÝEZEÝT";
		colAufzeichnungName[7] = "INFOS";
		aufzeichnungModel.setColumnIdentifiers(colAufzeichnungName);
		for(int i = 0; i<admin.getAufzeichnungList().size(); i++) {
			aufzeichnungData[0] = admin.getAufzeichnungList().get(i).getId();
			aufzeichnungData[1] = admin.getAufzeichnungList().get(i).getKunde();
			aufzeichnungData[2] = admin.getAufzeichnungList().get(i).getPersonal();
			aufzeichnungData[3] = admin.getAufzeichnungList().get(i).getProdukt();
			aufzeichnungData[4] = admin.getAufzeichnungList().get(i).getPreis();
			aufzeichnungData[5] = admin.getAufzeichnungList().get(i).getDatum();
			aufzeichnungData[6] = admin.getAufzeichnungList().get(i).getGarantiezeit();
			aufzeichnungData[7] = admin.getAufzeichnungList().get(i).getInfos();
			aufzeichnungModel.addRow(aufzeichnungData);
			aufzeichnungSum++;
			textAufzeichnungSum.setText(aufzeichnungSum + " Aufzeichnung gefunden");
		}

		setTitle("Weißwarenhändler Managment System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 200, 1250, 850);
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
		btnQuit.setBounds(1113, 11, 100, 30);
		contentPane.add(btnQuit);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 50, 1218, 754);
		contentPane.add(tabbedPane);
		
		JPanel adminVerwaltung = new JPanel();
		tabbedPane.addTab("Admin Verwaltung", null, adminVerwaltung, null);
		adminVerwaltung.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Suchen Sie mit ->");
		lblNewLabel_1.setBounds(10, 10, 108, 20);
		adminVerwaltung.add(lblNewLabel_1);
		
		sucheAdminPid = new JTextField();
		sucheAdminPid.setBounds(200, 10, 120, 20);
		adminVerwaltung.add(sucheAdminPid);
		sucheAdminPid.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Personal Id: ");
		lblNewLabel_2.setBounds(130, 13, 77, 14);
		adminVerwaltung.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Name:");
		lblNewLabel_3.setBounds(399, 13, 48, 14);
		adminVerwaltung.add(lblNewLabel_3);
		
		sucheAdminName = new JTextField();
		sucheAdminName.setBounds(444, 10, 96, 20);
		adminVerwaltung.add(sucheAdminName);
		sucheAdminName.setColumns(10);
		
		JScrollPane adminListe = new JScrollPane();
		adminListe.setBounds(10, 40, 922, 675);
		adminVerwaltung.add(adminListe);
		
		adminTable = new JTable(adminModel);
		adminTable.setFont(new Font("Tahoma", Font.PLAIN, 10));
		adminListe.setViewportView(adminTable);
		adminTable.getSelectionModel().addListSelectionListener( new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				try {
					textFieldAdminId.setText(adminTable.getValueAt(adminTable.getSelectedRow(), 0).toString());
					textFieldAdminPersonalId.setText(adminTable.getValueAt(adminTable.getSelectedRow(), 1).toString());
					textFieldAdminName.setText(adminTable.getValueAt(adminTable.getSelectedRow(), 2).toString());
					textFieldAdminNachname.setText(adminTable.getValueAt(adminTable.getSelectedRow(), 3).toString());
					textFieldAdminFiliale.setText(adminTable.getValueAt(adminTable.getSelectedRow(), 4).toString());
					textFieldAdminGeburtsdatum.setText(adminTable.getValueAt(adminTable.getSelectedRow(), 5).toString());
					textFieldAdminGeschlecht.setText(adminTable.getValueAt(adminTable.getSelectedRow(), 6).toString());
					textFieldAdminAdress.setText(adminTable.getValueAt(adminTable.getSelectedRow(), 7).toString());
					textFieldAdminTelNr.setText(adminTable.getValueAt(adminTable.getSelectedRow(), 8).toString());
					textFieldAdminPasswort.setText(adminTable.getValueAt(adminTable.getSelectedRow(), 9).toString());
					
				} catch (Exception ex) {
					
				}
			}
		});
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(942, 40, 261, 675);
		adminVerwaltung.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Neu Admin Hinzufügung");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(65, 11, 135, 14);
		panel.add(lblNewLabel_4);
		
		textFieldAdminId = new JTextField();
		textFieldAdminId.setBounds(124, 45, 124, 20);
		panel.add(textFieldAdminId);
		textFieldAdminId.setColumns(10);
		
		textFieldAdminPersonalId = new JTextField();
		textFieldAdminPersonalId.setBounds(124, 76, 124, 20);
		panel.add(textFieldAdminPersonalId);
		textFieldAdminPersonalId.setColumns(10);
		
		textFieldAdminPasswort = new JTextField();
		textFieldAdminPasswort.setBounds(124, 107, 124, 20);
		panel.add(textFieldAdminPasswort);
		textFieldAdminPasswort.setColumns(10);
		
		textFieldAdminName = new JTextField();
		textFieldAdminName.setBounds(124, 138, 124, 20);
		panel.add(textFieldAdminName);
		textFieldAdminName.setColumns(10);
		
		textFieldAdminNachname = new JTextField();
		textFieldAdminNachname.setBounds(124, 169, 124, 20);
		panel.add(textFieldAdminNachname);
		textFieldAdminNachname.setColumns(10);
		
		textFieldAdminFiliale = new JTextField();
		textFieldAdminFiliale.setBounds(124, 200, 124, 20);
		panel.add(textFieldAdminFiliale);
		textFieldAdminFiliale.setColumns(10);
		
		textFieldAdminGeburtsdatum = new JTextField();
		textFieldAdminGeburtsdatum.setBounds(124, 231, 124, 20);
		panel.add(textFieldAdminGeburtsdatum);
		textFieldAdminGeburtsdatum.setColumns(10);
		
		textFieldAdminGeschlecht = new JTextField();
		textFieldAdminGeschlecht.setBounds(124, 262, 124, 20);
		panel.add(textFieldAdminGeschlecht);
		textFieldAdminGeschlecht.setColumns(10);
		
		textFieldAdminAdress = new JTextField();
		textFieldAdminAdress.setBounds(124, 293, 124, 20);
		panel.add(textFieldAdminAdress);
		textFieldAdminAdress.setColumns(10);
		
		textFieldAdminTelNr = new JTextField();
		textFieldAdminTelNr.setBounds(124, 324, 124, 20);
		panel.add(textFieldAdminTelNr);
		textFieldAdminTelNr.setColumns(10);
		
		JButton btnAdminAdd = new JButton("Addieren");
		btnAdminAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Helper.confirm("add_admin")) {
					if(fieldPasswortRemove.getText().equals(admin.getPasswort())) {
						if(textFieldAdminId.getText().length() != 11 || textFieldAdminPersonalId.getText().length() != 8 || textFieldAdminPasswort.getText().length() != 8 || textFieldAdminName.getText().length() == 0 || textFieldAdminNachname.getText().length() == 0 || textFieldAdminFiliale.getText().length() != 1 || textFieldAdminGeburtsdatum.getText().length() != 10 || textFieldAdminGeschlecht.getText().length() != 1 || textFieldAdminAdress.getText().length() == 0 || textFieldAdminTelNr.getText().length() != 11) {
								JOptionPane.showMessageDialog(null,"Leere oder ungültige Eingabe!!!");
						} else {
							Admin adm = new Admin(textFieldAdminId.getText(), textFieldAdminPersonalId.getText(), textFieldAdminPasswort.getText(), textFieldAdminName.getText(), textFieldAdminNachname.getText(), textFieldAdminFiliale.getText(), textFieldAdminGeburtsdatum.getText(), textFieldAdminGeschlecht.getText(), textFieldAdminAdress.getText(), textFieldAdminTelNr.getText());
							boolean control = admin.addAdmin(adm);
							if(control) {
								JOptionPane.showMessageDialog(null,"Administrator erfolgreich hinzugefügt");
								textFieldAdminId.setText(null);
								textFieldAdminPersonalId.setText(null);
								textFieldAdminPasswort.setText(null);
								textFieldAdminName.setText(null);
								textFieldAdminNachname.setText(null);
								textFieldAdminFiliale.setText(null);
								textFieldAdminGeburtsdatum.setText(null);
								textFieldAdminGeschlecht.setText(null);
								textFieldAdminAdress.setText(null);
								textFieldAdminTelNr.setText(null);
								fieldPasswortRemove.setText(null);
								updateAdminModel();
							} else {
								JOptionPane.showMessageDialog(null,"Hinzufügen des Administrators fehlgeschlagen!!!");
								fieldPasswortRemove.setText(null);
							}
						}	
					} else {
						JOptionPane.showMessageDialog(null,"ungültige Passwort!!!");
						fieldPasswortRemove.setText(null);
					}
				} else {
					fieldPasswortRemove.setText(null);
				}
				
				
			}
		});
		btnAdminAdd.setBounds(10, 413, 113, 23);
		panel.add(btnAdminAdd);
		
		JLabel lblNewLabel_5 = new JLabel("Id:");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5.setBounds(10, 49, 104, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("Personal Id:");
		lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5_1.setBounds(10, 80, 104, 14);
		panel.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("Passwort:");
		lblNewLabel_5_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5_2.setBounds(10, 111, 104, 14);
		panel.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_5_3 = new JLabel("Name:");
		lblNewLabel_5_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5_3.setBounds(10, 142, 104, 14);
		panel.add(lblNewLabel_5_3);
		
		JLabel lblNewLabel_5_4 = new JLabel("Nachname:");
		lblNewLabel_5_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5_4.setBounds(10, 173, 104, 14);
		panel.add(lblNewLabel_5_4);
		
		JLabel lblNewLabel_5_5 = new JLabel("Filiale:");
		lblNewLabel_5_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5_5.setBounds(10, 204, 104, 14);
		panel.add(lblNewLabel_5_5);
		
		JLabel lblNewLabel_5_6 = new JLabel("Geburtsdatum:");
		lblNewLabel_5_6.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5_6.setBounds(10, 235, 104, 14);
		panel.add(lblNewLabel_5_6);
		
		JLabel lblNewLabel_5_7 = new JLabel("Geschlecht:");
		lblNewLabel_5_7.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5_7.setBounds(10, 266, 104, 14);
		panel.add(lblNewLabel_5_7);
		
		JLabel lblNewLabel_5_8 = new JLabel("Adress:");
		lblNewLabel_5_8.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5_8.setBounds(10, 297, 104, 14);
		panel.add(lblNewLabel_5_8);
		
		JLabel lblNewLabel_5_9 = new JLabel("Tel Nr.:");
		lblNewLabel_5_9.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5_9.setBounds(10, 328, 113, 14);
		panel.add(lblNewLabel_5_9);
		
		JButton adminDelete = new JButton("Löschen");
		adminDelete.setBounds(65, 447, 114, 23);
		panel.add(adminDelete);
		
		fieldPasswortRemove = new JTextField();
		fieldPasswortRemove.setBounds(10, 382, 241, 20);
		panel.add(fieldPasswortRemove);
		fieldPasswortRemove.setColumns(10);
		
		JButton adminAktualisieren = new JButton("Update");
		adminAktualisieren.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Helper.confirm("update_admin")) {
					String control = admin.personalControl(textFieldAdminId.getText(), textFieldAdminPersonalId.getText(), textFieldAdminPasswort.getText(), textFieldAdminName.getText(), textFieldAdminNachname.getText(), textFieldAdminFiliale.getText(), textFieldAdminGeburtsdatum.getText(), textFieldAdminGeschlecht.getText(), textFieldAdminAdress.getText(), textFieldAdminTelNr.getText());
					if(control.equals("gültig")) {
						if(fieldPasswortRemove.getText().equals(admin.getPasswort())) {
							boolean cntrl = admin.updateAdmin(textFieldAdminId.getText(), textFieldAdminPersonalId.getText(), textFieldAdminPasswort.getText(), textFieldAdminName.getText(), textFieldAdminNachname.getText(), textFieldAdminFiliale.getText(), textFieldAdminGeburtsdatum.getText(), textFieldAdminGeschlecht.getText(), textFieldAdminAdress.getText(), textFieldAdminTelNr.getText());
							JOptionPane.showMessageDialog(null,"Admin wird erfolgreich aktualisiert.");
							textFieldAdminId.setText(null);
							textFieldAdminPersonalId.setText(null);
							textFieldAdminPasswort.setText(null);
							textFieldAdminName.setText(null);
							textFieldAdminNachname.setText(null);
							textFieldAdminFiliale.setText(null);
							textFieldAdminGeburtsdatum.setText(null);
							textFieldAdminGeschlecht.setText(null);
							textFieldAdminAdress.setText(null);
							textFieldAdminTelNr.setText(null);
							fieldPasswortRemove.setText(null);
							updateAdminModel();
						} else {
							JOptionPane.showMessageDialog(null,"Bitte geben Sie gültige Passwort!!!");
							fieldPasswortRemove.setText(null);
						}
					} else {
						JOptionPane.showMessageDialog(null, control);
						fieldPasswortRemove.setText(null);
					}
				} else {
					fieldPasswortRemove.setText(null);
				}
			}
		});
		adminAktualisieren.setBounds(136, 413, 115, 23);
		panel.add(adminAktualisieren);
		
		JLabel lblNewLabel = new JLabel("Ihr Passwort:");
		lblNewLabel.setBounds(10, 366, 78, 14);
		panel.add(lblNewLabel);
		adminDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Helper.confirm("delete_admin")) {
					if(textFieldAdminPersonalId.getText().length() != 8) {
						JOptionPane.showMessageDialog(null,"Ungültige oder leere Personal ID!!!");
					} else if (fieldPasswortRemove.getText().equals(admin.getPasswort())) {
						boolean control = admin.deleteAdmin(textFieldAdminPersonalId.getText());
						if(control) {
							JOptionPane.showMessageDialog(null,"Admin wird erfolgreich aus der Datenbank gelöscht.");
							textFieldAdminId.setText(null);
							textFieldAdminPersonalId.setText(null);
							textFieldAdminPasswort.setText(null);
							textFieldAdminName.setText(null);
							textFieldAdminNachname.setText(null);
							textFieldAdminFiliale.setText(null);
							textFieldAdminGeburtsdatum.setText(null);
							textFieldAdminGeschlecht.setText(null);
							textFieldAdminAdress.setText(null);
							textFieldAdminTelNr.setText(null);
							fieldPasswortRemove.setText(null);
							updateAdminModel();
						} else {
							JOptionPane.showMessageDialog(null,"Ungültige Personal Id!!!");
						}
					} else {
						JOptionPane.showMessageDialog(null,"Bitte geben Sie gültige Passwort!!!");
					}
				} else {
					fieldPasswortRemove.setText(null);
				}
			}
		});
		
		JLabel lblNewLabel_9 = new JLabel("oder");
		lblNewLabel_9.setBounds(348, 13, 27, 14);
		adminVerwaltung.add(lblNewLabel_9);
		
		JButton btnAdminSuche = new JButton("Suche");
		btnAdminSuche.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sucheAdminPid.getText().length() == 0 && sucheAdminName.getText().length() == 0) {
					updateAdminModel();
				} else if(sucheAdminPid.getText().length() == 0) {
					try {
						sucheAdminModel("name", sucheAdminName.getText());
						sucheAdminName.setText(null);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} else if(sucheAdminName.getText().length() == 0) {
					try {
						sucheAdminModel("personalId", sucheAdminPid.getText());
						sucheAdminPid.setText(null);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} else {
					JOptionPane.showMessageDialog(null,"Bitte füllen Sie nur ein Textfeld!!!");
				}
			}
		});
		btnAdminSuche.setBounds(570, 10, 89, 20);
		adminVerwaltung.add(btnAdminSuche);
		
		textAdminSum.setBounds(1031, 13, 120, 14);
		adminVerwaltung.add(textAdminSum);
		
		JPanel personalVerwaltung = new JPanel();
		tabbedPane.addTab("Personal Verwaltung", null, personalVerwaltung, null);
		personalVerwaltung.setLayout(null);
		
		JScrollPane personalListe = new JScrollPane();
		personalListe.setBounds(10, 11, 927, 706);
		personalVerwaltung.add(personalListe);
		
		personalTable = new JTable(personalModel);
		personalListe.setViewportView(personalTable);
		
		ButtonGroup personalSucheBtnGroup = new ButtonGroup();
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(947, 11, 256, 705);
		personalVerwaltung.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Personal Suche");
		lblNewLabel_6.setBounds(75, 11, 110, 14);
		panel_1.add(lblNewLabel_6);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_7 = new JLabel("ID:");
		lblNewLabel_7.setBounds(25, 54, 48, 15);
		panel_1.add(lblNewLabel_7);
		
		textFieldId = new JTextField();
		textFieldId.setBounds(24, 74, 210, 18);
		panel_1.add(textFieldId);
		textFieldId.setColumns(10);
		
		JLabel lblNewLabel_7_1 = new JLabel("Personal ID:");
		lblNewLabel_7_1.setBounds(25, 97, 181, 15);
		panel_1.add(lblNewLabel_7_1);
		
		textFieldPersonalId = new JTextField();
		textFieldPersonalId.setBounds(24, 117, 210, 18);
		panel_1.add(textFieldPersonalId);
		textFieldPersonalId.setColumns(10);
		
		JLabel lblNewLabel_7_2 = new JLabel("Name:");
		lblNewLabel_7_2.setBounds(25, 142, 48, 15);
		panel_1.add(lblNewLabel_7_2);
		
		textFieldName = new JTextField();
		textFieldName.setBounds(24, 162, 210, 18);
		panel_1.add(textFieldName);
		textFieldName.setColumns(10);
		
		JLabel lblNewLabel_7_1_1 = new JLabel("Nachname:");
		lblNewLabel_7_1_1.setBounds(25, 185, 181, 15);
		panel_1.add(lblNewLabel_7_1_1);
		
		textFieldNachname = new JTextField();
		textFieldNachname.setBounds(24, 205, 210, 18);
		panel_1.add(textFieldNachname);
		textFieldNachname.setColumns(10);
		
		JLabel lblNewLabel_7_3 = new JLabel("Filiale:");
		lblNewLabel_7_3.setBounds(25, 228, 48, 15);
		panel_1.add(lblNewLabel_7_3);
		
		textFieldFiliale = new JTextField();
		textFieldFiliale.setBounds(24, 248, 210, 18);
		panel_1.add(textFieldFiliale);
		textFieldFiliale.setColumns(10);
		
		JLabel lblNewLabel_7_1_2 = new JLabel("Personal Rolle:");
		lblNewLabel_7_1_2.setBounds(25, 287, 228, 15);
		panel_1.add(lblNewLabel_7_1_2);
		
		JRadioButton btnVerkaeufer = new JRadioButton("Verk\u00E4ufer");
		btnVerkaeufer.setBounds(10, 309, 99, 23);
		panel_1.add(btnVerkaeufer);
		personalSucheBtnGroup.add(btnVerkaeufer);
		
		JRadioButton btnTechniker = new JRadioButton("Techniker");
		btnTechniker.setBounds(131, 309, 103, 23);
		panel_1.add(btnTechniker);
		personalSucheBtnGroup.add(btnTechniker);
		
		JRadioButton btnAlle = new JRadioButton("Alle Rolle");
		btnAlle.setBounds(73, 329, 85, 23);
		panel_1.add(btnAlle);
		personalSucheBtnGroup.add(btnAlle);
		
		JButton btnPersonalSuche = new JButton("Personal Suche");
		btnPersonalSuche.setBounds(18, 359, 216, 25);
		panel_1.add(btnPersonalSuche);
		textPersonalSum.setBounds(48, 395, 158, 14);
		panel_1.add(textPersonalSum);
		
		
		textPersonalSum.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnPersonalAdd = new JButton("Personal Addieren");
		btnPersonalAdd.setBounds(10, 523, 237, 30);
		panel_1.add(btnPersonalAdd);
		btnPersonalAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PersonalAddGui pag = new PersonalAddGui(admin);
				pag.setVisible(true);
				pag.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosed(WindowEvent e) {
						updatePersonalModel();
					}
				});
			}
		});
		btnPersonalSuche.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(btnVerkaeufer.isSelected()) {
						suchePersonalModel(textFieldId.getText(),textFieldPersonalId.getText(),textFieldName.getText(),textFieldNachname.getText(),textFieldFiliale.getText(), '1');
					} else if(btnTechniker.isSelected()) {
						suchePersonalModel(textFieldId.getText(),textFieldPersonalId.getText(),textFieldName.getText(),textFieldNachname.getText(),textFieldFiliale.getText(), '2');
					} else {	
						suchePersonalModel(textFieldId.getText(),textFieldPersonalId.getText(),textFieldName.getText(),textFieldNachname.getText(),textFieldFiliale.getText(), '9');
					}
				} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
				}
			}
		});
		
		JPanel produktVerwaltung = new JPanel();
		tabbedPane.addTab("Produkt Verwaltung", null, produktVerwaltung, null);
		produktVerwaltung.setLayout(null);
		
		JScrollPane produktListe = new JScrollPane();
		produktListe.setBounds(10, 11, 927, 706);
		produktVerwaltung.add(produktListe);
		
		produktTable = new JTable(produktModel);
		produktListe.setViewportView(produktTable);
		produktTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				try {
					textFieldProduktIdDelete.setText(produktTable.getValueAt(produktTable.getSelectedRow(), 0).toString());
				}catch(Exception ex){	
				}
			}
		});
		
		produktTable.getModel().addTableModelListener(new TableModelListener() {

			@Override
			public void tableChanged(TableModelEvent e) {
				if(e.getType() == TableModelEvent.UPDATE) {
					String selectId = produktTable.getValueAt(produktTable.getSelectedRow(), 0).toString();
					String selectTitel = produktTable.getValueAt(produktTable.getSelectedRow(), 1).toString();
					String selectName = produktTable.getValueAt(produktTable.getSelectedRow(), 2).toString();
					String selectPreis = produktTable.getValueAt(produktTable.getSelectedRow(), 3).toString();
					String selectGarantiezeit = produktTable.getValueAt(produktTable.getSelectedRow(), 4).toString();
					String selectFiliale = produktTable.getValueAt(produktTable.getSelectedRow(), 5).toString();
					String selectFarbe = produktTable.getValueAt(produktTable.getSelectedRow(), 6).toString();
					try {
						if(admin.updateProdukt(selectId, selectTitel, selectName, selectPreis, selectGarantiezeit, selectFiliale, selectFarbe)) {
							JOptionPane.showMessageDialog(null,"Aktualisierung von Produkt ist erfolgreich!!!");
						} else {
							JOptionPane.showMessageDialog(null,"Aktualisierung von Produkt ist nicht erfolgreich!!!");
						}
					}catch(Exception e2){
						e2.printStackTrace();
					}
				}
				
			}
			
		});
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1_1.setBounds(947, 11, 256, 705);
		produktVerwaltung.add(panel_1_1);
		
		JLabel lblNewLabel_7_4 = new JLabel("Produkt ID:");
		lblNewLabel_7_4.setBounds(25, 54, 181, 15);
		panel_1_1.add(lblNewLabel_7_4);
		
		textFieldProduktId = new JTextField();
		textFieldProduktId.setColumns(10);
		textFieldProduktId.setBounds(10, 74, 237, 18);
		panel_1_1.add(textFieldProduktId);
		
		JLabel lblNewLabel_7_1_3 = new JLabel("Produkt Titel:");
		lblNewLabel_7_1_3.setBounds(25, 107, 181, 15);
		panel_1_1.add(lblNewLabel_7_1_3);
		
		textFieldProduktTitel = new JTextField();
		textFieldProduktTitel.setColumns(10);
		textFieldProduktTitel.setBounds(10, 127, 237, 18);
		panel_1_1.add(textFieldProduktTitel);
		
		JLabel lblNewLabel_7_2_1 = new JLabel("Produkt Name:");
		lblNewLabel_7_2_1.setBounds(25, 159, 122, 15);
		panel_1_1.add(lblNewLabel_7_2_1);
		
		textFieldProduktName = new JTextField();
		textFieldProduktName.setColumns(10);
		textFieldProduktName.setBounds(10, 179, 237, 18);
		panel_1_1.add(textFieldProduktName);
		
		JLabel lblNewLabel_7_1_1_1 = new JLabel("Produkt Preis:");
		lblNewLabel_7_1_1_1.setBounds(25, 209, 181, 15);
		//panel_1_1.add(lblNewLabel_7_1_1_1);
		
		textFieldMinPreis = new JTextField();
		textFieldMinPreis.setColumns(10);
		textFieldMinPreis.setBounds(10, 229, 90, 18);
		//panel_1_1.add(textFieldMinPreis);
		
		JLabel lblNewLabel_7_3_1 = new JLabel("Filiale:");
		lblNewLabel_7_3_1.setBounds(25, 208, 48, 15);
		panel_1_1.add(lblNewLabel_7_3_1);
		
		textFieldProduktFiliale = new JTextField();
		textFieldProduktFiliale.setColumns(10);
		textFieldProduktFiliale.setBounds(10, 228, 237, 18);
		panel_1_1.add(textFieldProduktFiliale);
		
		ButtonGroup produktSucheBtnGroup = new ButtonGroup();
		
		JRadioButton rdbtnUnverkaufte = new JRadioButton("unverkaufte");
		rdbtnUnverkaufte.setSelected(true);
		rdbtnUnverkaufte.setBounds(25, 310, 109, 23);
		panel_1_1.add(rdbtnUnverkaufte);
		produktSucheBtnGroup.add(rdbtnUnverkaufte);
		
		JRadioButton rdbtnVerkaufte = new JRadioButton("verkaufte");
		rdbtnVerkaufte.setBounds(136, 310, 111, 23);
		panel_1_1.add(rdbtnVerkaufte);
		produktSucheBtnGroup.add(rdbtnVerkaufte);
		
		JRadioButton rdbtnAlleProdukte = new JRadioButton("alle Produkte");
		rdbtnAlleProdukte.setBounds(75, 336, 116, 23);
		panel_1_1.add(rdbtnAlleProdukte);
		produktSucheBtnGroup.add(rdbtnAlleProdukte);
		
		JButton btnProduktSuche = new JButton("Produkt Suche");
		btnProduktSuche.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(rdbtnUnverkaufte.isSelected()) {
						sucheProduktModel(textFieldProduktId.getText(),textFieldProduktTitel.getText(),textFieldProduktName.getText(),"","",textFieldProduktFiliale.getText(),textFieldFarbe.getText(), '1');
					} else if(rdbtnVerkaufte.isSelected()) {
						sucheProduktModel(textFieldProduktId.getText(),textFieldProduktTitel.getText(),textFieldProduktName.getText(),"","",textFieldProduktFiliale.getText(),textFieldFarbe.getText(), '2');
					} else {	
						sucheProduktModel(textFieldProduktId.getText(),textFieldProduktTitel.getText(),textFieldProduktName.getText(),"","",textFieldProduktFiliale.getText(),textFieldFarbe.getText(), '9');
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
			}
		});
		btnProduktSuche.setBounds(25, 366, 208, 25);
		panel_1_1.add(btnProduktSuche);
		
		
		textProduktSum.setHorizontalAlignment(SwingConstants.CENTER);
		textProduktSum.setBounds(48, 396, 158, 14);
		panel_1_1.add(textProduktSum);
		
		JButton btnProduktAddieren = new JButton("Produkt Addieren");
		btnProduktAddieren.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProduktAddGui pag = new ProduktAddGui(admin);
				pag.setVisible(true);
				pag.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosed(WindowEvent e) {
						updateProduktModel();
					}
				});
			}
		});
		btnProduktAddieren.setBounds(10, 614, 237, 30);
		panel_1_1.add(btnProduktAddieren);
		
		JLabel lblNewLabel_8 = new JLabel("Produkt Suche");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_8.setBounds(82, 11, 109, 14);
		panel_1_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_10 = new JLabel("\u2264 Preis \u2264");
		lblNewLabel_10.setBounds(103, 231, 57, 14);
		//panel_1_1.add(lblNewLabel_10);
		
		textFieldMaxPreis = new JTextField();
		textFieldMaxPreis.setColumns(10);
		textFieldMaxPreis.setBounds(157, 228, 90, 18);
		//panel_1_1.add(textFieldMaxPreis);
		
		
		
		JLabel lblNewLabel_7_3_1_1 = new JLabel("Farbe:");
		lblNewLabel_7_3_1_1.setBounds(25, 257, 208, 15);
		panel_1_1.add(lblNewLabel_7_3_1_1);
		
		textFieldFarbe = new JTextField();
		textFieldFarbe.setColumns(10);
		textFieldFarbe.setBounds(10, 277, 237, 18);
		panel_1_1.add(textFieldFarbe);
		
		JButton btnProduktDelete = new JButton("Produkt L\u00F6schen");
		btnProduktDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textFieldProduktIdDelete.getText().length() != 0) {
					if(admin.deleteProdukt(textFieldProduktIdDelete.getText())) {
						JOptionPane.showMessageDialog(null, "Produkt wird erfolgreich gelöscht.");
						textFieldProduktIdDelete.setText(null);
						updateProduktModel();
					}
				} else {
					JOptionPane.showMessageDialog(null, "Bitte geben Sie ein Produkt ID!!!");
				}
			}
		});
		btnProduktDelete.setBounds(10, 502, 237, 30);
		panel_1_1.add(btnProduktDelete);
		
		JLabel lblNewLabel_11_1 = new JLabel("Produkt ID:");
		lblNewLabel_11_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_11_1.setBounds(10, 454, 90, 14);
		panel_1_1.add(lblNewLabel_11_1);
		
		textFieldProduktIdDelete = new JTextField();
		textFieldProduktIdDelete.setBounds(10, 468, 237, 23);
		panel_1_1.add(textFieldProduktIdDelete);
		textFieldProduktIdDelete.setColumns(10);
		
		JPanel kundeVerwaltung = new JPanel();
		tabbedPane.addTab("Kunde Verwaltung", null, kundeVerwaltung, null);
		kundeVerwaltung.setLayout(null);
		
		JPanel kundeVerwaltung_1 = new JPanel();
		kundeVerwaltung_1.setLayout(null);
		kundeVerwaltung_1.setBounds(0, 0, 1213, 726);
		kundeVerwaltung.add(kundeVerwaltung_1);
		
		JScrollPane kundeListe = new JScrollPane();
		kundeListe.setBounds(10, 11, 927, 706);
		kundeVerwaltung_1.add(kundeListe);
		
		kundeTable = new JTable(kundeModel);
		kundeListe.setViewportView(kundeTable);
		kundeTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				try {
					textFieldKundeIdDelete.setText(kundeTable.getValueAt(kundeTable.getSelectedRow(), 0).toString());
				}catch(Exception ex){	
				}
			}
			
		});
		
		kundeTable.getModel().addTableModelListener(new TableModelListener() {

			@Override
			public void tableChanged(TableModelEvent e) {
				// TODO Auto-generated method stub
				if(e.getType() == TableModelEvent.UPDATE) {
					String selectId = kundeTable.getValueAt(kundeTable.getSelectedRow(), 0).toString();
					String selectName = kundeTable.getValueAt(kundeTable.getSelectedRow(), 1).toString();
					String selectNachname = kundeTable.getValueAt(kundeTable.getSelectedRow(), 2).toString();
					String selectFiliale = kundeTable.getValueAt(kundeTable.getSelectedRow(), 3).toString();
					String selectGeburtsdatum = kundeTable.getValueAt(kundeTable.getSelectedRow(), 4).toString();
					String selectGesclecht = kundeTable.getValueAt(kundeTable.getSelectedRow(), 5).toString();
					String selectAdress = kundeTable.getValueAt(kundeTable.getSelectedRow(), 6).toString();
					String selectTelnr = kundeTable.getValueAt(kundeTable.getSelectedRow(), 7).toString();

					try {
						if(admin.updateKunde(selectId, selectName, selectNachname, selectFiliale, selectGeburtsdatum, selectGesclecht, selectAdress,selectTelnr)) {
							JOptionPane.showMessageDialog(null,"Aktualisierung von Kunde ist erfolgreich!!!");
						} else {
							JOptionPane.showMessageDialog(null,"Aktualisierung von Kunde ist nicht erfolgreich!!!");
						}
					}catch(Exception e2){
						e2.printStackTrace();
					}
				}
			}
			
		});
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1_1_1.setBounds(947, 11, 256, 705);
		kundeVerwaltung_1.add(panel_1_1_1);
		
		JLabel lblNewLabel_7_4_1 = new JLabel("Kunde ID:");
		lblNewLabel_7_4_1.setBounds(25, 54, 181, 15);
		panel_1_1_1.add(lblNewLabel_7_4_1);
		
		textFieldKundeId = new JTextField();
		textFieldKundeId.setColumns(10);
		textFieldKundeId.setBounds(10, 74, 237, 18);
		panel_1_1_1.add(textFieldKundeId);
		
		JLabel lblNewLabel_7_1_3_1 = new JLabel("Name:");
		lblNewLabel_7_1_3_1.setBounds(25, 107, 181, 15);
		panel_1_1_1.add(lblNewLabel_7_1_3_1);
		
		textFieldKundeName = new JTextField();
		textFieldKundeName.setColumns(10);
		textFieldKundeName.setBounds(10, 127, 237, 18);
		panel_1_1_1.add(textFieldKundeName);
		
		JLabel lblNewLabel_7_2_1_1 = new JLabel("Nachname:");
		lblNewLabel_7_2_1_1.setBounds(25, 159, 122, 15);
		panel_1_1_1.add(lblNewLabel_7_2_1_1);
		
		textFieldKundeNachname = new JTextField();
		textFieldKundeNachname.setColumns(10);
		textFieldKundeNachname.setBounds(10, 179, 237, 18);
		panel_1_1_1.add(textFieldKundeNachname);
		
		JLabel lblNewLabel_7_3_1_2 = new JLabel("Filiale:");
		lblNewLabel_7_3_1_2.setBounds(25, 216, 48, 15);
		panel_1_1_1.add(lblNewLabel_7_3_1_2);
		
		textFieldKundeFiliale = new JTextField();
		textFieldKundeFiliale.setColumns(10);
		textFieldKundeFiliale.setBounds(10, 236, 237, 18);
		panel_1_1_1.add(textFieldKundeFiliale);
		
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
		btnKundeSuche.setBounds(25, 283, 208, 25);
		panel_1_1_1.add(btnKundeSuche);
		
		JButton btnKundeAddieren = new JButton("Kunde Addieren");
		btnKundeAddieren.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KundeAddGui pag = new KundeAddGui(admin);
				pag.setVisible(true);
				pag.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosed(WindowEvent e) {
						updateKundeModel();
					}
				});
			}
		});
		btnKundeAddieren.setBounds(10, 539, 237, 30);
		panel_1_1_1.add(btnKundeAddieren);
		
		JLabel lblNewLabel_8_1 = new JLabel("Kunde Suche");
		lblNewLabel_8_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_8_1.setBounds(82, 11, 109, 14);
		panel_1_1_1.add(lblNewLabel_8_1);
		
		JButton btnKundeDelete = new JButton("Kunde L\u00F6schen");
		btnKundeDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textFieldKundeIdDelete.getText().length() != 0) {
					if(admin.deleteKunde(textFieldKundeIdDelete.getText())) {
						JOptionPane.showMessageDialog(null, "Kunde wird erfolgreich gelöscht.");
						textFieldKundeIdDelete.setText(null);
						updateKundeModel();
					}
				} else {
					JOptionPane.showMessageDialog(null, "Bitte geben Sie ein Kunde ID!!!");
				}
			}
		});
		btnKundeDelete.setBounds(10, 438, 237, 30);
		panel_1_1_1.add(btnKundeDelete);
		
		JLabel lblNewLabel_11_1_1 = new JLabel("Kunde ID:");
		lblNewLabel_11_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_11_1_1.setBounds(10, 390, 90, 14);
		panel_1_1_1.add(lblNewLabel_11_1_1);
		
		textFieldKundeIdDelete = new JTextField();
		textFieldKundeIdDelete.setColumns(10);
		textFieldKundeIdDelete.setBounds(10, 404, 237, 23);
		panel_1_1_1.add(textFieldKundeIdDelete);
		textKundeSum.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		textKundeSum.setBounds(82, 319, 107, 14);
		panel_1_1_1.add(textKundeSum);
		
		JPanel aufzeichnungVerwaltung = new JPanel();
		tabbedPane.addTab("Aufzeichnung Verwaltung", null, aufzeichnungVerwaltung, null);
		aufzeichnungVerwaltung.setLayout(null);
		
		JScrollPane aufzeichnungListe = new JScrollPane();
		aufzeichnungListe.setBounds(10, 11, 927, 706);
		aufzeichnungVerwaltung.add(aufzeichnungListe);
		
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
		aufzeichnungVerwaltung.add(panel_1_1_1_1);
		
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
		
		JButton btnAufzeichnungAddieren = new JButton("Verkaufaufzeichnung Addieren");
		btnAufzeichnungAddieren.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VerkaufAddGui pag = new VerkaufAddGui(admin);
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
					if(admin.deleteAufzeichnung(textFieldAufzeichnungIdDelete.getText(), bufferProdukt)) {
						JOptionPane.showMessageDialog(null, "Aufzeichnung wird erfolgreich gelöscht.");
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
		
		
		
		personalTable.getSelectionModel().addListSelectionListener( new ListSelectionListener() {
			boolean cntrl = true;
			@Override
			public void valueChanged(ListSelectionEvent e) {
				if(cntrl) {
					//int res = JOptionPane.showConfirmDialog(null, "Möchten Sie dieser Personal schauen? ", "Message", JOptionPane.YES_NO_OPTION);
					if(true/*res == 0*/) {
						try {	
							personalData[0] = personalTable.getValueAt(personalTable.getSelectedRow(), 0).toString();
							personalData[1] = personalTable.getValueAt(personalTable.getSelectedRow(), 1).toString();
							personalData[2] = personalTable.getValueAt(personalTable.getSelectedRow(), 2).toString();
							personalData[3] = personalTable.getValueAt(personalTable.getSelectedRow(), 3).toString();
							personalData[4] = personalTable.getValueAt(personalTable.getSelectedRow(), 4).toString();
							personalData[5] = personalTable.getValueAt(personalTable.getSelectedRow(), 5).toString();
							personalData[6] = personalTable.getValueAt(personalTable.getSelectedRow(), 6).toString();
							personalData[7] = personalTable.getValueAt(personalTable.getSelectedRow(), 7).toString();
							personalData[8] = personalTable.getValueAt(personalTable.getSelectedRow(), 8).toString();
							personalData[9] = personalTable.getValueAt(personalTable.getSelectedRow(), 9).toString();
							Personal personal = new Personal(personalData[0].toString(),personalData[1].toString(),personalData[9].toString(),personalData[2].toString(),personalData[3].toString(),personalData[4].toString(),personalData[5].toString(),personalData[6].toString(),personalData[7].toString(),personalData[8].toString());
							boolean control = (admin.personalControl(personal.getId(), personal.getPersonalId(), personal.getPasswort(), personal.getName(), personal.getNachname(), personal.getFiliale(), personal.getGeburtsdatum(), personal.getGeschlecht(), personal.getAdress(), personal.getTelNr())).equals("gültig");
							if(control) {
								cntrl = false;
								PersonalInfos personalInfos = new PersonalInfos(personal, admin);
								personalInfos.setVisible(true);
								personalInfos.addWindowListener(new WindowAdapter() {
									@Override
									public void windowClosed(WindowEvent e) {
										updatePersonalModel();
										cntrl = true;
									}	
								});
	
							} else {
									JOptionPane.showMessageDialog(null, "Fehler!!!");
							}	
						} catch (Exception el) {
						}	
					} else {	
					}
				}
				// TODO Auto-generated method stub		
			}
		});
		
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
	
	public static void updateAdminModel()  {
		DefaultTableModel clearModel = (DefaultTableModel) adminTable.getModel();
		clearModel.setRowCount(0);
		adminSum = 0;
		try {
			for(int i = 0; i<admin.getAdminList().size(); i++) {
				adminData[0] = admin.getAdminList().get(i).getId();
				adminData[1] = admin.getAdminList().get(i).getPersonalId();
				adminData[2] = admin.getAdminList().get(i).getName();
				adminData[3] = admin.getAdminList().get(i).getNachname();
				adminData[4] = admin.getAdminList().get(i).getFiliale();
				adminData[5] = admin.getAdminList().get(i).getGeburtsdatum();
				adminData[6] = admin.getAdminList().get(i).getGeschlecht();
				adminData[7] = admin.getAdminList().get(i).getAdress();
				adminData[8] = admin.getAdminList().get(i).getTelNr();
				adminData[9] = admin.getAdminList().get(i).getPasswort();
				adminModel.addRow(adminData);
				adminSum++;
				
			}
			textAdminSum.setText(adminSum + " Admin gefunden");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void sucheAdminModel(String column, String key) throws SQLException {
		DefaultTableModel clearModel = (DefaultTableModel) adminTable.getModel();
		clearModel.setRowCount(0);
		adminSum = 0;
		for(int i = 0; i<admin.adminSuche(column, key).size(); i++) {
			adminData[0] = admin.adminSuche(column, key).get(i).getId();
			adminData[1] = admin.adminSuche(column, key).get(i).getPersonalId();
			adminData[2] = admin.adminSuche(column, key).get(i).getName();
			adminData[3] = admin.adminSuche(column, key).get(i).getNachname();
			adminData[4] = admin.adminSuche(column, key).get(i).getFiliale();
			adminData[5] = admin.adminSuche(column, key).get(i).getGeburtsdatum();
			adminData[6] = admin.adminSuche(column, key).get(i).getGeschlecht();
			adminData[7] = admin.adminSuche(column, key).get(i).getAdress();
			adminData[8] = admin.adminSuche(column, key).get(i).getTelNr();
			adminData[9] = admin.adminSuche(column, key).get(i).getPasswort();
			adminModel.addRow(adminData);
			adminSum++;
			
		}
		textAdminSum.setText(adminSum + " Admin gefunden");
	}
	
	public static void updatePersonalModel()  {
		DefaultTableModel clearModel = (DefaultTableModel) personalTable.getModel();
		clearModel.setRowCount(0);
		personalSum = 0;
		try {
			for(int i = 0; i<admin.getPersonalList().size(); i++) {
				personalData[0] = admin.getPersonalList().get(i).getId();
				personalData[1] = admin.getPersonalList().get(i).getPersonalId();
				personalData[2] = admin.getPersonalList().get(i).getName();
				personalData[3] = admin.getPersonalList().get(i).getNachname();
				personalData[4] = admin.getPersonalList().get(i).getFiliale();
				personalData[5] = admin.getPersonalList().get(i).getGeburtsdatum();
				personalData[6] = admin.getPersonalList().get(i).getGeschlecht();
				personalData[7] = admin.getPersonalList().get(i).getAdress();
				personalData[8] = admin.getPersonalList().get(i).getTelNr();
				personalData[9] = admin.getPersonalList().get(i).getPasswort();
				personalModel.addRow(personalData);
				personalSum++;
				
			}
			textPersonalSum.setText(personalSum + " Personal gefunden");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void suchePersonalModel(String id, String personalId,String name, String nachname, String filiale, char pt) throws SQLException {
		DefaultTableModel clearModel = (DefaultTableModel) personalTable.getModel();
		clearModel.setRowCount(0);
		personalSum = 0;
		for(int i = 0; i<admin.personalSuche(id, personalId, name, nachname, filiale, pt).size(); i++) {
			personalData[0] = admin.personalSuche(id, personalId, name, nachname, filiale, pt).get(i).getId();
			personalData[1] = admin.personalSuche(id, personalId, name, nachname, filiale, pt).get(i).getPersonalId();
			personalData[2] = admin.personalSuche(id, personalId, name, nachname, filiale, pt).get(i).getName();
			personalData[3] = admin.personalSuche(id, personalId, name, nachname, filiale, pt).get(i).getNachname();
			personalData[4] = admin.personalSuche(id, personalId, name, nachname, filiale, pt).get(i).getFiliale();
			personalData[5] = admin.personalSuche(id, personalId, name, nachname, filiale, pt).get(i).getGeburtsdatum();
			personalData[6] = admin.personalSuche(id, personalId, name, nachname, filiale, pt).get(i).getGeschlecht();
			personalData[7] = admin.personalSuche(id, personalId, name, nachname, filiale, pt).get(i).getAdress();
			personalData[8] = admin.personalSuche(id, personalId, name, nachname, filiale, pt).get(i).getTelNr();
			personalData[9] = admin.personalSuche(id, personalId, name, nachname, filiale, pt).get(i).getPasswort();
			personalModel.addRow(personalData);
			personalSum++;
			
		}
		textPersonalSum.setText(personalSum + " Personal gefunden");
	}
	
	public static void updateProduktModel()  {
		DefaultTableModel clearModel = (DefaultTableModel) produktTable.getModel();
		clearModel.setRowCount(0);
		produktSum = 0;
		try {
			for(int i = 0; i<admin.getProduktList().size(); i++) {
				produktData[0] = admin.getProduktList().get(i).getProduktId();
				produktData[1] = admin.getProduktList().get(i).getProduktTitel();
				produktData[2] = admin.getProduktList().get(i).getProduktName();
				produktData[3] = admin.getProduktList().get(i).getPreis();
				produktData[4] = admin.getProduktList().get(i).getGarantiezeit();
				produktData[5] = admin.getProduktList().get(i).getFiliale();
				produktData[6] = admin.getProduktList().get(i).getFarbe();
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
		//ArrayList<Produkt> list = admin.produktSuche(id, titel, name, minPreis, maxPreis, filiale, farbe, pt);
		for(int i = 0; i<admin.produktSuche(id, titel, name, minPreis, maxPreis, filiale, farbe, pt).size(); i++) {
			produktData[0] = admin.produktSuche(id, titel, name, minPreis, maxPreis, filiale, farbe, pt).get(i).getProduktId();
			produktData[1] = admin.produktSuche(id, titel, name, minPreis, maxPreis, filiale, farbe, pt).get(i).getProduktTitel();
			produktData[2] = admin.produktSuche(id, titel, name, minPreis, maxPreis, filiale, farbe, pt).get(i).getProduktName();
			produktData[3] = admin.produktSuche(id, titel, name, minPreis, maxPreis, filiale, farbe, pt).get(i).getPreis();
			produktData[4] = admin.produktSuche(id, titel, name, minPreis, maxPreis, filiale, farbe, pt).get(i).getGarantiezeit();
			produktData[5] = admin.produktSuche(id, titel, name, minPreis, maxPreis, filiale, farbe, pt).get(i).getFiliale();
			produktData[6] = admin.produktSuche(id, titel, name, minPreis, maxPreis, filiale, farbe, pt).get(i).getFarbe();
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
			for(int i = 0; i<admin.getKundeList().size(); i++) {
				kundeData[0] = admin.getKundeList().get(i).getId();
				kundeData[1] = admin.getKundeList().get(i).getName();
				kundeData[2] = admin.getKundeList().get(i).getNachname();
				kundeData[3] = admin.getKundeList().get(i).getFiliale();
				kundeData[4] = admin.getKundeList().get(i).getGeburtsdatum();
				kundeData[5] = admin.getKundeList().get(i).getGeschlecht();
				kundeData[6] = admin.getKundeList().get(i).getAdress();
				kundeData[7] = admin.getKundeList().get(i).getTelNr();
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
		//ArrayList<Produkt> list = admin.produktSuche(id, titel, name, minPreis, maxPreis, filiale, farbe, pt);
		for(int i = 0; i<admin.kundeSuche(id, name, nachname, filiale).size(); i++) {
			kundeData[0] = admin.kundeSuche(id, name, nachname, filiale).get(i).getId();
			kundeData[1] = admin.kundeSuche(id, name, nachname, filiale).get(i).getName();
			kundeData[2] = admin.kundeSuche(id, name, nachname, filiale).get(i).getNachname();
			kundeData[3] = admin.kundeSuche(id, name, nachname, filiale).get(i).getFiliale();
			kundeData[4] = admin.kundeSuche(id, name, nachname, filiale).get(i).getGeburtsdatum();
			kundeData[5] = admin.kundeSuche(id, name, nachname, filiale).get(i).getGeschlecht();
			kundeData[6] = admin.kundeSuche(id, name, nachname, filiale).get(i).getAdress();
			kundeData[7] = admin.kundeSuche(id, name, nachname, filiale).get(i).getTelNr();
			kundeModel.addRow(kundeData);
			kundeSum++;
			
		}
		textKundeSum.setText(kundeSum + " Kunde gefunden");
	}
	
	public static void sucheAufzeichnungModel(String id, String kunde,String personal, String produkt, char pt) throws SQLException {
		DefaultTableModel clearModel = (DefaultTableModel) aufzeichnungTable.getModel();
		clearModel.setRowCount(0);
		aufzeichnungSum = 0;
		for(int i = 0; i<admin.aufzeichnungSuche(id, kunde, personal, produkt, pt).size(); i++) {
			aufzeichnungData[0] = admin.aufzeichnungSuche(id, kunde, personal, produkt, pt).get(i).getId();
			aufzeichnungData[1] = admin.aufzeichnungSuche(id, kunde, personal, produkt, pt).get(i).getKunde();
			aufzeichnungData[2] = admin.aufzeichnungSuche(id, kunde, personal, produkt, pt).get(i).getPersonal();
			aufzeichnungData[3] = admin.aufzeichnungSuche(id, kunde, personal, produkt, pt).get(i).getProdukt();
			aufzeichnungData[4] = admin.aufzeichnungSuche(id, kunde, personal, produkt, pt).get(i).getPreis();
			aufzeichnungData[5] = admin.aufzeichnungSuche(id, kunde, personal, produkt, pt).get(i).getDatum();
			aufzeichnungData[6] = admin.aufzeichnungSuche(id, kunde, personal, produkt, pt).get(i).getGarantiezeit();
			aufzeichnungData[7] = admin.aufzeichnungSuche(id, kunde, personal, produkt, pt).get(i).getInfos();
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
			for(int i = 0; i<admin.getAufzeichnungList().size(); i++) {
				aufzeichnungData[0] = admin.getAufzeichnungList().get(i).getId();
				aufzeichnungData[1] = admin.getAufzeichnungList().get(i).getKunde();
				aufzeichnungData[2] = admin.getAufzeichnungList().get(i).getPersonal();
				aufzeichnungData[3] = admin.getAufzeichnungList().get(i).getProdukt();
				aufzeichnungData[4] = admin.getAufzeichnungList().get(i).getPreis();
				aufzeichnungData[5] = admin.getAufzeichnungList().get(i).getDatum();
				aufzeichnungData[6] = admin.getAufzeichnungList().get(i).getGarantiezeit();
				aufzeichnungData[7] = admin.getAufzeichnungList().get(i).getInfos();
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
