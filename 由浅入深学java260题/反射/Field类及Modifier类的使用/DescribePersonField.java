package Field类及Modifier类的使用;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import Class类及Field类的使用.Person;

public class DescribePersonField {
	public static void main(String[] args){
		Person p=new Person();
		@SuppressWarnings("rawtypes")
		Class c=p.getClass();
		Field[] fs=c.getDeclaredFields();
		System.out.println("Person类有如下属性：");
		System.out.println("----------------");
		for(Field f:fs){
			System.out.println(Modifier.toString(f.getModifiers())+" "+f.getType().getName()+" "+f.getName());
		}
	}

}
