package 由浅入深学Java_基础进阶必做260题;

public class 字符串的复制 {
	@SuppressWarnings("static-access")
	public static void main(String[] args){
		String str="Hello_World!";
		
		char[] ch=new char[str.length()];
		for(int i=0;i<str.length();i++){
			ch[i]=str.charAt(i);
		}
		String s1=str.copyValueOf(ch);//复制数组的全部，作为一个新的字符串。
		String s2=str.copyValueOf(ch, 0, 5);//复制数组的有要求的一部分，作为一个新的字符串。
		System.out.println(s1);
		System.out.println(s2);
	}

}
