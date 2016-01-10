/**
Дано число A. Вычислить A^8, используя вспомогательную переменную и три операции умножения. 
Для этого последовательно находить A^2, A^4, A^8.
Вывести все найденные степени числа A. 



*/
import java.io.*;
public class HomeWork5
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("Enter the number raised to the power:");
		int iNumb = ReadNumb();
		System.out.println("The number entered: " + iNumb);
		
		for (int i=2; i<=8; i*=2)
		{	
			System.out.println("number in power ^ " + i + " = " + (iNumb*=iNumb));
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