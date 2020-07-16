import java.util.Scanner;

public class InterChange 
{
    public static void main(String[] args) 
    {
        Scanner inputsize=new Scanner(System.in);
        System.out.println("Enter the size of arrays:\n");
        int size=inputsize.nextInt();
        int [] array1 = new int[size],array2 =new int[size],buff = new int[size];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of Array 1:\n");
        for(int i=0;i<size;i++)
        {
            array1[i]=sc.nextInt();
        }
        System.out.println("Enter the values of Array 2:\n");
        for(int i=0;i<size;i++)
        {
            array2[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            buff[i]=array1[i];
            array1[i]=array2[i];
            array2[i]=buff[i];
        }
        System.out.println("\nArrays after swapping:\n");
        System.out.print("Array_1: ");
        for(int i=0;i<size;i++)
        {
            System.out.print(array1[i]+" ");
        }
        System.out.print("\nArray_2: ");
        for(int i=0;i<size;i++)
        {
            System.out.print(array2[i]+" ");
        }
        System.out.println();
    }
}