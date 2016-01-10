/**
Дано значение температуры T в градусах Фаренгейта. 
Определить значение этой же температуры в градусах Цельсия. 
Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношеним: TC=(TF–32)·5/9.
*/
import java.io.*;
public class HomeWork6
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("Enter the temperature in Fahrenheit:");
		int iNumb = ReadNumb();
		System.out.println("Entered value: " + iNumb);
		
		System.out.print("Corresponds to the temperature in Celsius:");
		System.out.println((iNumb-32)*5/9);
	
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