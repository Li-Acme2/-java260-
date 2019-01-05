package 多线程的同步;

public class Worker implements Runnable{
	private String name;
	private Canteen canteen;
	private String[] foods;
	public Worker(String name,Canteen canteen,String...foods){
		this.name=name;
		this.canteen=canteen;
		this.foods=foods;
	}
	public void run(){
		canteen.sell(name, foods);
	}
	public static void main(String[] args){
		Canteen c=new Canteen();
		Thread w1=new Thread(new Worker("Jack",c,"potato","meat","rice"));
		Thread w2=new Thread(new Worker("Mike",c,"eggplant","egg","bread"));
		Thread w3=new Thread(new Worker("TIM",c,"cabbage","egg","rice"));
		w1.start();
		w2.start();
		w3.start();
	}

}
