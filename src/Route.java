import java.util.*;

public class Route {
    private ArrayList<Bus>arrayBuses;
    private ArrayList<Trolleybus>arrayTrolleybuses;
    private ArrayList<Tram>arrayTrams;
    private int numberRoute;
    private String startOfRoute;
    private String endOfRoute;
    private int timeOfRoute;

    public Route(){
        arrayBuses = new ArrayList<>(5);
        arrayTrolleybuses = new ArrayList<>(5);
        arrayTrams = new ArrayList<>(5);
         }

    public void setArrayBuses(ArrayList<Bus> arrayBuses) {
        this.arrayBuses = arrayBuses;
    }

    public void setArrayTrolleybuses(ArrayList<Trolleybus> arrayTrolleybuses) {
        this.arrayTrolleybuses = arrayTrolleybuses;
    }

    public void setArrayTrams(ArrayList<Tram> arrayTrams) {
        this.arrayTrams = arrayTrams;
    }

    public void setNumberRoute(int numberRoute) {
        this.numberRoute = numberRoute;
    }

    public void setStartOfRoute(String startOfRoute) {
        this.startOfRoute = startOfRoute;
    }

    public void setEndOfRoute(String endOfRoute) {
        this.endOfRoute = endOfRoute;
    }

    public void setTimeOfRoute(int timeOfRoute) {
        this.timeOfRoute = timeOfRoute;
    }

    public ArrayList<Bus> getArrayBuses() {
        return arrayBuses;
    }

    public ArrayList<Trolleybus> getArrayTrolleybuses() {
        return arrayTrolleybuses;
    }

    public ArrayList<Tram> getArrayTrams() {
        return arrayTrams;
    }

    public int getNumberRoute() {
        return numberRoute;
    }

    public String getStartOfRoute() {
        return startOfRoute;
    }

    public String getEndOfRoute() {
        return endOfRoute;
    }

    public int getTimeOfRoute() {
        return timeOfRoute;
    }

    public void AddBus(int number, int capacity){
        Bus bus = new Bus(number, capacity);
        arrayBuses.add(bus);
    }
    public void AddTrolleybus(int number, int capacity){
        Trolleybus trolleybus = new Trolleybus(number, capacity);
        arrayTrolleybuses.add(trolleybus);
    }
    public void AddTram(int number, int capacity){
        Tram tram = new Tram(number, capacity);
        arrayTrams.add(tram);
    }

}
