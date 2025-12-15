package h1;

import java.util.ArrayList;

public class PrioListe {
	
	private ArrayList <Patient> myList;
	
	public PrioListe() {
	    this.myList = new ArrayList<>();
	}
	
	public void addPatient (Patient p) {
		
		if (myList.isEmpty() == true){
			myList.add (p);
			return;
		}

		else {
			for (int i = 0; i < myList.size(); i++) {
				if (p.getPrio() < myList.get(i).getPrio()) {
					myList.add(i,p);
					return;
				}
			}
		myList.add(p);
		}
	}
	
	public Patient getNextPatient () {
		
		if (myList.isEmpty()) {
	        return null;
	    }
		Patient p = myList.get(0);
		myList.remove(0);
		return p;
	}
	
	public int getPosition (Patient p) {
		for (int k = 0; k < myList.size(); k++) {
	        if (myList.get(k) == p) { 
	            return k;
	        }
	    }
		return -1;
	}
	
	public void printListe() {
        for (int j = 0; j < myList.size(); j++) {
        	Patient p = myList.get(j);
            System.out.println(j + ": " + "Patientenname: "+ p.getName() + "  / " + " Prio: " + p.getPrio() );
        }
	}
}
