import java.util.Scanner;

public class PatterForloop {
    public void forLoop(int numbers){ //function
        int sum=1;
        for(int i=0;i<numbers;i++){
            for(int j=1;j<=i;j++){
                System.out.print(sum+" ");
                sum++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        PatterForloop pattern=new PatterForloop();//object
        System.out.println("Enter a number to show patter :");
        Scanner sc=new Scanner(System.in);
        int numbers=sc.nextInt();
        pattern.forLoop(numbers);

    }
}