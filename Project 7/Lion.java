public class Lion 
{
    public Lion() 
    {
        super("",new DefaultNoise());
    }

    public Lion(String name) 
    {
        super(name);
    }

    public String getName() 
    {
        return this.name + " the Lion";
    }
}
