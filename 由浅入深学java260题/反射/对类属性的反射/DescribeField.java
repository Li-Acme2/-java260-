package �������Եķ���;

//����Product�������
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import ʵ����.Product;

public class DescribeField {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args){
		Product p=new Product();
		Class c=p.getClass();
		Field[] fs=c.getDeclaredFields();   //�����ƶ��������͵��������ԣ�����public�ͷ�public
		System.out.println("Product�����������ԣ�");
		System.out.println("--------------");
		for (Field f: fs){
			System.out.println(Modifier.toString(f.getModifiers())+" "+f.getType().getName()+" "+f.getName());
		}
		
	}

}
