package 猜数字小程序;

import java.util.Scanner;

public class GameTest {
	public static void main(String[] args){
		System.out.println("猜数字游戏!!");
		int Guess=(int)MathTest();       //要猜的数
		int Num;                          //你的猜想
		boolean right=true;
		while(right){
			//提示用户输入一个整型数字。
			System.out.println("请输入一个整型数字1-100之间：");
			@SuppressWarnings("resource")
			//从键盘获得一个数
			Scanner scan=new Scanner(System.in);
			Num=scan.nextInt();
			//判断用户输入的数是否正确
			if(Num>Guess){
			System.out.println("你输入的数大于这个数：请继续努力！");	
			}else if(Num<Guess){
				System.out.println("你输入的数小于这个数：请继续努力！");
			}
			else{
				System.out.println("恭喜你猜对了！");
				System.out.println("这个数就是："+Guess);
				right=false;
			}
		}
	}
	/*Math的random函数
	 * 用于产生一个随机数
	 * @return随机数*/

	public static double MathTest() {
		double MathTest=Math.random()*100;
		return MathTest;
	}

}
