package Class类及Field类的使用;

public class Person {
	public String name;
	@SuppressWarnings("unused")
	private String gender;
	protected int age;
	protected long money;
	@SuppressWarnings("unused")
	private boolean married;
	
	public  String speak(){
		return "speaking....";
	}
	protected String eat(){
		return "eating....";
	}
	public String eat(String food){
		return "eat"+food;
	}

}
