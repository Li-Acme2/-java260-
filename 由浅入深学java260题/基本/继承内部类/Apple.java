package 继承内部类;

public class Apple extends Plant.Fruit {
	Apple(String taste){                       //自定义带参构造方法
		this.taste=taste;                      //重新给taste赋值
	}
	Apple(){
		super();                           //调用父类的构造方法
	}
	public static void main(String[] args){
		Apple apple=new Apple();                 //创建Apple对象
		//调用父类的变量
		System.out.println("苹果的味道："+apple.taste);
		System.out.print("苹果是否有核：");//+apple.iron
		if(apple.iron==true){
			System.out.print("有");
		}else{
			System.out.print("没有");
		}
	}

}
