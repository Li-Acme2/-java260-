package 对类方法的反射2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import 实例化.Product;

public class DescribeConstructor {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args){
		Product p=new Product();
		Class c=p.getClass();
		Constructor[] cs=c.getDeclaredConstructors();  //返回制定参数类型的所有构造器，包括public和非public
		System.out.println("Product类的构造函数如下：");
		System.out.println("-----------------------");
		StringBuffer sb=new StringBuffer();
		for(Constructor ct:cs){
			sb.setLength(0);
			sb.append(Modifier.toString(ct.getModifiers())).append(" ").append(ct.getName()).append(" ");
			 //getModifiers（）：返回int类型值表示该字段的修饰符
			Class [] ps=ct.getParameterTypes();
			for(int i=0;i<ps.length;i++){
				sb.append(ps[i]);
				if(i<ps.length-1){
					sb.append(",");
				}
			}
		System.out.println(sb);
		}
			
	}

}
