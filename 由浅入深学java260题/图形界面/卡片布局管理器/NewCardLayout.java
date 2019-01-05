package 卡片布局管理器;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewCardLayout {
	 	public static void main(String[] args){
		 final Frame f=new Frame("卡片布局管理器实例");//创建一个新的窗口
		 final CardLayout cl=new CardLayout();        //创建一个新的卡片布局管理器
		f.setLayout(cl);              //对窗口f设置卡片布局管理
		Button b1=new Button("按钮1");  //添加按钮
		Button b2=new Button("按钮2");
		Button b=new Button("关闭");
		b.setBackground(Color.RED);		
		b.addActionListener(new ActionListener(){  //添加动作侦听器
			public void actionPerformed(ActionEvent e){ //动作执行
				System.exit(1);
			}
});	
		b2.addActionListener(new ActionListener(){    //添加动作侦听器
			public void actionPerformed(ActionEvent e){//动作执行：翻页
				cl.next(f);   //将f和cl设置成final类型，才可以运行成功次命令
			}
		});
		b1.addActionListener(new ActionListener(){   
			public void actionPerformed(ActionEvent e){
				cl.next(f);
			}
		});
		f.add(b1);
		f.add(b2);
		f.add(b);
		f.setBounds(100, 100,250,250);
		f.setVisible(true);
			
	}
}

	