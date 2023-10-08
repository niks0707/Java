public class FirstObj{
    public static void main(String[] args){
        Car mycar1 = new Car();
        Car mycar2 = new Car();
        System.out.println("Car brand is: "+ mycar1.brand);

        mycar1.price();
        mycar1.print();

        System.out.println("Car brand is: "+ mycar2.brand);

        mycar2.price();
        mycar2.print();
    }
}
