package �̵߳����ȼ�;

public class Police implements Runnable{
	private String name;
	public  Police(String name){
		this.name=name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(name+"����ִ������");
	}
	public static void main(String[] args){
		Thread p1=new Thread(new Police("317������"));
		Thread p2=new Thread(new Police("����47ʦ"));
		Thread p3=new Thread(new Police("Ⱥ��С�ֶ�"));
		p1.setPriority(2);
		p2.setPriority(10);
		p3.setPriority(8);
		p1.start();
		p2.start();
		p3.start();
	}

}
