import java.io.File;

public class FileClass{
    public static void main(String [] args){
        File f1 = new File("niks.txt");
        System.out.println();
        if(f1.exists()){
            System.out.println("File exist!!");
            System.out.println(f1.getPath());
            System.out.println(f1.getAbsolutePath());
        }
        else{
            System.out.println("File does not exist )!");
        }
    }   
}