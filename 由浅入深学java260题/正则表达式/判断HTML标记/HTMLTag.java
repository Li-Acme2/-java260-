package �ж�HTML���;

import java.util.regex.Pattern;

public class HTMLTag {
	public static void main(String[] args){
		String s="<font color=#008000 size=-1>e.baidu.com</font>";
		String r="<.*>.*</\\1|(.*)>|<(.*) />";         //��������ʽƥ����ĸ
		Pattern p=Pattern.compile(r);
		System.out.println(p.matcher(s).matches());
	}

}
