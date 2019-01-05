package 由浅入深学Java_基础进阶必做260题;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 删重复排序 {
	public static void main(String[] args){
		int array[]=new int[10];
		@SuppressWarnings("resource")
		Scanner rd=new Scanner(System.in);
		System.out.println("输入要排序的值：");
		for(int i=0;i<array.length;i++){//利用随机数产生20个随机数
			array[i]=rd.nextInt(10);
		}
		Arrays.sort(array);
		for(int i=0;i<array.length;i++){
			System.out.print(" "+array[i]);
			if((i+1)%5==0)
			System.out.println();
		}
		System.out.println("简单方法：");
		for(int s:array){
			System.out.print(s);
		}
		List<Integer> c=trim(array);
		System.out.println("\n 去掉数组中重复数字，还剩" +c.size()+ "个数字，他们的值分别为：");
		System.out.print(c);
	}


	private static List<Integer> trim(int[] array) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<array.length;i++){
			if(!list.contains(array[i])){
          list.add(array[i]);				
			}
		}
	return list;
	}

	
}
