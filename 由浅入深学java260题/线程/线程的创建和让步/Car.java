package �̵߳Ĵ������ò�;

public class Car implements Runnable{
	private boolean stoped=false;
	private String license;
	public Car(){
		
	}
	public Car(String lic){
		this.license=lic;
	}
	public void run(){
		for(int i=0;i<20&&!stoped;i++){
			System.out.println((license==null ? "����������":license)+"������ʻ��.....");
			if(i==11){
				System.out.println((license==null?"����������":license)+"��������...");
				if(null==license){
					System.out.println("����������������");
					stoped=true;
				}else{
					Thread.yield();
				}
			}
		}
	}
	public static void main(String[] args){
		Thread t1=new Thread(new Car("123"));
		Thread t2=new Thread(new Car());
		Thread t3=new Thread(new Car("456"));
		t1.start();
		t2.start();
		t3.start();
	}

}
