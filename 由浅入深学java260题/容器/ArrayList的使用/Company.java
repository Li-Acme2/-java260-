package ArrayList的使用;


import java.util.ArrayList;
import java.util.List;

class Employee{
		private String name;
		private int salary;
		public Employee(String name,int salary){
			this.name=name;
			this.salary=salary;
		}
	public String getname(){
		return name;
	}
	public void setname(String name){
		this.name=name;
	}
	public int getsalary(){
		return salary;
	}
	public void setsalsry(int salary){
		this.salary=salary;
	}
	}

public class Company {
	public static void main(String[] args){
		List<Employee> es=new ArrayList<Employee>();
		es.add(new Employee("Mike",10000));
		es.add(new Employee("Rose",8000));
		es.add(new Employee("Zim",16000));
		es.add(new Employee("Jone",10000));
		for(Employee e:es){
			System.out.println(e.getname()+"的薪水是："+e.getsalary());
		}
	}
}
