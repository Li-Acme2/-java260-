package ���̵߳�ͬ��;

public class Canteen {
	synchronized public void sell(String student,String...foods){
		for(String f:foods){
			System.out.println(student+"��"+f);
		}
	}

}
