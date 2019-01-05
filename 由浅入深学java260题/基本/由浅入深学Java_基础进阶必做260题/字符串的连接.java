package 由浅入深学Java_基础进阶必做260题;

public class 字符串的连接 {
	//concat（）方法用来连接字符串。
	public static void main(String[] args){
		String str="Hello ";
		String s="World ";
		String b="!";
		System.out.println(str.concat(s).concat(b));
		System.out.println(str.concat(b));
	}

}
