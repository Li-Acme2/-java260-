package 内部类的继承;

import java.util.Scanner;

public class ColorPrinter {
	@SuppressWarnings("resource")
	public static void main(String[] args){
		Scanner reader=new Scanner(System.in);
		System.out.println("请输入打印内容：");
		String content=reader.next();
	    System.out.println("输入true或false:");
		boolean isColor=reader.nextBoolean();
		PrintHead ph;
		if(isColor){
			ph=new ColorPrintHead();
			ph.strike(content);
		}else{
			ph=new PrintHead();
			ph.strike(content);
		}

	}
	static class PrintHead{
		public void strike(String s){
			System.out.println("Striking words");
			System.out.println(s);
		}
	}
	static class ColorPrintHead extends PrintHead{
		public void strike(String s){
			System.out.println("Striking color words");
			System.out.println(s);
		}
	}

}
