package 边界布局管理器;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class NewBorderLayout extends Frame {
	Button b1=new Button("东");
	Button b2=new Button("西");
	Button b3=new Button("南");
	Button b4=new Button("北");
	Button b5=new Button("中");
	
	  NewBorderLayout(){//边界布局管理器类
		
		this.setTitle("边界布局管理器实例");//设置窗口容器的名称
		this.setLayout(new BorderLayout());  //设置布局
	b5.setBackground(Color.RED);
    //添加按钮并设置属性
	this.add(b1,BorderLayout.EAST);
	this.add(b2,BorderLayout.WEST);
	this.add(b3,BorderLayout.SOUTH);
	this.add(b4,BorderLayout.NORTH);
	this.add(b5,BorderLayout.CENTER);
	b5.addActionListener(new ActionListener(){//添加动作侦听器
			public void actionPerformed(ActionEvent e){//动作执行
				System.exit(1);
			}
		});
	
	this.setBounds(100, 100, 250, 250);
	this.setVisible(true);
	}
	public static void main(String[] args){
		new NewBorderLayout();
	}

}
