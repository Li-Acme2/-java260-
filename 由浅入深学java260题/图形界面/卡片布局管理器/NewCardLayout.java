package ��Ƭ���ֹ�����;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewCardLayout {
	 	public static void main(String[] args){
		 final Frame f=new Frame("��Ƭ���ֹ�����ʵ��");//����һ���µĴ���
		 final CardLayout cl=new CardLayout();        //����һ���µĿ�Ƭ���ֹ�����
		f.setLayout(cl);              //�Դ���f���ÿ�Ƭ���ֹ���
		Button b1=new Button("��ť1");  //��Ӱ�ť
		Button b2=new Button("��ť2");
		Button b=new Button("�ر�");
		b.setBackground(Color.RED);		
		b.addActionListener(new ActionListener(){  //��Ӷ���������
			public void actionPerformed(ActionEvent e){ //����ִ��
				System.exit(1);
			}
});	
		b2.addActionListener(new ActionListener(){    //��Ӷ���������
			public void actionPerformed(ActionEvent e){//����ִ�У���ҳ
				cl.next(f);   //��f��cl���ó�final���ͣ��ſ������гɹ�������
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

	