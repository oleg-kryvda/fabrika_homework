/**
Напишите программу, которая будет считать сколько денег получает работник в неделю. Программа принимает на входе два аргумента (зарплата в час, кол-во проработанных часов). 
Условия:
- Каждый час после 40 считается за полтора. 
- Работник не может работать больше, чем 60 часов в неделю.
- Работник не может получать меньше 8 долларов в час.
*/

public class homework58
{
	public static void main(String[] args) throws Exception
	{
		int dollarsPerHour = Integer.parseInt(args[0]); //денег в час
		int hoursPerWeek = Integer.parseInt(args[1]); //часов в неделю
		
		int argsCount = args.length; //считаем кол-во введенных аргументов
		
		//**********--------------*****************
		// не понял с этой проверкой, почему то она срабатывает только когда аргументов больше чем положено, и не срабатывает когда меньше
		//**********---------------**************************
		if (argsCount != 2){
			System.out.println("Enter two argument, and try again!!!");
			return;
			}
			
		if (hoursPerWeek > 60)	{
				System.out.println("We have already filed against you, a fucking slaveholder!!!");
				return;
			}
		if (dollarsPerHour <8 ) {
			System.out.println("We'll complain about you to the unions, workers can not receive less than $ 8 per hour!!!");
			dollarsPerHour=8;
			}
		if (hoursPerWeek <=40) {
				System.out.println("Payment for this week is: : " + dollarsPerHour*hoursPerWeek);
			}
		else if (hoursPerWeek > 40 && hoursPerWeek <= 60) {
				System.out.println("Payment for this week given the above-standard : " + ((40*dollarsPerHour) + (hoursPerWeek-40) * dollarsPerHour * 1.5));
			}
	}
}