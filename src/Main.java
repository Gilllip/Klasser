import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

       /* Book book1 = new Book("Book 1", 100);
        Book book2 = new Book("Book 2", 200);
        Book book3 = new Book("Book 3", 250);

        System.out.println("Book 1: Name - " + book1.GetName() + ", Pages - " + book1.GetPages());
        System.out.println("Book 2: Name - " + book2.GetName() + ", Pages - " + book2.GetPages());
        System.out.println("Book 3: Name - " + book3.GetName() + ", Pages - " + book3.GetPages());

        // Testa turnpage
        System.out.println("nuvarande sida i bok 1 " + book1.GetCurrentPage());
        book1.TurnPage();
        System.out.println("nuvarande sida efter att ha vänt en sida" + book1.GetCurrentPage());

        Scanner scanner = new Scanner(System.in);
        ArrayList<Rock> rockList = new ArrayList<>();

        System.out.println("hur många stenar vill du skapa?");
        int numberOfRocks = scanner.nextInt();

        for (int i = 0; i < numberOfRocks; i++) {
            System.out.println("Ange vikten för stenen" + (i + 1) + ":");
            double weight = scanner.nextDouble();
            Rock rock = new Rock(weight);
            rockList.add(rock);
        }

        System.out.println("Vikterna för de skapade stenarna");
        for (int i =0; i<rockList.size(); i++) {
            System.out.println("Sten " +(i+1) + ": " + rockList.get(i).getWeight() + " kg");
        }

        scanner.close();
        */

        // koden nedan är för worker superklassen medan den ovan är för böckerna
      /*  Worker worker = new Worker("Ben dover", 25);
        WhiteCollar whiteCollar = new WhiteCollar("Gabe itch", 30 );
        BlueCollar blueCollar = new BlueCollar("Peter file", 50);

        // Sätt löm
        worker.setWage(5000);
        whiteCollar.setWage(90000);
        blueCollar.setWage(70000);

        // Hämta och skriva ut namn, ålder och lön
        System.out.println(worker.getName() + " is " + worker.getAge() + " years old and earns $" + worker.getWage());
        System.out.println(whiteCollar.getName() + " is " + whiteCollar.getAge() + " years old and earns $" + whiteCollar.getWage());
        System.out.println(blueCollar.getName() + " is " + blueCollar.getAge() + " years old and earns $" + blueCollar.getWage());

        // Testa WhiteCollar-metoder
        whiteCollar.drinkCoffee();
        whiteCollar.attendMeeting();
        whiteCollar.doSpreadsheets();

        // Testa BlueCollar-metoder
        blueCollar.build();
        blueCollar.repair();
        blueCollar.destroy();

       */

        Scanner scanner = new Scanner(System.in);
        List<Hardware> hardwareList = new ArrayList<>();

        while (true) {
            System.out.println("Vilken typ av hårdvara vill du skapa? 1 hårddisk 2 processor 3 grafikkort");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Läser bort den nya raden efter nästa int

            if (choice == 0) {
                break;
            }


            System.out.println("Ange namn:");
            String name = scanner.nextLine();
            System.out.println("Ange pris:");
            double price = scanner.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("Ange kapacitet (GB):");
                    int capacity = scanner.nextInt();
                    hardwareList.add(new HardDrive(name, price, capacity));
                    break;
                case 2:
                    System.out.println("Ange antal kärnor");
                    int cores = scanner.nextInt();
                    System.out.println("Ange klockhastighet (GHz):");
                    double clockSpeed = scanner.nextDouble();
                    hardwareList.add((new Processor(name, price, cores, clockSpeed)));
                    break;
                case 3:
                    System.out.println("Ange minne (GB):");
                    int memory = scanner.nextInt();
                    hardwareList.add(new GraphicsCard(name, price, memory));
                    break;
                default:
                    System.out.println("Ogiltigt val");
                    break;

            }
            scanner.nextLine(); // Tar bort den nya raden efter nästa int
        }
        // skriver ut all skapad hårdvara
        System.out.println("\nSkapad hårdvara:");
        for (Hardware hardware : hardwareList) {
            System.out.println("Namn" + hardware.getName() + ", Pris: " + hardware.getPrice());

            if (hardware instanceof HardDrive) {
                System.out.println("Kapacitet: "+ ((HardDrive) hardware).getCapacity() + " GB");
            } else if (hardware instanceof  Processor) {
                System.out.println("Antal kärnor: " + ((Processor)hardware).getCores() + ", Klockhastighet" + ((Processor)hardware).getClockSpeed() + " GHz");
            } else if (hardware instanceof  GraphicsCard) {
                System.out.println("Minne: " + ((GraphicsCard)hardware).getMemory() + "GB");
            }
        }
        scanner.close();
    }
}