
import java.util.Scanner;
public class CrossRoads {
    Scanner sc=new Scanner(System.in);
        String crossRoad=sc.nextLine();
    public void repeat4(){
        out();
        out();
        repeat3();
    }
    public void repeat3() {
        out();
        out();
        out();
        repeat2();
    }
    public void repeat2() {
        out();
        out();
        out();
    }
    public void out() {
        System.out.println(crossRoad);
    }
    public static void main(String []args) {
        System.out.println("Enter Crossroads:");
        /* 
        You can also use this method to print 8 times;
        here crossroad added 8 times and assign it to sum.
        String sum=crossRoad+"\n"+crossRoad+"\n"+crossRoad+"\n"+crossRoad+"\n"+crossRoad+"\n"+crossRoad+"\n"+crossRoad+"\n"+crossRoad;
        System.out.println("Output:\n"+sum);
        
        */

        CrossRoads obj=new CrossRoads();
        System.out.println("Repeated 8 Times:");
        obj.repeat4();//function calling
    }
}