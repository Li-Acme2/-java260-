package Field�༰Modifier���ʹ��;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import Class�༰Field���ʹ��.Person;

public class DescribePersonField {
	public static void main(String[] args){
		Person p=new Person();
		@SuppressWarnings("rawtypes")
		Class c=p.getClass();
		Field[] fs=c.getDeclaredFields();
		System.out.println("Person�����������ԣ�");
		System.out.println("----------------");
		for(Field f:fs){
			System.out.println(Modifier.toString(f.getModifiers())+" "+f.getType().getName()+" "+f.getName());
		}
	}

}
