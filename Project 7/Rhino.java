public class Rhino 
{
    public Rhino() 
    {
        super("",new DefaultNoise());
    }

    public Rhino(String name) 
    {
        super(name);
    }

    public String getName() 
    {
        return this.name + " the Rhino";
    }
}
