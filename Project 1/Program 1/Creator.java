//Tyler Learned
//(https://www.educative.io/answers/how-to-generate-random-numbers-in-java)

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Creator 
{
    //array of random numbers from java.util.Random
    public double[] UtilRandomArray(int numRands)
    {
        double[] input = new double[numRands];

        for(int i = 0; i < numRands; i++)
        {
            input[i] = new Random().nextDouble();
        }

        return input;
    }

    //rarray of random numbers from using Math.random
    public double[] MathRandomArray(int numRands)
    {
        double[] input = new double[numRands];

        for(int i = 0; i < numRands; i++)
        {
            input[i] = Math.random();
        }

        return input;
    }

    //array of random numbers from java.util.concurrent.ThreadLocalRandom
    public double[] TLRArray(int numRands)
    {
        double[] input = new double[numRands];

        for(int i = 0; i < numRands; i++)
        {
            input[i] = ThreadLocalRandom.current().nextDouble();
        }

        return input;
    }
}