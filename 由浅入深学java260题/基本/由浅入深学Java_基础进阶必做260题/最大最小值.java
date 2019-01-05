package 由浅入深学Java_基础进阶必做260题;

import java.util.Scanner;

public class 最大最小值 {
	public static void main(String[] args){
		double[] array=new double[3];
		@SuppressWarnings("resource")
		Scanner a=new Scanner(System.in);
		System.out.print("输入要比较的值：");
		for(int i=0;i<array.length;i++){
			
			array[i]=a.nextDouble();
		}
		double[] s=show(array);
		System.out.println("最大值：");
			System.out.println(s[0]);
			System.out.println("最小值：");
			System.out.println(s[1]);
			System.out.println("总和：");
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