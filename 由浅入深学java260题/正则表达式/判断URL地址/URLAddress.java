package �ж�URL��ַ;

import java.util.regex.Pattern;

public class URLAddress {
	public static void main(String[] args){
		String s="http://www.baidu.com/";
		String r="^http://([\\w-]+\\.)+[\\w-]+(/[./?%&=]*)?$";
		Pattern p=Pattern.compile(r);
		boolean b=p.matcher(s).matches();
		if(b){
			System.out.println(s+"��һ��URL��ַ");
		}else{
			System.out.println(s+"����һ��URL��ַ");
		}
	}

}
