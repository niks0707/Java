public class Friend{
    String name;
    static int count = 0;

    Friend(String name){
        this.name = name;
        count++;
    }

    static void display(){
        System.out.println("You have total "+count+" Friends");
    }
}