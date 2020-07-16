import java.util.Scanner;

public class DuplicatenumberCheck {
    public static void main(String[]args) {
       System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        //inserting values to array
        int array[]=new int [size];  
       System.out.println("Enter number to store in array:");
        for (int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        System.out.print("Dulpcate :");
        for(int i = 0;i < array.length; i++)
        {
            for(int j = i + 1;j < array.length; j++){
                if(array[i]==array[j])
                    System.out.print(array[j]+","+" ");
            }
        }
        System.out.println();
    }
}