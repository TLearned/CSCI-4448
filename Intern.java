import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.List;
import java.util.Scanner;

public class Intern extends Staff implements PropertyChangeListener
{
    private int salaryEarned = 10;
    private int bonusEarned = 0;
    private int bonus = 1;

    private int daysWorked;
    private boolean status;

    public Intern()
    {
        super();
    }

    public Intern(staffType)
    {
        super(staffType);
    }

    public void setSalaryEarned(int slary)
    {
        for(a = 0; a <= daysWorked; a++)
        {
            int total = 0;
            total = total + salary;
        }

        System.out.println("Salary Earned is $" + total * daysWorked + " .");
    }

    public void setBonusEarned(int bonus)
    {
        for(b = 0; b <= carsCleaned; b++)
        {
            int tot = 0;
            tot = tot + bonus;
        }
        System.out.println("Bonus Earned is $" + tot + " .");
    }

    public void setDaysWorked(int daysWorked)
    {
        for(int i = 0; i < daysWorked ; i++)
        {
            totalDays = 0;
            totalDays = totalDays + 1;
        }
        System.out.println("Total Days Worked is " + j + " .");
    }

    public void setStatus(int status)
    {
        if(status == 0)
        {
            System.out.println("Employee is no longer employed");
        }

        else if(status == 1)
        {
            System.out.println("Employee is employed");
        }
    }

    public void cleanCar()
    {
        public int carStat = 0;
        public int carsCleaned = 0;

        if(carStat = 0 || carStat = 1)
        {
            System.out.println("Car Not Cleaned");
        }
        else if(carStat = 2)
        {
            System.out.println("Car Cleaned");
            carsFixed = carsCleaned + 1;
        }
    }
}