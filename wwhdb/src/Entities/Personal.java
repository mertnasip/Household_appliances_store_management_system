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
	
	public ArrayList<Kunde> getKundeList() throws SQLException {
    	ArrayList<Kunde> list = new ArrayList<>();
    	Kunde kunde;
    	try {
    		con = dbm.getConnection();
			st = con.createStatement();
			rs = st.executeQuery("SELECT * FROM kunde");
	    	while(rs.next()) {
	    		kunde = new Kunde(rs.getString("id"), rs.getString("name"),rs.getString("nachname"),rs.getString("filiale"),rs.getString("geburtsdatum"),rs.getString("geschlecht"),rs.getString("adress"),rs.getString("telnr"));
	    		list.add(kunde);
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
	
	public ArrayList<Kunde> kundeSuche(String id, String name, String nachname, String filiale) throws SQLException {
    	ArrayList<Kunde> list = new ArrayList<>();
    	Kunde kunde;
    	String query;
    	
    		query = "SELECT * FROM kunde WHERE id LIKE ? AND name LIKE ? AND nachname LIKE ? AND filiale LIKE ?";
    		con = dbm.getConnection();
    		ps = con.prepareStatement(query);
    		if(id.length() == 0 || id.equals(null)) {
    			ps.setString(1, "%");
    		} else {
    			ps.setString(1, id);
    		}
    		if(name.length() == 0 || name.equals(null)) {
        		ps.setString(2, "%");
    		} else {
        		ps.setString(2, name);
    		}
    		if(nachname.length() == 0 || nachname.equals(null)) {
        		ps.setString(3, "%");
    		} else {
        		ps.setString(3, nachname);
    		}
    		if(filiale.length() == 0 || filiale.equals(null)) {
        		ps.setString(4, "%");
    		} else {
        		ps.setString(4, filiale);
    		}
    		rs = ps.executeQuery();
    	    while(rs.next()) {
    	    	kunde = new Kunde(rs.getString("id"), rs.getString("name"),rs.getString("nachname"),rs.getString("filiale"),rs.getString("geburtsdatum"),rs.getString("geschlecht"),rs.getString("adress"),rs.getString("telnr"));
    	    	list.add(kunde);
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
	
	public boolean addKunde(Kunde kunde) {
    	String query = "INSERT INTO kunde" + "(id,name,nachname,filiale,geburtsdatum,geschlecht,adress,telnr) VALUES" + "(?,?,?,?,?,?,?,?)";
    	boolean ret = false; 
    	try {
    		con = dbm.getConnection();
	    	ps = con.prepareStatement(query);
	    	ps.setString(1, kunde.getId());
	    	ps.setString(2, kunde.getName());
	    	ps.setString(3, kunde.getNachname());
	    	ps.setString(4, kunde.getFiliale());
	    	ps.setString(5, kunde.getGeburtsdatum());
	    	ps.setString(6, kunde.getGeschlecht());
	    	ps.setString(7, kunde.getAdress());
	    	ps.setString(8, kunde.getTelNr());
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
	
	public boolean deleteKunde(String id) {
    	String query = "DELETE FROM kunde WHERE id = ?";
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
				st.close();
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
    	return ret;
    	
    }
	
	public boolean updateKunde(String id, String name, String nachname, String filiale, String geburtsdatum, String geschlecht , String adress, String telnr) {
    	String query = "UPDATE kunde SET name = ?, nachname = ?, filiale = ?, geburtsdatum = ?, geschlecht = ?, adress = ?, telnr = ? WHERE id = ?";
    	boolean ret = false; 
    	try {
    		con = dbm.getConnection();
    	    ps = con.prepareStatement(query);
    	    ps.setString(1, name);
    	    ps.setString(2, nachname);
    	    ps.setString(3, filiale);
    	    ps.setString(4, geburtsdatum);
    	    ps.setString(5, geschlecht);
    	    ps.setString(6, adress);
    	    ps.setString(7, telnr);
    	    ps.setString(8, id);
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
	
	public ArrayList<Aufzeichnung> getAufzeichnungList() throws SQLException {
    	ArrayList<Aufzeichnung> list = new ArrayList<>();
    	Aufzeichnung aufzeichnung;
    	try {
    		con = dbm.getConnection();
			st = con.createStatement();
			rs = st.executeQuery("SELECT * FROM verkauf UNION SELECT * FROM dienst");
	    	while(rs.next()) {
	    		aufzeichnung = new Aufzeichnung(rs.getString("id"),rs.getString("kunde"),rs.getString("personal"),rs.getString("produkt"),rs.getDouble("preis"),rs.getString("datum"),rs.getString("garantiezeit"),rs.getString("infos"));
	    		list.add(aufzeichnung);
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
	
	public ArrayList<Aufzeichnung> aufzeichnungSuche(String id, String kunde, String personal, String produkt, char pt) {
    	ArrayList<Aufzeichnung> list = new ArrayList<>();
    	Aufzeichnung aufzeichnung;
    	String query;
    	
    	try {
    		switch(pt) {
    		case '1':
    			query = "SELECT * FROM verkauf WHERE id LIKE ? AND kunde LIKE ? AND personal LIKE ? AND produkt LIKE ?";
    			con = dbm.getConnection();
    			ps = con.prepareStatement(query);
    			if(id.length() == 0 || id.equals(null)) {
    				ps.setString(1, "%");
    			} else {
    				ps.setString(1, id);
    			}
    			if(kunde.length() == 0 || kunde.equals(null)) {
        			ps.setString(2, "%");
    			} else {
        			ps.setString(2, kunde);
    			}
    			if(personal.length() == 0 || personal.equals(null)) {
        			ps.setString(3, "%");
    			} else {
        			ps.setString(3, personal);
    			}
    			if(produkt.length() == 0 || produkt.equals(null)) {
        			ps.setString(4, "%");
    			} else {
        			ps.setString(4, produkt);
    			}
    			rs = ps.executeQuery();
    	    	while(rs.next()) {
    	    		aufzeichnung = new Aufzeichnung(rs.getString("id"),rs.getString("kunde"),rs.getString("personal"),rs.getString("produkt"),rs.getDouble("preis"),rs.getString("datum"),rs.getString("garantiezeit"),rs.getString("infos"));
    	    		list.add(aufzeichnung);
    	    	}
    			break;
    		case '2':
    			query = "SELECT * FROM dienst WHERE id LIKE ? AND kunde LIKE ? AND personal LIKE ? AND produkt LIKE ?";
    			con = dbm.getConnection();
    			ps = con.prepareStatement(query);
    			if(id.length() == 0 || id.equals(null)) {
    				ps.setString(1, "%");
    			} else {
    				ps.setString(1, id);
    			}
    			if(kunde.length() == 0 || kunde.equals(null)) {
        			ps.setString(2, "%");
    			} else {
        			ps.setString(2, kunde);
    			}
    			if(personal.length() == 0 || personal.equals(null)) {
        			ps.setString(3, "%");
    			} else {
        			ps.setString(3, personal);
    			}
    			if(produkt.length() == 0 || produkt.equals(null)) {
        			ps.setString(4, "%");
    			} else {
        			ps.setString(4, produkt);
    			}
    			rs = ps.executeQuery();
    	    	while(rs.next()) {
    	    		aufzeichnung = new Aufzeichnung(rs.getString("id"),rs.getString("kunde"),rs.getString("personal"),rs.getString("produkt"),rs.getDouble("preis"),rs.getString("datum"),rs.getString("garantiezeit"),rs.getString("infos"));
    	    		list.add(aufzeichnung);
    	    	}
    			break;
    		case '9':
    			query = "SELECT * FROM verkauf WHERE id LIKE ? AND kunde LIKE ? AND personal LIKE ? AND produkt LIKE ? UNION SELECT * FROM dienst WHERE id LIKE ? AND kunde LIKE ? AND personal LIKE ? AND produkt LIKE ?";
    			con = dbm.getConnection();
    			ps = con.prepareStatement(query);
    			if(id.length() == 0 || id.equals(null)) {
    				ps.setString(1, "%");
    			} else {
    				ps.setString(1, id);
    			}
    			if(kunde.length() == 0 || kunde.equals(null)) {
        			ps.setString(2, "%");
    			} else {
        			ps.setString(2, kunde);
    			}
    			if(personal.length() == 0 || personal.equals(null)) {
        			ps.setString(3, "%");
    			} else {
        			ps.setString(3, personal);
    			}
    			if(produkt.length() == 0 || produkt.equals(null)) {
        			ps.setString(4, "%");
    			} else {
        			ps.setString(4, produkt);
    			}
    			//////////////////////////////////////////////////////////////////////
    			if(id.length() == 0 || id.equals(null)) {
    				ps.setString(5, "%");
    			} else {
    				ps.setString(5, id);
    			}
    			if(kunde.length() == 0 || kunde.equals(null)) {
        			ps.setString(6, "%");
    			} else {
        			ps.setString(6, kunde);
    			}
    			if(personal.length() == 0 || personal.equals(null)) {
        			ps.setString(7, "%");
    			} else {
        			ps.setString(7, personal);
    			}
    			if(produkt.length() == 0 || produkt.equals(null)) {
        			ps.setString(8, "%");
    			} else {
        			ps.setString(8, produkt);
    			}
    			rs = ps.executeQuery();
    			while(rs.next()) {
    				aufzeichnung = new Aufzeichnung(rs.getString("id"),rs.getString("kunde"),rs.getString("personal"),rs.getString("produkt"),rs.getDouble("preis"),rs.getString("datum"),rs.getString("garantiezeit"),rs.getString("infos"));
    	    		list.add(aufzeichnung);
    	    	}
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
	
	public boolean deleteAufzeichnung(String id, String produkt) {
		char control = id.charAt(0);
		String query;
		boolean ret = false;
		try {
    		switch(control) {
    		case '0':
    			query = "DELETE FROM verkauf WHERE id = ?";
    			con = dbm.getConnection();
    			ps = con.prepareStatement(query);
    			ps.setString(1, id);
    			rs = ps.executeQuery();
    			query = "UPDATE produkt SET verkauf = 0 WHERE produktId = ?";
    			ps = con.prepareStatement(query);
    			ps.setString(1, produkt);
    			ps.executeQuery();
    			ret = true;
    			break;
    		case '1':
    			query = "DELETE FROM dienst WHERE id = ?";
    			con = dbm.getConnection();
    			ps = con.prepareStatement(query);
    			ps.setString(1, id);
    			rs = ps.executeQuery();
    			ret = true;
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
    	return ret;
    	
    }
	
	public boolean addAufzeichnung(String id, String kunde, String personal, String produkt, String preis, String datum, String garantiezeit, String infos, char pt) {
		String query;
		boolean ret = false;
		try {
    		switch(pt) {
    		case '0':
    			query = "INSERT INTO verkauf (id,kunde,personal,produkt,preis,datum,garantiezeit,infos) VALUES (?,?,?,?,?,?,?,?)";
    			con = dbm.getConnection();
    			ps = con.prepareStatement(query);
    			ps.setString(1, id);
    			ps.setString(2, kunde);
    			ps.setString(3, personal);
    			ps.setString(4, produkt);
    			ps.setDouble(5, Double.parseDouble(preis));
    			ps.setString(6, datum);
    			ps.setString(7, garantiezeit);
    			ps.setString(8, infos);
    			rs = ps.executeQuery();
    			query = "UPDATE produkt SET verkauf = 1 WHERE produktId = ?";
    			ps = con.prepareStatement(query);
    			ps.setString(1, produkt);
    			ps.executeQuery();
    			ret = true;
    			break;
    		case '1':
    			query = "INSERT INTO dienst (id,kunde,personal,produkt,preis,datum,garantiezeit,infos) VALUES (?,?,?,?,?,?,?,?)";
    			con = dbm.getConnection();
    			ps = con.prepareStatement(query);
    			ps.setString(1, id);
    			ps.setString(2, kunde);
    			ps.setString(3, personal);
    			ps.setString(4, produkt);
    			ps.setDouble(5, Double.parseDouble(preis));
    			ps.setString(6, datum);
    			ps.setString(7, garantiezeit);
    			ps.setString(8, infos);
    			rs = ps.executeQuery();
    			ret = true;
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
    	return ret;
    	
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
