/**
Дано целое число в диапазоне 100–999. Вывести строку-описание данного числа, 
например: 256 — «двести пятьдесят шесть», 814 — «восемьсот четырнадцать».
*/

public class homework26
{
	public static void main(String[] args) throws Exception
	{
		String sNumber=args[0];
		int argsCount = args.length; //считаем кол-во аргументов
		if (argsCount != 1) // || argsCount<=1
			{
				System.out.println("Enter one argument, and try again!!!");
				return;
			}
		
		int CharCount = sNumber.length(); //считаем длину строки
		if (CharCount != 3) //проверяем трехзначная ли она
			{
				System.out.println("Not a three-digit number!!!");
				return;
			}
		
		int number = Integer.parseInt(sNumber);

		int first = number/100;
		int second = number/10%10; 
		int third = number%10;
		
		String firstNumber="", secondNumber="", thirdNumber="";
		
		System.out.println("You have entered a number: " + number);
		
		switch (first)
		{
			case 1: firstNumber="one hundred"; break;
			case 2: firstNumber="two hundred"; break;
			case 3: firstNumber="three hundred"; break;
			case 4: firstNumber="four hundred"; break;
			case 5: firstNumber="five hundred"; break;
			case 6: firstNumber="six hundred"; break;
			case 7: firstNumber="seven hundred"; break;
			case 8: firstNumber="eight hundred"; break;
			case 9: firstNumber="nine hundred"; break;
		}
		
		if (second == 0)
		{
			switch (third)
			{
			case 1: thirdNumber=" one"; break;
			case 2: thirdNumber=" two"; break;
			case 3: thirdNumber=" three"; break;
			case 4: thirdNumber=" four"; break;
			case 5: thirdNumber=" five"; break;
			case 6: thirdNumber=" six"; break;
			case 7: thirdNumber=" seven"; break;
			case 8: thirdNumber=" eight"; break;
			case 9: thirdNumber=" nine"; break;
			}
		}
		else if (second == 1)
		{
			int secondL = 10 + third;
			switch (secondL)
			{
			case 10: secondNumber=" ten"; break;
			case 11: secondNumber=" eleven"; break;
			case 12: secondNumber=" twelve"; break;
			case 13: secondNumber=" thirteen"; break;
			case 14: secondNumber=" fourteen"; break;
			case 15: secondNumber=" fifteen"; break;
			case 16: secondNumber=" sixteen"; break;
			case 17: secondNumber=" seventeen"; break;
			case 18: secondNumber=" eighteen"; break;
			case 19: secondNumber=" nineteen"; break;
			}
			
		}
		else if (second>1 && second<=9)
		{
			switch(second)
			{
			case 2: secondNumber=" twenty"; break;
			case 3: secondNumber=" thirty"; break;
			case 4: secondNumber=" forty"; break;
			case 5: secondNumber=" fifty"; break;
			case 6: secondNumber=" sixty"; break;
			case 7: secondNumber=" seventy"; break;
			case 8: secondNumber=" eighty"; break;
			case 9: secondNumber=" ninety"; break;
			}
			switch (third)
			{
			case 1: thirdNumber=" one"; break;
			case 2: thirdNumber=" two"; break;
			case 3: thirdNumber=" three"; break;
			case 4: thirdNumber=" four"; break;
			case 5: thirdNumber=" five"; break;
			case 6: thirdNumber=" six"; break;
			case 7: thirdNumber=" seven"; break;
			case 8: thirdNumber=" eight"; break;
			case 9: thirdNumber=" nine"; break;
			}
		}
				
		System.out.println(firstNumber + secondNumber + thirdNumber); //
	}
}