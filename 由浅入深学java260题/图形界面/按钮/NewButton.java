package ��ť;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewButton {
	public static void main(String[] args){
		Frame f=new Frame("Button");//Button�Ǵ��ڱ���
		Button b=new Button();
		b.setBackground(Color.RED);
		b.setLabel("����һ����ť�������ǹرմ���");//��ť����
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
