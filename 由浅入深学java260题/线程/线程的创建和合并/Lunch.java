package 线程的创建和合并;

public class Lunch implements Runnable{
	public void run(){
		for(int i=0;i<3;i++){
			System.out.println("正在吃午饭");
			try{
				Thread.sleep(3000);
			}catch(InterruptedException e){
				System.out.println("");
			}
		}
	}

}
