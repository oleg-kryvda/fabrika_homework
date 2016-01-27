/** 
Дано целое число N и массив из N целых чисел, упорядоченный по возрастанию. 
Данный набор может содержать одинаковые элементы. Вывести в том же порядке все различные элементы данного массива.
*/
import java.util.*;
public class homework46
{
	public static void main(String[] args) throws Exception
	{		
		
		if (args.length != 1)	{
			System.out.println("Enter one argument: the number of elements in the array:");
			return;
		}
		
		int N = Integer.parseInt(args[0]);		
		
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
		
		System.out.println("The array contains such different numbers:");
		// выводим на екран первое число массива, так как оно еще не может повторяться
		System.out.print(array[0] + " "); 
		//выводим остальные числа с условием что они не равны предыдущему
		for (int i=1; i < array.length; i++)	{
			if (array[i-1] != array[i])	System.out.print(array[i] + " ");
		}
	
		
	}
}