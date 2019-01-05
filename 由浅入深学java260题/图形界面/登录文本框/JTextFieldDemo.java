package 登录文本框;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JTextFieldDemo {
	public static void main(String[] args){
		JFrame jf=new JFrame("登录文本框");                 //创建一个窗口
		Container contentPane=jf.getContentPane();          //返回窗体容器
		jf.setContentPane(contentPane);                    //设置窗体容器布局
		JPanel p1=new JPanel();                         //创建面板容器
		p1.setLayout(new GridLayout(3,2));                    //设置面板布局
		p1.setBorder(BorderFactory.createTitledBorder("请输入你的登录信息"));
		// 设置边界布局
		JLabel l1=new JLabel("用户名：",JLabel.CENTER);
		JLabel l2=new JLabel("密码：",JLabel.CENTER);
		JTextField tf1=new JTextField(10);
		JPasswordField tf2=new JPasswordField(10);
		//将组件添加到面板
		p1.add(l1);
		p1.add(tf1);
		p1.add(l2);
		p1.add(tf2);
		contentPane.add(p1);
		jf.addWindowListener(new WindowAdapter(){            //窗口侦听器
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		jf.setSize(300, 120);
		jf.setVisible(true);
		}

}
