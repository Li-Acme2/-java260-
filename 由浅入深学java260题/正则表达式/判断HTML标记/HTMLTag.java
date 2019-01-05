package 判断HTML标记;

import java.util.regex.Pattern;

public class HTMLTag {
	public static void main(String[] args){
		String s="<font color=#008000 size=-1>e.baidu.com</font>";
		String r="<.*>.*</\\1|(.*)>|<(.*) />";         //此正则表达式匹配字母
		Pattern p=Pattern.compile(r);
		System.out.println(p.matcher(s).matches());
	}

}
