package ��ѡ��;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public  class SelsctCourse  {
	public static void main(String[] args){
		JFrame f=new JFrame("ѡ��");            //����һ��JFrameʵ������
		Container contentPane=f.getContentPane();    //����һ������
		contentPane.setLayout(new GridLayout(2,1));  //���ô��ڵĲ���
		JPanel p1=new JPanel();                     //����һ��������
		p1.setLayout(new GridLayout(1,3));
		p1.setBorder(BorderFactory.createTitledBorder("ѡ�����ſγ�"));
		f.setLayout(new GridLayout(2,1));
		Checkbox cb1=new Checkbox("��ѧ");
		Checkbox cb2=new Checkbox("����");
		Checkbox cb3=new Checkbox("Ӣ��");
		Checkbox cb4=new Checkbox("����");
		//JRadioButton jb=new JradioButton();      //��ѡ��ť
		p1.add(cb1);
		p1.add(cb2);
		p1.add(cb3);
		p1.add(cb4);
		contentPane.add(p1);
		Button b=new Button("�ύ");
		f.add(b);
		f.setSize(300, 200);
		f.addWindowListener(new WindowAdapter(){   //�Դ����ϰ�ť�����������
			public void windowClosing(WindowEvent e){      //����ִ��
				System.exit(0);
			}
		});
		f.setVisible(true);
	}

	

}
