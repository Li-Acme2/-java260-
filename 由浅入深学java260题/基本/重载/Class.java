package ����;

public class Class {
	public static void main(String[] args){
		Student s=new Student();
		s.print();
		s.print("zhangsan",20);
		s.print("zhangsan",20,"��");
		s.print("zhangsan",20,"��",10010);
	}
	
}
//Integer.parseInt(String s);
class Student{//�Է���print�������������أ�ʹ�ò�ͬ�Ĳ���
	String name="zhangsan";
	int age=19;
	void print(){
		System.out.println("����:"+name+" ���䣺"+age);
	}
	void print(String name,int age){
		System.out.println("���֣�"+name+" ����"+age);
	}
	void print(String name,int age,String sex){
		System.out.println("���֣�"+name+" ���䣺"+age+" �Ա�"+sex);
	}
	void print(String name,int age,String sex,int number){
		System.out.println("���֣�"+name+" ���䣺"+age+" �Ա�"+sex+" ѧ�ţ�"+number);
	}
}

