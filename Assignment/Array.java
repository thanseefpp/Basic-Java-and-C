import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        System.out.println("Enter the array limit :");
        Scanner sc=new Scanner(System.in);
        int limit=sc.nextInt();
        int [] array=new int[limit];

        System.out.println("Ente the value of array :");
        for(int i=0;i<limit;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Array Multiplied:");
        for(int i=0;i<limit-1;i++){
            array[i]=array[i]*array[i+1];
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}