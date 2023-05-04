public class Animal 
{
    protected String name;
    MakeNoise noise;

    public Animal() 
    {
        this.name = "No Name";
        noise = new Default();
    }

    public Animal(String name, MakeNoise newnoise) {
        this.name = name;
        noise = newnoise;

            //Factory
        switch (name)
        {
            case "Alpha":
                return new Elephant():
            case "Bravo":
                return new Elephant():
            case "Charlie":
                return new Lion():
            case "Delta":
                return new Lion():
            case "Echo":
                return new Rhino():
            case "Foxtrot":
                return new Rhino():
            case "India":
                return new Tiger():
            case "Juliet":
                return new Tiger():
        }
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

    public void makeNoise() {
        System.out.print(getName() + " is ");
        noise.makeNoise();
    }

            //strategy patten
            
    public void setnoise(MakeNoise newnoise) {
        noise = newnoise;
     }
}
