package �̳߳�;

import java.util.LinkedList;

public class SurgeryThreadPool {                    
	private static Runnable createTask(final int taskID){       //�������񷽷�
		return new Runnable(){
			public void run(){                                 //������������
			System.out.println("������ʼ�����Ϊ��"+taskID);
			System.out.println("����������~~~");
			System.out.println("�������������Ϊ��"+taskID);
			}
		};
	}
public static void main(String[] args){               //java��������ڴ�
		ThreadTask threadPool=new ThreadTask(3);          //���������������̵߳�һ���̳߳�
		try{                                     
			Thread.sleep(600);                    //����600ms�����̳߳��е�����ȫ��ִ�����
		}catch(InterruptedException e){               //���������쳣
			System.out.println("�߳����߳���"+e.getMessage());
		}
		for(int i=0;i<3;i++){                           //ѭ��������ִ������
			threadPool.addTask(createTask(i));
		}
		threadPool.waitTaskClosed();          //�ȴ���������ִ�����
		threadPool.closePool();                //�ر��̳߳�
	}
}
	class ThreadTask extends ThreadGroup{          //�̳��߳���ʵ���̳߳ع���
		private boolean isStop=false;         //�̳߳��Ƿ�ر�
		@SuppressWarnings("rawtypes")
		private LinkedList queue;             //�����������
		private static final int poolID=1;       //�̳߳صı��
		private class SurgeryTask extends Thread{       //����ӹ���������ȡ������ִ�е��ڲ���
			private int id;                          //������
			public SurgeryTask(int id){             //���췽�����г�ʼ��
				super(ThreadTask.this,id+"");    //���̼߳��뵱ǰ�߳�����
				this.id=id;
			}
			public void run(){
				while(!isInterrupted()){          //�ж��߳��Ƿ񱻴��
					Runnable task=null;
					task=getTask(id);               //ȡ������
					if(task==null)         //���getTask��������Ϊnull�����߳�ִ��getTask����ʱ���жϣ���������߳�
						return;
					try{
						task.run();              //��������
					}catch(Throwable t){
						t.printStackTrace();
					}
				}
			}
		}
		@SuppressWarnings("rawtypes")
		public ThreadTask(int size){           //���췽�������̳߳��еĹ����̵߳�����
			super(poolID+"");              //ָ���߳�������
			setDaemon(true);             //�̳��߳���ķ������������Ƿ��ػ��̳߳�
			queue=new LinkedList();             //���������������
			for(int i=0;i<size;i++){                   //ѭ�����������߳�
				new SurgeryTask(i).start();            //�����̳߳����ݴ��������̲߳������߳�
			}
		}
		@SuppressWarnings("unchecked")
		public synchronized void addTask(Runnable task){            //���������ִ��
			if(isStop){                                           //�жϱ�ʶ
				throw new IllegalStateException();              //�׳��������״̬�쳣
			}
			if(task!=null){
				queue.add(task);                      //����������м���һ������
				notify();                           //���ѵȴ�����Ĺ��������߳�
			}
		}
		private synchronized Runnable getTask(int id){         //ȡ������
			try{
				while(queue.size()==0){       //ѭ��ʹ�̵߳ȴ�����
					if(isStop)
						return null;
					System.out.println("����"+id+"���ڵȴ�����....");
					wait();                               //������������û�����񣬾͵ȴ�����
				}
			}catch(InterruptedException e){                  //���������쳣
				System.out.println("�ȴ����Ƴ��ִ���"+e.getMessage());
			}
			System.out.println("����"+id+"��ʼִ������....");
			return(Runnable) queue.removeFirst();             //���ص�һ�����񲢴Ӷ���ɾ��
		}
		public synchronized void closePool(){            //�ر��̳߳�
			if(!isStop){                                 //�жϱ�ʶ
				waitTaskClosed();               //�ȴ������߳�ִ�����
				isStop=true;                            //��ʶΪ��
				queue.clear();                        //����������
				interrupt();                         //�����̳߳������еĹ����߳�
			}
		}
		public void waitTaskClosed(){       //�ȴ������̰߳����е�����ִ�����
			synchronized(this){
				isStop=true;                  //��ʶΪ��
				notify();                         //���ѵȴ�����Ĺ��������߳�
			}
			Thread[] threads=new Thread[activeCount()];  //�����߳����л���߳���
			int count=enumerate(threads);                      //����߳����е�ǰ���еĻ�Ĺ����߳�
			for(int i=0;i<count;i++){             //ѭ���ȴ����еĹ����߳̽���
				try{
					threads[i].join();                   //�ȴ������߳̽���
				}catch(InterruptedException e){          //���������쳣
					System.out.println("����ʧ��:"+e.getMessage());
				}
			}
		}
	}
/*SurygerThreadPool���е�createTask()��������������ִ��ָ�������������main������������ʵ��������ThreadTask����
 * Thread�������sleep��������ʹ�߳�����0.6�룬����ѭ��ִ�д��������񣬵���waitTaskClosed���������ȴ���������ִ�����֮��ر��̳߳�*/

