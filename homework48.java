/** 
Write a subroutine with three parameters of type int. 
The subroutine should determine which of its parameters is smallest. 
The value of the smallest parameter should be returned as the value of the subroutine.
*/

public class homework48
{
	public static void main(String[] args) throws Exception
	{
		if (args.length != 3)	{
			System.out.print("Enter three integer arguments.");
			return;
		}
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		System.out.println("Entered numbers " + a + ", " + b + ", " + c + ".");
		System.out.print("A smaller number of input: " + min(a,b,c));
	}

	public static int min(int a, int b, int c)	{
		if (a < b && a < c) return a;
		else if (b < a && b < c) return b;
		else return c;
	}
}