package �����¼�;

import java.awt.Container;
import java.awt.Label;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class WindowEventDemo {
	public static void main(String[] args){
		JFrame jf=new JFrame("�����¼�");
		Container c=jf.getContentPane();
		c.add(new Label("print window event"));
		jf.addWindowListener(new WindowListener(){
			public void windowOpened(WindowEvent e){
				System.out.println("�򿪴���");
			}
			public void windowClosing(WindowEvent e){
				System.out.println("���ڹرմ���");
			}
			@Override
			public void windowClosed(WindowEvent e) {
				System.out.println("�رմ���");
				
			}
			@Override
			public void windowIconified(WindowEvent e) {
				System.out.println("��С������");
				
			}
			@Override
			public void windowDeiconified(WindowEvent e) {
				System.out.println("�ָ�����");
				
			}
			@Override
			public void windowActivated(WindowEvent e) {
				System.out.println("�����");
				
			}
			@Override
			public void windowDeactivated(WindowEvent e) {
				System.out.println("δ�����");
				
			}
			
		});
		jf.setSize(300, 200);
		jf.setVisible(true);
	}

}
