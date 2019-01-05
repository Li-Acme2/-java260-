package 无参匿名内部类;

public class AnonymousInnerTset {
	public static void main(String[] args){
		DustMan dm=new DustMan();
		dm.cleanWithRoom();
		dm.cleanWithDustCollector();
	}

}
class DustMan{
	public void cleanWithRoom(){
		Utility util=new Utility(){
			public void clean(){
				System.out.println("正在清洁卫生。。。。");
			}
		};
		util.clean();
	}
	public void cleanWithDustCollector(){
		ElectronicUtil util=new ElectronicUtil(){
			public void clean (){
				System.out.println("正在使用吸尘器清洁卫生。。。");
			}
		};
		util.clean();
	}
}
interface Utility{
	public void clean();
}
class ElectronicUtil{
	public void clean(){
		System.out.println("使用电子设备清洁卫生。。。。");
	}
}