package ��ͨ�̴߳�ӡ;

//Printer������ģ���ӡ���������Ի����Ϣ����ӡ����
public class SynchDemo {
	//��ӡ����
	public static void main(String[] args){
		Printer p=new Printer();     //����һ����ӡ������
		Teacher t1=new Teacher(p,"lancy",87,76,90);   //����������ʦʵ��
		Teacher t2=new Teacher(p,"macula",97,86,70);
		Teacher t3=new Teacher(p,"herbert",67,86,97);
		t1.t.start();
		t2.t.start();                  //������ӡ����
		t3.t.start();
	}

}
class Printer{
	/*1��synchronized���Ϻ�ʵ��ͬ��������һһ��ӡ*/
	void PrintScore(String name,int score1,int score2,int score3){
		System.out.println(name+"�ĳɼ���");
		System.out.println(name+"Ӣ�");
		System.out.println(score1);
		//Ϊ��ʹ�������н�����ԣ��ڴ�ӡ�Ĺ������ô�ӡ��������һ��ʱ��
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}System.out.println(name+"��ѧ��");
		System.out.println(score2);
		System.out.println(name+"���ģ�");
		System.out.println(score3);
	}
	
}
class Teacher implements Runnable{  //��ʦ�࣬ÿ����ʦ�����Լ����̲߳���ʹ��ͬһ����ӡ��
	Printer p=null;                          //��ӡ��
	String name=null;                      //����
	Thread t;                                //�߳�
	int score1=0;                         //����
	int score2=0;
	int score3=0;
	Teacher(Printer printer,String nm,int s1,int s2,int s3){       //��ʦ��Ĺ��캯��
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
		/*2��synchronized(p){         //����p�������䵥�̲߳�����ʵ��ͬ����
		p.PrintScore(name, score1, score2, score3);
	}*/
		p.PrintScore(name, score1, score2, score3);
	}
}
/*���������Print����һ����ӡ���࣬����һ��printscore���������԰ѽ��յ�����Ϣ��ӡ������Ϊ��ʹ��ӡ������ԣ������ڴ�ӡ��������һ��ʱ���ֹͣ��Teacher
 * �ǽ�ʦ�࣬ʵ����Runnable�ӿڣ�����һ�������߳̿�����ʱ���д�ӡ�������������ṩ��ӡ��Ϣ������SynchDemo�У�����һ����ӡ��ʵ������������ʦ�ṩ��
 * ��ӡ���󣬴�ӡ������Ȼ�ύ��ʱ�䲻ͬ�����ǻ���ǰ���ӡ���֮ǰ�����ύ�����Կ�������ӡ����һ�����İ�����ִ�����ȥִ����������������޷���������*/


