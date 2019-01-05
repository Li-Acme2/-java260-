package 由浅入深学Java_基础进阶必做260题;

public class 强制类型转换 {
	public  static void main(String[] args){
		int b=111;
		byte i=(byte)b;
		System.out.println("int类型强制转换为byte后的值："+i);
		
		double c=11.56;
		int v=(int)c;
		System.out.println("double类型强制转换为int后的值："+v);
	}

}
