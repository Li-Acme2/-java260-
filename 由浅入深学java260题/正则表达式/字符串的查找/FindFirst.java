package �ַ����Ĳ���;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindFirst {
	public static void main(String[] args){
		String s="��Ҷ��ʱ����������Ҷ��ʱ��޳ɡ���֪�����鳣�ڣ�������ͷ��ˮ����";
		String r="(.*��)(.*��)";
		Pattern p=Pattern.compile(r);
		Matcher m=p.matcher(s);
		if(m.find()){
			System.out.println(m.group(1));      //��ӡ��ǰһ��
		}
	}

}
