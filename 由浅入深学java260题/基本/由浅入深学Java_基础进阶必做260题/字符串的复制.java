package ��ǳ����ѧJava_�������ױ���260��;

public class �ַ����ĸ��� {
	@SuppressWarnings("static-access")
	public static void main(String[] args){
		String str="Hello_World!";
		
		char[] ch=new char[str.length()];
		for(int i=0;i<str.length();i++){
			ch[i]=str.charAt(i);
		}
		String s1=str.copyValueOf(ch);//���������ȫ������Ϊһ���µ��ַ�����
		String s2=str.copyValueOf(ch, 0, 5);//�����������Ҫ���һ���֣���Ϊһ���µ��ַ�����
		System.out.println(s1);
		System.out.println(s2);
	}

}
