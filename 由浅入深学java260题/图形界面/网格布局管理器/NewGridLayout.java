package 网格布局管理器;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewGridLayout {
	public static void main(String[] args){
		Frame f=new Frame("这是一个网格布局实例");//创建一个新的窗口
		f.setLayout(new GridLayout(3,3));    //设置网格布局
		for(int i=0;i<8;i++){     //在网格布局中添加按钮，并设置按钮的名称
			f.add(new Button("按钮"+i));
		}
		Button b=new Button("按钮8");   //创建网格最后一个按钮
		b.setBackground(Color.RED);
		b.addActionListener(new ActionListener(){  //添加一个动作侦听器
			public void actionPerformed(ActionEvent e){  //动作执行方法
				System.exit(1);
			}
		});
		
		f.add(b);
		f.setSize(300, 200);
		f.setVisible(true);
	}

}
