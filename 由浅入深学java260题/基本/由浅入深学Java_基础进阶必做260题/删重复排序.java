package ��ǳ����ѧJava_�������ױ���260��;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ɾ�ظ����� {
	public static void main(String[] args){
		int array[]=new int[10];
		@SuppressWarnings("resource")
		Scanner rd=new Scanner(System.in);
		System.out.println("����Ҫ�����ֵ��");
		for(int i=0;i<array.length;i++){//�������������20�������
			array[i]=rd.nextInt(10);
		}
		Arrays.sort(array);
		for(int i=0;i<array.length;i++){
			System.out.print(" "+array[i]);
			if((i+1)%5==0)
			System.out.println();
		}
		System.out.println("�򵥷�����");
		for(int s:array){
			System.out.print(s);
		}
		List<Integer> c=trim(array);
		System.out.println("\n ȥ���������ظ����֣���ʣ" +c.size()+ "�����֣����ǵ�ֵ�ֱ�Ϊ��");
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
