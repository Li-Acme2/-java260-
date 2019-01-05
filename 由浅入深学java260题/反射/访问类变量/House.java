package 访问类变量;
//通过java的反射机制，可以轻松的获得类变量的所有信息，并且可以修改变量的值。如果这些属性是protected和private
// 的，则必须设置setAccessible（true）方法，否则会抛出IllegalAccessException异常，
//如果启用java安全机制，则可能会抛出SecurityException异常



public class House {
	public String owner;
	protected int space;
	@SuppressWarnings("unused")
	private int price;
	public String address;
	@SuppressWarnings("unused")
	private static String name;
	public House(){}
	public House(String owner,int space,int price,String address,String n){
		this.owner=owner;
		this.space=space;
		this.price=price;
		this.address=address;
		name=n;
	}
	}
