package ��Product�����ʵ����;

//��ȷ�����ʵ��������

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import ʵ����.Product;

public class InstanceClass {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args)throws ClassNotFoundException,NoSuchMethodException, InvocationTargetException,
	IllegalAccessException,InstantiationException{
		Class c=Class.forName("ʵ����.Product");         //������������ַ��������������ͽӿڵ�Class����
		Constructor c1=c.getDeclaredConstructor();    //�����ƶ��������͵����й�����������public�ͷ�public��
		Product p1=(Product)c1.newInstance();        //Ϊ��c1����һ��ʵ��
		System.out.println("����p1��getClass����������"+p1.getClass());
		System.out.println("����p1��getName����������"+p1.getName());
		System.out.println("����p1��getPrice����������"+p1.getPrice());
		System.out.println("---------------------");
		
		Constructor c2=c.getDeclaredConstructor(String.class,String.class);
		Product p2=(Product)c2.newInstance("�ز�ʱ�а�Ь","200");
		System.out.println("����p2��getClass����������"+p2.getClass());
		System.out.println("����p2��getName����������"+p2.getName());
		System.out.println("����p2��getPrice����������"+p2.getPrice());
		
		
	}

}
