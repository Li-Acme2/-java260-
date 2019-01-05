package Pattern��Matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PattMatTest {
	public static void main(String[] args){
		//����һ��������ʽ�ͱ�ƥ����ַ���
		String patternStr="(0?[1-9]|1[0-2]):([0-5]\\d)([a|p]m)";
		String matcherStr="���ڵ�ʱ����11:15am�������Ӫҵʱ����ÿ���8:30am��5:30pm";//�����ŵ�ע��
		//����Pattern��Matcher����
		Pattern pa=Pattern.compile(patternStr);
		Matcher ma=pa.matcher(matcherStr);
		StringBuffer sb=new StringBuffer();         //����һ��Ŀ���ַ���������
		int count=0;                              //����һ��������
		System.out.println("��ʼ�ַ����ǣ�");          //����ʼ�ַ�����ӡ����
		System.out.println(matcherStr);
		while(ma.find()){                             //ʹ��whileѭ������ƥ����
			StringBuffer temp=new StringBuffer();            //����һ����ʱ�ַ����Ļ�����
			if(ma.group(3).equals("am")){      //���ʱ����am��������滻��  �����¼��ĸ�ʽ
				temp.append(ma.group(1));
				temp.append("��");
				temp.append(ma.group(2));
			}
			else{                         //����ʱ��Ϊpm�Ľ����滻����ʱ�������ȡ
				int time=Integer.parseInt(ma.group(1));
				time=time+12;
				temp.append(time+":"+ma.group(2));             //�����µ�ʱ���ʽ
			}
			ma.appendReplacement(sb, temp.toString());//�����滻����������õ�Ŀ���ַ�����������
			System.out.println("["+(++count)+"]��"+ma.group(0)+"�滻Ϊ"+temp.toString());  //��ӡÿ�ε��滻���
		}
		ma.appendTail(sb);   //�����һ���滻��ʣ����ַ�����ӵ�Ŀ���ַ���������
		System.out.println("���Ľ����");       //��ӡ�����
		System.out.println(sb.toString());
	}

}
/*����Ҫ����������ʽ�ͱ�ƥ���ַ�����������Pattern��Matcher����ʹ��whileѭ�����ַ�������ƥ���飬����ƥ���ַ����滻��Ȼ���ӡ*/

