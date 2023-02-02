//Tyler Learned

import java.util.Scanner;

public class Main {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        int numRands=0;

        while(true)
        {
            System.out.println("Enter number of random integers to generate");

            String userInput = scan.next();

            if(userInput.isEmpty() || Integer.parseInt(userInput) == 0)
            {
                System.out.println("Entered value is invalid");
                break;
            }

            try
            {
                numRands = Integer.parseInt(userInput);
            }
            catch(NumberFormatException e)
            {
                System.out.println("Invalid input");
            }

            Creator create = new Creator();
            double[] utilRandomArray = create.UtilRandomArray(numRands);
            double[] mathRandomArray = create.MathRandomArray(numRands);
            double[] threadRandomArray = create.TLRArray(numRands);

            Analyzer analyze = new Analyzer();
            System.out.println("Function Name" + "\t\t\t\t" + "numRands" + "\t" + "Mean" + "\t\t\t" + "StdDev" + "\t\t\t" + "Min" + "\t\t\t" + "Max");
            System.out.println("Java.util.Random " + "\t\t\t" + numRands + "\t " + analyze.mean(utilRandomArray) + "\t " + analyze.standardDeviation(utilRandomArray) + "\t " + analyze.min(utilRandomArray) + "\t " + analyze.max(utilRandomArray));
            System.out.println("Math.Random " + "\t\t\t\t" + numRands + "\t " + analyze.mean(mathRandomArray) + "\t " + analyze.standardDeviation(mathRandomArray) + "\t " + analyze.min(mathRandomArray) + "\t " + analyze.max(mathRandomArray));
            System.out.println("java.util.concurrent.ThreadLocalRandom " + "\t" + numRands + "\t " + analyze.mean(threadRandomArray) + "\t " + analyze.standardDeviation(threadRandomArray) + "\t " + analyze.min(threadRandomArray) + "\t " + analyze.max(threadRandomArray));
        }
        scan.close();
    }
}
