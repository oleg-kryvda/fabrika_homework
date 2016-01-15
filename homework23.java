/**
Дан номер года (положительное целое число). Определить количество дней в этом году, учитывая, что обычный год насчитывает 365 дней,
 а ви-сокосный — 366 дней. Високосным считается год, делящийся на 4, за исключением тех годов, которые делятся на 100 и не делятся на 400 
 (например, годы 300, 1300 и 1900 не являются високосными, а 1200 и 2000 — являются).
*/

public class homework23
{
	public static void main(String[] args) throws Exception
	{
		String SYear=args[0];
		int Year = Integer.parseInt(SYear);
		

		if ((Year%4==0 && Year%100!=0) || Year%400==0)
        System.out.println("number of days: 366"); //количество дней в году
        else System.out.println("number of days: 365");
		
	}
}