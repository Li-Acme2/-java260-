package ���񲼾ֹ�������չ;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewGridBagLayout {
	public static void main(String[] args){
		Frame f=new Frame("�������񲼾ֹ�������չ����");//����һ���µĴ���
		f.setLayout(new GridBagLayout());     	//���ò��ֹ�����
		Button b=new Button("�ر�");
		b.setBackground(Color.RED);
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(1);
			}
		});
		GridBagConstraints gbc=new GridBagConstraints();
		//���ú���������������꣬�����밴ť��
		gbc.gridx=0;
		gbc.gridy=0;
		f.add(new Button("��ť1"),gbc);
		gbc.gridx=1;
		gbc.gridy=0;
		f.add(new Button("��ť2"),gbc);
		gbc.gridx=0;
		gbc.gridy=1;
		f.add(new Button("��ť3"),gbc);
		gbc.gridx=1;
		gbc.gridy=1;
		f.add(new Button("��ť4"),gbc);
		gbc.gridx=9;
		gbc.gridy=9;
		f.add(b,gbc);
		
		
		f.setSize(300,200);
		f.setVisible(true);
	}

}
