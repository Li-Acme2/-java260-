package 判断URL地址;

import java.util.regex.Pattern;

public class URLAddress {
	public static void main(String[] args){
		String s="http://www.baidu.com/";
		String r="^http://([\\w-]+\\.)+[\\w-]+(/[./?%&=]*)?$";
		Pattern p=Pattern.compile(r);
		boolean b=p.matcher(s).matches();
		if(b){
			System.out.println(s+"是一个URL地址");
		}else{
			System.out.println(s+"不是一个URL地址");
		}
	}

}
