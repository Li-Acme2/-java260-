package 访问类变量;

import java.lang.reflect.Field;

public class FieldTest {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args)throws IllegalAccessException{
		House house=new House("George",160,300,"Beijing","Happy House");
		Class c=house.getClass();
		Field[] fields=c.getDeclaredFields();     //取出所有成员变量
		System.out.println("共有成员变量："+fields.length);
		System.out.println("-------------");
		for(Field field:fields){
			field.setAccessible(true);         //设置此变量的可访问性为true
			Class t=field.getType();              //取得此变量的类型
			if(t==String.class){
				System.out.println(field.getName()+":"+field.get(house));
			}
			if(t==int.class){
				System.out.println(field.getName()+":"+field.getInt(house));  //取得int类型的值
			}
		}
		System.out.println("\n为变量设置新值");
		System.out.println("-----------------");
		for(Field field:fields){
			field.setAccessible(true);
			String n=field.getName();      //取得此变量的名称
			if(n.equalsIgnoreCase("owner")){
				field.set(house, "George Li");  //为此变量设置新值
			    }
				if(n.equalsIgnoreCase("space")){
					field.set(house, field.getInt(house)*2);
				}
				if(n.equalsIgnoreCase("price")){
					field.set(house, field.getInt(house)*2);
				}
				if(n.equalsIgnoreCase("address")){
					field.set(house, "Beijing Chine");
				}
				if(n.equalsIgnoreCase("name")){
					field.set(house, "Brillint House");
				}
			}
			for(Field field:fields){
				System.out.println(field.getName()+":"+field.get(house));
			}
		}
	}

