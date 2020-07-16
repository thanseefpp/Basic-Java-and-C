import java.util.Scanner;

public class CallArray 
{
    public static void displayArray(int[]array,int size) //Argument passing 
    {
        System.out.println("Inserted Values in Array:");
        for(int i=0;i<size;i++)
        {
            System.out.println(array[i]);
        }
    }
    public static void getArray(int []array,int size) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Values to array :");
        for(int i=0;i<size;i++)
        {
            array[i]=s.nextInt();
        }
    }
    public static void main(final String[] args) 
    {
        System.out.println("Enter size of array");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] array=new int[size];//Array size declared
        int i=0;
        getArray(array,size);//Function calling
        displayArray(array,size);//Function calling
    }
}