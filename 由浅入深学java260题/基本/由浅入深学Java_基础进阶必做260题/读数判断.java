package 由浅入深学Java_基础进阶必做260题;

import java.util.Scanner;

public class 读数判断 {
	@SuppressWarnings("resource")
	public static void main(String[] args){
		Scanner reader=new Scanner(System.in);
		System.out.println("输入要计算的数：");
		
		int x=reader.nextInt();
		System.out.println("\t");
		int y=reader.nextInt();
		int z=x*y;
		if(z>0){
			System.out.println("两数同号。");
		}
		else if(z<0){
			System.out.println("两数异号。");
		}
		if(z==0){
			System.out.println("有一个数为0.");
		}
	}

}
