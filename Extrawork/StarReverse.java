import java.util.Scanner;

public class StarReverse 
    { 
        public static void rightTriangle(int n) 
        { 
            int i, j;  
            for(i=0; i<n; i++) 
                {           
                    System.out.print(" "); 
                
                for(j=0; j<=i; j++) 
                {       
                    System.out.print("* "); 
                }
                for(j=1;j<n-1;++){
                    System.out.print("* ");
                }
                System.out.println(); 
            } 
        }
        public static void main(String args[]) 
        { 
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt(); 
            rightTriangle(n); 
        } 
    }