package Class类及Field类的使用;

import java.lang.reflect.Field;

public class InvokeField {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args)throws IllegalAccessException{
		Person p=new Person();
		Class c=p.getClass();
		Field[] fs=c.getDeclaredFields();           //取出所有成员变量
		for(Field f:fs){
			f.setAccessible(true);
			System.out.println(f.getName()+"的值"+f.get(p));
		}
		System.out.println("\n为各个属性赋值后：");
		for(Field f:fs){
			f.setAccessible(true);
			String n=f.getName();
			if(n.equalsIgnoreCase("name")){
				f.set(p, "Jake");
			}
			if(n.equalsIgnoreCase("gender")){
				f.set(p, "Male");
			}
			if(n.equalsIgnoreCase("age")){
				f.set(p, 30);
			}
		}
		for(Field f: fs){
			f.setAccessible(true);
			System.out.println(f.getName()+"的值："+f.get(p));
		}
	}

}
