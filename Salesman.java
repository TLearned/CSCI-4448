import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.List;
import java.util.Scanner;

public class Salesman extends Staff implements PropertyChangeListener
{
    private int salary = 100;
    private int bonusPe = 10;
    private int bonusC= 5;
    private int bonusPic= 5;
    
    private int salaryEarned;
    private int bonusEarned;
    private int daysWorked;
    private int status; //0 no longer employed, 1 employed

    public Salesman()
    {
        super();
    }

    public Salesman(staffType)
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
        for(b = 0; b <= carsSold; b++)
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


    public void getMostExpensiveCar()
    {
        
    }

    public void sellcar()
    {
        private boolean sold = false;
        public int carsSold = 0;
        
        if(sold == false)
        {
            System.out.println("Car Not Sold.");
        }
        if(sold == true)
        {
            system.out.println("Car Sold.");
            carsSold = carsSold + 1;
        }
    }
}