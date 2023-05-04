public class Tiger 
{
    public Tiger() 
    {
        super("",new DefaultNoise());
    }

    public Tiger(String name) 
    {
        super(name);
    }

    public String getName() 
    {
        return this.name + " the Tiger";
    }
}