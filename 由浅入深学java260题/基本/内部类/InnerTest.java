package 内部类;

public class InnerTest {
	public static void main(String[] args){
		Outer out=new Outer();
		out.useIner();
	} 

}
class Outer{
	String out_string="String in Outer";//设置外部类的变量
	void useIner(){//设置外部类的方法
		Iner in=new Iner();//在外部类中对内部类的对象进行定义
		in.print();//调用内部类的对象
	}
	//建立内部类
	class Iner{
		void print(){
			System.out.println("Iner.print()");
			System.out.println("use\'"+out_string+"\'");
		}
	}
}
