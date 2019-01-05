package ���߳�����;


class Resource{                     //��Դ��
	String resourceName;             //��Դ����
	Resource(String name){
		this.resourceName=name;
	}
}
class MyThread implements Runnable{           //ʵ��Runnable�ӿ�
	Resource rs1;
	Resource rs2;             //�߳���Ҫ����Դ
	String name;
	MyThread(Resource rs1,Resource rs2,String name){            //���췽��
		this.rs1=rs1;
		this.rs2=rs2;
		this.name=name;
	} 
	public void run(){     //run����������ͬ���飬ֻ����ͬʱռ������Դ����ʱ����ִ�����
		synchronized(rs1){
			System.out.println(this.name+"���"+rs1.resourceName);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(this.name+"�ȴ�"+rs2.resourceName+"�ͷ�");
			synchronized(rs2){                                         //����Դ2����ͬ������
				System.out.println(this.name+"���"+rs2.resourceName);
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
		Resource rs1=new Resource("��Դ1");         //������Դ����
		Resource rs2=new Resource("��Դ2");
		Resource rs3=new Resource("��Դ3");
		MyThread ms1=new MyThread(rs1,rs2,"�߳�1");   //����ʵ��Runnable�ӿڵĶ���
		MyThread ms2=new MyThread(rs2,rs3,"�߳�2");
		MyThread ms3=new MyThread(rs3,rs1,"�߳�3");
		Thread t1=new Thread(ms1);       //�����߳�
		Thread t2=new Thread(ms2);
		Thread t3=new Thread(ms3);
		t1.start();   //�����߳�
		t2.start();
		t3.start();
	}

}

/*������Resource���������Դ�࣬MyThread�Ǵ����̵߳��ࡣ�ڸ��߳�����Ҫ����Դ����������������򣬵��������г����ʱ��ms1ռ������Դ1��
 * ms2ռ������Դ2��ms3ռ������Դ3�����Ƕ��ڵȴ��Է��ͷ���Դ����˶�����ִ�С�*/
