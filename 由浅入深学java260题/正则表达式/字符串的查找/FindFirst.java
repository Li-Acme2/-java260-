package 字符串的查找;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindFirst {
	public static void main(String[] args){
		String s="荷叶生时春恨生，荷叶枯时秋恨成。深知身在情常在，怅望江头江水声。";
		String r="(.*。)(.*。)";
		Pattern p=Pattern.compile(r);
		Matcher m=p.matcher(s);
		if(m.find()){
			System.out.println(m.group(1));      //打印出前一句
		}
	}

}
