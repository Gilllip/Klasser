public class HardDrive extends Hardware{
    private int capacity; // kapacitet i gb

    public HardDrive(String name, double price, int capacity){
        super(name, price);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
