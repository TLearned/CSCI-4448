import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Vehicle {
    String name;
    Enums.VehicleType type;
    Enums.Condition condition;
    Enums.Cleanliness cleanliness;
    double cost;
    double price;
    double repair_bonus;
    double wash_bonus;
    double sale_bonus;
    double range;
    double engineSize;
    String stageName;
    double racesWon;

    Vehicle () {
        // all vehicles have the same cleanliness arrival chance
        double chance = Utility.rnd();
        if (chance <= .05) cleanliness = Enums.Cleanliness.Sparkling;
        else if (chance>.05 && chance<=.4) cleanliness = Enums.Cleanliness.Clean;
        else cleanliness = Enums.Cleanliness.Dirty;
        // all vehicles have the same condition arrival chance (even chance of any)
        condition = Utility.randomEnum(Enums.Condition.class);
    }

    // utility for getting adjusted cost by condition
    double getCost(int low,int high) {
        double cost = Utility.rndFromRange(low, high);
        if (condition== Enums.Condition.Used) cost = cost*.8;
        if (condition== Enums.Condition.Broken) cost = cost*.5;
        return cost;
    }

    // utility for getting Vehicles by Type
    // You could do this with getClass instead of Type, but I use the enum
    // because it's clearer to me (less Java-y)
    static ArrayList<Vehicle> getVehiclesByType(ArrayList<Vehicle> vehicleList, Enums.VehicleType t) {
        ArrayList<Vehicle> subclassInstances = new ArrayList<>();
        for (Vehicle v : vehicleList) {
            if (v.type == t) subclassInstances.add(v);
        }
        return subclassInstances;
    }

    // Utility for finding out how many of a Vehicle there are
    static int howManyVehiclesByType(ArrayList<Vehicle> vehicleList, Enums.VehicleType t) {
        int n = 0;
        for (Vehicle v: vehicleList) {
            if (v.type == t) n++;
        }
        return n;
    }
}

class Car extends Vehicle {
    // could make the name list longer to avoid as many duplicates if you like...
    static List<String> names = Arrays.asList("Probe","Escort","Taurus","Fiesta");
    static Namer namer = new Namer(names);
    Car() {
        super();
        type = Enums.VehicleType.Car;
        name = namer.getNext();  // every new car gets a new name
        cost = getCost(10000,20000);
        price = cost * 2;
        if (racesWon >= 1){                 //Tyler Learned
            price = price + (price * .1);   //Tyler Learned
        }                                   //Tyler Learned
        repair_bonus = 100;
        wash_bonus = 20;
        sale_bonus = 500;
        racesWon = ; //Tyler Learned
    }
}

class PerfCar extends Vehicle {
    static List<String> names = Arrays.asList("Europa","Cayman","Corvette","Mustang");
    static Namer namer = new Namer(names);
    PerfCar() {
        super();
        type = Enums.VehicleType.PerfCar;
        name = namer.getNext();  // every new perf car gets a unique new name
        cost = getCost(20000,40000);
        price = cost * 2;
        if (racesWon >= 1){                 //Tyler Learned
            price = price + (price * .1);   //Tyler Learned
        }                                   //Tyler Learned
        repair_bonus = 300;
        wash_bonus = 100;
        sale_bonus = 1000;
        racesWon = ; //Tyler Learned
    }
}

class Pickup extends Vehicle {
    static List<String> names = Arrays.asList("Ranger","F-250","Colorado","Tundra");
    static Namer namer = new Namer(names);
    Pickup() {
        super();
        type = Enums.VehicleType.Pickup;
        name = namer.getNext(); // every new pickup gets a unique new name
        cost = getCost(10000,40000);
        price = cost * 2;
        if (racesWon >= 1){                 //Tyler Learned
            price = price + (price * .1);   //Tyler Learned
        }                                   //Tyler Learned
        repair_bonus = 200;
        wash_bonus = 75;
        sale_bonus = 750;
        racesWon = ; //Tyler Learned
    }
}

//Tyler Learned

class Ecar extends Vehicle {
    static List<String> names = Arrays.asList("ModelS","Model3","ModelX","i4");
    static Namer namer = new Namer(names);
    Ecar() {
        super();
        type = Enums.VehicleType.Ecar;
        name = namer.getNext();
        cost = getCost(10000,40000);
        price = cost * 2;
        if (racesWon >= 1){
            price = price + (price * .1);
        }
        repair_bonus = 200;
        wash_bonus = 75;
        sale_bonus = 750;
        range =      
        racesWon = ; 
    }
}

class Moto extends Vehicle {
    static List<String> names = Arrays.asList("Harley","Ducati","BMW","Yamaha");
    static Namer namer = new Namer(names);
    Moto() {
        super();
        type = Enums.VehicleType.Moto;
        name = namer.getNext();
        cost = getCost(10000,40000);
        price = cost * 2;
        if (racesWon >= 1){
            price = price + (price * .1);
        }
        repair_bonus = 200;
        wash_bonus = 75;
        sale_bonus = 750;
        engineSize = 
        racesWon = ;
    }
}

class Monster extends Vehicle {
    static List<String> names = Arrays.asList("Avenger","Batman","Gunslinger","Zombie");
    static Namer namer = new Namer(names);
    Monster() {
        super();
        type = Enums.VehicleType.Monster;
        stageName = namer.getNext();
        cost = getCost(10000,40000);
        price = cost * 2;
        if (racesWon >= 1){
            price = price + (price * .1);
        }
        repair_bonus = 200;
        wash_bonus = 75;
        sale_bonus = 750;
        racesWon = ;
    }
}

class ThreeWheel extends Vehicle {
    static List<String> names = Arrays.asList("BAC","Arrow","Mutant","Thing");
    static Namer namer = new Namer(names);
    ThreeWheel() {
        super();
        type = Enums.VehicleType.ThreeWheel;
        stageName = namer.getNext();
        cost = getCost(10000,40000);
        price = cost * 2;
        if (racesWon >= 1){
            price = price + (price * .1);
        }
        repair_bonus = 200;
        wash_bonus = 75;
        sale_bonus = 750;
        racesWon = ;
    }
}

class SixWheel extends Vehicle {
    static List<String> names = Arrays.asList("Western","Wilder","Rocky","Transport");
    static Namer namer = new Namer(names);
    SixWheel() {
        super();
        type = Enums.VehicleType.SixWheel;
        stageName = namer.getNext();
        cost = getCost(10000,40000);
        price = cost * 2;
        if (racesWon >= 1){
            price = price + (price * .1);
        }
        repair_bonus = 200;
        wash_bonus = 75;
        sale_bonus = 750;
        racesWon = ;
    }
}

class Trail extends Vehicle {
    static List<String> names = Arrays.asList("Wrangler","XTerra","Trailhawk","4Runnerrr");
    static Namer namer = new Namer(names);
    Trail() {
        super();
        type = Enums.VehicleType.Trail;
        stageName = namer.getNext();
        cost = getCost(10000,40000);
        price = cost * 2;
        if (racesWon >= 1){
            price = price + (price * .1);
        }
        repair_bonus = 200;
        wash_bonus = 75;
        sale_bonus = 750;
        racesWon = ;
    }
}
