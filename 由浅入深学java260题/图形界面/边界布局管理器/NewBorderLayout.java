package �߽粼�ֹ�����;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class NewBorderLayout extends Frame {
	Button b1=new Button("��");
	Button b2=new Button("��");
	Button b3=new Button("��");
	Button b4=new Button("��");
	Button b5=new Button("��");
	
	  NewBorderLayout(){//�߽粼�ֹ�������
		
		this.setTitle("�߽粼�ֹ�����ʵ��");//���ô�������������
		this.setLayout(new BorderLayout());  //���ò���
	b5.setBackground(Color.RED);
    //��Ӱ�ť����������
	this.add(b1,BorderLayout.EAST);
	this.add(b2,BorderLayout.WEST);
	this.add(b3,BorderLayout.SOUTH);
	this.add(b4,BorderLayout.NORTH);
	this.add(b5,BorderLayout.CENTER);
	b5.addActionListener(new ActionListener(){//��Ӷ���������
			public void actionPerformed(ActionEvent e){//����ִ��
				System.exit(1);
			}
		});
	
	this.setBounds(100, 100, 250, 250);
	this.setVisible(true);
	}
	public static void main(String[] args){
		new NewBorderLayout();
	}

}
