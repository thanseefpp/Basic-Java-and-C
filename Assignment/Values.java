
import java.util.Scanner;

public class Values 
{
    public static void main(String[]args) 
    {
        System.out.println("Enter Two numbers :");
        Scanner sc=new Scanner(System.in);
        int number1=sc.nextInt();
        float number2=sc.nextFloat();
        float result=number1+number2;
        System.out.println("Result :"+result);
    }
    
}