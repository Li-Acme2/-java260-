package �߳����ȼ�ʹ��;

class MyRunnable1 implements Runnable{   //ʵ��Runnable�ӿ�

	@Override
	public void run() {             //�߳����е�ʱ���ӡ���Ӻ�
		// TODO Auto-generated method stub
		for(int i=0;i<200;i++)               //ÿ���̴߳�ӡ200��
			System.out.println("+");
		}
	}
class MyRunnable2 implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i=0;i<200;i++){
				System.out.println("*");
			}
		}
		
	}
public class Demo2 {
	public static void main(String[] args){
		MyRunnable1 m1=new MyRunnable1();         //��������ʵ����Runnable�ӿڵ���Ķ���
		MyRunnable2 m2=new MyRunnable2();
		Thread t1=new Thread(m1);                    //���������߳�
		Thread t2=new Thread(m2);
		System.out.println("�߳�t1�����ȼ�Ϊ��");     //ȡ�������̵߳����ȼ�
		System.out.println(t1.getPriority());
		System.out.println("�߳�t2�����ȼ�Ϊ��");
		System.out.println(t2.getPriority());
		t1.setPriority(Thread.MAX_PRIORITY);              //��t1������ȼ�
		t2.setPriority(Thread.MIN_PRIORITY);
		System.out.println("�޸ĺ��߳�t1�����ȼ�Ϊ��");
		System.out.println(t1.getPriority());
		System.out.println("�޸ĺ��߳�t2�����ȼ�Ϊ��");
		System.out.println(t2.getPriority()); 
		t1.start();              //�����߳�
		t2.start(); 
	}

}
