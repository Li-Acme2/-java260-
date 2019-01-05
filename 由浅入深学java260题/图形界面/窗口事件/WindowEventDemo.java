package 窗口事件;

import java.awt.Container;
import java.awt.Label;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class WindowEventDemo {
	public static void main(String[] args){
		JFrame jf=new JFrame("窗口事件");
		Container c=jf.getContentPane();
		c.add(new Label("print window event"));
		jf.addWindowListener(new WindowListener(){
			public void windowOpened(WindowEvent e){
				System.out.println("打开窗口");
			}
			public void windowClosing(WindowEvent e){
				System.out.println("正在关闭窗口");
			}
			@Override
			public void windowClosed(WindowEvent e) {
				System.out.println("关闭窗口");
				
			}
			@Override
			public void windowIconified(WindowEvent e) {
				System.out.println("最小化窗口");
				
			}
			@Override
			public void windowDeiconified(WindowEvent e) {
				System.out.println("恢复窗口");
				
			}
			@Override
			public void windowActivated(WindowEvent e) {
				System.out.println("激活窗口");
				
			}
			@Override
			public void windowDeactivated(WindowEvent e) {
				System.out.println("未激活窗口");
				
			}
			
		});
		jf.setSize(300, 200);
		jf.setVisible(true);
	}

}
