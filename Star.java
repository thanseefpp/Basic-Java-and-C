import java.util.Scanner;

import javax.swing.event.InternalFrameListener;

public class Star {
    public static void main(String[] aString) {
        System.out.println("Enter a number :");
        Scanner s=new Scanner(System.in);
        int star=s.nextInt();
        int k=0;

        for(int i = 1 ; i <=star; ++i,k=0)
        {
            for(int space =1;space <= star - i; ++space){
                System.out.print("  ");
            }
            while(k !=2 *i - 1){
                System.out.print("* ");
                ++k;
            }
            System.out.println();
        }
        
    }
    
}