/**
a) С начала суток прошло N секунд (N — целое). Найти количество полных минут и секунд, прошедших с начала последнего часа.
б) С начала суток прошло N секунд (N — целое). Найти количество полных часов, минут и секунд, прошедших с начала суток.

*/
import java.io.*;
public class HomeWork15
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("Enter the number of seconds:");
		int iNumb = ReadNumb();
		System.out.println("Entered value: " + iNumb);
		
		System.out.println ("a. The total number of "+(iNumb/60%60)+" minutes and "+ ((iNumb%60%60))+" seconds since the start of the last hour.");
		System.out.println ("b. The total number of "+ (iNumb/3600) + " hours and " + (iNumb/60) +" minutes since the start of the day.");
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