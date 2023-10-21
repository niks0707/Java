import java.util.Scanner;

public class Run{
    public static void main(String[] args){
        Vehicle v1;
        Scanner sc = new Scanner(System.in);

        System.out.println("What do you want: 1-Boat 2-Car 3 Bicycle :");
        int choice = sc.nextInt();

        if(choice==1){
            v1 = new Boat();
            v1.go();
        }
        else if(choice==2){
            v1 = new Car();
            v1.go();
        }
        else if(choice==3){
            v1 = new Bicycle();
            v1.go();
        }
        else{
            v1 = new Vehicle();
            v1.go();
        }
    }
}

/*
    Here c1 is Car object and also Vehicle object
    Here bi1 is Bicycle object and also Vehicle object
    Here b1 is Boat object and also Vehicle object

    that's the polymorphism
    One object in many forms

    but we performed action while programe is running
 */