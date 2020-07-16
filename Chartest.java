import java.util.Scanner;

public class Chartest {
    public static void main(String[]args) 
    {
        System.out.println("Enter your name :");
        Scanner s=new Scanner(System.in);
        String name=s.nextLine();
        System.out.print("You have entered:"+name+"\n");
    }
}