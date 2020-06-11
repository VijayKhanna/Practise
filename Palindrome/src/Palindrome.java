import java.util.Scanner;
public class Palindrome {
public static void main(String args[])
{
	 int r,sum=0,n;    
	 Scanner sc=new Scanner(System.in);
	 int num;
	  num=sc.nextInt();
	  n=num;    
	  while(n>0)
	  {    
	   r=n%10; 
	   sum=(sum*10)+r;    
	   n=n/10;    
	  }    
	  if(num==sum)    
	   System.out.println("palindrome number ");    
	  else    
	   System.out.println("not palindrome"); 
}
}
