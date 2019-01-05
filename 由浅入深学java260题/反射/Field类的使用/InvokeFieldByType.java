package Field类的使用;

import java.lang.reflect.Field;

import Class类及Field类的使用.Person;

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
				System.out.println(f.getName()+"的值："+f.get(p));
			}
			if(t==int.class){
				System.out.println(f.getName()+"的值："+f.getInt(p));
			}
			if(t==long.class){
				System.out.println(f.getName()+"的值："+f.getLong(p));
			}
			if(t==boolean.class){
				System.out.println(f.getName()+"的值："+f.getBoolean(p));
			}
		}
		System.out.println("\n为各个属性赋值：");
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
			System.out.println(f.getName()+"的值："+f.get(p));
		}
	}

}
