package lab12;

import java.util.Scanner;

public class sorting {
public static void main(String args[]) {
	
	Scanner obj=new Scanner (System.in); 
	char s;
	do
	{
		System.out.println("enter the choice");
		int a=obj.nextInt();
		switch(a) 
		{
		case 1:
		{
			System.out.println("enter the size of the list");
			int n=obj.nextInt();
			Integer n1[]=new Integer[n];
			System.out.println("enter the elements");
			for(int i=0;i<n;i++)
			{
				n1[i]=obj.nextInt();
			}
		   System.out.println("entered elements are");
		   for(int i=0;i<n;i++)
			{
			   System.out.println(n1[i]);
			   
			}
		   sort<Integer>obj1=new sort<>();
		   obj1.Dsorting(n1);
		   break;
		
		}
		case 2:
		{
			System.out.println("double");
			System.out.println("enter the size of the list");
			int n=obj.nextInt();
			Double n1[]=new Double[n];
			System.out.println("enter the elements");
			for(int i=0;i<n;i++)
			{
				n1[i]=obj.nextDouble();
			}
		   System.out.println("entered elements are");
		   for(int i=0;i<n;i++)
			{
			   System.out.println(n1[i]);
			   
			}
		   sort<Integer>obj2=new sort<>();
		   obj2.Dsorting(n1);
		   break;
		}
		case 3:
		{
			System.out.println("float");
			System.out.println("enter the size of the list");
			int n=obj.nextInt();
			Float n1[]=new Float[n];
			System.out.println("enter the elements");
			for(int i=0;i<n;i++)
			{
				n1[i]=obj.nextFloat();
			}
		   System.out.println("entered elements are");
		   for(int i=0;i<n;i++)
			{
			   System.out.println(n1[i]);
			   
			}
		   sort<Integer>obj3=new sort<>();
		   obj3.Dsorting(n1);
		   break;
		}
		case 4:
		{
			System.out.println("byte");
			System.out.println("enter the size of the list");
			int n=obj.nextInt();
			Byte n1[]=new Byte[n];
			System.out.println("enter the elements");
			for(int i=0;i<n;i++)
			{
				n1[i]=obj.nextByte();
			}
		   System.out.println("entered elements are");
		   for(int i=0;i<n;i++)
			{
			   System.out.println(n1[i]);
			   
			}
		   sort<Integer>obj4=new sort<>();
		   obj4.Dsorting(n1);
		   break;
		}
		case 5:
		{
			System.out.println("short");
			System.out.println("enter the size of the list");
			int n=obj.nextInt();
			Short n1[]=new Short[n];
			System.out.println("enter the elements");
			for(int i=0;i<n;i++)
			{
				n1[i]=obj.nextShort();
			}
		   System.out.println("entered elements are");
		   for(int i=0;i<n;i++)
			{
			   System.out.println(n1[i]);
			   
			}
		   sort<Integer>obj5=new sort<>();
		   obj5.Dsorting(n1);
		   break;
		}
		default:
		{
			System.out.println("invalid");
			
		}
		
		}
		System.out.println("enter 'y' to continue");
		s=obj.next().charAt(0);
		if(s=='Y' ||s=='y')
		{
			System.out.println("continue to sort");
		}
		else
		{
			System.out.println("no more sort");
		}
		
	}while(s=='Y' ||s=='y');
	
	
}
}
class sort<T>
{
	T c;
	public <T extends Number>void Dsorting(T[] value)
	{
		for(int i=0;i<value.length;i++)
		{
			for(int j=i;j<value.length;j++)
			{
				if(value[i].intValue()>value[j].intValue())
				{
					T c=value[i];
					value[i]=value[j];
					value[j]=(T) c;
					
				}
			}
		}
		System.out.println("=>");
		for(int i=value.length-1;i>=0;i--)
		{
			System.out.println(value[i]);
		}
	}

}