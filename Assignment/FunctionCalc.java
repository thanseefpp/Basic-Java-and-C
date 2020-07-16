import java.util.Scanner;
public class FunctionCalc {

    public void addition(int number1,int number2){
        {
            int sum=number1+number2;
            System.out.println("Result :"+sum);
        }
    }
    public void subtraction(int number1,int number2){
        int sum=number1-number2;
        System.out.println("Result :"+sum);
    }
    public void multiplication(int number1,int number2){
        int sum=number1*number2;
        System.out.println("Result :"+sum);
    }
    public void division(int number1,int number2){
        float sum=number1/number2;
        System.out.println("Result :"+sum);
    }

    public static void main(String[]args) 
    {
        System.out.println("Enter two numbers:");
        Scanner s=new Scanner(System.in);
        int number1=s.nextInt(),number2=s.nextInt();
        FunctionCalc c=new FunctionCalc();//class object access
        System.out.println("Choose Operation :\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        

        switch (choice) {
            case 1:
                c.addition(number1, number2);
                break;
            case 2:
                c.subtraction(number1,number2);
                break;
            case 3:
                c.multiplication(number1, number2);
                break;
            case 4:
                c.division(number1, number2);
                break;
            default:
                System.out.println("wrong choice");
                break;
        }
    }
}