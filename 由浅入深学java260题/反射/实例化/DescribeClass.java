package ʵ����;

public class DescribeClass {
	@SuppressWarnings({ "rawtypes" })
	public static void main(String[] args)throws ClassNotFoundException,IllegalAccessException,InstantiationException{
		Class c=Class.forName("ʵ����.Product");
		//Product p=(Product)c.newInstance();
		System.out.println(c.getName()+"��"+c.getDeclaredFields().length+"������");
		System.out.println(c.getName()+"��"+c.getDeclaredMethods().length+"������");
	}

}
