package �̵߳Ĵ�����˯��;

public class Guard implements Runnable{
    public void run(){
		for(int i=0;i<20;i++){
			System.out.println("��鰲ȫ");
		try{
			Thread.sleep(5000);
		}catch(InterruptedException e){
			System.out.println();
		}
	}
	}
	public static void main(String[] args){
		Thread thread=new Thread(new Guard());
		thread.start();
	}
}
