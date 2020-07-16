import java.util.Scanner;

public class Area {

    public void circle(){
        System.out.println("Enter radius of circle :\n");
        Scanner s=new Scanner(System.in);
        int radius=s.nextInt();
        double pi=3.14,area;
        area=pi*radius*radius;
        System.out.println("Area of Circle :"+area);
        
    }
    public void Square(){
        System.out.println("Enter the length :");
        Scanner sq=new Scanner(System.in);
        int length=sq.nextInt();
        int area=length*length;
        System.out.println("Area of the square is:"+area);
    }
    public void Rectangle(){
        System.out.println("Enter length :");
        Scanner sw=new Scanner(System.in);
        int length=sw.nextInt();
        System.out.println("Enter width :");
        int width=sw.nextInt();
        int rectangle=length*width;
        System.out.println("Area of Rectangle :"+rectangle);
    }
    public void Triangle() {
        System.out.println("Enter the height of the Triangle:");
        Scanner sd=new Scanner(System.in);
        double height=sd.nextDouble();
        System.out.println("Enter the base of the Triangle:");
        Scanner sl=new Scanner(System.in);
        double base=sd.nextDouble(),area;
        area=(height*base)/2;
        System.out.println("Area of Triangle is :"+area);
    }
}