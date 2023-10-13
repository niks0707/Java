public class ArrayOfObject{
    public static void main(String[] args){
        // Food[] refregitor = new Food[3];
        
        Food f1 = new Food("Pizza");
        Food f2 = new Food("hotdog");
        Food f3 = new Food("burger");

        // refregitor[0] = f1;
        // refregitor[1] = f2; 
        // refregitor[2] = f3;

        Food[] refregitor = {f1,f2,f3};

        System.out.println(refregitor[0].name);
        System.out.println(refregitor[1].name);
        System.out.println(refregitor[2].name);
    }
}