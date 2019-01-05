package 普通线程打印;

//Printer类用来模拟打印机，它可以获得信息并打印出来
public class SynchDemo {
	//打印方法
	public static void main(String[] args){
		Printer p=new Printer();     //创建一个打印机对象
		Teacher t1=new Teacher(p,"lancy",87,76,90);   //创建三个教师实例
		Teacher t2=new Teacher(p,"macula",97,86,70);
		Teacher t3=new Teacher(p,"herbert",67,86,97);
		t1.t.start();
		t2.t.start();                  //启动打印工作
		t3.t.start();
	}

}
class Printer{
	/*1、synchronized加上后，实现同步方法，一一打印*/
	void PrintScore(String name,int score1,int score2,int score3){
		System.out.println(name+"的成绩：");
		System.out.println(name+"英语：");
		System.out.println(score1);
		//为了使程序运行结果明显，在打印的过程中让打印工作休眠一段时间
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}System.out.println(name+"数学：");
		System.out.println(score2);
		System.out.println(name+"语文：");
		System.out.println(score3);
	}
	
}
class Teacher implements Runnable{  //教师类，每个教师都有自己的线程并且使用同一个打印机
	Printer p=null;                          //打印机
	String name=null;                      //姓名
	Thread t;                                //线程
	int score1=0;                         //分数
	int score2=0;
	int score3=0;
	Teacher(Printer printer,String nm,int s1,int s2,int s3){       //教师类的构造函数
		p=printer;
		name=nm;
		t=new Thread(this);
		score1=s1;
		score2=s2;
		score3=s3;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		/*2、synchronized(p){         //锁定p对象，让其单线程操作，实现同步块
		p.PrintScore(name, score1, score2, score3);
	}*/
		p.PrintScore(name, score1, score2, score3);
	}
}
/*代码解析：Print类是一个打印机类，他有一个printscore方法，可以把接收到的信息打印出来，为了使打印结果明显，程序在打印过程中有一段时间的停止。Teacher
 * 是教师类，实现了Runnable接口，他是一个单独线程可以随时进行打印，并且由他来提供打印信息。在类SynchDemo中，创建一个打印机实例，有三个老师提供了
 * 打印请求，打印请求虽然提交的时间不同，但是会在前面打印完成之前进行提交。可以看到，打印不是一个个的把任务执行完后去执行其他任务，因此这无法满足需求*/


