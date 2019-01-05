package 由浅入深学Java_基础进阶必做260题;

public class 字符串的更改 {
	public static void main(String[] args){
		String s=new String("Hallo Hallo!");//Hello
		String s1=s.replace('a', 'e');//把字符串中与方法的第一个参数字符相同的字符统一替换为方法中的第二个字符。
		System.out.println(s1);
		
		String s2=s.replaceAll("a","ee");//把字符串中与方法的第一个参数字符串相同的字符串统一替换为方法的第二个字符串。
		System.out.println(s2);
		
		String s3=s.replaceFirst("a","e");//把字符串中与方法第一个参数字符串相同的第一个字符串替换为方法的第二个字符串。
		System.out.println(s3);
		
		String s4=s.replaceAll("\\s+","_");//  “\\s+” 应该是空格
		System.out.println(s4);
	}

}
