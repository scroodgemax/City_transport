public class Tram {
    private int number;
    private int capacity;
    private int interval;
    public Tram(int number, int capacity)
    {
        this.number=number;
        this.capacity=capacity;
    }

    public void setNumber(int number) {
        this.number = number;

    }
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public int getNumber() {
        return number;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getInterval() {
        return interval;
    }

}
