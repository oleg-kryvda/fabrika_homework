/** 
:) рисуем фигуры звездочкой "*"
*/

public class figures
{
	public static void main(String[] args) throws Exception
	{
		if (args.length<2 ||  args.length>3)	{
			System.out.println("Enter two or three arguments:");
			System.out.println("First argument of the letter, to the triangle - \"t\", to funnel - \"f\", for the square \"s\", to the rectangle - \"r\"");
			System.out.println("Second argument is the height of the triangle, the height of the funnel, the size of a square, a rectangle height");
			System.out.println("Third argument - the width of the rectangle");
			return;
		}
		char figures = ' ';
		int height = 0;
		int width = 0;
		
		if (args.length==2){
			figures = args[0].charAt(0);
			height = Integer.parseInt(args[1]);
			if (figures != 't' || figures != 's' || figures != 'f' )	{
				System.out.print("enter a valid arguments");
				return;
			}
		}
		
		if (args.length==3)	{
			figures = args[0].charAt(0);
			height = Integer.parseInt(args[1]);
			width = Integer.parseInt(args[2]);
			if (figures != 'r')	{
				System.out.print("enter a valid arguments");
				return;
			}
		}
		
		switch (figures)	{
			case 't': 	Triangle(height);
						break;
			case 's':	Square(height);
						break;
			case 'f':	Funnel(height);
						break;
			case 'r': 	Rectangle(height, width);
						break;
		}
		
	}
	
	public static void Square(int height)	{//выводим на экран квадрат
		for (int i=0; i < height; i++)		{
			for(int j=0; j<height; j++)	{
					System.out.print("*");
			}
		System.out.println("");
		}
	}
	public static void Funnel(int height)	{//выводим на экран флажок
		for (int i=0; i < height; i++)		{
			for(int j=i; j<height; j++)	{
					System.out.print("*");
			}
		System.out.println("");
		}
	}
	public static void Triangle(int height)	{//выводим на экран треугольник
		for (int i=height; i >=0 ; i--)		{
			for(int j=i; j<height; j++)	{
					System.out.print("*");
			}
		System.out.println("");
		}
	}
	
	public static void Rectangle(int height, int width)	{//выводим на экран прямоугольник
		for (int i=0; i < height; i++)		{
			for(int j=0; j<width; j++)	{
					System.out.print("*");
			}
		System.out.println("");
		}
	}
}