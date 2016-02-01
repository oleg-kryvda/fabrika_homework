/** 
циклический сдвиг массива
*/

public class cyclic_shift
{
	public static void main(String[] args) throws Exception
	{
		if (args.length != 2)	{
			System.out.println("Enter two arguments:\nFirst - shift distance.\nSecond - the shift direction (where 0 - shift to the left, 1 - right shift).\n");
			return;
		}
		
		int shift = Integer.parseInt(args[0]);
		int directionMotion = Integer.parseInt(args[1]);
		int finishReverse = 0;
		int startReverse=0;
		
		int[] array = {1, 2, 3,4,5,6,7,8,9,10}; //new int[10];
		//заполняем массив значениями от 1 до 100 включительно
		//for (int i=0; i<array.length; i++)	{
		//	array[i]=1+(int)(Math.random() *100);
		//}
		
		if (directionMotion==0)	{
			finishReverse=array.length-shift-1;
			startReverse =array.length-shift;
		}
		else	{
			finishReverse=shift-1;
			startReverse =shift;
		}
		
		printArray(array);
		System.out.println();
		reverseArray(array);
		reverseArray(array,finishReverse,startReverse);
		System.out.println();
		
		
		
		printArray(array);
	}
	//просто реверсируем массив
	public static int[] reverseArray(int[] array)	{
		int temp;
		for (int i=0; i<array.length/2; i++)	{
			temp=array[(array.length-1)-i];
			array[(array.length-1)-i]=array[i];
			array[i]=temp;
		}
			return array;
	}
	
	//реверсируем массив по частям, первую, вторую
	public static int[] reverseArray(int[] array, int finishReverse, int startReverse)	{
		int temp;
		int shiftT=array.length-startReverse;//
		int count = 0;
		
		//реверсируем 1-ю половину, это просто
		for (int i=0; i<finishReverse/2; i++)	{
			temp=array[finishReverse-i];
			array[finishReverse-i]=array[i];
			array[i]=temp;	
		}
		
		if (shiftT>1)	{
		//реверсируем вторую половину (пока решал побился головой об стол, решение может и не оптимальное, но это пока все что я смог без подсматривания)
			for (int i=startReverse; i<startReverse+shiftT/2; i++)	{
				temp=array[i];
				array[i]=array[array.length-1-count];
				array[array.length-1-count]=temp;
				count++;
				//array[array.length-i]=temp;
			}
		}
			return array;
	}

	//выводим массив на экран
	public static void printArray(int[] array)	{
		for (int i=0; i<array.length; i++)	{
			System.out.print(array[i] + " ");
		}
	}

}