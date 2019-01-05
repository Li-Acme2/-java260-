package 列表;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewList {
	@SuppressWarnings("static-access")
	public static void main(String[] args){
		Frame f=new Frame("这是一个列表测试");//创建一个新的窗口
		f.setLayout(new GridLayout(2,2));//设置网格布局
		Label l=new Label("请选择右边的年份");//创建一个新的标签
		l.setAlignment(l.CENTER);//设置标签的位置    Alignment：调整
		l.setBackground(Color.BLUE);
		Button b=new Button("关闭");  //创建一个新的按钮
		b.setBackground(Color.RED);
		b.addActionListener(new ActionListener(){  //创建一个动作侦听器
			public void actionPerformed(ActionEvent e){ //动作执行方法
				System.exit(1);
			}
		});
		List lt=new List(2,true);   //创建一个可以多选的列表
		lt.add("2017年9月");
		lt.add("2017年10月");
		lt.add("2017年11月");
		lt.add("2017年12月");
		
		
		f.add(l);
		f.add(lt);
		f.add(b);
		f.setSize(300, 200);
		f.setVisible(true);
		
	}

}
