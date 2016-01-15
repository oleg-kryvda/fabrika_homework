/**
Даны координаты двух различных полей шахматной доски x1, y1, x2, y2 (целые числа, лежащие в диапазоне 1–8). 
Проверить истинность высказывания: «Ладья за один ход может перейти с одного поля на другое».
*/

public class homework21
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

		if (x1==x2 || y1==y2) System.out.print("Yes!!!"); //Ладья за один ход может перейти с одного поля на другое
		else System.out.print("No!!!"); // нет уж позвольте
		
	}
}