package ð������;


/*
 * ð������Ϳ������������     
 * 1.������ð�ݵĸĽ�
 * 2.ð�ݵĽ�������ڵڶ���ѭ�����У����ŵĽ�������ڵ�һ��ѭ������
 * */

import java.util.Scanner;
/*�����³����У��Ȼ�ȡ����������֣����ҷָ�����飬Ȼ�����sort������������������sort���������У��������Ƚ�0~֮�����ڵ����֣����ǰһ���Ⱥ�һ����
 * �ͽ���λ�ã��ڱȽ�0~֮������֣��Դ����ơ�*/
public class Bubble {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
	System.out.println("������Ҫ��������飨�ÿո������:");
	String st=s.nextLine();
	System.out.println(st+"�����򷽷���");
	String[] ss=st.split("\\s+");
	sort(ss);
	System.out.println("�����");
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
				sb.append("�Ƚϣ�").append(array[j]).append(" ").append(array[j+1]);
				//���˶�����ָ���Ķ�����бȽ��Խ������� ����һ�����������������������Ϊ�ö���С�ڣ����ڻ����ָ������
				if(array[j].compareTo(array[j+1])>0){
					sb.append("ð��");
					swap(array,j,j+1);
					}
				System.out.println(sb);
				sb.setLength(0);
			}
			for(E s:array){
				sb.append(s).append(" ");
			}
			System.out.println("��"+(len-i)+"�֣�"+sb);
			sb.setLength(0);
		}
		System.out.println("-----------------");
	}
//��������Ԫ�ص�λ��
	private static<E extends Comparable<E>> void swap(E[] array, int a, int b) {
		// TODO Auto-generated method stub
		E e=array[a];
		array[a]=array[b];
		array[b]=e;
	}
}
