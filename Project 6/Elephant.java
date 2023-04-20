public class Elephant extends Animal 
{
    public Elephant() 
    {
        super("");
    }

    public Elephant(String name) 
    {
        super(name);
    }

    public String getName() 
    {
        return this.name + " the Elephant";
    }
}