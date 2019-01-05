package 引用外部类对象;

public class OutObjectTest {
	public static void main(String[] args){
		Sun s=new Sun();
		Sun.H2 h=s.getH2();
		h.burn();
		h.Temp();
		System.out.println(s.getTemperature());
		
	}

}
class Sun{//如果需要在内部类中引用外部类的this指针，需要使用“方法名.this”的格式。eg print().this;
	private int temperature=3600;
	private String type="star";
	private H2 fuel=null;
	class H2{
		private String name="氢气";
		public String toString(){
			return name;
		}
		public void burn(){
			System.out.println(H2.this.toString()+"正在燃烧"+this.name);
		}
		public void Temp(){
			System.out.println("1");
		}
	}
	public String toString(){
		return "太阳";
	}
	public H2 getFuel(){
		return fuel;
	}
	public void setFuel(H2 fuel){
		this.fuel=fuel;
	}
	public int getTemperature(){
		return temperature;
	}
	public void setTemperature(int temperature){
		this.temperature=temperature;
	}
	public String getType(){
		return type;
	}
	public void setType(String type){
		this.type=type;
	}
	public H2 getH2(){
		if(fuel==null){
			fuel=new H2();
		}
		return fuel;
	}
}
