public class GraphicsCard extends Hardware{
    private int memory;

    public GraphicsCard(String name, double price, int memory){
        super(name, price);
        this.memory = memory;
    }
    public int getMemory(){
        return memory;
    }
}
