package ��֤�ֻ���;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PhoneNumber {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner reader=new Scanner(System.in);    //ɨ�������ı�
		System.out.println("�������ֻ��ţ�");
		String n=reader.next();
		String r="^1[3|4|5|8][\\d]\\d{8}$";
		Pattern p=Pattern.compile(r);
		boolean b=p.matcher(n).matches();
		if(b){
			System.out.println(n+"��һ���ֻ���");
		}else{
			System.out.println(n+"����һ���ֻ���");
		}
	}

}
