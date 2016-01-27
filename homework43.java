/** 
Дано целое число K и массив из десяти целых ненулевых чисел. 
Вывести порядковый номер первого числа в массиве, большего K. Если таких чисел нет, то вывести 0.
*/

public class homework43
{
	public static void main(String[] args) throws Exception
	{		
		if (args.length != 1)	{
			System.out.println("Enter the numbers.");
			return;
		}
		int K=Integer.parseInt(args[0]);
		
		int[] array = new int[10];
		//заполняем массив значениями от 1 до 10 включительно
		for (int i=0; i<array.length; i++)	{
			array[i]=1+(int)(Math.random() *10);
		}
		//выводим массив 
		System.out.println("Array contains numbers:");
		for (int i=0; i<array.length; i++)	{
			System.out.print(array[i] + " ");
		}
		System.out.println();
		//создаем переменную в которую будем записывать индекс найденного элемента
		int numb = 0;
		//ищем элемент из условия задачи
		for (int i=0; i<array.length; i++)	{
			if (array[i] > K) {
				numb = i+1; // если нашли такой присваеваем его номер переменной - numb
				break; //что бы не искать дальше выходим из цикла
			}
		}
		if (numb>0)	{
			System.out.print("The first number greater than \"" + K + "\" in the array at number: " + (numb));
		}
		else 	{
			System.out.print("The array does not contain a large number of " + K);
		}
	}
}