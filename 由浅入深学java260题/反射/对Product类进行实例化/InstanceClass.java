package 对Product类进行实例化;

//明确反射的实例化机制

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import 实例化.Product;

public class InstanceClass {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args)throws ClassNotFoundException,NoSuchMethodException, InvocationTargetException,
	IllegalAccessException,InstantiationException{
		Class c=Class.forName("实例化.Product");         //返回与给定的字符串名称相关联类和接口的Class对象
		Constructor c1=c.getDeclaredConstructor();    //返回制定参数类型的所有构造器，包括public和非public的
		Product p1=(Product)c1.newInstance();        //为类c1创建一个实例
		System.out.println("调用p1的getClass（）方法："+p1.getClass());
		System.out.println("调用p1的getName（）方法："+p1.getName());
		System.out.println("调用p1的getPrice（）方法："+p1.getPrice());
		System.out.println("---------------------");
		
		Constructor c2=c.getDeclaredConstructor(String.class,String.class);
		Product p2=(Product)c2.newInstance("特步时尚板鞋","200");
		System.out.println("调用p2的getClass（）方法："+p2.getClass());
		System.out.println("调用p2的getName（）方法："+p2.getName());
		System.out.println("调用p2的getPrice（）方法："+p2.getPrice());
		
		
	}

}
