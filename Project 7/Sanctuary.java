public class Sanctuary
{
    import java.util.ArrayList;
    import java.util.Scanner;

    public class Sanctuary 
    {
            //Singleton
        private static Sanctuary obj = new Sanctuary();
        private Sanctuary() {}
        public static Sanctuary getInstance()
        {
            return obj;
        }

        public static void main(String[] args) 
        {
            ArrayList<Animal> animals = new ArrayList<>();

            animals.add(new Elephant("Alpha", new DefaultNoise()));
            animals.add(new Elephant("Bravo", new DefaultNoise()));

            animals.add(new Lion("Charlie", new DefaultNoise()));
            animals.add(new Lion("Delta", new DefaultNoise()));

            animals.add(new Rhino("Echo", new DefaultNoise()));
            animals.add(new Rhino("Foxtrot", new DefaultNoise()));

            animals.add(new Tiger("India", new DefaultNoise()));
            animals.add(new Tiger("Juliet", new DefaultNoise()));

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
}
