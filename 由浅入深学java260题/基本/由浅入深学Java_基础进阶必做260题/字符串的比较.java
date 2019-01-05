package 由浅入深学Java_基础进阶必做260题;

public class 字符串的比较 {
	public static void main(String[] args){
		String zhangsan="Hello World!";
		String lisi="Hello World!";
		String wangwu="Hello world!";
		String zhaoliu="hello world!";
		
		//equals():比较两个字符串的内容是否相等，返回值是Boolean类型值。
		//equalsIgnoreCase():忽略大小写的equals（）方法。
		//compareTo():按照词典的顺序进行比较，返回int类型值。它从第一位开始比较，如果遇到不同的字符，就马上返回这两个字符的ascii值差值。返回值是
		//                 int类型。
		
		if(zhangsan.equals(lisi)){
			System.out.println("张三和李四的相同。");
		}else{
			System.out.println("张三和李四的不一样。");
		}
		if(zhangsan.equalsIgnoreCase(zhaoliu)){
			System.out.println("张三和赵六的相同。");
		}else{
			System.out.println("张三和赵六的不一样。");
		}
		if((wangwu.compareTo(zhaoliu))>0){
			System.out.println("王五和赵六的相同。");
		}else{
			System.out.println("王五和赵六的不一样。");
		}
	}

}
