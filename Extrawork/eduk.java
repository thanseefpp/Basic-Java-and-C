public class eduk {
 
    public static void pyramidPattern(int n) 
    {  
        for (int i=0; i<n; i++) 
        { 
  
            // inner loop to handle number spaces 
            // values changing acc. to requirement 
            for (int j=n-i; j>1; j--) 
            { 
                // printing spaces 
                System.out.print(" "); 
            } 
   
            //  inner loop to handle number of columns 
            //  values changing acc. to outer loop 
            for (int j=1; j<=i+1; j++ ) 
            { 
                if(j==i+1){
                    System.out.print("1"); //print star
                    break;
                   }
                // printing stars 
                System.out.print(j+" "); 
            } 
   
            // ending line after each row 
            System.out.println(); 
        } 
    }
    public static void main(String args[]) //driver function
    { 
        int n = 5; 
        pyramidPattern(n); 
    } 
}