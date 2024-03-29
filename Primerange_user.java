import java.util.*;
public class Primerange_user{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter a : ");
        int a=sc.nextInt();
System.out.println("Enter b: ");
        int b=sc.nextInt();
        for(int i=a;i<=b;i++)
           if(my(i))
              System.out.print(" "+i);
    }
    static Boolean my(int n)
    {
        if(n<2)
          return false;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
            
        }
        return true;
        
    }
}