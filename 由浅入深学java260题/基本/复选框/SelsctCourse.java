package 复选框;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public  class SelsctCourse  {
	public static void main(String[] args){
		JFrame f=new JFrame("选课");            //创建一个JFrame实例对象
		Container contentPane=f.getContentPane();    //定义一个容器
		contentPane.setLayout(new GridLayout(2,1));  //设置窗口的布局
		JPanel p1=new JPanel();                     //创建一个面板对象
		p1.setLayout(new GridLayout(1,3));
		p1.setBorder(BorderFactory.createTitledBorder("选择哪门课程"));
		f.setLayout(new GridLayout(2,1));
		Checkbox cb1=new Checkbox("数学");
		Checkbox cb2=new Checkbox("语文");
		Checkbox cb3=new Checkbox("英语");
		Checkbox cb4=new Checkbox("政治");
		//JRadioButton jb=new JradioButton();      //单选按钮
		p1.add(cb1);
		p1.add(cb2);
		p1.add(cb3);
		p1.add(cb4);
		contentPane.add(p1);
		Button b=new Button("提交");
		f.add(b);
		f.setSize(300, 200);
		f.addWindowListener(new WindowAdapter(){   //对窗口上按钮的添加侦听器
			public void windowClosing(WindowEvent e){      //动作执行
				System.exit(0);
			}
		});
		f.setVisible(true);
	}

	

}
