package 改变字体;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class FontSize {
	public static void main(String[] args){
		JFrame jf=new JFrame();                 //新建一个窗口对象
		Container c=jf.getContentPane();        //定义一个容器
		c.setLayout(new BorderLayout());
		
		JPanel p=new JPanel();
		p.setLayout(new BorderLayout());
		
		JPanel p1=new JPanel();
		p1.setLayout(new GridLayout(4,1));
		//定义几个单选按钮
		JRadioButton r9=new JRadioButton("9号");
		JRadioButton r12=new JRadioButton("12号");
		JRadioButton r18=new JRadioButton("18号");
		JRadioButton r22=new JRadioButton("22号");
		p1.add(r9);
		p1.add(r12);
		p1.add(r18);
		p1.add(r22);
		ButtonGroup bg=new ButtonGroup();//单选按钮和按钮组配合使用
		bg.add(r9);
		bg.add(r12);
		bg.add(r18);
		bg.add(r22);
		
		p.add(p1,BorderLayout.NORTH);
		
		final JTextField tf=new JTextField();
		p.add(new JScrollPane(tf), BorderLayout.CENTER);//滚动面板
		//JScrollPane(Component view):建立一个新的JScrollOpane对象，当组件内容大于显示区域时会自动产生滚动轴。
		r9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tf.setFont(new Font("TimeRoman",Font.PLAIN,9));//第一个参数是字体，第二个参数是字体样式，第三个参数是字体大小。
				//第一个可以是“宋体”。第二个可以，BOLD：粗体样式常量；ITALIC：斜体样式常量；
			}
		});
		r12.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tf.setFont(new Font("宋体",Font.PLAIN,12));
			}
		});
		r18.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tf.setFont(new Font("TimeRoman",Font.PLAIN,18));
			}
		});
		r22.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tf.setFont(new Font("TimeRamon",Font.PLAIN,22));
			}
		});
		
		c.add(p);
		jf.setSize(300, 100);
		jf.setVisible(true);
		jf.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}

}









