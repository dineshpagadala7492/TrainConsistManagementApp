import java.util.*;

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        List<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("Passenger Bogies: " + passengerBogies);

        passengerBogies.remove("AC Chair");

        System.out.println("After Removal: " + passengerBogies);

        System.out.println("Sleeper exists? " + passengerBogies.contains("Sleeper"));
    }
}
