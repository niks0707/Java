public class Printtf{
    public static void main(String[] args){
//        printf() = an optional method to control, format, and display text to the console window
//                   two arguments =  format string + (object/ variable/value)
//                   % [flags] [precision] [width] [conversion-character]
        boolean myB00lean = true;
        char myChar = '@';
        String myString = "Niks";
        int mylnt = 50;
        double myDoub1e = 100012554;

        System.out.printf("%d \n",mylnt);
        System.out.printf("%c \n",myChar);
        System.out.printf("%20s \n",myString);
        System.out.printf("%-20s \n",myString);
        System.out.printf("%b \n",myB00lean);
        System.out.printf("%.2f \n",myDoub1e);
        System.out.printf("%,f \n",myDoub1e);





//        Final keyword

        final double PI = 3.14;
//        PI = 4;   now we cannot change value
        System.out.println(PI);
    }
}
