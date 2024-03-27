import java.util.*;
public class Large3{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int m= My(a,b,c);
System.out.println("Large number is "+m);
}
static int My(int a,int b,int c)
{
int m=Math.max(Math.max(a,b),c);
return m;
}
}