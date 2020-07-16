
import java.util.Scanner;

public class Interest 
{
    public static void main(String [] args) 
    {
        System.out.println("Enter Principleamount \nEnter interestrate(%) \nEnter number of years");
        
        Scanner s=new Scanner(System.in);
        int principleAmount=s.nextInt();
        float interestRate=s.nextFloat();
        float numberofYears=s.nextFloat();
        float simpleInterest=(principleAmount*interestRate*numberofYears)/100;
        System.out.println("Result :"+simpleInterest);
    }    
}