package 顺序布局管理器;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class NewFlowLayout extends Frame{
	//定义按钮组件
	Button b1=new Button("按钮1");
	Button b2=new Button("按钮2");
	Button b3=new Button("按钮3");
	Button b4=new Button("按钮4");
	Button b=new Button("关闭");
	NewFlowLayout(){
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(1);
			}
		});
		b.setBackground(Color.RED);
		//设置窗口名称
		this.setTitle("FlowLayout布局管理器");
		//设置布局管理器为FlowLayout
		this.setLayout(new FlowLayout());
		//添加按钮
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(b4);
		this.add(b);
		//设置窗口大小及显示位置
		this.setBounds(100, 100, 250, 250);
		this.setVisible(true);
	}
	public static void main(String[] args){
		new NewFlowLayout();
		
	}

}
