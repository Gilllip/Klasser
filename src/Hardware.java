import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Hardware {
    private String name;
    private double price;

    public Hardware(String name,double price) {
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }
}
