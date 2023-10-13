import java.util.ArrayList;

public class Foreach{
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();
        names.add("Niks1");
        names.add("Niks2");
        names.add("Niks3");
        names.add("Niks4");

        for(String i:names){
            System.out.println(i);
        }
    }
}