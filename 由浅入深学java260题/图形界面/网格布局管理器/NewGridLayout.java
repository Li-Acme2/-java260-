package ���񲼾ֹ�����;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewGridLayout {
	public static void main(String[] args){
		Frame f=new Frame("����һ�����񲼾�ʵ��");//����һ���µĴ���
		f.setLayout(new GridLayout(3,3));    //�������񲼾�
		for(int i=0;i<8;i++){     //�����񲼾�����Ӱ�ť�������ð�ť������
			f.add(new Button("��ť"+i));
		}
		Button b=new Button("��ť8");   //�����������һ����ť
		b.setBackground(Color.RED);
		b.addActionListener(new ActionListener(){  //���һ������������
			public void actionPerformed(ActionEvent e){  //����ִ�з���
				System.exit(1);
			}
		});
		
		f.add(b);
		f.setSize(300, 200);
		f.setVisible(true);
	}

}
