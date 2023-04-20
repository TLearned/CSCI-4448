import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.List;
import java.util.Scanner;

public class Keeper extends Employee implements PropertyChangeListener 
{
    private List<Animal> animals;
    private int currentDay;

    public Keeper() 
    {
        super();
    }

    public Keeper(String name) 
    {
        super(name);
    }

    public void setAnimals(List<Animal> animals) 
    {
        this.animals = animals;
    }

    public void rollCallAnimals() 
    {
        support.firePropertyChange("Keeper", null, "roll call the animals");
        System.out.println("The keeper performs roll call.");
        for (int i = 0; i < animals.size(); i++) 
        {
            System.out.println("The keeper sees " + animals.get(i).getName() + ".");
        }
    }

    public void sleepAnimals() 
    {
        support.firePropertyChange("Keeper", null, "put the animals to sleep");
        for (int i = 0; i < animals.size(); i++) 
        {
            System.out.println("The keeper tells " + animals.get(i).getName() + " to go to sleep.");
            animals.get(i).sleep();
        }
    }

    public void wakeUpAnimals() {
        support.firePropertyChange("Keeper", null, "wake the animals");
        for (int i = 0; i < animals.size(); i++) 
        {
            System.out.println("The keeper wakes up " + animals.get(i).getName() + ".");
            animals.get(i).wakeUp();
        }
    }

    public void feedAnimals() 
    {
        support.firePropertyChange("Keeper", null, "feed the animals");
        for (int i = 0; i < animals.size(); i++) 
        {
            System.out.println("The keeper feeds " + animals.get(i).getName() + ".");
            animals.get(i).eat();
        }
    }

    public void arrive() 
    {
        System.out.println("The keeper arrives to the sanctuary on " + currentDay + ".");
        support.firePropertyChange("arrive", null, currentDay);
    }

    public void leave() 
    {
        System.out.println("The keeper leaves the sanctuary on " + currentDay + ".");
        support.firePropertyChange("leave", null, currentDay);
    }

    public void propertyChange(PropertyChangeEvent evt) 
    {
        if (evt.getPropertyName().equals("Time Current Day")) 
        {
            currentDay = (int) evt.getNewValue();
        }
        
        else if (evt.getPropertyName().equals("Time")) 
        {
            if (evt.getNewValue().equals(8)) 
            {
                arrive();
            } 
            else if (evt.getNewValue().equals(9)) 
            {
                wakeUpAnimals();
            } 
            else if (evt.getNewValue().equals(10)) 
            {
                rollCallAnimals();
            } 
            else if (evt.getNewValue().equals(11)) 
            {
                feedAnimals();
            }
            else if (evt.getNewValue().equals(17)) 
            {
                feedAnimals();
            }  
            else if (evt.getNewValue().equals(19)) 
            {
                sleepAnimals();
            } 
            else if (evt.getNewValue().equals(20)) 
            {
                leave();
            }
        }
    }
}