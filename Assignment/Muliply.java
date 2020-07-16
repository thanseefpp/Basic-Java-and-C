import java.util.Scanner;

public class Muliply 
{
    public static void main(String[]ar) 
    {
        System.out.println("Enter a number to show multiplication table:");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        System.out.println("Enter how many:");
        int count=sc.nextInt();
        int i;
        
        for(i=1;i<=count;i++)
        {
            System.out.print(i + "X" + number+"="+ number*i+"\n");

        }

    }
    
}