package 序列和反序列测试;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Product implements Serializable {
	private String name;
	private String price;
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getPrice(){
		return price;
	}
	public void SetPrice(String price){
		this.price=price;
	}

}
