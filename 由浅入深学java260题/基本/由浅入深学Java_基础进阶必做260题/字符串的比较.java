package ��ǳ����ѧJava_�������ױ���260��;

public class �ַ����ıȽ� {
	public static void main(String[] args){
		String zhangsan="Hello World!";
		String lisi="Hello World!";
		String wangwu="Hello world!";
		String zhaoliu="hello world!";
		
		//equals():�Ƚ������ַ����������Ƿ���ȣ�����ֵ��Boolean����ֵ��
		//equalsIgnoreCase():���Դ�Сд��equals����������
		//compareTo():���մʵ��˳����бȽϣ�����int����ֵ�����ӵ�һλ��ʼ�Ƚϣ����������ͬ���ַ��������Ϸ����������ַ���asciiֵ��ֵ������ֵ��
		//                 int���͡�
		
		if(zhangsan.equals(lisi)){
			System.out.println("���������ĵ���ͬ��");
		}else{
			System.out.println("���������ĵĲ�һ����");
		}
		if(zhangsan.equalsIgnoreCase(zhaoliu)){
			System.out.println("��������������ͬ��");
		}else{
			System.out.println("�����������Ĳ�һ����");
		}
		if((wangwu.compareTo(zhaoliu))>0){
			System.out.println("�������������ͬ��");
		}else{
			System.out.println("����������Ĳ�һ����");
		}
	}

}
