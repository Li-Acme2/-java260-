package 实例化;

//编写一个Product类，然后利用反射进行实例化，并且描述此类声明了多少属性和方法
public class Product {
	private String name;
	private String price;
	public Product(){}
	public Product(String name,String price){
		this.name=name;
		this.price=price;
		
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getPrice(){
		return price;
	}
	public void setPrice(String price){
		this.price=price;
	}
	@SuppressWarnings("unused")
	private int cost(){
		return Integer.parseInt(price)/2;
	}

}
