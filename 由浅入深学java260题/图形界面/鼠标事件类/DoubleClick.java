package 鼠标事件类;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class DoubleClick {
	public static void main(String[] args){
		JFrame jf=new JFrame();
		Container c=jf.getContentPane();
		
		JPanel jp=new JPanel();
		jp.setLayout(new BorderLayout());
		
		final JTextArea jt=new JTextArea();
		jp.add(new JScrollPane(jt),BorderLayout.CENTER);//将jt添加到滚动面板中
		jt.addMouseListener(new MouseAdapter(){//对鼠标进行监听，双击，换背景为蓝色；三击，换背景为白色。
			public void mouseClicked(MouseEvent e){
				int a=e.getClickCount();  //将鼠标点击次数记录，赋值给a。
				if(a==2){
					jt.setBackground(Color.BLUE);
				}
				if(a==3){
					jt.setBackground(Color.WHITE);
				}
			}
		});
		
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
