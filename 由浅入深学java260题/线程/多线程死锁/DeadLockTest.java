package 多线程死锁;


class Resource{                     //资源类
	String resourceName;             //资源名称
	Resource(String name){
		this.resourceName=name;
	}
}
class MyThread implements Runnable{           //实现Runnable接口
	Resource rs1;
	Resource rs2;             //线程需要的资源
	String name;
	MyThread(Resource rs1,Resource rs2,String name){            //构造方法
		this.rs1=rs1;
		this.rs2=rs2;
		this.name=name;
	} 
	public void run(){     //run方法有俩个同步块，只有他同时占有俩资源的锁时才能执行完毕
		synchronized(rs1){
			System.out.println(this.name+"获得"+rs1.resourceName);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(this.name+"等待"+rs2.resourceName+"释放");
			synchronized(rs2){                                         //对资源2进行同步锁定
				System.out.println(this.name+"获得"+rs2.resourceName);
				try{
					Thread.sleep(1000);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
		}
	}
}
public class DeadLockTest {
	public static void main(String[] args){
		Resource rs1=new Resource("资源1");         //创建资源对象
		Resource rs2=new Resource("资源2");
		Resource rs3=new Resource("资源3");
		MyThread ms1=new MyThread(rs1,rs2,"线程1");   //创建实现Runnable接口的对象
		MyThread ms2=new MyThread(rs2,rs3,"线程2");
		MyThread ms3=new MyThread(rs3,rs1,"线程3");
		Thread t1=new Thread(ms1);       //创建线程
		Thread t2=new Thread(ms2);
		Thread t3=new Thread(ms3);
		t1.start();   //启动线程
		t2.start();
		t3.start();
	}

}

/*程序中Resource类代表了资源类，MyThread是创建线程的类。在该线程中需要俩资源才能正常运行完程序，但是在运行程序的时候，ms1占有了资源1，
 * ms2占有了资源2，ms3占有了资源3，他们都在等待对方释放资源，因此都不能执行。*/
