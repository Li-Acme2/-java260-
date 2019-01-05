package 等待线程;

public class ThreadJoinTest {
	public static void main(String[] args){
		FirstTest1 one=new FirstTest1();              //创建对象1
		SecondTest2 two=new SecondTest2();
		ThirdTest3 thr=new ThirdTest3();
		one.start();                              //开启线程
		two.start();
		thr.start();
	}

}
class FirstTest1 extends Thread{                  //创建第一个线程
	public void run(){                                //实现run方法
		try{                                  //自动生成方法存根
			for(int i=0;i<10;){                     //循环打印数字
				i++;
				System.out.println("第一个线程  第"+i+"次循环");          //打印输出
				Thread.sleep(1000);                          //间隔1秒打印一次
				}	
			}catch(Exception e){
				System.out.println("异常");                //打印输出异常
			}finally{
		}
	}
}

class SecondTest2 extends Thread{          //创建第二个线程
	public FirstTest1 first;
	public void run(){
		
			for(int i=0;i<10;){	
				try{
				i++;
				System.out.println("第二个线程   第"+i+"次循环");
				Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("异常");
		}
		if(i==4){
			try{
				first.join();                  //加入线程FirstTest1
			}catch(InterruptedException e){
				e.printStackTrace();                      //TODO自动生成catch块
			}
		}
	}
}
}
class ThirdTest3 extends Thread{
	public void run(){
		try{
			for(int i=0;i<10;){
				i++;
				System.out.println("第三个线程  第"+i+"次循环");
				Thread.sleep(1000);
			}
		}catch(Exception e){
			System.out.println("异常");
		}
	}
}








