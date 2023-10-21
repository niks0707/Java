import java.util.Scanner;

public class Exce{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter number 1: ");
            int num1 = sc.nextInt();
            System.out.println("Enter number 1: ");
            int num2 = sc.nextInt();

            int res = num1/num2;

            System.out.println(res);
        }
        catch(ArithmeticException e){
            System.out.println("Cant divide by zero");
        }
        catch(Exception e){
            System.out.println("Something Wrong");
        }
        
        finally{
            sc.close();
        }
    }
}