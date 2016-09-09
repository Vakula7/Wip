package java2;

import java.util.Scanner;

public class Palin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int count=0;
		StringBuffer buf=new StringBuffer(s);
		String n=buf.reverse().toString();
		if(s.equals(n))
		{
		   char a[]=n.toCharArray();
		   char ae[]=new char[a.length];
		   for (int x = 0; x < a.length; x++) 
		   {   
			   if(a[x]!='@')
			   {
				   ae[x]=a[x];
	               for (int z = 0; z < a.length; z++) 
		           { 
				     if(a[z]==ae[x])
				     {
				    	 a[z]='@';
				     }
		           }
			   }
			   
		   }
		   for(int i=0;i<ae.length;i++)
		   {
			   if(ae[i]=='a'||ae[i]=='e'||ae[i]=='i'||ae[i]=='o'||ae[i]=='u')
			   {
				   count++;
			   }
		   }
		   if(count>=2)
		   {
			   System.out.println("True");
		   }
		   else
			   System.out.println("false");
		}
		else
			System.out.println("not palindrome");
		sc.close();

	}

}
