package �̵߳Ĵ����ͺϲ�;

public class Lunch implements Runnable{
	public void run(){
		for(int i=0;i<3;i++){
			System.out.println("���ڳ��緹");
			try{
				Thread.sleep(3000);
			}catch(InterruptedException e){
				System.out.println("");
			}
		}
	}

}
