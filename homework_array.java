/** 
Дан массив случайных чисел от 1 до 100. Вывести этот массив в порядке возрастания
*/

//import java.util.*;

public class homework_array
{
	public static void main(String[] args) throws Exception
	{
		int[] array = new int[100];
		
		for (int i = 0; i<100; i++)
		{
			array[i]=1+(int)(Math.random() *100);
		}
		
		//Arrays.sort(array); //- не будем пользоваться штатной магией :)
		
		// сортировка пузырьком
		for(int i = array.length-1 ; i > 0 ; i--){
			for(int j = 0 ; j < i ; j++){
				if( array[j] > array[j+1] ){
					int tmp = array[j];
					array[j] = array[j+1];
					array[j+1] = tmp;
					}
				}
			}
		
		for(int i = 0; i < array.length; i++){
			System.out.println((i+1) + ". " +array[i]);
		}
	}
}