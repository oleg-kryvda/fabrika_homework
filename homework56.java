import java.util.*;
import java.util.Comparator;



public class homework56	{

    public static void main(String[] args)	{
        Employee[] employee = new Employee[11];
        employee[0] = new Employee(12345, "Viktor", "Sotov", 999.0);
        employee[1] = new Employee(45678, "Oleg", "Strel'tsov", 887.0);
        employee[2] = new Employee(56789, "Andrey", "Brus", 1500.0);
        employee[3] = new Employee(91234, "Konstantin", "Genchevskiy", 1000.0);
        employee[4] = new Employee(0, "KAREEM", "KHALIL", 500.0);
        employee[5] = new Employee(0, "RONALD", "MONKS", 1000.0);
        employee[6] = new FabrikaManager(23456, "Ol'ga ", "Dovganich", 1000.0);
        employee[7] = new FabrikaManager(34567, "Gleb", "Svyazhin", 1000.0);
        employee[8] = new FabrikaManager(67891, "Nikolay", "Pashkovskiy", 1000.0);
        employee[9] = new FabrikaManager(78912, "Andrey", "Sil'chuk", 1000.0);
        employee[10] = new FabrikaManager(89123, "Dmitriy", "Vlayev", 1000.0);

        //Arrays.sort(employee);

        int sort = 3;
        switch (sort){
            case 1: 
                Arrays.sort(employee, new SortedByINN());
                break;
            case 2:
                Arrays.sort(employee, new SortedByName().thenComparing(new SortedBySurname())); //sort by name
                break;
            case 3: 
                Arrays.sort(employee, new SortedBySurname().thenComparing(new SortedByName())); // sort by surname
                break;
            case 4:
                Arrays.sort(employee, new SortedBySalary());
                break;
        }

        System.out.println("**-----Report the total salaries list-----**");
        printAllEmployee(employee);
        System.out.println("Total sum: "+ sumAllSalary(employee));
        System.out.println("");
        System.out.println("**-----Report the minimal salary----------**");
        printOneEmployee(employee, findMinSalary(employee));
        System.out.println("");
        System.out.println("**-----Report the maximum salary----------**");
        printOneEmployee(employee, findMaxSalary(employee));
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
        System.out.println(employee[numb].toString());
    }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////
class Employee implements Comparable{
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
    //public void setINN(int inn)	{this.INN = inn;}
    public int getINN()	{return INN;}
    //public void setName(String name)	{this.name = name;}
    public String getName()	{return name;}
    //public void setSurname(String surname)	{this.surname = surname;}
    public String getSurname()	{return surname;}
    //public void setSalary(double salary)	{this.salary = salary;}
    public double getSalary()	{return salary;}


    public int compareTo(Object obj)  {
        Employee tmp = (Employee)obj;
        if(this.INN < tmp.INN) {
		  /* текущее меньше полученного */
            return -1;
        }
        else if(this.INN > tmp.INN){
		  /* текущее больше полученного */
            return 1;
        }
		/* текущее равно полученному */
        return 0;
    }
    @Override
    public String toString() {
        return getINN() + ", \t" + getName() + " " + getSurname() + ", \t " + getSalary() ;
    }


}
//////////////////////////////////////////////////////////////////////////////////////////////////////
class FabrikaManager extends Employee 	{
    private double bonus=250.0;

    public FabrikaManager(int INN, String name, String surname, double salary)	{
        super(INN, name, surname, salary);
    }
    public FabrikaManager(int INN, String name, String surname, double salary, double bonus)	{
        super(INN, name, surname, salary);
        this.bonus = bonus;
    }

    public double getBonus(){
        return bonus;
    }

    public int getINN()	{return super.getINN();}
    public String getName()	{return super.getName();}
    public String getSurname()	{return super.getSurname();}

    public double getSalary()	{
        return super.getSalary() + bonus;
    }
    @Override
    public String toString() {
        return getINN() + ", \t" + getName() + " " + getSurname() + ", \t " + getSalary() ;
    }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////
class SortedByINN implements Comparator<Employee> {
    public int compare(Employee obj1, Employee obj2){
        int inn1 = obj1.getINN();
        int inn2 = obj2.getINN();
        if(inn1 > inn2) {
            return 1;
        }
        else if(inn1 < inn2) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////
class SortedBySalary implements Comparator<Employee> {
    public int compare(Employee obj1, Employee obj2){
        double salary1 = obj1.getSalary();
        double salary2 = obj2.getSalary();
        if(salary1 > salary2) {
            return 1;
        }
        else if(salary1 < salary2) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////
class SortedByName implements Comparator<Employee> {
    public int compare(Employee obj1, Employee obj2) {
        String name1 = obj1.getName();
        String name2 = obj2.getName();
        return name1.compareTo(name2);
    }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////
class SortedBySurname implements Comparator<Employee> {
    public int compare(Employee obj1, Employee obj2) {
        String name1 = obj1.getSurname();
        String name2 = obj2.getSurname();
        return name1.compareTo(name2);
    }
}
