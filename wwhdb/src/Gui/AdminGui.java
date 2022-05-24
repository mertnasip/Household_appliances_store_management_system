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
	private static DefaultTableModel adminModel = null;
	private static DefaultTableModel personalModel = null;
	private static Object[] adminData = new Object[10];
	private static Object[] personalData = new Object[10];
	private JPopupMenu personalMenu; 
	private JTextField textFieldId;
	private JTextField textFieldPersonalId;
	private JTextField textFieldName;
	private JTextField textFieldNachname;
	private JTextField textFieldFiliale;
	private static int adminSum = 0;
	private static int personalSum = 0;
	//private static int buffer;
	private static JLabel textAdminSum = new JLabel(adminSum + " Admin gefunden");
	private static JLabel textPersonalSum = new JLabel(personalSum + " Personal gefunden");
	
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

		setTitle("Weißwarenhändler Managment System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 200, 1000, 750);
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
		btnQuit.setBounds(880, 10, 100, 30);
		contentPane.add(btnQuit);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 50, 970, 654);
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
		adminListe.setBounds(10, 40, 713, 574);
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
		panel.setBounds(733, 40, 222, 574);
		adminVerwaltung.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Neu Admin Hinzufügung");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(44, 11, 135, 14);
		panel.add(lblNewLabel_4);
		
		textFieldAdminId = new JTextField();
		textFieldAdminId.setBounds(97, 46, 115, 20);
		panel.add(textFieldAdminId);
		textFieldAdminId.setColumns(10);
		
		textFieldAdminPersonalId = new JTextField();
		textFieldAdminPersonalId.setBounds(97, 77, 115, 20);
		panel.add(textFieldAdminPersonalId);
		textFieldAdminPersonalId.setColumns(10);
		
		textFieldAdminPasswort = new JTextField();
		textFieldAdminPasswort.setBounds(97, 108, 115, 20);
		panel.add(textFieldAdminPasswort);
		textFieldAdminPasswort.setColumns(10);
		
		textFieldAdminName = new JTextField();
		textFieldAdminName.setBounds(97, 139, 115, 20);
		panel.add(textFieldAdminName);
		textFieldAdminName.setColumns(10);
		
		textFieldAdminNachname = new JTextField();
		textFieldAdminNachname.setBounds(97, 170, 115, 20);
		panel.add(textFieldAdminNachname);
		textFieldAdminNachname.setColumns(10);
		
		textFieldAdminFiliale = new JTextField();
		textFieldAdminFiliale.setBounds(97, 201, 115, 20);
		panel.add(textFieldAdminFiliale);
		textFieldAdminFiliale.setColumns(10);
		
		textFieldAdminGeburtsdatum = new JTextField();
		textFieldAdminGeburtsdatum.setBounds(97, 232, 115, 20);
		panel.add(textFieldAdminGeburtsdatum);
		textFieldAdminGeburtsdatum.setColumns(10);
		
		textFieldAdminGeschlecht = new JTextField();
		textFieldAdminGeschlecht.setBounds(97, 263, 115, 20);
		panel.add(textFieldAdminGeschlecht);
		textFieldAdminGeschlecht.setColumns(10);
		
		textFieldAdminAdress = new JTextField();
		textFieldAdminAdress.setBounds(97, 294, 115, 20);
		panel.add(textFieldAdminAdress);
		textFieldAdminAdress.setColumns(10);
		
		textFieldAdminTelNr = new JTextField();
		textFieldAdminTelNr.setBounds(97, 325, 115, 20);
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
		btnAdminAdd.setBounds(10, 413, 95, 23);
		panel.add(btnAdminAdd);
		
		JLabel lblNewLabel_5 = new JLabel("Id:");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5.setBounds(10, 49, 78, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("Personal Id:");
		lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5_1.setBounds(10, 80, 78, 14);
		panel.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("Passwort:");
		lblNewLabel_5_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5_2.setBounds(10, 111, 78, 14);
		panel.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_5_3 = new JLabel("Name:");
		lblNewLabel_5_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5_3.setBounds(10, 142, 78, 14);
		panel.add(lblNewLabel_5_3);
		
		JLabel lblNewLabel_5_4 = new JLabel("Nachname:");
		lblNewLabel_5_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5_4.setBounds(10, 173, 78, 14);
		panel.add(lblNewLabel_5_4);
		
		JLabel lblNewLabel_5_5 = new JLabel("Filiale:");
		lblNewLabel_5_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5_5.setBounds(10, 204, 78, 14);
		panel.add(lblNewLabel_5_5);
		
		JLabel lblNewLabel_5_6 = new JLabel("Geburtsdatum:");
		lblNewLabel_5_6.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5_6.setBounds(10, 235, 78, 14);
		panel.add(lblNewLabel_5_6);
		
		JLabel lblNewLabel_5_7 = new JLabel("Geschlecht:");
		lblNewLabel_5_7.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5_7.setBounds(10, 266, 78, 14);
		panel.add(lblNewLabel_5_7);
		
		JLabel lblNewLabel_5_8 = new JLabel("Adress:");
		lblNewLabel_5_8.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5_8.setBounds(10, 297, 78, 14);
		panel.add(lblNewLabel_5_8);
		
		JLabel lblNewLabel_5_9 = new JLabel("Tel Nr.:");
		lblNewLabel_5_9.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5_9.setBounds(10, 328, 78, 14);
		panel.add(lblNewLabel_5_9);
		
		JButton adminDelete = new JButton("Löschen");
		adminDelete.setBounds(65, 447, 95, 23);
		panel.add(adminDelete);
		
		fieldPasswortRemove = new JTextField();
		fieldPasswortRemove.setBounds(10, 382, 202, 20);
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
		adminAktualisieren.setBounds(115, 413, 95, 23);
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
		
		textAdminSum.setBounds(792, 13, 120, 14);
		adminVerwaltung.add(textAdminSum);
		
		JPanel personalVerwaltung = new JPanel();
		tabbedPane.addTab("Personal Verwaltung", null, personalVerwaltung, null);
		personalVerwaltung.setLayout(null);
		
		JScrollPane personalListe = new JScrollPane();
		personalListe.setBounds(10, 11, 753, 604);
		personalVerwaltung.add(personalListe);
		
		JButton btnPersonalAdd = new JButton("Personal Addieren");
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
		btnPersonalAdd.setBounds(773, 574, 182, 30);
		personalVerwaltung.add(btnPersonalAdd);
		
		personalTable = new JTable(personalModel);
		personalListe.setViewportView(personalTable);
		
		JLabel lblNewLabel_6 = new JLabel("Personal Suche");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(805, 21, 110, 14);
		personalVerwaltung.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("ID:");
		lblNewLabel_7.setBounds(774, 51, 48, 15);
		personalVerwaltung.add(lblNewLabel_7);
		
		textFieldId = new JTextField();
		textFieldId.setBounds(773, 71, 182, 18);
		personalVerwaltung.add(textFieldId);
		textFieldId.setColumns(10);
		
		JLabel lblNewLabel_7_1 = new JLabel("Personal ID:");
		lblNewLabel_7_1.setBounds(774, 94, 181, 15);
		personalVerwaltung.add(lblNewLabel_7_1);
		
		textFieldPersonalId = new JTextField();
		textFieldPersonalId.setColumns(10);
		textFieldPersonalId.setBounds(773, 114, 182, 18);
		personalVerwaltung.add(textFieldPersonalId);
		
		JRadioButton btnVerkaeufer = new JRadioButton("Verk\u00E4ufer");
		btnVerkaeufer.setBounds(774, 285, 80, 23);
		personalVerwaltung.add(btnVerkaeufer);
		
		JRadioButton btnTechniker = new JRadioButton("Techniker");
		btnTechniker.setBounds(859, 285, 96, 23);
		personalVerwaltung.add(btnTechniker);
		
		JRadioButton btnAlle = new JRadioButton("Alle Rolle");
		btnAlle.setBounds(823, 310, 85, 23);
		personalVerwaltung.add(btnAlle);
		
		ButtonGroup personalSucheBtnGroup = new ButtonGroup();
		personalSucheBtnGroup.add(btnVerkaeufer);
		personalSucheBtnGroup.add(btnTechniker);
		personalSucheBtnGroup.add(btnAlle);
		
		JButton btnPersonalSuche = new JButton("Personal Suche");
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
		
		btnPersonalSuche.setBounds(773, 340, 182, 25);
		personalVerwaltung.add(btnPersonalSuche);
		
		JLabel lblNewLabel_7_2 = new JLabel("Name:");
		lblNewLabel_7_2.setBounds(774, 139, 48, 15);
		personalVerwaltung.add(lblNewLabel_7_2);
		
		textFieldName = new JTextField();
		textFieldName.setColumns(10);
		textFieldName.setBounds(773, 159, 182, 18);
		personalVerwaltung.add(textFieldName);
		
		JLabel lblNewLabel_7_1_1 = new JLabel("Nachname:");
		lblNewLabel_7_1_1.setBounds(774, 182, 181, 15);
		personalVerwaltung.add(lblNewLabel_7_1_1);
		
		textFieldNachname = new JTextField();
		textFieldNachname.setColumns(10);
		textFieldNachname.setBounds(773, 202, 182, 18);
		personalVerwaltung.add(textFieldNachname);
		
		JLabel lblNewLabel_7_3 = new JLabel("Filiale:");
		lblNewLabel_7_3.setBounds(774, 225, 48, 15);
		personalVerwaltung.add(lblNewLabel_7_3);
		
		textFieldFiliale = new JTextField();
		textFieldFiliale.setColumns(10);
		textFieldFiliale.setBounds(773, 245, 182, 18);
		personalVerwaltung.add(textFieldFiliale);
		
		JLabel lblNewLabel_7_1_2 = new JLabel("Personal Rolle:");
		lblNewLabel_7_1_2.setBounds(774, 268, 181, 15);
		personalVerwaltung.add(lblNewLabel_7_1_2);
		
		
		textPersonalSum.setHorizontalAlignment(SwingConstants.CENTER);
		textPersonalSum.setBounds(805, 376, 110, 14);
		personalVerwaltung.add(textPersonalSum);
		
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
				textAdminSum.setText(adminSum + " Admin gefunden");
			}
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
			textAdminSum.setText(adminSum + " Admin gefunden");
		}
		
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
				textPersonalSum.setText(personalSum + " Personal gefunden");
			}
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
			textPersonalSum.setText(personalSum + " Personal gefunden");
		}
		
	}
}
