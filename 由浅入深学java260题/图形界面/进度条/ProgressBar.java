package 进度条;

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
		JFrame jf=new JFrame();               //新建一个窗口
		Container c=jf.getContentPane();         //定义一个容器
		
		c.setLayout(new BorderLayout());
		final ProgressMonitor monitor=new ProgressMonitor(jf,"Monitoring the progress","",0,100);//monitor:监听器
		monitor.setProgress(0);
		JButton b=new JButton("Click to monitor the progress.");
		c.add(b);
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			ProgressTask task=new ProgressTask(monitor);//task：活动	
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
		private Thread t;   //thread:线程.
		private ProgressMonitor monitor;
		private int value;
		
		public ProgressTask(ProgressMonitor monitor){
			this.monitor=monitor;
			running=false;
		}
		public void run() {            //进度条运行
			while(running){
				try{
					Thread.sleep(200);
					if(monitor.isCanceled()){          //点击取消，则结束进程
						running=false;
					}
					monitor.setProgress(++value);
					monitor.setNote(value+"% complete");
					if(value>=100){                      //当value值到达100，结束进程。
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
