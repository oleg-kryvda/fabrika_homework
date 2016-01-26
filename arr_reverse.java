/** 
реверс значений массива
*/

public class arr_reverse
{
	public static void main(String[] args) throws Exception
	{
		int[] array = new int[10];
		//заполняем массив значениями от 1 до 100 включительно
		for (int i=0; i<array.length; i++)	{
			array[i]=1+(int)(Math.random() *100);
		}
		
		for (int i=0; i<array.length; i++)	{
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		//меняем элементы местами
		int temp;
		for (int i=0; i<array.length/2; i++)	{
			temp=array[(array.length-1)-i];
			array[(array.length-1)-i]=array[i];
			array[i]=temp;
		}
			
		for (int i=0; i<array.length; i++)	{
			System.out.print(array[i] + " ");
		}
	
	}
}