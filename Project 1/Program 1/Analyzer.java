//Tyler Learned

public class Analyzer 
{
    // mean of array
    public double mean(double[] input)
    {
        double sum = 0;
       
        for(int i = 0; i < input.length; i++)
        {
            sum += input[i];
        }

        return sum/input.length;
    }

    //standard deviation of array
    public double standardDeviation(double[] input)
    {
        double std = 0.0;
        double mean = mean(input);

        for(double num: input)
        {
            std += Math.pow(num - mean, 2);
        }

        return Math.sqrt(std / input.length);
    }

    //min of array
    public double min(double[] input)
    {
        double min = input[0];

        for(int i = 1; i < input.length; i++)
        {
            if(input[i] < min)
            {
                min = input[i];
            }
        }
        return min;
    }

    //max of array
    public double max(double[] input)
    {
        double max = input[0];
        for(int i = 1; i < input.length; i++)
        {
            if(input[i] > max)
            {
                max = input[i];
            }
        }
        return max;
    }
}