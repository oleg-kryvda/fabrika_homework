/**
Даны два целых числа: D (день) и M (месяц), определяющие правильную дату. 
Вывести знак Зодиака, соответствующий этой дате: «Водолей» (20.1–18.2), «Рыбы» (19.2–20.3),
 «Овен» (21.3–19.4), «Телец» (20.4–20.5), «Близнецы» (21.5–21.6), «Рак» (22.6–22.7), «Лев» (23.7–22.8),
 «Дева» (23.8–22.9), «Весы» (23.9–22.10), «Скорпион» (23.10–22.11), «Стрелец» (23.11–21.12), «Козерог» (22.12–19.1).
*/

public class homework28
{
	public static void main(String[] args) throws Exception
	{
		int DD = Integer.parseInt(args[0]); //день
		int MM = Integer.parseInt(args[1]); //месяц
		String Zodiak=null;
		int argsCount = args.length; //считаем кол-во аргументов
		if (argsCount != 2) // || argsCount<=1
		{
			System.out.println("Enter two argument, and try again!!!");
			return;
		}
		int day = (MM*100)+DD;
		if (day >= 120 && day <= 218) Zodiak = "Aquarius"; //«Водолей»
		if (day >= 219 && day <= 320) Zodiak = "Pisces"; //«Рыбы»
		if (day >= 321 && day <= 419) Zodiak = "Aries"; //«Овен»
		if (day >= 420 && day <= 520) Zodiak = "Taurus"; //«Телец»
		if (day >= 521 && day <= 621) Zodiak = "Gemini"; //«Близнецы»
		if (day >= 622 && day <= 722) Zodiak = "Cancer"; //«Рак»
		if (day >= 723 && day <= 822) Zodiak = "Leo"; //«Лев»
		if (day >= 823 && day <= 922) Zodiak = "Virgo"; //«Дева»
		if (day >= 923 && day <= 1022) Zodiak = "Libra"; //«Весы»
		if (day >= 1023 && day <= 1122) Zodiak = "Scorpio"; //«Скорпион»
		if (day >= 1123 && day <= 1221) Zodiak = "Sagittarius"; //«Стрелец»
		if (day >= 1222 && day <= 1231) Zodiak = "Capricorn"; //«Козерог»
		if (day >= 101 && day <= 119) Zodiak = "Capricorn"; //«Козерог»
		
		System.out.println("The introduction date corresponds to zodiac sign: " + Zodiak);
	}
}