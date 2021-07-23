

class Employee{
	String name;
	String ssn;
	String dept;
	int salary;
	Employee() {}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(String name, String ssn, String dept, int salary) {
		super();
		this.name = name;
		this.ssn = ssn;
		this.dept = dept;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", ssn=" + ssn + ", dept=" + dept + ", salary=" + salary + "]";
	}
	
	
}
public class EmployeeApp {

	
	Employee getEmployeeInfo(String str) {
		
     StringBuffer s1=new StringBuffer(str);
     String name=s1.substring(0,3);
     String ssn=s1.substring(4,8);
     String dept=s1.substring(9,14);
     String sal=s1.substring(15,17);
     int salary=Integer.parseInt(sal);
     Employee e=new Employee(name,ssn,dept,salary);
     return e;
}
	String getEmployeeLevel(Employee e) {
   int ssn=Integer.parseInt(e.ssn);
   String level =" ";
   if (ssn>=1 && ssn<=10)
   {
	   level="Level 1";
   }
   else if (ssn>=61 && ssn<=120) {
	   level="Level 2";
   }
   else if (ssn>=121 && ssn<=180) {
	   level="Level 3";
   }
   else {
	   level="Level 4";
   }
   return level;		
}
	public static void main(String[] args) {
		EmployeeApp e=new EmployeeApp();
		System.out.println(e.getEmployeeInfo("abc@4356-uuuii#98"));
		System.out.println(e.getEmployeeLevel(new Employee("abc","4356","uuuii",220)));
	}
}
 