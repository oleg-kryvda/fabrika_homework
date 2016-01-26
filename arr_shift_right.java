/** 
Сдвинуть массив чисел на один элемент вправо
*/

public class arr_shift_right
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
		
			//сдвигаем массив вправо
			for (int i=array.length-1; i >0; i--)	{
				array[i]=array[i-1];
			}
			//первому элементу массива присваеваем зачение
			array[0] = 0;
		
		for (int i=0; i<array.length; i++)	{
			System.out.print(array[i] + " ");
		}
	
	}
}