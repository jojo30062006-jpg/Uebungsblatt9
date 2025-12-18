package h2;

import java.util.ArrayList;

public class Bus {
	
	public ArrayList <Passenger> passengers;
	
	public Bus() {
	    this.passengers = new ArrayList<>();
	}
	
	public void enterBus(Passenger p) {
		passengers.addLast(p);
	}
	
	private void exitBus() {
		for (int i = passengers.size() -1; i >= 0; i --) {
			if (passengers.get(i).planned == passengers.get(i).visited) {
				passengers.remove(i);
			}
		}
	}
	
	public void nextStop (Passenger[] boarding) {
		for ( int k = 0; k < passengers.size(); k++) {
			passengers.get(k).visited ++;
		}
		
		exitBus();
		
		for (int j = 0; j < boarding.length; j++) {
			enterBus(boarding[j]);
		}
	}
	
	public void nextStop () {
		for ( int k = 0; k < passengers.size(); k++) {
			passengers.get(k).visited ++;
		}
		exitBus();
	}
	
	public ArrayList<Passenger> findPassengersWithoutTickets() {
		ArrayList<Passenger> entfernt = new ArrayList<>();
		
		for (int l = passengers.size() - 1; l >= 0; l--) {
			if (passengers.get(l).ticket == false) {
				entfernt.addLast(passengers.get(l));
				passengers.remove(l);
			}
		}
		return entfernt;
	}


	public void transferPassengers(Bus otherBus, String[] passengerNames) {

		for (int i = 0 ; i < passengers.size(); i++) {
			Passenger p = passengers.get(i);

			for (int j = 0; j < passengerNames.length; j++) {
				if (p.name.equals(passengerNames[j])) {
					passengers.remove(i);
					otherBus.enterBus(p);
					break;
				}
			}
		}
	}

}


