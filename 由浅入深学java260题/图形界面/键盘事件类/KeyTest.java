package 键盘事件类;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class KeyTest extends KeyAdapter implements ActionListener {
	JFrame jf=null;         //声明一个窗口对象
	JLabel jl=null;          //声明一个标签对象
	JTextField jt=null;      //声明一个文本框对象
	String key="";
	@SuppressWarnings("deprecation")
	public KeyTest(){
		jf=new JFrame("键盘监听实例");
		Container c=jf.getContentPane();
		c.setLayout(new GridLayout(3,1));
		jl=new JLabel("标签：");
		jl.setHorizontalAlignment(JLabel.CENTER);              //设置文本的水平对齐方式
		jt=new JTextField();
		jt.requestFocus();            //获得焦点
		jt.addKeyListener(this);          //添加键盘监听器
		JButton jb=new JButton("清除");
		//jb.setMnemonic('o');                   //为按钮设置快捷键o。
		jb.addActionListener(this);
		c.add(jl);
		c.add(jt);
		c.add(jb);
		jf.pack();
		jf.show();
		jf.setSize(300, 150);
		jf.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
	
	public void actionPerformed(ActionEvent e) {
		key="";
		jl.setText("");
		jt.setText("");
		jt.requestFocus();
		
	}
	@SuppressWarnings("deprecation")
	public void keyTyped(KeyEvent e){
		char c=e.getKeyChar();        //获取事件源上的字符
		if(c=='o'){                     //如果输入字母o，就会产生新的窗口。
			JFrame newf=new JFrame("这是输入o后弹出的新的窗口");
			newf.setSize(300, 200);
			newf.show();
		}
		key=key+c;
		jl.setText(key);           //将文本框的内容显示在标签栏
	}
public static void main(String[] args){
		new KeyTest();
	}

}
