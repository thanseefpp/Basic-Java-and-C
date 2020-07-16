public class Pattern 
{
    public static void numberPattern(int num) 
    {
        int number;

        for(int i =0;i < num;i++)
        {
            number=1;
            for(int j=0;j<=i;j++)
            {
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
    public static void main(String[]args) 
    {       
            int num=5;
            numberPattern(num);
    }    
}