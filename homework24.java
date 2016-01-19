/**
Дан номер месяца — целое число в диапазоне 1–12 (1 — январь, 2 — февраль и т. д.). 
Вывести название соответствующего времени года и месяца, например, “март - весна”, “август - лето” и т.п.

*/

public class homework24
{
	public static void main(String[] args) throws Exception
	{
		String SMonth=args[0];
		int month = Integer.parseInt(SMonth);
		String monhtName;
		
		switch(month)
		{
			case 12: monhtName = "December";
			case 1:	monhtName = "January";
			case 2:	monhtName = "February";
				System.out.print(monhtName + " - Winter");
				break; 

			case 3:	monhtName = "March";
			case 4:	monhtName = "April";
			case 5: monhtName = "May";
				System.out.print(monhtName + " - Spring");
				break;
			case 6:	monhtName = "June";
			case 7:	monhtName = "July";
			case 8:	monhtName = "August";
				System.out.print(monhtName + " - Summer");
				break;
			case 9:	monhtName = "September";
			case 10: monhtName = "October";
			case 11: monhtName = "November";
				System.out.print(monhtName + " - Autumn");
				break;
		}
		
	}
}