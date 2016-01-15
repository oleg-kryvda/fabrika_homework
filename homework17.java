/**
Дано целое положительное число. Проверить истинность высказывания: «Данное число является нечетным трехзначным».
*/

public class homework17
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
			// (iNumb%2==0) ? (System.out.println("The number is even, three-digit")) : (System.out.println("The number of odd, three-digit"))
			//пытался реализовать через тернарный оператор не вышло :((( - буду еще разбираться
			
			if (iNumb%2 == 0) 
				System.out.println("Even three-digit number"); // четное трехзначное
			else 
				System.out.println("Three-digit number is odd"); //нечетное трехзначное
			}
	}
}