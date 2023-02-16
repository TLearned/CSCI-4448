import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.*;


public abstract class Staff 
{
    protected string staffType;
    protected PropertyChangeSupport sup;

    public staffMemeber(name)
    {
        this.name = name;
        support = new PropertyChangeSupport(this);
    }

    public getStaffType()
    (
        System.out.println("What type of staff member are you searching for? 1) Salesperson, 2) Mechanic, 3) Intern");
        int a = sc.nextInt();
        
        if(a == 1)
        {
            Salesman();
        }
        if(a == 2)
        {
            Mechanic();
        }
        if(a == 3);
        {
            Intern();
        }
    )

    public who()
    {
        System.out.println("Who  are you searching for?");
        String name = sc.nextString();
    }
}
