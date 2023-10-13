public class Person{
    int age;
    String name;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return this.name+" "+this.age+" ";
    }
}