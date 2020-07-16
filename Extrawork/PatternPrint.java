import java.util.Scanner;
public class PatternPrint {
    public static void main(String[] aString) {
        System.out.println("Enter a number :");
        Scanner s=new Scanner(System.in);
        int star=s.nextInt();
        for (int i=0; i<star;i++) 
        { 
            for (int j=star-i; j>1; j--) 
            { 
                System.out.print(" "); // printing spaces 
            } 
            for (int j=1; j<=i+1; j++ ) 
            { 
                if(j==i+1){
                    System.out.print("1"); //print 1 after incrimenting values
                    break;
                   }
                System.out.print(j+" "); // printing j values
            } 
            System.out.println(); //new line 
        } 
    }
}