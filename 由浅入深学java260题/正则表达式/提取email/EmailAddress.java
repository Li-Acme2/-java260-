package ��ȡemail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailAddress {
	public static void main(String[] args){
		String txt="�����Ҫ���ַ��������ݽ��з���ƥ��ʱ��abc@aa.com abddatt@d.com������ʹ��������ʽ���п����Ĺ���";
		String r="\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*";      //������ʽƥ����ĸ
		Pattern p=Pattern.compile(r);
		Matcher m=p.matcher(txt);
		while(m.find()){
			System.out.println(m.group(0));
		}
	}

}
