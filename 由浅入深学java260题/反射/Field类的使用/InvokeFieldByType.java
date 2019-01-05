package Field���ʹ��;

import java.lang.reflect.Field;

import Class�༰Field���ʹ��.Person;

public class InvokeFieldByType {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args)throws IllegalAccessException{
		Person p=new Person();
		Class c=p.getClass();
		Field[] fs=c.getDeclaredFields();
		for(Field f:fs){
			f.setAccessible(true);
			Class t=f.getType();
			if(t==String.class){
				System.out.println(f.getName()+"��ֵ��"+f.get(p));
			}
			if(t==int.class){
				System.out.println(f.getName()+"��ֵ��"+f.getInt(p));
			}
			if(t==long.class){
				System.out.println(f.getName()+"��ֵ��"+f.getLong(p));
			}
			if(t==boolean.class){
				System.out.println(f.getName()+"��ֵ��"+f.getBoolean(p));
			}
		}
		System.out.println("\nΪ�������Ը�ֵ��");
		for(Field f:fs){
			f.setAccessible(true);
			String n=f.getName();
			if(n.equalsIgnoreCase("name")){
				f.set(p, "Jack");
			}
			if(n.equalsIgnoreCase("gender")){
				f.set(p, "Male");
			}
			if(n.equalsIgnoreCase("age")){
				f.setInt(p, 30);
			}
			if(n.equalsIgnoreCase("money")){
				f.setLong(p, 30000000);
			}
			if(n.equalsIgnoreCase("married")){
				f.setBoolean(p, false);
			}
		}
		for(Field f:fs){
			f.setAccessible(true);
			System.out.println(f.getName()+"��ֵ��"+f.get(p));
		}
	}

}
