package 多线程的同步;

public class Canteen {
	synchronized public void sell(String student,String...foods){
		for(String f:foods){
			System.out.println(student+"买"+f);
		}
	}

}
