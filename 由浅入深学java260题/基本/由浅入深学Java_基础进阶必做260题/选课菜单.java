package ��ǳ����ѧJava_�������ױ���260��;

import java.io.IOException;

public class ѡ�β˵� {
public static void main(String[] args) throws IOException{
	int i;
	do{
		System.out.println("1����ѧ");
		System.out.println("2������");
		System.out.println("3��Ӣ��");
		System.out.println("4������");
		System.out.println("5����ѧ");
		System.out.println("6������");
		System.out.println("������ѡ��Ŀγ̺ţ�");
		 i=System.in.read();
		switch(i){
		case'1':System.out.println("��ѡ�������ѧ");break;
		case'2':System.out.println("��ѡ���������");break;
		case'3':System.out.println("��ѡ�����Ӣ��");break;
		case'4':System.out.println("��ѡ���������");break;
		case'5':System.out.println("��ѡ����ǻ�ѧ");break;
		case'6':System.out.println("��ѡ���������");break;
		default:System.out.println("û��������Ŀγ̺ţ�������0-5֮�������");break;
		}
	}while(i<'1'||i>'5');
}
}
