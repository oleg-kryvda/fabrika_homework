/**
В молекулярной биологии для строк, описывающих структуру ДНК, существует понятие GC-content, 
которое равно процентному содержанию в этих строках букв G _или_ C. Например, GC-content строки "AGCTATAG" is 37.5%.

Дан массив из 10 ДНК-строк разной длины вида:
CCTGCGGAAGATCGGCACTAGAATAGCCAG
AACCGTTTCTCTGAGGCTTCCGGCCTTCCCTCC
CACTAATAATTCTGAGG
...

Написать программу, которая выводит на экран номер (индекс) строки, которая имеет самый высокий GC-content.
Расчет GC-content для строки реализовать в виде функции.

*/

// Я понимаю что залез в дебри, решение не соответствует условию задачи, одним словом увлекся....
// !!!!! но она работает и правильно считает :)

public class gc_content		{
	public static void main(String[] args)	{
		
		int arrayLength = 10;
		char[][] arr_content = new char[arrayLength][]; //массив с контентом
		double[] contentValue = new double[arrayLength]; //массив со значениями содержания GC контента 
		
		//так как на самом деле у нас нет исходных данных  - придумаем их
		//задаем длины строк массива
		for (int i=0; i<arr_content.length; i++)	{ 
			arr_content[i] = new char[arrayLength()];
		}
		arrayExtender(arr_content);//наполняем массив значениями
		arrayPrint(arr_content); //выводим массив на экран
		arrayExtender(arr_content, contentValue);//заполняем массив значениями содержания контента
		System.out.println();
		arrayPrint(contentValue);

		//находим максимальное значение в архиве значений контента, и его индекс
		int maxLine = 0;
		double max = contentValue[0];
		for (int i=0; i < contentValue.length; i++)	{
			if (max < contentValue[i]){
				maxLine=i;
				max = contentValue[i];
			}
		}
		System.out.println();
		System.out.println("The maximum GC-content of the line "+ (maxLine+1) +", value: " + max);
	}
	
	public static void arrayExtender(char[][] arr_content, double[] contentValue)	{
		for (int i=0; i < arr_content.length; i++)	{
			int contentCount=0;
			for (int j=0; j < arr_content[i].length; j++)	{
				if (arr_content[i][j] == 'C' || arr_content[i][j] == 'G') contentCount++;
			}
			contentValue[i]=(double)contentCount/arr_content[i].length*100;
		}
	}
	public static void arrayExtender(char[][] arr_content)	{ 
		for (int i=0; i<arr_content.length; i ++)	{
			for (int j=0; j<arr_content[i].length; j++)	{
				arr_content[i][j]=contentGenerator();
			}
		}
	}
	
	public static void arrayPrint(char[][] arr_content)	{ 
		for (int i=0; i<arr_content.length; i ++)	{
			for (int j=0; j<arr_content[i].length; j++)	{
				System.out.print(arr_content[i][j]);
			}
			System.out.println();
		}
	}
	public static void arrayPrint(double[] contentValue)	{ 
		for (int i=0; i<contentValue.length; i ++)	{
				System.out.print((i+1) + ": "+ contentValue[i] + " ||");
		}
		System.out.println();
	}
	public static int arrayLength()	{//генегируем число в диаппазоне от 20 до 40
		return 20+(int)(Math.random() *40);
	}
	
	public static char contentGenerator()	{//генерируем буквы контента
		char a = ' ';
		int z = 1+(int)(Math.random() *4);
		if (z==1) a = 'A';
		else if (z==2) a ='C';
		else if (z==3) a ='G';
		else a = 'T';
		return a;
	}
}