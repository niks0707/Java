import java.util.Random;

public class Dice2{
    int num;
    Random rand;
    Dice2(){
        rand = new Random();
        roll();
    }

    void roll(){
        num = rand.nextInt(10)+1;
        System.out.println("Random number is : " + num);
    }
}