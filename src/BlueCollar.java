public class BlueCollar extends Worker {
    public BlueCollar(String name, int age){
        super(name, age);
    }
    public void build() {
        System.out.println(name + " is building");
    }

    public void repair() {
        System.out.println(name + " is repairing");
    }

    public void destroy() {
        System.out.println(name + " is destroying");
    }
}
