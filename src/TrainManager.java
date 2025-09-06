package train;

import java.util.ArrayList;
import java.util.List;

public class TrainManager {
    private List<Train> trains;

    public TrainManager() {
        trains = new ArrayList<>();

        // Default data
        trains.add(new Train(101, "Shatabdi Express", "Delhi", "Bhopal", "06:00", "12:00"));
        trains.add(new Train(102, "Rajdhani Express", "Delhi", "Mumbai", "16:00", "08:00"));
        trains.add(new Train(103, "Duronto Express", "Kolkata", "Delhi", "20:00", "11:00"));
        trains.add(new Train(104, "Intercity Express", "Bhopal", "Indore", "09:00", "11:30"));
    }

    public void addTrain(Train train) {
        trains.add(train);
    }

    public List<Train> getAllTrains() {
        return trains;
    }

    public List<Train> searchTrains(String source, String destination) {
        List<Train> result = new ArrayList<>();
        for (Train t : trains) {
            if (t.getSource().equalsIgnoreCase(source) &&
                t.getDestination().equalsIgnoreCase(destination)) {
                result.add(t);
            }
        }
        return result;
    }

    public List<Train> getTrainsFromStation(String station) {
        List<Train> result = new ArrayList<>();
        for (Train t : trains) {
            if (t.getSource().equalsIgnoreCase(station)) {
                result.add(t);
            }
        }
        return result;
    }
}