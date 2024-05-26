public class Worker {
    protected   String name;
    protected int age;
    protected double wage;

    // Konstruktor som tar emot name och age
    public Worker(String name, int age) {
        this.name = name;
        this.age =age;
        this.wage = 0;
    }

    // Metod för att sätta lönens värde
    public void setWage(double wage) {
        this.wage = wage;
    }
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public double getWage(){
        return wage;
    }
}
