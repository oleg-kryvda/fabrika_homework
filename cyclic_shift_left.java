/** 
Циклический сдвиг массива на один элемент влево
*/

public class cyclic_shift_left
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
		
		//запоминаем значение первого элемента массива чтобы его потом поставить на место последнего
		//не уверен что это решение допустимо, пошел по пути неименьшего сопротивления ))
			int temp = array[0];
			//сдвигаем массив влево
			for (int i=0; i<array.length-1; i++)	{
				array[i]=array[i+1];
			}
			//последнему элементу массива присваеваем зачение
			array[array.length-1] = temp;
		
		for (int i=0; i<array.length; i++)	{
			System.out.print(array[i] + " ");
		}
	
	}
}