/**
Дни недели пронумерованы следующим образом: 1 — понедельник, 2 — вторник, …, 6 — суббота, 7 — воскресенье. 
Дано целое число K, лежащее в диапазоне 1–365. 
Определить номер дня недели для K-го дня года, если известно, что в этом году 1 января было средой.

*/
import java.io.*;
public class HomeWork16
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("Enter the number:");
		int iNumb = ReadNumb();
		System.out.println("Entered value: " + iNumb);
		int dayW=(iNumb%7);
		System.out.println (dayW);
		switch (dayW)
		{
			case 1: System.out.println ("Wednesday");
				break;
			case 2: System.out.println ("Thursday");
				break;
			case 3: System.out.println ("Friday");
				break;
			case 4: System.out.println ("Thursday");
				break;
			case 5: System.out.println ("Saturday");
				break;
			case 6: System.out.println ("Sunday");
				break;
			case 0: System.out.println ("Monday");
				break;
		}
		
		
	}
	public static int ReadNumb() throws Exception
	{
		BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
		String sNumb = reader.readLine();
		//преобразовываем переменную из строковой в числовую
		int Numb = Integer.parseInt(sNumb);
		return Numb;
	}
}