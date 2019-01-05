package 鼠标事件类;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventTest extends WindowAdapter implements ActionListener {
	JButton b1=null;
	JButton b2=null;
	@SuppressWarnings("deprecation")
	public EventTest(){                          //构造方法
		JFrame jf=new JFrame();                 //创建一个框架
		Container c=jf.getContentPane();          //创建一个容器
		c.setLayout(new GridLayout(1,2));
		b1=new JButton("关闭窗口");
		b2=new JButton("打开窗口");
		c.add(b1);
		c.add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		jf.pack();                           //将窗口调整到适合大小
		jf.show();
		jf.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1){                      //利用getSource（）方法判断那个按钮被按下
			Toolkit.getDefaultToolkit().beep();
		}
		if(e.getSource()==b2){
			JFrame newjf=new JFrame("新窗口");
			newjf.setSize(200, 200);
			newjf.setVisible(true);
		}
		
	}
public static void main(String[] args){
		new EventTest();
	}

}
