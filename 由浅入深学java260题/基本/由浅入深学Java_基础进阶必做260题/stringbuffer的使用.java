package ��ǳ����ѧJava_�������ױ���260��;

public class stringbuffer��ʹ�� {
	//length()�������ַ����ĳ��ȡ�
	//insert���������ַ������м���룬�м��ֲ�ͬ�Ĳ�����ʽ��
	//append()�����ַ�����ĩβ׷���ַ�����
	//setCharAt��int index,char ch��:����ָ������λ��Ϊ�ƶ����ַ���
	//toString�����������ַ�����
	//capacity():���ص�ǰ���������ͻ�����������֮�͡�
	public static void main(String[] args){
		StringBuffer sb=new StringBuffer();
		StringBuffer sb2=new StringBuffer();
		StringBuffer sb3=new StringBuffer("�������Ӱ��춹�������괺����������¥��");
		
		String s1="Hello ";
		String s2="World!";
		sb.append("������");
		sb.append("�ؼң�");
		sb.append("�Է���");
		
		sb2.append(s1);
		sb2.insert(sb2.length(), s2);
		System.out.println(sb2);
		
		System.out.println(sb.toString());
		int i=sb.length();
		System.out.println(i);
		
		sb3.replace(sb3.indexOf("��")+1,sb3.length(),"�����˼֪��֪��");//��һ��������Ҫ�������ʼλ�ã��ڶ��������ǽ���λ�ã����������滻�����ݡ�
		System.out.println(sb3);
		}

}
