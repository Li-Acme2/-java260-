package �߳�ͬ��ʵ�ִ�ӡ;


class Source{
	synchronized void method1(){          //����ͬ������method1
		System.out.println("���뷽��method1�������");
	try{
		Thread.sleep(1000);                      //�߳�����
	}catch(InterruptedException e){
		e.printStackTrace();
	}
	System.out.println("method1ִ����ϣ��ͷ���");
	}
	synchronized void method2(){
	System.out.println("���뷽��method2�������");
	try{
		Thread.sleep(1000);
	}catch(InterruptedException e){
		e.printStackTrace();
	}
	System.out.println("method2ִ����ϣ��ͷ���");
	}
}
class MyThread implements Runnable{          //�����߳���
	String name;                               //ͨ��name���жϵ����Ǹ�����
	Source s=null;
	MyThread(Source s,String nm){                       //���췽��
		this.s=s;
		name=nm;
	}
	public void run(){
		if("method1".equals(name)){
			s.method1();                         //����ͬ������1
		}else{
			System.out.println("Thread2������׼������method2");
			s.method2();
		}
	}
}
public class SynchMethodTest {
	public static void main(String[] args){
		Source s=new Source();                              //����һ����Դ����
		MyThread mt1=new MyThread(s,"method1");
		MyThread mt2=new MyThread(s,"method2");
		Thread t1=new Thread(mt1);
		Thread t2=new Thread(mt2);
		t1.start();
		t2.start();
	}

}
/*������������Source�ж���������ͬ�����������߳���MyThread������ʱ�򣬸��ݴ��ݸ����Ĳ���name�жϵ����Ǹ�������
 * �ڳ���SynchMethodhDemo�ж����������̣߳����ǻ���ò�ͬ�ķ��������������̡߳�
 * ��������������ͬ�����������߳�Thread1���÷���method1ʱ����ʹ�߳�Thread2����method2Ҳ����ִ�У�������ȴ�method1ִ�����֮��
 * ���ܻ�������Ӷ�ִ��ͬ������method2*/
