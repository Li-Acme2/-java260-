package ���;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class PanelTest {
	public static void main(String[] args){
		Frame f=new Frame("�½�Panel");//���ڱ���
		Panel p1=new Panel();
		p1.setBackground(Color.RED);//������ɫ
		
		Panel p2=new Panel();
		p2.setBackground(Color.BLUE);
		
		Panel p3=new Panel();
		p3.setBackground(Color.YELLOW);
		
		f.add(p1,BorderLayout.NORTH);
		f.add(p2,BorderLayout.CENTER);
		f.add(p3,BorderLayout.SOUTH);
		f.setSize(300,200);
		f.setVisible(true);
	}

}
