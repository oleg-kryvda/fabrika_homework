/**
*/

public class homework55		{
	public static void main(String[] args)	{
		Employee[] employee = new Employee[11];
		employee[0] = new Employee(12345, "Viktor", "Sotov", 1000.0);
		employee[1] = new Employee(23456, "Ol'ga ", "Dovganich", 1000.0);
		employee[2] = new Employee(34567, "Gleb", "Svyazhin", 1000.0);
		employee[3] = new Employee(45678, "Oleg", "Strel'tsov", 1000.0);
		employee[4] = new Employee(56789, "Andrey", "Brus", 1500.0); //мелкий подхалимаж, и для проверки :)
		employee[5] = new Employee(67891, "Nikolay", "Pashkovskiy", 1000.0);
		employee[6] = new Employee(78912, "Andrey", "Sil'chuk", 1000.0);
		employee[7] = new Employee(89123, "Dmitriy", "Vlayev", 1000.0);
		employee[8] = new Employee(91234, "Konstantin", "Genchevskiy", 1000.0);
		employee[9] = new Employee(0, "KAREEM", "KHALIL", 500.0);
		employee[10] = new Employee(0, "RONALD", "MONKS", 1000.0);
		
		System.out.println("**-----Report the total salaries list-----**");
		printAllEmployee(employee);
		System.out.println("Total sum: "+ sumAllSalary(employee));
		System.out.println("");
		System.out.println("**-----Report the minimal salary----------**");
		printOneEmployee(employee, findMinSalary(employee));
		System.out.println("");
		System.out.println("**-----Report the maximum salary----------**");
		printOneEmployee(employee, findMaxSalary(employee));
		
		//int indMin = findMinSalary(employee);
		//int indMax = findMaxSalary(employee);
		//System.out.println("max = " + indMax);
		//double sumSalary = sumAllSalary(employee); 
		//System.out.println("Sum = " + sumSalary);
		//printOneEmployee(employee, 0);
	}
	
	public static int findMaxSalary(Employee[] employee)	{ //returns the array index
		double max = employee[0].getSalary();
		int numb = 0;
		for (int i=0; i<employee.length; i++)	{
			if (max < employee[i].getSalary()) {
				max=employee[i].getSalary();
				numb=i;
			}
		}
		return numb;
	}
	public static int findMinSalary(Employee[] employee)	{//returns the array index
		double min = employee[0].getSalary();
		int numb = 0;
		for (int i=0; i<employee.length; i++)	{
			if (min > employee[i].getSalary()) {
				min=employee[i].getSalary();
				numb=i;
			}
		}
		return numb;
	}
	public static double sumAllSalary(Employee[] employee)	{ //returns the sum of all salaries
		double sum = 0;
		for (int i=0; i<employee.length; i++)	{
			sum += employee[i].getSalary();
		}
		return sum;
	}
	public static void printAllEmployee(Employee[] employee)	{ //It displays all variables of the array, using the method printOneEmployee()
		for (int i=0; i<employee.length; i++)	{
				printOneEmployee(employee, i);
		}
	}
	public static void printOneEmployee(Employee[] employee, int numb)	{ //displays a variable class
		System.out.println(employee[numb].getINN()+ ", \t" + employee[numb].getName() + " " + employee[numb].getSurname() + ": \t" + employee[numb].getSalary());
	}
}
//////////////////////////////////////////////////////////////////////////////////////////////////////
class Employee	{
	private int INN;
	private String name;
	private String surname;
	private double salary;
	
	public Employee(int INN, String name, String surname, double salary)	{
		this.INN = INN;
		this.name = name;
		this.surname = surname;
		this.salary = salary;
	}
	
	public void setINN(int inn)	{
		this.INN = inn;
	}
	public int getINN()	{
		return INN;
	}
	
	public void setName(String name)	{
		this.name = name;	
	}
	public String getName()	{
		return name;
	}
	
	public void setSurname(String surname)	{
		this.surname = surname;	
	}
	public String getSurname()	{
		return surname;
	}
	
	public void setSalary(double salary)	{
		this.salary = salary;	
	}
	public double getSalary()	{
		return salary;
	}
}