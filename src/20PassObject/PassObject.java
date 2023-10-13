public class PassObject{
    public static void main(String[] args){

        Car c1 = new Car("BMW");
        Car c2 = new Car("Tesla");

        Garrage g1 = new Garrage();

        g1.park(c1);
        g1.park(c2);
    }
}