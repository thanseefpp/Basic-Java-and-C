import java.util.Scanner;

public class ObjectArray {
    public void getArray(int[][]array,int userSize){
        Scanner userInput=new Scanner(System.in);
        System.out.println("Enter the Value of Array1:");
        for(int i=0;i<userSize;i++){
            for(int j=0;j<userSize;j++){
                array[i][j]=userInput.nextInt();
            }
        }
    }
    public void displayArray(int [][]array,int userSize){
        System.out.println("Array elements:");
        for(int i=0;i<userSize;i++){
            for(int j=0;j<userSize;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[]args) {
        System.out.println("Enter the size of array:");
        Scanner sc=new Scanner(System.in);
        int userSize=sc.nextInt();
        ObjectArray obj=new ObjectArray();//object
        int[][] array=new int[userSize][userSize];
        obj.getArray(array, userSize);//object oriented
        obj.displayArray(array, userSize);//calling function
    }
}