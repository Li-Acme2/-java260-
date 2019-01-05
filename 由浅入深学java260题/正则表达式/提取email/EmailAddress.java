package 提取email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailAddress {
	public static void main(String[] args){
		String txt="如果需要对字符串的内容进行分析匹配时，abc@aa.com abddatt@d.com大大简化了使用正则表达式进行开发的工作";
		String r="\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*";      //此正则式匹配字母
		Pattern p=Pattern.compile(r);
		Matcher m=p.matcher(txt);
		while(m.find()){
			System.out.println(m.group(0));
		}
	}

}
