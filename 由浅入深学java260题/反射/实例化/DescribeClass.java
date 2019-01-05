package 实例化;

public class DescribeClass {
	@SuppressWarnings({ "rawtypes" })
	public static void main(String[] args)throws ClassNotFoundException,IllegalAccessException,InstantiationException{
		Class c=Class.forName("实例化.Product");
		//Product p=(Product)c.newInstance();
		System.out.println(c.getName()+"有"+c.getDeclaredFields().length+"个属性");
		System.out.println(c.getName()+"有"+c.getDeclaredMethods().length+"个方法");
	}

}
