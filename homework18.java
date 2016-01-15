/**
Дано трехзначное число. Проверить истинность высказывания: «Цифры данного числа образуют возрастающую последовательность».
а. Проверить истинность высказывания: «Цифры данного числа образуют возрастающую арифметическую последовательность», например, 123, 456 и т.п.

*/

public class homework18
{
	public static void main(String[] args) throws Exception
	{
		String sNumb=args[0];
		int CharCount = sNumb.length(); //считаем длину строки
		
		if (CharCount != 3) //проверяем трехзначная ли она
			{
				System.out.println("The number is not three-digit!!!");
				return;
			}
		else {
			int iNumb=Integer.parseInt(sNumb);
			int first = iNumb/100;
			int second = iNumb/10%10;
			int third = iNumb%10;
			
			if (first+1==second && second+1==third) 
				{
					System.out.println("Arithmetic sequence");
					return;
				}
			if (first < second && second < third) 
				System.out.println("Increasing sequence");
			
			}
	}
}