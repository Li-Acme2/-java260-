package �߳����ȼ�;

import java.util.ArrayList;
import java.util.List;

class Student{
	public String name;
	public int age;
	public int score;
	public int height;
	public  Student(String name,int age,int score,int height){  //���캯��Ϊ����Ա����
		this.name=name;
		this.age=age;
		this.score=score;
		this.height=height;
	}
}

class Height implements Runnable{                                  //�߳�ʵ�ֽӿ�runnable
	Thread thread;                                                   //����һ���߳�
	Height(){}                                                    //Ĭ�Ϲ��췽��
	 Height(String name){                                          //���췽����ʼһ���߳�
		 thread=new Thread(this,name);
	 }
	 public void run(){
		 System.out.println("һ��һ��ĳ�Ա������"+thread.getName());
	 }
	 @SuppressWarnings("rawtypes")
	public void RowSeat(List list){                            //�����ȼ�ִ���߳�
		 Student st=(Student)list.get(0);
		 Student st1=(Student)list.get(1);
		 Student st2=(Student)list.get(2);
		 Student st3=(Student)list.get(3);
		 Student st4=(Student)list.get(4);
		 Height o1=new Height(st.name);                               //�����̶߳�������
		 Height o2=new Height(st1.name);
		 Height o3=new Height(st2.name);
		 Height o4=new Height(st3.name);
		 Height o5=new Height(st4.name);
		 o1.thread.setPriority(Thread.NORM_PRIORITY-1);   //�м��֮
		 o2.thread.setPriority(Thread.MAX_PRIORITY);    //���
		 o3.thread.setPriority(Thread.MIN_PRIORITY);   //��С
		 o4.thread.setPriority(Thread.NORM_PRIORITY);  //�м�
		 o5.thread.setPriority(Thread.MAX_PRIORITY-1);   //����֮
		 o1.thread.start();            //�����߳�
		 o2.thread.start();
		 o3.thread.start();
		 o4.thread.start();
		 o5.thread.start();
		 try{
			 o5.thread.join();               //�ȴ��߳����н���
		 }catch(InterruptedException e){            //���������쳣
			System.out.println("�ȴ��߳̽�������"+e.getMessage());
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
		System.out.println("һ��һ��ĳ�Ա��"+thread.getName());
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
			System.out.println("�ȴ��߳̽�������"+e.getMessage());
		 }
}
}
public class ThreadPriority {
	@SuppressWarnings("unchecked")
	public static void main(String[] args){
	    @SuppressWarnings("rawtypes")
		List list=new ArrayList();              //����һ��list����
		Student st1=new Student("����",5,98,130);               //����student����
		list.add(st1);                                       //��student������ӵ�list
		Student st2=new Student("����",3,95,150);
		list.add(st2);
		Student st3=new Student("����",4,100,120);
		list.add(st3);
		Student st4=new Student("����",6,91,140);
		list.add(st4);
		Student st5=new Student("Ǯ��",7,93,150);
		list.add(st5);
		System.out.println("���ɼ������ĸߵ�������");
		new Score().RowSeat(list);
		System.out.println("�����Ӹߵ�������");
		new Height().RowSeat(list);
	}

}

