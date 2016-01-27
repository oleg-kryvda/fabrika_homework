/** 
Дано вещественное число B, целое число N и массив из N целых чисел, упорядоченных по возрастанию. 
Вывести элементы массива вместе с числом B, сохраняя упорядоченность выводимых чисел.
*/
import java.util.*;
public class homework45
{
	public static void main(String[] args) throws Exception
	{		
		
		if (args.length != 2)	{
			System.out.println("Enter two numbers: \nthe first - the length of the array \nthe second - a floating point number");
			return;
		}
		
		int N = Integer.parseInt(args[0]);
		double B = Double.parseDouble(args[1]);
		
		int[] array = new int[N];
		//заполняем массив значениями от 1 до 100 включительно
		for (int i=0; i<array.length; i++)	{
			array[i]=1+(int)(Math.random() *100);
		}
		Arrays.sort(array); // сортируем массив штатной сортировкой
		//выводим массив на экран
		System.out.println("Array contains numbers:");
		for (int i=0; i<array.length; i++)	{
			System.out.print(array[i] + " ");
		}
		System.out.println();
		int numb = 0;
		//ищем последний эмемент который меньше заданного числа
		for (int i=array.length-1; i >= 0; i--)	{
			if (array[i] < B) {
				numb = i+1; // если нашли такой присваеваем его номер переменной - numb
				break;
			}
		}
		//выводим на экран часть массива до переменной "В"
		System.out.println(numb); 
		for (int i=0; i<numb; i++)	{
			System.out.print(array[i] + " ");
		}
		System.out.print(B + " "); //выводим переменную "В"
		//выводим на экран часть массива после переменной "В"
		for (int i = numb; i<array.length; i++)	{
			System.out.print(array[i] + " ");
		}
	}
}