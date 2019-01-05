package 线程同步实现打印;


class Source{
	synchronized void method1(){          //定义同步方法method1
		System.out.println("进入方法method1，获得锁");
	try{
		Thread.sleep(1000);                      //线程休眠
	}catch(InterruptedException e){
		e.printStackTrace();
	}
	System.out.println("method1执行完毕，释放锁");
	}
	synchronized void method2(){
	System.out.println("进入方法method2，获得锁");
	try{
		Thread.sleep(1000);
	}catch(InterruptedException e){
		e.printStackTrace();
	}
	System.out.println("method2执行完毕，释放锁");
	}
}
class MyThread implements Runnable{          //定义线程类
	String name;                               //通过name来判断调用那个方法
	Source s=null;
	MyThread(Source s,String nm){                       //构造方法
		this.s=s;
		name=nm;
	}
	public void run(){
		if("method1".equals(name)){
			s.method1();                         //调用同步方法1
		}else{
			System.out.println("Thread2启动，准备调用method2");
			s.method2();
		}
	}
}
public class SynchMethodTest {
	public static void main(String[] args){
		Source s=new Source();                              //创建一个资源对象
		MyThread mt1=new MyThread(s,"method1");
		MyThread mt2=new MyThread(s,"method2");
		Thread t1=new Thread(mt1);
		Thread t2=new Thread(mt2);
		t1.start();
		t2.start();
	}

}
/*程序首先在类Source中定义了俩个同步方法。在线程类MyThread启动的时候，根据传递给他的参数name判断调用那个方法。
 * 在程序SynchMethodhDemo中定义了俩个线程，他们会调用不同的方法，启动俩个线程。
 * 由于俩方法都是同步方法，在线程Thread1调用方法method1时，即使线程Thread2调用method2也不能执行，而必须等待method1执行完毕之后
 * 才能获得锁，从而执行同步方法method2*/
