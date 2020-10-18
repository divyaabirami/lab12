package lab12;

import java.util.Scanner;

public class generic_prg{
public static void main(String args[])
		{
	Scanner obj1=new Scanner (System.in);
	System.out.println("enter the size ");
	int n=obj1.nextInt();
	Integer n1[]=new Integer[n];
	System.out.println("enter element");
	for(int i=0;i<n;i++)
	{
		n1[i]=obj1.nextInt();
		
	}
	System.out.println("entered element");
	for(int i=0;i<n;i++)
	{
		System.out.println(n1[i]);
	
	}
	System.out.println("counting odd  number from given");
	generic<Integer>obj=new generic<>();
	obj.odd(n1);
	System.out.println(" exchange position");
	System.out.println("enter two positions");
	int x=obj1.nextInt();
	int y=obj1.nextInt();
	System.out.println("after changes");
	obj.exchange(n1,x,y);
	for(int i=0;i<n;i++)
	{
		System.out.println(n1[i]);
	
	}
	System.out.println("to find maximal element");
	System.out.println("enter begining ,endind index");
	int w=obj1.nextInt();
	int u=obj1.nextInt();
	System.out.println("elements inbetween are");
	for(int i=w;i<=u;i++)
	{
		System.out.println(n1[i]);
	
	}
	System.out.println("maximal");
	obj.max(n1,w,u);
	
		}
}
class generic<T>
{
	int count,x,y,end,beg;
	public<T extends Number>void odd(T[] value)
{
	for(int i=0;i<value.length;i++)
	{
		if(value[i].intValue()%2!=0)
		{
			count++;
			
		}
	}
	System.out.println("count:"+count);
	
}
public<T extends Number>void exchange(T[] value,int x,int y)
{
	T temp=value[x];
	value[x]=value[y];
	value[y]=temp;
}
public<T extends Number>void max(T[] value,int beg,int end)
{
	int maxi=value[beg].intValue();
	for(int i=beg;i<=end;i++)
	{
		if(value[i].intValue()>maxi)
		{
			maxi=value[i].intValue();
		}
}
	System.out.println("maximum element:"+maxi);
}

}