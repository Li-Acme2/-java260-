package 线程的创建和合并;

public class Student implements Runnable{
	public Thread lunch=new Thread(new Lunch());
	public void run(){
		for(int i=0;i<20;i++){
			System.out.println("正在上自习"+i);
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
