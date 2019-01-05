package ������;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.ProgressMonitor;

public class ProgressBar {
	public static void main(String[] args){
		JFrame jf=new JFrame();               //�½�һ������
		Container c=jf.getContentPane();         //����һ������
		
		c.setLayout(new BorderLayout());
		final ProgressMonitor monitor=new ProgressMonitor(jf,"Monitoring the progress","",0,100);//monitor:������
		monitor.setProgress(0);
		JButton b=new JButton("Click to monitor the progress.");
		c.add(b);
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			ProgressTask task=new ProgressTask(monitor);//task���	
			task.start();
			}
		});
		jf.setSize(300, 200);
		jf.setVisible(true);
		jf.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
	static class ProgressTask implements Runnable{
		private boolean running;
		private Thread t;   //thread:�߳�.
		private ProgressMonitor monitor;
		private int value;
		
		public ProgressTask(ProgressMonitor monitor){
			this.monitor=monitor;
			running=false;
		}
		public void run() {            //����������
			while(running){
				try{
					Thread.sleep(200);
					if(monitor.isCanceled()){          //���ȡ�������������
						running=false;
					}
					monitor.setProgress(++value);
					monitor.setNote(value+"% complete");
					if(value>=100){                      //��valueֵ����100���������̡�
						running=false;
					}
				}
				catch(InterruptedException e){
					e.printStackTrace();
				}
			}
			
		}
		public void start(){
			if(!running){
				value=0;
				monitor.setProgress(value);
				running=true;
				t=new Thread(this);
				t.start();
			}
		}
		public void stop(){
			monitor.setProgress(0);
			t=null;
		}
	}

}
