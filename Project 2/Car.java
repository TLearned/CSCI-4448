import java.util.concurrent.locks.Condition;

public class Car
{
    protected int type; 
    public int condition;
    public int cleanliness;
    private int cost;
    private int salesPrice;
    public int status;

    public Car()
    {
        this.car = 0;
    }

    public Car(int type)
    {
        this.car = type;
    }

    public getType()
    {
        System.out.println("What type of car are you searching for? 1) Performance, 2) Car, 3) Pickup");
        int a = sc.nextInt();
        if(a == 1)
        {
            System.out.println("Performance");
            type == 1;
        }
        if(a == 2)
        {
            System.out.println("Car");
            type == 2;
        }
        if(a == 3);
        {
            System.out.println("Pickup");
            type == 3;
        }
    }
    
    public void carStatus(status)
    (
        getType()
        {
            return this.car;
        }

        if(status == 0)
        {
            System.out.println("Please Choose Another Car.");
            break;
        }
        else if(status == 1)
        {
            System.out.println("Choosing " + type + " .");
        }
    )

    public void carCondition()
    (
        getType()
        {
            return this.car;
        }

        if(condition == 0)
        {
            System.out.println("Brokem.");
            carSalesPrice = carCost * .5;
        }
        if(condition == 1)
        {
            System.out.println("Used.");
            carSalesPrice = carCost * .5;
        }
        else if(comdition == 2)
        {
            System.out.println("New.");
            carSalesPrice = carCost * .5;
        }
    )

    public void carCleanliness()
    (
        getType()
        {
            return this.car;
        }

        if(cleanliness == 0)
        {
            System.out.println("Dirty");
            carSalesPrice = carCost * .4;
        }
        else if(cleanliness == 1)
        {
            System.out.println("Clean");
            carSalesPrice = carCost * .65;
        }
        else if(sparkling == 2)
        {
            System.out.println("Sparkling");
            carSalesPrice = carCost * .95;
        }
    )

    public void carCost()
    {
        getType()
        {
            return this.car;
        }
        if(type == 1)
        {
            cost == 40000;
        }
        if(type == 2)
        {
            cost == 20000;
        }
        if(type == 3)
        {
            cost == 20000;
        }
    }

    public void carSalesPrice()
    {
        getType()
        {
            return this.car;
        }
        
        carCost(carCondtion, carStatus);
        carCondition();
        carStatus();
    }
}
