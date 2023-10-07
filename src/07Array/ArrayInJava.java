import java.util.Scanner;
public class ArrayInJava {
    public static void main(String[] args){

//1D array

        String[] arr = {"Hi","Hello","Hie"};

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        int[] arr2 = new int[5];
        for(int i=0;i<arr2.length;i++){
            arr2[i] = 1000+i;
        }
        for (int j : arr2) {
            System.out.print(j+" ");
        }

        System.out.println();



//2D aray

        int r,c;

        Scanner sc = new Scanner(System.in);

        System.out.println("row: ");
        r=sc.nextInt();

        System.out.println("col: ");
        c=sc.nextInt();

        int [][] arra = new int[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arra[i][j] = i+j;
            }
        }

        for(int i=0;i< arra.length;i++){
            for(int j=0;j<arra[i].length;j++){
                System.out.print(arra[i][j]+" ");
            }
            System.out.println();
        }

    }
}