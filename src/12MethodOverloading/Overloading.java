public class Overloading{
    public static void main(String[] args){
        hello();
        double z = add(5,9,14);
        System.out.println(z);
    }
    static void hello(){
        System.out.println("Hello");
    }
    static int add(int x,int y){
        return x+y;
    }
    static int add(int x,int y,int z){
        return x+y+z;
    }
    static int add(int x,int y,int z,int w){
        return x+y+z+w;
    }

    static double add(double x,double y){
        return x+y;
    }
    static double add(double x,double y,double z){
        return x+y+z;
    }
}