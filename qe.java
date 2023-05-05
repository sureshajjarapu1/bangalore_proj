
import java.util.Scanner;  
import java.math.*;
class QuadraticEquation
{
	public static void main(String... aurg)
	{
		Scanner Sc=new Scanner(System.in);
		double root1,root2,a,b,c;
		System.out.println("Enter a,b,c values");
		a=Sc.nextDouble();
		System.out.println("a value ="+a);
		b=Sc.nextDouble();
		System.out.println("b value ="+b);
		c=Sc.nextDouble();
		System.out.println("c value ="+c);
		root1=(-b+Math.sqrt((b*b)-(4*a*c))/(2*a));
		root1=(-b+Math.sqrt((b*b)-(4*a*c))/(2*a));
		root2=(-b-Math.sqrt((b*b)-(4*a*c))/(2*a));
		System.out.println("Root1="+root1);
		System.out.println("Root2="+root2);
	}
}


