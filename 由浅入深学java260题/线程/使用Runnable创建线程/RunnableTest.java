package ʹ��Runnable�����߳�;


class MyThread implements Runnable{
	public void run(){
		for(int i=0;i<10;i++){
			try{
				Thread.sleep(100);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println("��"+i+"MyThread");
		}
	}
}
public class RunnableTest {
	public static void main(String[] args){
		MyThread mt=new MyThread();
		Thread thr=new Thread(mt);
		thr.start();
		for(int i=0;i<10;i++){
			try{
				Thread.sleep(100);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println("��"+i+"RunnableTest");
		}
	}

}
