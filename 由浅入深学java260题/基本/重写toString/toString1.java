package ��дtoString;

public class toString1 {
	String name;
	int age;
	String sex;
	public toString1(){
	}
	public toString1(String name,int age,String sex){
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setage(int age){
		this.age=age;
	}
	public void setsex(String sex){
		this.sex=sex;
	}
	public String toString(){
		return"����:"+name+" ���䣺"+age+" "+ "�Ա�"+sex;
	}

}
