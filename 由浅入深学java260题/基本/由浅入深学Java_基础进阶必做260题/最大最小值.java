package ��ǳ����ѧJava_�������ױ���260��;

import java.util.Scanner;

public class �����Сֵ {
	public static void main(String[] args){
		double[] array=new double[3];
		@SuppressWarnings("resource")
		Scanner a=new Scanner(System.in);
		System.out.print("����Ҫ�Ƚϵ�ֵ��");
		for(int i=0;i<array.length;i++){
			
			array[i]=a.nextDouble();
		}
		double[] s=show(array);
		System.out.println("���ֵ��");
			System.out.println(s[0]);
			System.out.println("��Сֵ��");
			System.out.println(s[1]);
			System.out.println("�ܺͣ�");
			System.out.println(s[2]);
	}
	public static double[] show(double[] dou){
			double[] result=new double[3];
			double max=dou[0],min=dou[0],sum=0;
			for(int i=0;i<result.length;i++){
				max=max>dou[i]?max:dou[i];
				min=min<dou[i]?min:dou[i];
				sum+=dou[i];
			}
			result[0]=max;
			result[1]=min;
			result[2]=sum;
			return result;
}
}