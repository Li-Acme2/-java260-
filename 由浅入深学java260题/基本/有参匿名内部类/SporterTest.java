package 有参匿名内部类;

public class SporterTest {//如果匿名类继承或实现的接口，只有带参数的构造方法，没有无参数构造方法，则用如下形式创建。
	                      //父类名 对象名=new 父类名（参数列）
	                      //{具体实现代码；
						  //}
	public void drink(Beverages drink){
		System.out.println("运动员在饮用"+drink);
	}
	public static void main(String[] args){
		SporterTest sp=new SporterTest();
		Beverages be=new Beverages(){
			public String toString(){
				return "添加维他命C";
		}
		};
	System.out.println(be.toString());
	    //Beverages be=new Beverages("橙汁");	    
		sp.drink(new Beverages("橙汁"){
			
		});
		sp.drink(new Beverages("可乐"){
			/*public void addVataminc(){
				System.out.println("添加二氧化碳");
			}*/
		});
		sp.drink(new Beverages("雪碧"){
			/*public void addVataminc(){
				System.out.println("添加二氧化碳");
			}*/
		});
		sp.drink(new Beverages("芬达"){
		/*public void addVataminc(){
			System.out.println("添加色素");
		}*/
		});
		sp.drink(new Beverages("绿茶"){
			/*public void addVataminc(){
				System.out.println("添加色素");
			}*/
		});

	}

}
class Beverages{
	private String juicename;
	public Beverages(String name){
		this.juicename=name;
	}
	public Beverages() {
		// TODO Auto-generated constructor stub
	}
	public String toString(){
		return juicename;
	}
	
}
