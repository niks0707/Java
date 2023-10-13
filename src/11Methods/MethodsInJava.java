public class MethodsInJava{
    public static void main(String[] args){
        hello();
        int z = add(5,9);
        System.out.println(z);
    }
    static void hello(){
        System.out.println("Hello");
    }
    static int add(int x,int y){
        return x+y;
    }
}