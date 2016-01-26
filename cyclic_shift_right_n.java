/** 
циклический сдвиг массива на один элемент вправо
*/

public class cyclic_shift_right_n
{
	public static void main(String[] args) throws Exception
	{
		int shift=Integer.parseInt(args[0]);
		
		int[] array = new int[10];
		//заполняем массив значениями от 1 до 100 включительно
		for (int i=0; i<array.length; i++)	{
			array[i]=1+(int)(Math.random() *100);
		}
		
		for (int i=0; i<array.length; i++)	{
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		for (int j=shift; j>0; j--)	{
			//запоминаем значение первого элемента массива чтобы его потом поставить на место последнего
			//не уверен что это решение допустимо, пошел по пути неименьшего сопротивления ))
			int temp = array[array.length-1];
			//сдвигаем массив вправо
			for (int i=array.length-1; i >0; i--)	{
				array[i]=array[i-1];
			}
			//первому элементу массива присваеваем зачение
			array[0] = temp;
		}
		
		for (int i=0; i<array.length; i++)	{
			System.out.print(array[i] + " ");
		}
	
	}
}