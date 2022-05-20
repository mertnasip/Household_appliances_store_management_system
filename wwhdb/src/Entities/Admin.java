package Entities;

import java.sql.*;
import java.util.ArrayList;

public class Admin  extends Personal {
    
	Connection con = dbm.getConnection();
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
			st = con.createStatement();
			rs = st.executeQuery("SELECT * FROM admin");
	    	while(rs.next()) {
	    		admin = new Admin(rs.getString("id"),rs.getString("personalId"),rs.getString("passwort"),rs.getString("name"),rs.getString("nachname"),rs.getString("filiale"),rs.getString("geburtsdatum"),rs.getString("geschlecht"),rs.getString("adress"),rs.getString("telnr"));
	    		list.add(admin);
	    	}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    	return list;
    }
    
    public boolean addAdmin(Admin admin) {
    	String query = "INSERT INTO admin" + "(id,personalId,passwort,name,nachname,filiale,geburtsdatum,geschlecht,adress,telnr) VALUES" + "(?,?,?,?,?,?,?,?,?,?)";
    	boolean ret = false; 
    	try {
			st = con.createStatement();
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
		}
    	return ret;
    }
    
    public boolean deleteAdmin(String id) {
    	String query = "DELETE FROM admin WHERE personalId = ?";
    	boolean ret = false; 
    	try {
			st = con.createStatement();
	    	ps = con.prepareStatement(query);
	    	ps.setString(1, id);
	    	ps.executeUpdate();
	    	ret = true;
    	} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
    			st = con.createStatement();
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
    			st = con.createStatement();
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
		}
    	return list;
	}
}