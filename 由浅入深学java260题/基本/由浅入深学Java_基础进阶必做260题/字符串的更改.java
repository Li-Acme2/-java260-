package ��ǳ����ѧJava_�������ױ���260��;

public class �ַ����ĸ��� {
	public static void main(String[] args){
		String s=new String("Hallo Hallo!");//Hello
		String s1=s.replace('a', 'e');//���ַ������뷽���ĵ�һ�������ַ���ͬ���ַ�ͳһ�滻Ϊ�����еĵڶ����ַ���
		System.out.println(s1);
		
		String s2=s.replaceAll("a","ee");//���ַ������뷽���ĵ�һ�������ַ�����ͬ���ַ���ͳһ�滻Ϊ�����ĵڶ����ַ�����
		System.out.println(s2);
		
		String s3=s.replaceFirst("a","e");//���ַ������뷽����һ�������ַ�����ͬ�ĵ�һ���ַ����滻Ϊ�����ĵڶ����ַ�����
		System.out.println(s3);
		
		String s4=s.replaceAll("\\s+","_");//  ��\\s+�� Ӧ���ǿո�
		System.out.println(s4);
	}

}
