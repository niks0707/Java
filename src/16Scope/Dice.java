import java.util.Random;
public class Dice{
    Dice(){
        Random rand = new Random();
        int num = 0;
        roll(rand, num);
    }

    void roll(Random rand, int num){
        num = rand.nextInt(10)+1;
        System.out.println(num);
    }
}