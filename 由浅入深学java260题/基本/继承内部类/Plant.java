package 继承内部类;

public class Plant {
	public String shape="椭圆形";                    //叶子的形状
	private static String color="白色";              //花的颜色
	private String grow="黑土地";                    //生长环境
	@SuppressWarnings("static-access")
	public static void main(String[] args){
		Fruit f=new Fruit();                      //创建Fruit类
		f.print();                                //调用Fruit类的print方法
		new Apple().main(args);                   //调用Apple类的main方法
	}
	static class Fruit{
		String taste;                        //味道
		boolean iron;                        //是否有核
		Fruit(){                             //给变量赋初值
			this.taste="酸";
			this.iron=true;
		}
		public void print(){//调用外部类的变量
			System.out.println("叶子的形状："+new Plant().shape);
			System.out.println("花的颜色："+color);
			System.out.println("生长环境："+new Plant().grow);
		}
	}

}
