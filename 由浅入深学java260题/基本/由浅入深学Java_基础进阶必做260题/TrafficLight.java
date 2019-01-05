package 由浅入深学Java_基础进阶必做260题;

import java.util.Random;

public class TrafficLight {
	public static void main(String[] args) throws InterruptedException{
		int x=200;
		while(x>0){
			int i=new Random().nextInt(10);
			if((i%2)==0){
				//i--;
				System.out.println("绿灯，可以行走"); 
			}else{
				Thread.sleep(1000);
				System.out.println("红灯，禁止行走");
			}
		}
	}

}
