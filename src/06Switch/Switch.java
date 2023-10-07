import java.util.Scanner;
public class Switch {
    public static void main(String[] args){

//Switches

//        int age = 18;
//        switch (age){
//            case 10:
//                System.out.println("Age is 10");
//                break;
//            case 18:
//                System.out.println("Age is 18");
//                break;
//        }

//While loop
        Scanner sc = new Scanner(System.in);
//        String name = "";
//        while(name.isBlank()){
//            System.out.println("Enter your name");
//            name = sc.nextLine();
//        }
//        System.out.println("Hello "+ name);




//For loop
        int r,c;
        String symbol = "";

        System.out.println("row: ");
        r=sc.nextInt();

        System.out.println("col: ");
        c=sc.nextInt();

        System.out.println("Symbol: ");
        symbol = sc.next();

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(symbol+" ");
            }
            System.out.println();
        }

    }
}