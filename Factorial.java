public class Factorial
{
  public static void main (String[] args)
  {
     if(args.length > 0)
	 {
	    int num = Integer.parseInt(args[0]);
		System.out.println("Factorial of " + num + " is " + factorial (num));
	 }
	 else
	 {
		 System.out.println("Incorrect usage: Factorial <number>");
	 }
  }
  
  private static int factorial (int num)
  {
	  if(num < 0)
		  return -1;
	  
	  int result = 1;
	  for (int i = num; i > 0; i--)
	  {
		  result *= i;
	  }
	  return result;
  }
}