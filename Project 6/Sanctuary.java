import java.util.ArrayList;
import java.util.Scanner;

public class Sanctuary 
{
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Elephant(""));
        animals.add(new Elephant(""));

        animals.add(new Lion(""));
        animals.add(new Lion(""));

        animals.add(new Rhino(""));
        animals.add(new Rhino(""));

        Keeper keeper = new Keeper();
        keeper.setAnimals(animals);

        Engineer engineer = new Engineer();

        Ticketer ticket = new Ticketer();
       
        Time clock = new Time();
        clock.addPropertyChangeListener(keeper);
        clock.addPropertyChangeListener(ticket);

        System.out.println("Input the number of days to run the Sanctuary:\t");
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();

        for (int i = 0; i < days; i++) 
        {
            int currentDay = i + 1;
            System.out.println("\nThe Sanctuary has opened on " + currentDay + ", the clock will start.");
            clock.countTime(currentDay, 8, 20);
            System.out.println("The Sactuary has closed on " + currentDay + ".\n");
        }
    }
}
