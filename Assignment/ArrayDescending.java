
import java.util.Scanner;

public class ArrayDescending 
{
    public static void main(String[]args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int size=sc.nextInt();
        int [] array=new int[size];
        System.out.println("Enter the values of array :");
        for(int i=0;i<size;i++)
        {
            array[i]=sc.nextInt();
        }
        int temp=0;
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(array[i]<array[j])
                {
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }      
            }
        }
        System.out.println();
        System.out.print("Sorted Array :");
        for(int i=0;i<size;i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }    
}