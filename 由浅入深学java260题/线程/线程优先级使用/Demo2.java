package 线程优先级使用;

class MyRunnable1 implements Runnable{   //实现Runnable接口

	@Override
	public void run() {             //线程运行的时候打印出加号
		// TODO Auto-generated method stub
		for(int i=0;i<200;i++)               //每个线程打印200个
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
		MyRunnable1 m1=new MyRunnable1();         //创建俩个实现了Runnable接口的类的对象
		MyRunnable2 m2=new MyRunnable2();
		Thread t1=new Thread(m1);                    //创建俩个线程
		Thread t2=new Thread(m2);
		System.out.println("线程t1的优先级为：");     //取得俩个线程的优先级
		System.out.println(t1.getPriority());
		System.out.println("线程t2的优先级为：");
		System.out.println(t2.getPriority());
		t1.setPriority(Thread.MAX_PRIORITY);              //给t1最高优先级
		t2.setPriority(Thread.MIN_PRIORITY);
		System.out.println("修改后线程t1的优先级为：");
		System.out.println(t1.getPriority());
		System.out.println("修改后线程t2的优先级为：");
		System.out.println(t2.getPriority()); 
		t1.start();              //启动线程
		t2.start(); 
	}

}
