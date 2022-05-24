package Entities;

import java.sql.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Admin  extends Personal {
    
	Connection con = null;
	Statement st = null;
	ResultSet rs = null;
	PreparedStatement ps = null;
	
	public Admin(){

    }
    public Admin(String id, String personalId, String passwort){
        this.id=id;
        this.personalId = personalId;
        this.passwort = passwort;
    }
    public Admin(String id, String personalId, String passwort, String name, String nachname, String filiale ){
        this.id=id;
        this.personalId = personalId;
        this.passwort = passwort;
        this.name=name;
        this.nachname=nachname;
        this.filiale=filiale;
    }
    public Admin(String id, String personalId, String passwort, String name, String nachname, String filiale , String geburtsdatum, String geschlecht, String adress, String telNr){
        this.id=id;
        this.personalId = personalId;
        this.passwort = passwort;
        this.name=name;
        this.nachname=nachname;
        this.filiale=filiale;
        this.geburtsdatum=geburtsdatum;
        this.geschlecht=geschlecht;
        this.adress=adress;
        this.telNr=telNr;
    }
    
    public ArrayList<Admin> getAdminList() throws SQLException {
    	ArrayList<Admin> list = new ArrayList<>();
    	Admin admin;
    	try {
    		con = dbm.getConnection();
			st = con.createStatement();
			rs = st.executeQuery("SELECT * FROM admin");
	    	while(rs.next()) {
	    		admin = new Admin(rs.getString("id"),rs.getString("personalId"),rs.getString("passwort"),rs.getString("name"),rs.getString("nachname"),rs.getString("filiale"),rs.getString("geburtsdatum"),rs.getString("geschlecht"),rs.getString("adress"),rs.getString("telnr"));
	    		list.add(admin);
	    	}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				con.close();
				st.close();
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
    	
    	
    	return list;
    }
    
    public boolean addAdmin(Admin admin) {
    	String query = "INSERT INTO admin" + "(id,personalId,passwort,name,nachname,filiale,geburtsdatum,geschlecht,adress,telnr) VALUES" + "(?,?,?,?,?,?,?,?,?,?)";
    	boolean ret = false; 
    	try {
    		con = dbm.getConnection();
	    	ps = con.prepareStatement(query);
	    	ps.setString(1, admin.getId());
	    	ps.setString(2, admin.getPersonalId());
	    	ps.setString(3, admin.getPasswort());
	    	ps.setString(4, admin.getName());
	    	ps.setString(5, admin.getNachname());
	    	ps.setString(6, admin.getFiliale());
	    	ps.setString(7, admin.getGeburtsdatum());
	    	ps.setString(8, admin.getGeschlecht());
	    	ps.setString(9, admin.getAdress());
	    	ps.setString(10, admin.getTelNr());
	    	ps.executeUpdate();
	    	ret = true;
    	} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				con.close();
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
    	return ret;
    }
    
    public boolean updateAdmin(String id, String personalId, String passwort, String name, String nachname, String filiale , String geburtsdatum, String geschlecht, String adress, String telNr ) {
    	String query = "UPDATE admin SET personalId = ?, passwort = ?, name = ?, nachname = ?, filiale = ?, geburtsdatum = ?, geschlecht = ?, adress = ?, telnr = ? WHERE id = ?";
    	boolean ret = false; 
    	try {
    		con = dbm.getConnection();
    	    ps = con.prepareStatement(query);
    	    ps.setString(1, personalId);
    	    ps.setString(2, passwort);
    	    ps.setString(3, name);
    	    ps.setString(4, nachname);
    	    ps.setString(5, filiale);
    	    ps.setString(6, geburtsdatum);
    	    ps.setString(7, geschlecht);
    	    ps.setString(8, adress);
    	    ps.setString(9, telNr);
    	    ps.setString(10, id);
    	    ps.executeUpdate();
    	    ret = true;
        } catch (SQLException e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	} finally {
			try {
				con.close();
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
    	
    	return ret;
    }
    
    public boolean deleteAdmin(String id) {
    	String query = "DELETE FROM admin WHERE personalId = ?";
    	boolean ret = false; 
    	try {
    		con = dbm.getConnection();
	    	ps = con.prepareStatement(query);
	    	ps.setString(1, id);
	    	ps.executeUpdate();
	    	ret = true;
    	} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				con.close();
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
    	return ret;
    }
    
    public ArrayList<Admin> adminSuche(String column, String key) {
    	ArrayList<Admin> list = new ArrayList<>();
    	Admin admin;
    	String query;
    	
    	try {
    		switch(column) {
    		case "name":
    			query = "SELECT * FROM admin WHERE name = ?";
    			con = dbm.getConnection();
    			ps = con.prepareStatement(query);
    			ps.setString(1, key);
    			rs = ps.executeQuery();
    	    	while(rs.next()) {
    	    		admin = new Admin(rs.getString("id"),rs.getString("personalId"),rs.getString("passwort"),rs.getString("name"),rs.getString("nachname"),rs.getString("filiale"),rs.getString("geburtsdatum"),rs.getString("geschlecht"),rs.getString("adress"),rs.getString("telnr"));
    	    		list.add(admin);
    	    	}
    			break;
    		case "personalId":
    			query = "SELECT * FROM admin WHERE personalId = ?";
    			con = dbm.getConnection();
    			ps = con.prepareStatement(query);
    			ps.setString(1, key);
    			rs = ps.executeQuery();
    	    	while(rs.next()) {
    	    		admin = new Admin(rs.getString("id"),rs.getString("personalId"),rs.getString("passwort"),rs.getString("name"),rs.getString("nachname"),rs.getString("filiale"),rs.getString("geburtsdatum"),rs.getString("geschlecht"),rs.getString("adress"),rs.getString("telnr"));
    	    		list.add(admin);
    	    	}
    			break;
    		default:
    			System.out.println("hata");
    			break;
    		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				con.close();
				ps.close();
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
    	return list;
	}
    
    public String personalControl(String id, String personalId, String passwort, String name, String nachname, String filiale , String geburtsdatum, String geschlecht, String adress, String telNr) {
    	if(id.length() != 11) {
    		return "ungültige ID!!!";
    	} else if (personalId.length() != 8) {
    		return "ungültige Personal ID!!!";
    	} else if (passwort.length() != 8) {
    		return "ungültige Passwort!!!";
    	} else if (name.length() == 0) {
    		return "leere Name!!!";
    	} else if (nachname.length() == 0) {
    		return "leere Nachname!!!";
    	} else if (filiale.length() != 1) {
    		return "ungültige Filiale!!!";
    	} else if (geburtsdatum.length() != 10) {
    		return "ungültige Geburtsdatum!!!";
    	} else if (geschlecht.length() != 1) {
    		return "ungültige Geschlecht!!!";
    	} else if (adress.length() == 0) {
    		return "leere Adress!!!";
    	} else if (telNr.length() != 11) {
    		return "ungültige Telefon Nummer!!!";
    	} else {
    		return "gültig";
    	}
    }
    
    public ArrayList<Personal> getPersonalList() throws SQLException {
    	ArrayList<Personal> list = new ArrayList<>();
    	Personal personal;
    	try {
    		con = dbm.getConnection();
			st = con.createStatement();
			rs = st.executeQuery("SELECT * FROM verkaeufer UNION SELECT * FROM techniker");
	    	while(rs.next()) {
	    		personal = new Personal(rs.getString("id"),rs.getString("personalId"),rs.getString("passwort"),rs.getString("name"),rs.getString("nachname"),rs.getString("filiale"),rs.getString("geburtsdatum"),rs.getString("geschlecht"),rs.getString("adress"),rs.getString("telnr"));
	    		list.add(personal);
	    	}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				con.close();
				st.close();
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
    	return list;
    }
    
    public boolean updatePersonal(String id, String personalId, String passwort, String name, String nachname, String filiale , String geburtsdatum, String geschlecht, String adress, String telNr, char pt ) {
    	String query= null;
    	if(pt == '1') {
    		query = "UPDATE verkaeufer SET personalId = ?, passwort = ?, name = ?, nachname = ?, filiale = ?, geburtsdatum = ?, geschlecht = ?, adress = ?, telnr = ? WHERE id = ?";
    	} else if(pt == '2'){
    		query = "UPDATE techniker SET personalId = ?, passwort = ?, name = ?, nachname = ?, filiale = ?, geburtsdatum = ?, geschlecht = ?, adress = ?, telnr = ? WHERE id = ?";
    	}
    	
    	boolean ret = false; 
    	try {
    		con = dbm.getConnection();
    	    ps = con.prepareStatement(query);
    	    ps.setString(1, personalId);
    	    ps.setString(2, passwort);
    	    ps.setString(3, name);
    	    ps.setString(4, nachname);
    	    ps.setString(5, filiale);
    	    ps.setString(6, geburtsdatum);
    	    ps.setString(7, geschlecht);
    	    ps.setString(8, adress);
    	    ps.setString(9, telNr);
    	    ps.setString(10, id);
    	    ps.executeUpdate();
    	    ret = true;
        } catch (SQLException e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	} finally {
			try {
				con.close();
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
    	return ret;
    }
    
    public boolean deletePersonal(String personalId, char pt) {
    	String query= null;
    	if(pt == '1') {
    		query = "DELETE FROM verkaeufer WHERE personalId = ?";
    	} else if(pt == '2'){
    		query = "DELETE FROM techniker WHERE personalId = ?";
    	}
    	
    	boolean ret = false;
    	
    	try {
    		con = dbm.getConnection();
	    	ps = con.prepareStatement(query);
	    	ps.setString(1, personalId);
	    	ps.executeUpdate();
	    	ret = true;
    	} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				con.close();
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
    	return ret;
    }
    
}