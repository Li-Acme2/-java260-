package 泛型1;
/*编写一个Worker类，使用双类型参数，分别表示工作，吃饭和薪水*/
public class Worker<T,S> {
	private T first;
	private S second;
	public Worker(T first,S second){
		this.first=first;
		this.second=second;
	}
	public static void main(String[] args){
		Worker<String,String> w1=new Worker<String,String>("iron","water"); //iron:铁
		Worker<String,Integer> w2=new Worker<String,Integer>("food",30);
		Worker<Integer,String> w3=new Worker<Integer,String>(10000,"doller");
		System.out.println("worker1的工作原料是："+w1.first+"和"+w1.second);
		System.out.println("worker2的午饭"+w2.first+"花了"+w2.second);
		System.out.println("worker3的工资是"+w3.first+w3.second);
	}

}
