/**
Даны координаты двух различных полей шахматной доски x1, y1, x2, y2 (целые числа, лежащие в диапазоне 1–8). 
Проверить истинность высказывания: «Данные поля имеют одинаковый цвет».

*/

public class homework20
{
	public static void main(String[] args) throws Exception
	{
		String X1=args[0]; 		//x1
		String Y1=args[1]; 		//y1
		String X2=args[2];  	//x2
		String Y2=args[3];		//y2
	
		int x1 = Integer.parseInt(X1);
		int y1 = Integer.parseInt(Y1);
		int x2 = Integer.parseInt(X2);
		int y2 = Integer.parseInt(Y2);

		// очень хорошее решение и как раз вписывается в пройденный материал,
		// алгоритм подсмотрел в интернете, реализацию не сложно было додумать
		
		int cell1 = (x1+y1)%2;
		int cell2 = (x2+y2)%2;
		
		if (cell1 == cell2) 
			System.out.print("The fields of the same color"); //Поля одинакового цвета
		else 
			System.out.print("Fields of different colors"); //Поля разного цвета
		
	}
}