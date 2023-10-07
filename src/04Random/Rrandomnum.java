import  java.util.Random;

public class Rrandomnum{
    public static void main(String[] args){
        Random rd = new Random();

        int x = rd.nextInt(10)+1;
        Double y = rd.nextDouble(10)+1;

        System.out.println(x);
        System.out.println(y);
    }
}