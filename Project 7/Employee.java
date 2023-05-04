import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public abstract class Employee 
{
    protected String name;
    protected PropertyChangeSupport support;

    public Employee() 
    {
        this.name = "None";
        support = new PropertyChangeSupport(this);
    }

    public Employee(String name) 
    {
        this.name = name;
        support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) 
    {
        support.addPropertyChangeListener(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl) 
    {
        support.removePropertyChangeListener(pcl);
    }
}