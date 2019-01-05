package 验证手机号;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PhoneNumber {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner reader=new Scanner(System.in);    //扫描输入文本
		System.out.println("请输入手机号：");
		String n=reader.next();
		String r="^1[3|4|5|8][\\d]\\d{8}$";
		Pattern p=Pattern.compile(r);
		boolean b=p.matcher(n).matches();
		if(b){
			System.out.println(n+"是一个手机号");
		}else{
			System.out.println(n+"不是一个手机号");
		}
	}

}
