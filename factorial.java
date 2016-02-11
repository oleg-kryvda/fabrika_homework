public class factorial	{
	public static void main(String[] args)	{
		if (args.length!=1)	{
			System.out.print("Enter a single argument, the number to which we shall consider a factorial!!!");
		}
		int number = Integer.parseInt(args[0]);
		if (number <0){
			System.out.print("Enter a positive number, and try again !!!"); 
			return;
		}
		System.out.println("Entered number: " + number);
		int fact = factorial(number);
		System.out.println("Factorial number " + number + " is " + fact);	
	}
	
	public static int factorial(int number)	{
		int result;
		if (number == 0) return 1;
		result = factorial(number-1)*number;
		return result;
	}
}