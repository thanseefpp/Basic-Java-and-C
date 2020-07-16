
import java.util.Scanner;
public class AlphaPattern {
    public static void main(String []args) {
        
        System.out.println("Enter a number :");
        Scanner s=new Scanner(System.in);
        int star=s.nextInt();

        for (int i=1;i<=star;i++)
        {
            for (int j=1;j<=star-i; j++) 
                { 
                    System.out.printf(" "); // printing spaces 
                }
            for (int j=1; j<=i; j++)
                { 
                    System.out.printf("%c",(char)(j+64)); // printing j values
                } 
            
            for (int j=i-1; j>=1; j--) 
                { 
                    System.out.printf("%c",(char)(j+64)); // printing j values
                }
                System.out.println();
        }
    }  
} 