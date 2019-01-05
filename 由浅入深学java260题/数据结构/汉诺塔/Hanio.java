package 汉诺塔;

import java.util.Scanner;

public class Hanio {   //汉诺塔移动方法
	public void move(int n,String from,String mid,String to ){
		if(n==1){
			System.out.println("将第"+n+"个从"+from+"移动到"+to);
		}else{
			move(n-1, from, to, mid);//现将n-1个盘子移动到中间的盘子
			System.out.println("将第"+n+"个从"+from+"移动到"+to);
			move(n-1,mid,from,to);//将n-1个盘子从中间移到目的地
		}
	}
	@SuppressWarnings("resource")
	public static void main(String[] args){
		Hanio h=new Hanio();
		Scanner c=new Scanner(System.in);
		System.out.println("请输入需要移动的个数：");
		int s=c.nextInt();
		h.move(s, "A", "B", "C");
	}

}
