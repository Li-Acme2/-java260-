package Class�༰Method���ʹ��;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import Class�༰Field���ʹ��.Person;

public class InvokeMethod {
	public static void main(String[] args)throws InvocationTargetException,IllegalAccessException{
		Person p=new Person();
		@SuppressWarnings("rawtypes")
		Class c=p.getClass();
		Method[] ms=c.getDeclaredMethods();
		for(Method m:ms){
			m.setAccessible(true);
			if(m.getName().equalsIgnoreCase("eat")&&m.getParameterTypes().length==1){
				System.out.println(m.invoke(p, "noodles"));
			}else{
				System.out.println(m.invoke(p));
			}
		}
		
	}

}
