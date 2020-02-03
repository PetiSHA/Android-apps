
public class assignment1_2017 {

	public static void main(String[] args) 
	{
		System.out.println("Question 1:");
		print(4,10);
		System.out.println("Question 2:");
		System.out.println(tailSum(5,10));
		System.out.println("Question 3:");
		bin(11);
		
	}
	
//Question1	
	public static void print(int a, int b)
	{
		if (a<=b)		
		{
			System.out.print(a+" ");
			print(a+1,b);
		}
	}
	
//Question2	
	public static int sum(int a, int b, int s)
	{		
		if(a!=b)
		{					
			return sum(a+1,b,s+1+a);
		}
		return s;
	}
	
	public static int tailSum(int a, int b)
	{
		return sum(a,b,a);
	}
	

//Question3
	public static void bin(int a)
	{
		if (a!=0)
		{						
			bin(a/2);
			System.out.print(a%2);
		}
			
	}
	

}
