package �̵߳Ĵ����ͺϲ�;

public class Student implements Runnable{
	public Thread lunch=new Thread(new Lunch());
	public void run(){
		for(int i=0;i<20;i++){
			System.out.println("��������ϰ"+i);
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			System.out.println();
		}
		if(i==10){
			lunch.start();
			try{
				lunch.join();
			}catch(InterruptedException e){
				System.out.println("-----");
			}
		}
	}
	}
}
