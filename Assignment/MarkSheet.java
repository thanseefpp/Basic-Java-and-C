import java.util.Scanner;

public class MarkSheet 
{
    public static void main(String[]arg) 
    {
        System.out.println("Enter your Totalmark :");
        Scanner s=new Scanner(System.in);
        float totalMark=s.nextFloat();

        if (totalMark > 89)
        {
            System.out.println("Grade_A_🤩️");
        }
        else if(totalMark > 79 && totalMark < 89)
        {
            System.out.println("Grade_B_😀️");
        }
        else if(totalMark > 69 && totalMark < 79)
        {
            System.out.println("Grade_C_🙂️");
        }
        else if(totalMark > 59 && totalMark <69)
        {
            System.out.println("Grade_D_😥️");
        }
        else if(totalMark > 49 && totalMark <59)
        {
            System.out.println("Grade_E_😓️");
        }
        else
        {
            System.out.println("Failed! 😭️");
        }
    }
}