package MainCode;

public class Example {
	public static void main(String args[])
	{
      Example  ex=new Example();
      int b=ex.sumDigits(1000);
      System.out.println("Sum of digits"+b);
      
      /*
       * 1. starting with  (0)(0)
       * 2.	Special Characters (1@1)(Exception)
       * 3. Floating Numbers (12.1)(Exception)
       * 4. Single Digit (4)(4)
       * 5. Boundary Scenarios  2^(16-1)
       */
	}
	public int sumDigits(int a)
	{
		
		int sum=0;
		while(a!=0)
		{
			sum=sum+a%10;
			a=a/10;
          
		}
		return sum;

	}

}
