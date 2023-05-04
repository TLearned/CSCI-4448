public class Elephant extends Animal 
{
    public Elephant() 
    {
        super("",new DefaultNoise());
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