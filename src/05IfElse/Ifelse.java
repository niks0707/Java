import java.util.Scanner;
public class Ifelse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        if(age<18){
            System.out.println("Below 18");
        }
        else{
            System.out.println("Above 18");
        }
    }
}