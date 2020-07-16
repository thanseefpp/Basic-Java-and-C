import java.util.Scanner;

public class Myclass extends Area{

    public static void main(String[]args) {
        System.out.println("Enter yout choice :\n1.Circle\n2.Square\n3.Rectangle\n4.Triangle");
        Scanner inputChoice=new Scanner(System.in);
        int choice=inputChoice.nextInt();
        Myclass obj=new Myclass();

        switch (choice) {
            case 1:
                obj.circle();
                break;
            case 2:
                obj.Square();
                break;
            case 3:
                obj.Rectangle();
                break;
            case 4:
                obj.Triangle();
                break;
            default:
                System.out.println("Wrong choice 😭️");
                break;
        }
    }    
}