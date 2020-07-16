
import java.util.Scanner;

public class Palindrome {
    public static void main(String[]ars) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string :");
        String orginal=sc.nextLine();
        String reverse="";
        int length=orginal.length();
        for(int i=length-1;i>=0;i--)
        {
            reverse = reverse + orginal.charAt(i);
        }
        if(orginal.equals(reverse))
        {
            System.out.println("Entered string is a palindrome _🤩️");
        }
        else
        {
            System.out.println("Entered string is not Palindrome 😭️");
        }
    }
}