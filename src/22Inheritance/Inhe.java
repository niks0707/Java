public class Inhe{
    public static void main(String[] args){
        Vehicle v1 = new Vehicle();
        v1.go();

        Car c1 = new Car();
        c1.stop();

        System.out.println(c1.doors);
        System.out.println(v1.speed);
        System.out.println(c1.speed);
    }
}