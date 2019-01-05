package 使用Thread创建线程;


class MyThread extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			try{
				Thread.sleep(100);
			}catch(InterruptedException e){
				e.printStackTrace();
				}
			System.out.println("第"+i+"MyThread");
		}
	}
}
public class ThreadTest {
	public static void main(String[] args){
		MyThread mt=new MyThread();
		mt.start();
		for(int n=0;n<10;n++){
			try{
				Thread.sleep(100);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println("第"+n+"ThreadTest");
		}
	}

}
