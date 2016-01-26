/** 
сдвиг массива на заданное кол-во элементов влево
*/

public class arr_shift_left_n
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
		
		//повторяем внутренний массив N раз (а ларчик просто открывался)
		for (int j=0; j<shift; j++)	{
			//сдвигаем массив влево
			for (int i=0; i<array.length-1; i++)	{
				array[i]=array[i+1];
			}
			array[array.length-1] = 0;//последнему элементу массива присваеваем зачение
		}
		
		for (int i=0; i<array.length; i++)	{
			System.out.print(array[i] + " ");
		}
	
	}
}