
import java.util.Scanner;

public class TwoDimensionalArray 
{
    public static void main(final String[] ar) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :");
        final int size = sc.nextInt();
        final int[][] array1 = new int[size][size];
        final int[][] array2 = new int[size][size], sumArray = new int[size][size];
        int i,j;
        System.out.println("Enter value of array1 :");
        for(i=0;i<size;i++)
        {
            for(j=0;j<size;j++){
                array1[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("Ente value of array2 :");
        for(i=0;i<size;i++)
        {
            for(j=0;j<size;j++)
            {
                array2[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        
        System.out.println("Sum total :");
        for(i=0;i<size;i++)
        {
            for(j=0;j<size;j++)
            {
                sumArray[i][j]=array1[i][j]+array2[i][j];
                System.out.print(sumArray[i][j]+" ");
            }
            System.out.println();
        }
        

    }    
}