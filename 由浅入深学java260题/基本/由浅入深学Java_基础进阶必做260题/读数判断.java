package ��ǳ����ѧJava_�������ױ���260��;

import java.util.Scanner;

public class �����ж� {
	@SuppressWarnings("resource")
	public static void main(String[] args){
		Scanner reader=new Scanner(System.in);
		System.out.println("����Ҫ���������");
		
		int x=reader.nextInt();
		System.out.println("\t");
		int y=reader.nextInt();
		int z=x*y;
		if(z>0){
			System.out.println("����ͬ�š�");
		}
		else if(z<0){
			System.out.println("������š�");
		}
		if(z==0){
			System.out.println("��һ����Ϊ0.");
		}
	}

}
