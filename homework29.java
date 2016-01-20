/**
Даны два целых числа A и B. Найти сумму всех целых чисел от A до B включительно.
*/

public class homework29
{
	public static void main(String[] args) throws Exception
	{
		int number1 = Integer.parseInt(args[0]);
		int number2 = Integer.parseInt(args[1]);
		int summ = 0;
		
		int argsCount = args.length; //считаем кол-во аргументов
		if (argsCount != 2) // || argsCount<=1
		{
			System.out.println("Enter two argument, and try again!!!");
			return;
			}
		if (number1>number2) //условие если первый аргумент больше второго
		{
			for (int i = number1; i >= number2; i--){
				summ+=i;
			}
		}
		else { //если первый аргумент меньше второго
			for (int i = number1; i <= number2; i++){
			summ+=i;
			}
		}
			System.out.println("Sum of the numbers range from A to B: " + summ); //
			
	}
}