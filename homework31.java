/**
Даны два целых числа A и B. Найти сумму квадратов всех целых чисел от A до B включительно.
*/

public class homework31
{
	public static void main(String[] args) throws Exception
	{
		int number1 = Integer.parseInt(args[0]);
		int number2 = Integer.parseInt(args[1]);
		int mult=0;
		
		int argsCount = args.length; //считаем кол-во аргументов
		if (argsCount != 2){
			System.out.println("Enter two argument, and try again!!!");
			return;
			}
		if (number1>number2){ //условие если первый аргумент больше второго
			for (int i = number1; i >= number2; i--){
			mult+=i*i;
			}
		}
		else { //если первый аргумент меньше второго
			for (int i = number1; i <= number2; i++){
			mult+=i*i;
			}
		}
			System.out.println("The sum of the squares of numbers range from A to B: " + mult);		
	}
}