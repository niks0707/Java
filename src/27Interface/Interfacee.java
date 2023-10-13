public class Interfacee{
    public static void main(String[] args){
        Rabbit r1 = new Rabbit();
        r1.flee();

        System.out.println();

        Human h1 = new Human();
        h1.predict();
        h1.flee();
    }
}