import java.util.Scanner;

public class Calc {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("number1: ");
    Double num1 = sc.nextDouble();

    System.out.println("number2: ");
    Double num2 = sc.nextDouble();

    System.out.println("operator: ");
    char op = sc.next().charAt(0);

    switch (op) {
      case '+':
        System.out.println(num1 + num2);
      case '-':
        System.out.println(num1 - num2);
      case '*':
        System.out.println(num1 * num2);
      case '/':
        System.out.println(num1 / num2);
    }
  }
}
