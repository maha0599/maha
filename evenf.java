import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
public static void main(String[] args)
{
	int a;
	Scanner s=new Scanner(System.in);
	System.out.println("");
	a=s.nextInt();
	if(a%2==0)
	{

	System.out.println("Even");
	}
	else if(a%2<0)
	{
	System.out.println("Invalid");
	}
	else
	{
		System.out.println("Odd");
	}
}
}
