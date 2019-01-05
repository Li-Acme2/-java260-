package 由浅入深学Java_基础进阶必做260题;

public class 字符串的分割 {
	public static void main(String[] args){
		String s="张三, 回家吃饭, 快点";
		String[] a=s.split(",");
		System.out.println("原句："+s);
		for(int i=0;i<a.length;i++){
			System.out.println("剪切后的第"+(i+1)+"部分："+a[i]);
		}
	}

}
