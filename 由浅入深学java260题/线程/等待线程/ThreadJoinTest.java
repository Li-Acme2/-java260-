package �ȴ��߳�;

public class ThreadJoinTest {
	public static void main(String[] args){
		FirstTest1 one=new FirstTest1();              //��������1
		SecondTest2 two=new SecondTest2();
		ThirdTest3 thr=new ThirdTest3();
		one.start();                              //�����߳�
		two.start();
		thr.start();
	}

}
class FirstTest1 extends Thread{                  //������һ���߳�
	public void run(){                                //ʵ��run����
		try{                                  //�Զ����ɷ������
			for(int i=0;i<10;){                     //ѭ����ӡ����
				i++;
				System.out.println("��һ���߳�  ��"+i+"��ѭ��");          //��ӡ���
				Thread.sleep(1000);                          //���1���ӡһ��
				}	
			}catch(Exception e){
				System.out.println("�쳣");                //��ӡ����쳣
			}finally{
		}
	}
}

class SecondTest2 extends Thread{          //�����ڶ����߳�
	public FirstTest1 first;
	public void run(){
		
			for(int i=0;i<10;){	
				try{
				i++;
				System.out.println("�ڶ����߳�   ��"+i+"��ѭ��");
				Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("�쳣");
		}
		if(i==4){
			try{
				first.join();                  //�����߳�FirstTest1
			}catch(InterruptedException e){
				e.printStackTrace();                      //TODO�Զ�����catch��
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
				System.out.println("�������߳�  ��"+i+"��ѭ��");
				Thread.sleep(1000);
			}
		}catch(Exception e){
			System.out.println("�쳣");
		}
	}
}








