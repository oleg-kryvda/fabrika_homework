/** 
Дан массив из N целых чисел. Найти их среднее арифметическое. Расчет среднего арифметического массива реализовать в виде функции.
*/

public class homework51
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
		printArray(array);
		System.out.println();
		System.out.print("The arithmetic mean of the array: " + average(array));
	}

	public static double average(int[] array)	{
		int summ=0;
		for (int i = 0; i<array.length; i++)	{
			summ +=array[i];
		}
		double average = summ/array.length;
		return average;
	}
	
	public static void printArray(int[] array){
		
		System.out.println("Array contains numbers:");
		for (int i=0; i<array.length; i++)	{
			System.out.print(array[i] + " ");
		}
	}
}