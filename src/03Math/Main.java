import java.util.Scanner;

public class Main{
    public static void main(String[] args){
     
        Scanner sc = new Scanner(System.in);
        System.out.print("X: ");
        double x = sc.nextDouble();
        System.out.print("X: ");
        double y = sc.nextDouble();

        double z = Math.sqrt((x*x + y*y));

        System.out.println("Z: "+ z);
    }
}