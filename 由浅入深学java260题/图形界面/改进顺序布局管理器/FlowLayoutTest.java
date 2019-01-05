package 改进顺序布局管理器;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class FlowLayoutTest extends Frame implements  ActionListener{
	Button b=new Button("添加");
	Button bg=new Button("关闭");
	int i;
	FlowLayoutTest(){
		bg.addActionListener(new ActionListener(){//添加动作侦听器
			public void actionPerformed(ActionEvent e){//动作执行
				System.exit(1);
			}
		});
		bg.setBackground(Color.RED);
		//设置窗口名称
		this.setTitle("FlowLayout布局管理器");
		this.setLayout(new FlowLayout());//设置布局管理器为FlowLayout
		this.add(b);   //添加按钮
		b.addActionListener(this);
		this.add(bg);
		this.setBounds(100, 100, 250, 250);
		this.setVisible(true);
	}
	
	
	public static void main(String[] args){
		new FlowLayoutTest();
	}
	
	@SuppressWarnings("deprecation")
	public void actionPerformed(ActionEvent e){//添加按钮
		i++;
		Button bi=new Button("按钮"+i);
		bi.setBackground(Color.BLUE);
		this.add(bi);
		this.show(true);
	}

}
