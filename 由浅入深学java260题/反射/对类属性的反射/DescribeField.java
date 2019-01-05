package 对类属性的反射;

//反射Product类的属性
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import 实例化.Product;

public class DescribeField {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args){
		Product p=new Product();
		Class c=p.getClass();
		Field[] fs=c.getDeclaredFields();   //返回制定参数类型的所有属性，包括public和非public
		System.out.println("Product类有如下属性：");
		System.out.println("--------------");
		for (Field f: fs){
			System.out.println(Modifier.toString(f.getModifiers())+" "+f.getType().getName()+" "+f.getName());
		}
		
	}

}
