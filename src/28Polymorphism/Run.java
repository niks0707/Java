public class Run{
    public static void main(String[] args){
        Car c1 = new Car();
        Bicycle bi1 = new Bicycle();
        Boat b1 = new Boat();

        Vehicle[] racers = {c1,bi1,b1};

        for(Vehicle it:racers){
            it.go();
        }
    }
}

/*
    Here c1 is Car object and also Vehicle object
    Here bi1 is Bicycle object and also Vehicle object
    Here b1 is Boat object and also Vehicle object

    that's the polymorphism
    One object in many forms
 */