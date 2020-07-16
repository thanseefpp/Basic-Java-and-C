import java.util.Scanner;

public class ArrayOddnumber {
    public static void main(String[]ar) 
    {
        Scanner inputSize=new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int size=inputSize.nextInt();
        int[]  array=new int[size]; //storing values to array
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of Array: ");
        for (int i=0;i<size;i++)
        {
           array[i]=sc.nextInt();
        }

        //Print_Array Values:
       /* System.out.print("Array:");
        for(int i=0;i < size; i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();*/
       //odd_Numbers:
        /*System.out.println("OddNumbers");
        for (int i = 1;i < size; i++)
        {
            if(array[i] %2==0)
            {

            }
        }*/
        // even_number
        int even_number=0;
       System.out.print("Number of even numbers in the given array is:");
        for (int i = 1;i < size; i++)
        {
            if(array[i] %2 == 0)
            {
               even_number++;
            }
        }
        System.out.println(even_number);
    }   
}