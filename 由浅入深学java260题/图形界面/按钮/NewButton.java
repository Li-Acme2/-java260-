package 按钮;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewButton {
	public static void main(String[] args){
		Frame f=new Frame("Button");//Button是窗口标题
		Button b=new Button();
		b.setBackground(Color.RED);
		b.setLabel("这是一个按钮，功能是关闭窗口");//按钮名称
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(1);
			}
		});
		f.add(b);
		f.setSize(300,200);
		f.setVisible(true);
	}

}
