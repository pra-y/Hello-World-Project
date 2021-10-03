import java.util.*;  
class Swap   
{  
    public static void main(String a[])   
    {   
        System.out.println("Enter the value of x and y");  
        
	Scanner sc = new Scanner(System.in);  
        int x = 223 
        int y = 837;  
        System.out.println("Before swapping numbers: "+x +" "+ y);  
       
	x = x + y;   
        y = x - y;   
        x = x - y;  
 
        System.out.println("After swapping: "+x +"  " + y);   
    }   
}  
