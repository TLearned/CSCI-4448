import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.*;


public abstract class Staff 
{
    protected string staffType;
    protected PropertyChangeSupport sup;

    public staffMemeber(staffType)
    {
        this.staffType = staffType;
        support = new PropertyChangeSupport(this);
    }

    public getStaffType()
    (
        System.out.println("What type of staff member are you saerching for? 1) Salesperson, 2) Mechanic, 3) Intern");
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
}
