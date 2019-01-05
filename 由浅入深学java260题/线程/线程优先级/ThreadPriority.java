package 线程优先级;

import java.util.ArrayList;
import java.util.List;

class Student{
	public String name;
	public int age;
	public int score;
	public int height;
	public  Student(String name,int age,int score,int height){  //构造函数为各成员变量
		this.name=name;
		this.age=age;
		this.score=score;
		this.height=height;
	}
}

class Height implements Runnable{                                  //线程实现接口runnable
	Thread thread;                                                   //声明一个线程
	Height(){}                                                    //默认构造方法
	 Height(String name){                                          //构造方法初始一个线程
		 thread=new Thread(this,name);
	 }
	 public void run(){
		 System.out.println("一年一班的成员名单："+thread.getName());
	 }
	 @SuppressWarnings("rawtypes")
	public void RowSeat(List list){                            //按优先级执行线程
		 Student st=(Student)list.get(0);
		 Student st1=(Student)list.get(1);
		 Student st2=(Student)list.get(2);
		 Student st3=(Student)list.get(3);
		 Student st4=(Student)list.get(4);
		 Height o1=new Height(st.name);                               //创建线程对象并命名
		 Height o2=new Height(st1.name);
		 Height o3=new Height(st2.name);
		 Height o4=new Height(st3.name);
		 Height o5=new Height(st4.name);
		 o1.thread.setPriority(Thread.NORM_PRIORITY-1);   //中间次之
		 o2.thread.setPriority(Thread.MAX_PRIORITY);    //最大
		 o3.thread.setPriority(Thread.MIN_PRIORITY);   //最小
		 o4.thread.setPriority(Thread.NORM_PRIORITY);  //中间
		 o5.thread.setPriority(Thread.MAX_PRIORITY-1);   //最大次之
		 o1.thread.start();            //启动线程
		 o2.thread.start();
		 o3.thread.start();
		 o4.thread.start();
		 o5.thread.start();
		 try{
			 o5.thread.join();               //等待线程运行结束
		 }catch(InterruptedException e){            //捕获拦截异常
			System.out.println("等待线程结束出错："+e.getMessage());
		 }
	 }  
}
class Score extends Thread{
	Thread thread;
	public Score(){}
	public Score(String name){
		thread=new Thread(this,name);
	}
	public void run(){
		System.out.println("一年一班的成员："+thread.getName());
	}
	@SuppressWarnings("rawtypes")
	public void RowSeat(List list){
		 Student st=(Student)list.get(0);
		 Student st1=(Student)list.get(1);
		 Student st2=(Student)list.get(2);
		 Student st3=(Student)list.get(3);
		 Student st4=(Student)list.get(4);
		 Score e1=new Score(st.name);
		 Score e2=new Score(st1.name);
		 Score e3=new Score(st2.name);
		 Score e4=new Score(st3.name);
		 Score e5=new Score(st4.name);
		 e1.thread.setPriority(st.score/10);
		 e2.thread.setPriority(st1.score/10);
		 e3.thread.setPriority(st2.score/10);
		 e4.thread.setPriority(st3.score/10);
		 e5.thread.setPriority(st4.score/10);
		 e1.thread.start();
		 e2.thread.start();
		 e3.thread.start();
		 e4.thread.start();
		 e5.thread.start();
		 try{
			 e5.thread.join();
		 }catch(InterruptedException e){
			System.out.println("等待线程结束出错："+e.getMessage());
		 }
}
}
public class ThreadPriority {
	@SuppressWarnings("unchecked")
	public static void main(String[] args){
	    @SuppressWarnings("rawtypes")
		List list=new ArrayList();              //创建一个list对象
		Student st1=new Student("张三",5,98,130);               //创建student对象
		list.add(st1);                                       //将student对象添加到list
		Student st2=new Student("李四",3,95,150);
		list.add(st2);
		Student st3=new Student("王五",4,100,120);
		list.add(st3);
		Student st4=new Student("赵六",6,91,140);
		list.add(st4);
		Student st5=new Student("钱七",7,93,150);
		list.add(st5);
		System.out.println("按成绩分数的高低排座：");
		new Score().RowSeat(list);
		System.out.println("按个子高低排座：");
		new Height().RowSeat(list);
	}

}

