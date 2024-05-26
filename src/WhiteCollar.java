public class WhiteCollar extends Worker {

    public WhiteCollar(String name, int age){
        super(name, age);
    }

    public void drinkCoffee() {
        System.out.println(name + " is drinking coffee");
    }

    public void  attendMeeting(){
        System.out.println(name + " is attending a meeting.");
    }

    public void doSpreadsheets(){
        System.out.println(name +" is doing spreadsheets.");
    }
}
