package 线程的创建和合并;

public class Main {
	public static void main(String[] args){
		Thread student=new Thread(new Student());
		student.start();
	}

}
