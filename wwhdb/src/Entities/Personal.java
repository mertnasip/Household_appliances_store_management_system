package Entities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Helpers.*;

public class Personal extends Person {
	
	DBManager dbm = new DBManager();
	Connection con = null;
	Statement st = null;
	ResultSet rs = null;
	PreparedStatement ps = null;
	
	String personalId;
	String passwort;
	
	public Personal() {

    }
	
	public Personal(String id, String personalId, String passwort){
        this.id=id;
        this.personalId = personalId;
        this.passwort = passwort;
    }

    public Personal(String id, String name, String nachname, String filiale) {
        this.id = id;
        this.name = name;
        this.nachname = nachname;
        this.filiale = filiale;
    }
    
	public Personal(String id, String personalId, String passwort, String name, String nachname, String filiale , String gaburtsdatum, String geschlecht, String adress, String telNr){
        this.id=id;
        this.personalId = personalId;
        this.passwort = passwort;
        this.name=name;
        this.nachname=nachname;
        this.filiale=filiale;
        this.geburtsdatum=gaburtsdatum;
        this.geschlecht=geschlecht;
        this.adress=adress;
        this.telNr=telNr;
    }

	public ArrayList<Produkt> getProduktList() throws SQLException {
    	ArrayList<Produkt> list = new ArrayList<>();
    	Produkt produkt;
    	try {
    		con = dbm.getConnection();
			st = con.createStatement();
			rs = st.executeQuery("SELECT * FROM produkt WHERE verkauf = '0' ");
	    	while(rs.next()) {
	    		produkt = new Produkt(rs.getString("produktId"), rs.getString("produktTitel"),rs.getString("produktName"),rs.getDouble("preis"),rs.getString("garantiezeit"),rs.getString("filiale"),rs.getString("farbe"),rs.getString("verkauf"));
	    		list.add(produkt);
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
	
	public ArrayList<Produkt> produktSuche(String id, String titel, String name, String minPreis, String maxPreis, String filiale, String farbe, char pt) throws SQLException {
    	ArrayList<Produkt> list = new ArrayList<>();
    	Produkt produkt;
    	String query;
    	
    		query = "SELECT * FROM produkt WHERE produktId LIKE ? AND produktTitel LIKE ? AND produktName LIKE ? AND filiale LIKE ? AND farbe LIKE ? AND verkauf LIKE ?";
    		con = dbm.getConnection();
    		ps = con.prepareStatement(query);
    		if(id.length() == 0 || id.equals(null)) {
    			ps.setString(1, "%");
    		} else {
    			ps.setString(1, id);
    		}
    		if(titel.length() == 0 || titel.equals(null)) {
        		ps.setString(2, "%");
    		} else {
        		ps.setString(2, titel);
    		}
    		if(name.length() == 0 || name.equals(null)) {
        		ps.setString(3, "%");
    		} else {
        		ps.setString(3, name);
    		}
    		if(filiale.length() == 0 || filiale.equals(null)) {
        		ps.setString(4, "%");
    		} else {
        		ps.setString(4, filiale);
    		}
    		if(farbe.length() == 0 || farbe.equals(null)) {
        		ps.setString(5, "%");
    		} else {
        		ps.setString(5, farbe);
    		}
    		if(pt == '1') {
    			ps.setString(6, "0");
    		} else if(pt == '2') {
    			ps.setString(6, "1");
    		} else if(pt == '9') {
    			ps.setString(6, "%");
    		}
    		rs = ps.executeQuery();
    	    while(rs.next()) {
    	    	produkt = new Produkt(rs.getString("produktId"), rs.getString("produktTitel"),rs.getString("produktName"),rs.getDouble("preis"),rs.getString("garantiezeit"),rs.getString("filiale"),rs.getString("farbe"),rs.getString("verkauf"));
    	    	list.add(produkt);
    	    }
		
		try {
			con.close();
			ps.close();
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}	
	
	//getters and setters
    public String getPersonalId() {
        return personalId;
    }

    public void setPersonalId(String personalId) {
        this.personalId = personalId;
    }
    public String getPasswort() {
        return passwort;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }
    
    
    
}
