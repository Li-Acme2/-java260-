package 冒泡排序;


/*
 * 冒泡排序和快速排序的区别     
 * 1.快排是冒泡的改进
 * 2.冒泡的交换体放在第二个循环体中，快排的交换体放在第一个循环体中
 * */

import java.util.Scanner;
/*在以下程序中，先获取待排序的数字，并且分割成数组，然后调用sort（）方法进行排序。在sort（）方法中，先两两比较0~之间相邻的数字，如果前一个比后一个大，
 * 就交换位置，在比较0~之间的数字，以此类推。*/
public class Bubble {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
	System.out.println("请输入要排序的数组（用空格隔开）:");
	String st=s.nextLine();
	System.out.println(st+"的排序方法：");
	String[] ss=st.split("\\s+");
	sort(ss);
	System.out.println("结果：");
	StringBuffer sb=new StringBuffer();
	for(String a:ss){
		sb.append(a).append(" ");
	}
	System.out.println(""+sb);
	s.close();
	}

	public static<E extends Comparable<E>> void sort(E[] array) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();
		int len=array.length;
		for(int i=len-1;i>=0;i--){
			for(int j=0;j<i;j++){
				sb.append("比较：").append(array[j]).append(" ").append(array[j+1]);
				//将此对象与指定的对象进行比较以进行排序。 返回一个负整数，零或正整数，因为该对象小于，等于或大于指定对象。
				if(array[j].compareTo(array[j+1])>0){
					sb.append("冒泡");
					swap(array,j,j+1);
					}
				System.out.println(sb);
				sb.setLength(0);
			}
			for(E s:array){
				sb.append(s).append(" ");
			}
			System.out.println("第"+(len-i)+"轮："+sb);
			sb.setLength(0);
		}
		System.out.println("-----------------");
	}
//交换两个元素的位置
	private static<E extends Comparable<E>> void swap(E[] array, int a, int b) {
		// TODO Auto-generated method stub
		E e=array[a];
		array[a]=array[b];
		array[b]=e;
	}
}
