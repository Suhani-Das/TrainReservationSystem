package train;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TrainManager manager = new TrainManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Train Reservation System ===");
            System.out.println("1. View All Trains");
            System.out.println("2. Search Trains (Source → Destination)");
            System.out.println("3. Show Trains from a Station");
            System.out.println("4. Add New Train");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\n--- All Trains ---");
                    manager.getAllTrains().forEach(System.out::println);
                    break;

                case 2:
                    System.out.print("Enter Source: ");
                    String src = sc.nextLine();
                    System.out.print("Enter Destination: ");
                    String dest = sc.nextLine();
                    List<Train> searchResults = manager.searchTrains(src, dest);
                    if (searchResults.isEmpty()) {
                        System.out.println("No trains found!");
                    } else {
                        searchResults.forEach(System.out::println);
                    }
                    break;

                case 3:
                    System.out.print("Enter Station: ");
                    String station = sc.nextLine();
                    List<Train> fromStation = manager.getTrainsFromStation(station);
                    if (fromStation.isEmpty()) {
                        System.out.println("No trains available from " + station);
                    } else {
                        fromStation.forEach(System.out::println);
                    }
                    break;

                case 4:
                    System.out.print("Train No: ");
                    int trainNo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Train Name: ");
                    String name = sc.nextLine();
                    System.out.print("Source: ");
                    String source = sc.nextLine();
                    System.out.print("Destination: ");
                    String destination = sc.nextLine();
                    System.out.print("Departure Time (HH:MM): ");
                    String dep = sc.nextLine();
                    System.out.print("Arrival Time (HH:MM): ");
                    String arr = sc.nextLine();
                    manager.addTrain(new Train(trainNo, name, source, destination, dep, arr));
                    System.out.println("✅ Train Added Successfully!");
                    break;

                case 5:
                    System.out.println("Thank you for using the Train System 🚆");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}