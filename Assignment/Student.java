import java.util.Scanner;

public class Student 
{
        public static void main(String[]args)
        {
            System.out.println("Enter your mark :");
            Scanner s=new Scanner(System.in);
            float mark=s.nextFloat();
            
            if (mark<60)
            {
                if(mark<50){
                    System.out.println("You are Failed ! :( ");
                }
                else{
                    System.out.println("You are Just passed !");
                }
            }
            else
            {
                System.out.println("Congratulations :) ");
            }
        }
}