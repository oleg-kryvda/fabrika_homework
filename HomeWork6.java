/**
Дано значение температуры T в градусах Фаренгейта. 
Определить значение этой же температуры в градусах Цельсия. 
Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношеним: TC=(TF–32)·5/9.
*/

public class HomeWork6
{
	public static void main(String[] args) throws Exception
	{
		
		String sNumb=args[0];
		int iNumb=Integer.parseInt(sNumb);
		System.out.println("Entered value: " + iNumb);
		
		System.out.print("Corresponds to the temperature in Celsius:");
		System.out.println((iNumb-32)*5/9);
	
	}
}