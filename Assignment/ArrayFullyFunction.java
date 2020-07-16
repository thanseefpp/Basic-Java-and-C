
import java.util.Scanner;

public class ArrayFullyFunction {
    public static void getArray(int[][]array1,int[][] array2,int userSize){
        
        Scanner userInput=new Scanner(System.in);
        System.out.println("Enter the Value of Array1:");
        for(int i=0;i<userSize;i++){
            for(int j=0;j<userSize;j++){
                array1[i][j]=userInput.nextInt();
            }
        }
        System.out.println("Enter the value of Array2:");
        for(int i=0;i<userSize;i++){
            for(int j=0;j<userSize;j++){
                array2[i][j]=userInput.nextInt();
            }
        }
    }
    public static void addArray(int [][]array1,int[][] array2,int[][]sumArray,int userSize){
        for(int i=0;i<userSize;i++)
        {
            for(int j=0;j<userSize;j++)
            {
                sumArray[i][j]=array1[i][j]+array2[i][j];
            }
        }
    }
    public static void displayArray(int[][]sumArray,int userSize){
        
        System.out.println("sum of array1 and array2 :");
        for(int i=0;i<userSize;i++){
            for(int j=0;j<userSize;j++){
                System.out.print(sumArray[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[]args) {
        
        System.out.println("Enter the size of array:");
        Scanner sc=new Scanner(System.in);
        int userSize=sc.nextInt();
        ArrayFullyFunction obj=new ArrayFullyFunction();
        int [][] array1=new int[userSize][userSize],array2=new int[userSize][userSize],sumArray=new int[userSize][userSize];
        getArray(array1, array2, userSize);
        addArray(array1, array2, sumArray, userSize);
        displayArray(sumArray, userSize);
    }
}