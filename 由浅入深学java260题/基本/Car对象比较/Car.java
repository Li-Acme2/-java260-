package Car对象比较;

public class Car {
	public String color;
	public String number;
	public String brand;//品牌
	
	public Car(String color,String number,String brand){
		this.color=color;
		this.number=number;
		this.brand=brand;
	}
	public void run(){
		System.out.println("Running...");
	}
	public boolean equals(Object o){
		if(null==o){
			return false;
		}
		Car c=(Car)o;
		return this.color.equalsIgnoreCase(c.color)&&this.number.equalsIgnoreCase(c.number)&&this.brand.equalsIgnoreCase(c.brand);
	}
	public static void main(String[] args){
		Car car=new Car("white","#66666","BMW");
		Car c1=new Car("white","#12345","BMW");
		Car c2=new Car("","","");
		Car c3=new Car("White","#66666","BMW");
		car.run();
		System.out.println(car.color+" "+car.number+" "+car.brand);
		System.out.println("car和c1是否为同一辆车："+car.equals(c1));
		System.out.println("car和c2是否为同一辆车："+car.equals(c2));
		System.out.println("car和c3是否为同一辆车："+car.equals(c3));
	}

}
