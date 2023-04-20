import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.time.*;

public class Time 
{
    private int hour;
    private int day;

    private PropertyChangeSupport support;
    public Time() 
    {
        hour = 0;
        day = 0;
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

    public void setTime(int hour, int day) 
    {
        System.out.println("\nThe time is now " + hour + ":00 on " + day + ".");
        support.firePropertyChange("ZooClock", this.hour, hour);
        this.hour = hour;
    }

    public int getHour() 
    {
        return hour;
    }

    public void countTime(int day, int openTime, int closeTime) 
    {
        support.firePropertyChange("ZooClock Current Day", this.day, day);
        this.day = day;
        for (int i = openTime; i <= closeTime; i++) 
        {
            setTime(i, day);
        }
    }
}
