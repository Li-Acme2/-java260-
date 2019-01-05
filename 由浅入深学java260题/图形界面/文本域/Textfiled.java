package 文本域;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Textfiled {
	public static void main(String[] args){
		Frame f=new Frame("这是一个文本");//创建一个新的窗口
		f.setLayout(new GridLayout(2,3,100,50));//创建一个网格布局
		/*1.GridLayout（）：创建一个默认值的网格布局，即每个组件占据一行
		 2.GridLayout（int rows，int cols）：创建具有指定行数和列数的网格布局。Rows为行数，cols为列数
		 3.GridLayout（int rows，int cols，int hgap，int vgap）：创建具有指定行数、列数以及组件水平、纵向一定间距的网格布局。
		 */
		Label lb=new Label("请输入文本:");//创建一个新的标签
		lb.setAlignment(Label.RIGHT);           //对标签位置的调整
		Button b=new Button();//创建一个新的按钮
		b.setBackground(Color.RED);
		b.setLabel("这是一个关闭按钮");
		b.addActionListener(new ActionListener(){   //动作侦听器
			public void actionPerformed(ActionEvent e){//动作执行performed 执行；履行。
				System.exit(1);
			}
		});
		TextField tf=new TextField();    //创建一个新的文本域
		tf.setBackground(Color.blue);
		
	
		f.add(lb);
		f.add(tf);
		f.add(b);
		f.setSize(300, 200);
		f.setVisible(true);
	}

}
