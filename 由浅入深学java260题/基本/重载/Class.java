package 重载;

public class Class {
	public static void main(String[] args){
		Student s=new Student();
		s.print();
		s.print("zhangsan",20);
		s.print("zhangsan",20,"男");
		s.print("zhangsan",20,"男",10010);
	}
	
}
//Integer.parseInt(String s);
class Student{//对方法print（）进行了重载，使用不同的参数
	String name="zhangsan";
	int age=19;
	void print(){
		System.out.println("名字:"+name+" 年龄："+age);
	}
	void print(String name,int age){
		System.out.println("名字："+name+" 年龄"+age);
	}
	void print(String name,int age,String sex){
		System.out.println("名字："+name+" 年龄："+age+" 性别："+sex);
	}
	void print(String name,int age,String sex,int number){
		System.out.println("名字："+name+" 年龄："+age+" 性别："+sex+" 学号："+number);
	}
}

