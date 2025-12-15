package h1;

public class H1_main {
	public static void main(String[] args) {
		
		PrioListe warteliste = new PrioListe();
		
		Patient A = new Patient ("A",3);
		Patient B = new Patient ("B",1);
		Patient C = new Patient ("C",5);
		Patient D = new Patient ("D",2);
		
		warteliste.addPatient(A);
		warteliste.addPatient(B);
		warteliste.addPatient(C);
		warteliste.addPatient(D);
		
		System.out.println("Die aktuelle Warteliste: ");
		warteliste.printListe();
		
		System.out.println("\nListe nach Aufruf:");
        warteliste.printListe();
		
		Patient naechster = warteliste.getNextPatient();
        System.out.println("\njetzt wird: " + naechster.getName() + " aufgerufen");
        
        System.out.println("\nPosition von D: " + warteliste.getPosition(D));
	}
}
