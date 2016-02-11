public class bank	{
	public static void main(String[] args)	{
		
		customerAcc acc1 = new customerAcc();
		acc1.setFirstName("Vasja");
		acc1.setLastName("Pupkin");
		acc1.setIdentNumber(12345);
		acc1.setAccNumber(900123);
		//System.out.println("The number of customer:" +customerAcc.count);
		customerAcc acc2 = new customerAcc();
		acc2.setFirstName("Masha");
		acc2.setLastName("Belkina");
		acc2.setIdentNumber(54321);
		acc2.setAccNumber(900543);
		//System.out.println("The number of customer:" +customerAcc.count);
		
		customerAcc.printCustomerInfo(acc1);
		customerAcc.printCustomerInfo(acc2);
		System.out.println("The number of customer:" +customerAcc.count);
	}
}

class customerAcc	{
	public static int count=0; 		//увеличиваем счетчик, когда присваеваем identNumber клиенту
	private String firstName; 		// имя
	private String lastName; 		//фамилия
	private int identNumber; 		//однозначный идентификатор клиента, например идентификационный код
	private int accNumber; 			//номер счета
	
	public static void printCustomerInfo(customerAcc name)	{ //вывод на экран полной информации о клиенте
		System.out.print(name.getFirstName() +" "+ name.getLastName());
		System.out.println(", Ident No.: " + name.getIdentNumber() + ", Acc.No.: " + name.getAccNumber());
	}
	
	public String getFirstName()	{
		return firstName;
	}	
	public void setFirstName(String name)	{
		firstName = name;
	}
	
	public String getLastName()	{
		return lastName;
	}	
	public void setLastName(String name)	{
		lastName = name;
	}
	
	public int getIdentNumber()	{
		return identNumber;
	}	
	public void setIdentNumber(int ident)	{
		identNumber = ident;
		count++;
	}
	public int getAccNumber()	{
		return accNumber;
	}	
	public void setAccNumber(int number)	{
		accNumber = number;
	}
	
}
