import java.util.Scanner;

public class Oddnumber {

    public static void main(final String[] args) {
        System.out.println("Enter a limit :");
        final Scanner sc = new Scanner(System.in);
        final int number = sc.nextInt();
        int i,oddSum=0;

        for(i=1;i<=number;i=i+2)
        {
            oddSum=oddSum+i;
        }
        System.out.println("\nSum of Odd Number :"+number+"="+oddSum);

    }
}