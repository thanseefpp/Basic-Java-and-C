import java.util.Scanner;
public class PrimeNumber 
{
    public static void main(final String[] args) {
        System.out.println("Enter a number :");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int m = number / 2;
        int flag = 0;
        if(number==0 || number==1){
            System.out.println("Not a prime number 😥️");
        }
        else{
            for (int i=2;i<=m;i++){
                if(number%i==0){
                    System.out.println("Not a prime number 😥️");
                    flag=1;
                    break;
                }
        }
        if(flag==0){
            System.out.println(number+" is prime number 😯️");
        }
        }
    }    
}