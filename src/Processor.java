public class Processor extends Hardware {
    private int cores; // antal kärnor
    private double clockSpeed;

    public Processor(String name, double price, int cores, double clockSpeed){
        super(name, price);
        this.cores = cores;
        this.clockSpeed = clockSpeed;
    }
    public int getCores(){
        return cores;
    }

    public double getClockSpeed(){
        return clockSpeed;
    }
}
