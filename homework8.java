/**
Напишите программу, которая получает из аргументов командной стоки: количество километров, 
пройденных автомобилем; количество литров израсходованного бензина; стоимость одного литра бензина. 
Программа должна рассчитать и вывести на экран значение среднего расхода топлива на 100 км пройденного 
пути и среднюю стоимость 1 км пути.

*/
public class homework8
{
	public static void main(String[] args) throws Exception
	{
		String sKm=args[0];//количество километров пройденных автомобилем
		String sLitr=args[1];//количество литров израсходованного бензина
		String sPrice=args[2];//стоимость одного литра бензина.
		int km=Integer.parseInt(sKm);
		int litr=Integer.parseInt(sLitr);
		double price=Double.parseDouble(sPrice);
		
		System.out.println("********************************************************");
		System.out.println("Average fuel consumption per 100 km traveled ways : " + (litr*100/km) + " litr/100km");
		System.out.print("The average cost of one km....................... : ");
		System.out.printf("%.2f", litr*price/km); // подсмотрел как сделать красиво, как работает еще не понял 
		System.out.print(" Grh/km.");
		System.out.println("\n********************************************************");
	}
}