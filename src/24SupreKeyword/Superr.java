public class Superr{
    public static void main(String[] args){
        Person p1 = new Person("Nikhil",21);
        Hero h1 = new Hero("Shubham",25,"$$$");

        System.out.println(p1.name);
        System.out.println(h1.name);
        System.out.println(p1.toString());
        System.out.println(h1.toString());
    }
}