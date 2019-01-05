package 学生和老师;

public class Student {
	private String name;
	private String sex;
	private int age;
	
	public Student(){
		
	}
	public Student(String name,String sex,int age){
		this.name=name;
		this.sex=sex;
		this.age=age;
	}
	public void printmessage(){
		System.out.print(name);
		System.out.print(" "+sex);
		System.out.println(" "+age);
	}
	public String read(String content){
		String mine="（I learned early）：";
		String remain=mine+content;
		System.out.println("这是我学到的"+remain);
		return remain;
	}
	public String write(String content){
		System.out.println("这书写的内容："+content);
		return content;
	}

}
