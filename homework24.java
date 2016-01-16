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
		
		switch(month)
		{
			case 12:
			case 1:
			case 2:
				System.out.print("Winter");
				break; 

			case 3:
			case 4:
			case 5:
				System.out.print("Spring");
				break;
			case 6:
			case 7:
			case 8:
				System.out.print("Summer");
				break;
			case 9:
			case 10:
			case 11:
				System.out.print("Autumn");
				break;
		}
		
	}
}