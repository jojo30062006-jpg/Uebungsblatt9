package h2;

public class H2_main {

    public static void main(String[] args) {

        // Bus A und Bus B erzeugen
        Bus busA = new Bus();
        Bus busB = new Bus();

        // Passagiere erzeugen
        Passenger anna = new Passenger("Anna", 2, true);
        Passenger ben = new Passenger("Ben", 3, true);
        Passenger clara = new Passenger("Clara", 1, true);

        // Passagiere in Bus A einsteigen lassen
        busA.enterBus(anna);
        busA.enterBus(ben);
        busA.enterBus(clara);

        // Vor dem Umsteigen
        System.out.println("Vor dem Umsteigen:");
        printBus("Bus A", busA);
        printBus("Bus B", busB);

        // Anna und Clara steigen um
        String[] umsteiger = {"Anna", "Clara"};
        busA.transferPassengers(busB, umsteiger);

        // Nach dem Umsteigen
        System.out.println("\nNach dem Umsteigen:");
        printBus("Bus A", busA);
        printBus("Bus B", busB);
    }

    private static void printBus(String name, Bus bus) {
        System.out.print(name + ": ");
        if (bus.passengers.isEmpty()) {
            System.out.println("leer");
        } else {
            for (Passenger p : bus.passengers) {
                System.out.print(p.name + " ");
            }
            System.out.println();
        }
    }
}

