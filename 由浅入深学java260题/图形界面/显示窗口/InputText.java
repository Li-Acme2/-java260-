package 显示窗口;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class InputText {
	public static void main(String[] args){
		JFrame jf=new JFrame("显示");              //创建一个新的窗口
		Container c=jf.getContentPane();       //定义一个容器
		c.setLayout(new BorderLayout());        //设置容器的属性
		Box box1,box2,box3;
		Label l1,l2;
		l1=new Label("输出");
		l2=new Label("输入");
		final JTextField t1;
		final JTextField t2;
		t1=new JTextField();
		t2=new JTextField();
		JButton b=new JButton("提交");
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				t1.setText(t1.getText()+t2.getText());
				t2.setText(" ");
			}
		});
		
		box1=Box.createVerticalBox();
		box1.add(l1);
		box1.add(new JScrollPane(t1), BorderLayout.CENTER);
		
		box2=Box.createVerticalBox();
		box2.add(l2);
		box2.add(new JScrollPane(t2), BorderLayout.CENTER);
		box2.add(Box.createVerticalStrut(3));
		box2.add(b);
		
		box3=Box.createVerticalBox();
		box3.add(box1);
		box3.add(Box.createVerticalStrut(20));
		box3.add(box2);
		
		c.add(box3);
		jf.setSize(300, 200);
		jf.setVisible(true);
		jf.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}

}










