public class Encap{
    public static void main(String[] args){
        Car c1 = new Car("Lambo",2001);
        Car c2 = new Car("Dukati",1947);

        System.out.println(c1.getMake());
        System.out.println(c1.getYear());

        c1.setMake("Bugati");
        c1.setYear(2003);

        System.out.println(c1.getMake());
        System.out.println(c1.getYear());


        System.out.println();

        // Copy object like this or
        c2.copy(c1);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c2.getMake());
        System.out.println(c2.getYear());

        System.out.println();
        

        // Or create new object like this
        Car c3 = new Car(c1);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(c3.getMake());
        System.out.println(c3.getYear());
    }
}