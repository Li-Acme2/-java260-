package ˳�򲼾ֹ�����;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class NewFlowLayout extends Frame{
	//���尴ť���
	Button b1=new Button("��ť1");
	Button b2=new Button("��ť2");
	Button b3=new Button("��ť3");
	Button b4=new Button("��ť4");
	Button b=new Button("�ر�");
	NewFlowLayout(){
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(1);
			}
		});
		b.setBackground(Color.RED);
		//���ô�������
		this.setTitle("FlowLayout���ֹ�����");
		//���ò��ֹ�����ΪFlowLayout
		this.setLayout(new FlowLayout());
		//��Ӱ�ť
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(b4);
		this.add(b);
		//���ô��ڴ�С����ʾλ��
		this.setBounds(100, 100, 250, 250);
		this.setVisible(true);
	}
	public static void main(String[] args){
		new NewFlowLayout();
		
	}

}
