import java.util.ArrayList;
//ArraList is resizable array
//It uses Refference data types (wrapper datatypes)

public class arraylist{
    public static void main(String[] args){

//        1D array
        ArrayList<String> first = new ArrayList<String>();

        first.add("Niks1");
        first.add("Niks2");
        first.add("Niks3");

        first.set(1,"Nikhil");
        first.remove(2);

        for(int i=0;i<first.size();i++){
            System.out.println(first.get(i));
        }




//        2D array
        ArrayList<ArrayList<String>> combo = new ArrayList();
        ArrayList<String> sec = new ArrayList<String>();
        sec.add("Niks3");
        sec.add("Niks4");

        combo.add(first);
        combo.add(sec);

        System.out.println(combo);

        for(ArrayList s: combo){
            System.out.print(s);
        }
    }
}