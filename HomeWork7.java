/**
Дано значение температуры T в градусах Цельсия. Определить значение этой же температуры в градусах Фаренгейта.
При переводе из шкалы Цельсия в шкалу Фаренгейта исходную цифру умножают на 9/5 и прибавляют 32.
*/
import java.io.*;
public class HomeWork7
{
	public static void main(String[] args) throws Exception
	{
		String sNumb=args[0];
		int iNumb=Integer.parseInt(sNumb);
		System.out.println("Entered value: " + iNumb);
		
		System.out.print("Corresponds to the temperature in Fahrenheit:");
		System.out.println((iNumb*9)/5+32);
	
	}
}