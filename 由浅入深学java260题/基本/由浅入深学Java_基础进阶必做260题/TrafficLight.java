package ��ǳ����ѧJava_�������ױ���260��;

import java.util.Random;

public class TrafficLight {
	public static void main(String[] args) throws InterruptedException{
		int x=200;
		while(x>0){
			int i=new Random().nextInt(10);
			if((i%2)==0){
				//i--;
				System.out.println("�̵ƣ���������"); 
			}else{
				Thread.sleep(1000);
				System.out.println("��ƣ���ֹ����");
			}
		}
	}

}
