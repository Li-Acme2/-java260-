package ������С����;

import java.util.Scanner;

public class GameTest {
	public static void main(String[] args){
		System.out.println("��������Ϸ!!");
		int Guess=(int)MathTest();       //Ҫ�µ���
		int Num;                          //��Ĳ���
		boolean right=true;
		while(right){
			//��ʾ�û�����һ���������֡�
			System.out.println("������һ����������1-100֮�䣺");
			@SuppressWarnings("resource")
			//�Ӽ��̻��һ����
			Scanner scan=new Scanner(System.in);
			Num=scan.nextInt();
			//�ж��û���������Ƿ���ȷ
			if(Num>Guess){
			System.out.println("�������������������������Ŭ����");	
			}else if(Num<Guess){
				System.out.println("���������С��������������Ŭ����");
			}
			else{
				System.out.println("��ϲ��¶��ˣ�");
				System.out.println("��������ǣ�"+Guess);
				right=false;
			}
		}
	}
	/*Math��random����
	 * ���ڲ���һ�������
	 * @return�����*/

	public static double MathTest() {
		double MathTest=Math.random()*100;
		return MathTest;
	}

}
