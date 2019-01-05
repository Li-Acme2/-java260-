package 焦点事件;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ChangeColorWhenFocus {
	public static void main(String[] args){
		JFrame jf=new JFrame("Change Color");
		Container c=jf.getContentPane();
		c.setLayout(new BorderLayout());
		JPanel jp=new JPanel();
		
		JTextField tf1=new JTextField(10);
		JTextField tf2=new JTextField(10);
		JTextField tf3=new JTextField(10);
		
		FocusListener fl=new FocusListener(){
			public void focusGained(FocusEvent e){    //获得焦点时执行
				((JTextField)e.getSource()).setBackground(Color.RED);
				((JTextField)e.getSource()).repaint();
			}
			@Override
			public void focusLost(FocusEvent e) {   //失去焦点时执行
				((JTextField)e.getSource()).setBackground(Color.WHITE);
				((JTextField)e.getSource()).repaint();
			}
		};
		tf1.addFocusListener(fl);     //对文本框添加焦点监听器
		tf2.addFocusListener(fl);
		tf3.addFocusListener(fl);
		
		jp.add(tf1);
		jp.add(tf2);
		jp.add(tf3);
		
		c.add(jp);
		jf.setSize(300, 200);
		jf.setVisible(true);
		jf.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}

}
