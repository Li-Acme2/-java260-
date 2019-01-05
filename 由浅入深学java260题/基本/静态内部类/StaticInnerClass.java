package 静态内部类;

public class StaticInnerClass {//一般内部类会隐性持有一个指向外部类的引用，由此就可以直接访问外部类的一些成员，
	                            //不想其拥有此特性，就需要将内部类设置为静态属性。
	public static void main(String[] args){
		Painter p=new Painter();
		p.print();
		p.setName("晨光");
	}

}
class Painter{
	private Pen pen=new Pen();
	private String name="111";
	static class Pen{
		//private String lead="铅笔芯";
		public void print(){
			System.out.println("使用铅笔。。。");
		}
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public Pen getPen(){
		return pen;
	}
	public void setPen(Pen pen){
		this.pen=pen;
	}
	public void print(){
		pen.print();
	}
}
