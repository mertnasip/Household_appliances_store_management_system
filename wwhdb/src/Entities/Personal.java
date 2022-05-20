package Entities;

import Helpers.*;

public class Personal extends Person {
	
	DBManager dbm = new DBManager();
	
	String personalId;
	String passwort;

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
