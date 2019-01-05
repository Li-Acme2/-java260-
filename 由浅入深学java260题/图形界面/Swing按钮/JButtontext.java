package Swing按钮;

import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtontext {
	@SuppressWarnings("deprecation")
	public static void main(String[] args){
		JFrame f=new JFrame("按钮测试");
		Container contentpane=f.getContentPane();
		JButton b=new JButton("按钮");     //创建一个带初始文本的按钮
		//如果没有设置文字的位置，系统的默认值会将文字置于图形的右边中间的位置。
		//设置文本相对于图标的水平方向的位置。
		b.setHorizontalTextPosition(JButton.CENTER);
		//设置文本相对于图标的垂直方向的位置。
		b.setVerticalTextPosition(JButton.BOTTOM);
		contentpane.add(b);
		f.pack();
		f.show();
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		f.setSize(300, 200);
	}

}
