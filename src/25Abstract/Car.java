public class Car extends Vehicle{
    @Override
    void go(){  //but this overloaded method can have body
        System.out.println("Car is Going");
    }
}