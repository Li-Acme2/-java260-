package 继承;

public class Son extends Father implements StepFather{
	private String ss;//儿子的名字
	public void sets(String ss){
		this.ss=ss;
	}
	public String gets(){
		return ss;
	}
	public void hitChild(){//接口方法的实现
		System.out.println("这是继父。");
	}
}
