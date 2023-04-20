public class Animal {
    protected String name;

    public Animal() 
    {
        this.name = "No Name";
    }

    public Animal(String name) 
    {
        this.name = name;
    }

    public void setName(String a) 
    {
        this.name = a;
    }

    public String getName() 
    {
        return this.name + " the Animal";
    }

    public void sleep() 
    {
        System.out.println(getName() + " sleeps.");
    }

    public void wakeUp() 
    {
        System.out.println(getName() + " woke up.");
    }

    public void eat() 
    {
        System.out.println(getName() + " got fed.");
    }
}
