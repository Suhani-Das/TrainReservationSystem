package train;

public class Train {
    private int trainNo;
    private String trainName;
    private String source;
    private String destination;
    private String departureTime;
    private String arrivalTime;

    public Train(int trainNo, String trainName, String source, String destination, String departureTime, String arrivalTime) {
        this.trainNo = trainNo;
        this.trainName = trainName;
        this.source = source;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public int getTrainNo() {
        return trainNo;
    }

    public String getTrainName() {
        return trainName;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    @Override
    public String toString() {
        return trainNo + " - " + trainName + " | " + source + " → " + destination +
                " | Departure: " + departureTime + " | Arrival: " + arrivalTime;
    }
}