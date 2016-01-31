/** 
Дано 3 числа. Написать функцию, которая вычисляет сумму квадратов двух больших из этих трех чисел.
*/

public class homework52
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
		System.out.print("The sum of the squares of the two big numbers being entered: " + sumSquares(a,b,c));
	}

	public static int sumSquares(int a, int b, int c)	{
		if (a < b && a < c) return b*b+c*c;
		else if (b < a && b < c) return a*a+c*c;
		else return a*a+b*b;
	}
}