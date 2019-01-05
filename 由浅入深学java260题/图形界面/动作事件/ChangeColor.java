package 动作事件;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;

public class ChangeColor {
	public static void main(String[] args){
		JFrame jf=new JFrame();
		final Container c=jf.getContentPane();
		JMenuBar jm=new JMenuBar();                 //新建一个水平菜单栏
		JButton red=new JButton("red");
		JButton yellow=new JButton("yellow");
		JButton green=new JButton("green");
		
		jm.add(red);
		jm.add(green);
		jm.add(yellow);
		
		red.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				c.setBackground(Color.RED);
				c.repaint();         //这个函数很耗cpu，功能是刷新容器界面；对组件进行重绘。
			}
		});
		yellow.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				c.setBackground(Color.YELLOW);
				c.repaint();
			}
		});
		green.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				c.setBackground(Color.GREEN);
				c.repaint();
			}
		});
		jf.setJMenuBar(jm);
		jf.setSize(300, 200);
		jf.setVisible(true);
		jf.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}

}
