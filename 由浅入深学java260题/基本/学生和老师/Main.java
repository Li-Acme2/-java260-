package 学生和老师;

public class Main {
	public static void main(String[] args){
		Student std=new Student("李四","男",20);
		Teacher th=new Teacher();
		std.printmessage();
		th.check(std);
	}

}
