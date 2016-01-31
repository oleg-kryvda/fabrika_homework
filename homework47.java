/** 
Write a function named countChars that has a String and a char as parameters.
 The function should count the number of times the character occurs in the string, 
 and it should return the result as the value of the function.
*/

public class homework47
{
	public static void main(String[] args) throws Exception
	{
		if (args.length != 2)	{
			System.out.print("Type the two arguments:\nFirst - a symbol, the number of which you want to count.\nSecond - string, which will be considered.");
			return;
		}
		
		char symbol = args[0].charAt(0); //наверное плохо искал:), но так и не нашол как можно привести "строку" в "символ", нашол зато другую замечательную функцию
		StringBuffer string = new StringBuffer(args[1]); //почитал про работу со строками
		
		int count = countChars(symbol, string);

		System.out.print("Number of occurrences of the character \"" +symbol+ "\" is " + count);
	}
	public static int countChars(char symbol, StringBuffer string)	{
		int count = 0;
		for (int i = 0; i<string.length(); i++)	{
			if (string.charAt(i)==symbol)	{
				count++;
			}
		}
		return count;
	}
}