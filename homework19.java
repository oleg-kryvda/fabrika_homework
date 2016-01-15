/**
Дано четырехзначное число. Проверить истинность высказывания: 
«Данное число читается одинаково слева направо и справа налево» (т.е. является палиндромом)
*/

public class homework19
{
	public static void main(String[] args) throws Exception
	{
		String sNumb=args[0];
		int CharCount = sNumb.length(); //считаем длину строки
		
		if (CharCount != 4) //проверяем четырехзначная ли она
			{
				System.out.println("Not a four-digit number!!!");
				return;
			}
		else
			{
			int iNumb=Integer.parseInt(sNumb);
			System.out.println("You enter the number: " + iNumb);
			
			int first = iNumb/1000;
			int second = iNumb/100%10; 
			int third = iNumb/10%10;
			int fourth = iNumb%10;;
			//
			//
			
			if (first==fourth && second==third) 
				System.out.print("\nYippee! is polindrom !!!\n");
			else System.out.print("\nLuck next time.\n");

			}
	}
}