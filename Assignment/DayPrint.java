import java.util.Scanner;

public class DayPrint {
    public static void main(String[] ar) 
    {
        System.out.println("Choose a Day");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        
        switch(choice)
        {
            case 1:
            {
                System.out.print("Sunday \n");
                break;
            }
            case 2:
            {
                System.out.print("Monday \n");
                break;
            }
            case 3:
            {
                System.out.print("Tuesday \n");
                break;
            }
            case 4:
            {
                System.out.print("Wednesday \n");
                break;
            }
            case 5:
            {
                System.out.print("Thursday \n");
                break;
            }
            case 6:
            {
                System.out.print("Friday \n");
                break;
            }
            case 7:
            {
                System.out.println("Saturday \n");
                break;
            }
            default:
            {
                System.out.println("Invalid Entry \n");
            }
            
        }
    }
    
}