import java.util.Scanner;
public class IncomeTax {
    public static void main(String[]args) {
        System.out.println("Enter the anual income:");
        Scanner sc=new Scanner(System.in);
        int userIncome=sc.nextInt();
        float tax;
        if(userIncome<=250000){
            System.out.println("No Tax 😯️");
        }
        else if(userIncome>250000 && userIncome<=500000){
            tax=(userIncome*5)/100;
            System.out.println("Income tax amount 5% ="+tax);
        }
        else if(userIncome>500000 && userIncome<=1000000){
            tax=(userIncome*20)/100;
            System.out.println("Income tax amount 20% ="+tax);
        }
        else if(userIncome>1000000 && userIncome<=5000000){
            tax=(userIncome*30)/100;
            System.out.println("Income tax amount %30 ="+tax);
        }
        else if(userIncome>5000000){
            System.out.println("Income Tax Officers will visit your home 🤩️");
        }
    }
}