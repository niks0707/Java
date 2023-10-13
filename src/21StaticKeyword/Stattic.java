public class Stattic{
    public static void main(String[] args){
        Friend f1 = new Friend("Nikhil");
        Friend f2 = new Friend("Friend2");
        Friend f3 = new Friend("Friend3");
        Friend f4 = new Friend("Friend4");
    
        System.out.println(f1.name);
        // access static parameter by direct class name
        System.out.println(Friend.count);

        Friend.display();
    }
}