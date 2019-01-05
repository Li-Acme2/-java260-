package 多行文本域;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewTextArea {
	@SuppressWarnings("static-access")
	public static void main(String[] args){
		Frame f=new Frame("多行文本域实例");          //创建一个新的窗口
		Label lb=new Label("请输入文本，可换行");      //创建一个新的标签
		lb.setBackground(Color.PINK);
		lb.setAlignment(lb.LEFT);                    //设置标签的位置Alignment：调整.
		f.setLayout(new GridLayout(2,3));           //设置网格布局
		TextArea ta=new TextArea();                 //创建一个新的多行文本域
		ta.setBackground(Color.BLUE);
		Button b=new Button("关闭");                //创建一个新的按钮
		b.setBackground(Color.RED);
		
		b.addActionListener(new ActionListener(){  //动作侦听器
			public void actionPerformed(ActionEvent e){//动作执行
				System.exit(1);
			}
		});
		
	
		f.add(lb);
		f.add(ta);
		f.add(b);
		f.setSize(300, 200);
		f.setVisible(true);
	}

}
