package ����1;
/*��дһ��Worker�࣬ʹ��˫���Ͳ������ֱ��ʾ�������Է���нˮ*/
public class Worker<T,S> {
	private T first;
	private S second;
	public Worker(T first,S second){
		this.first=first;
		this.second=second;
	}
	public static void main(String[] args){
		Worker<String,String> w1=new Worker<String,String>("iron","water"); //iron:��
		Worker<String,Integer> w2=new Worker<String,Integer>("food",30);
		Worker<Integer,String> w3=new Worker<Integer,String>(10000,"doller");
		System.out.println("worker1�Ĺ���ԭ���ǣ�"+w1.first+"��"+w1.second);
		System.out.println("worker2���緹"+w2.first+"����"+w2.second);
		System.out.println("worker3�Ĺ�����"+w3.first+w3.second);
	}

}
