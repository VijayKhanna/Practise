import java.util.Scanner;
import java.io.*;
public class Prime {
public static void main(String args[])
{
	int num,i,c=0;
	Scanner sc=new Scanner(System.in);
	num=sc.nextInt();
	for(i=2;i<=(num/2);i++)
	{
		if(num%i==0)
		{
			c++;
		}
		else
		{
			c=0;
		}
	}
	if(c==0)
	{
		System.out.println("Prime");
	}
	else
	{
		System.out.println("Not prime");
	}
}
}
