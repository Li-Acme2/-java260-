package ��ŵ��;

import java.util.Scanner;

public class Hanio {   //��ŵ���ƶ�����
	public void move(int n,String from,String mid,String to ){
		if(n==1){
			System.out.println("����"+n+"����"+from+"�ƶ���"+to);
		}else{
			move(n-1, from, to, mid);//�ֽ�n-1�������ƶ����м������
			System.out.println("����"+n+"����"+from+"�ƶ���"+to);
			move(n-1,mid,from,to);//��n-1�����Ӵ��м��Ƶ�Ŀ�ĵ�
		}
	}
	@SuppressWarnings("resource")
	public static void main(String[] args){
		Hanio h=new Hanio();
		Scanner c=new Scanner(System.in);
		System.out.println("��������Ҫ�ƶ��ĸ�����");
		int s=c.nextInt();
		h.move(s, "A", "B", "C");
	}

}
