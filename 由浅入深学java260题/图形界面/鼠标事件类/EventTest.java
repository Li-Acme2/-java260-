package ����¼���;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventTest extends WindowAdapter implements ActionListener {
	JButton b1=null;
	JButton b2=null;
	@SuppressWarnings("deprecation")
	public EventTest(){                          //���췽��
		JFrame jf=new JFrame();                 //����һ�����
		Container c=jf.getContentPane();          //����һ������
		c.setLayout(new GridLayout(1,2));
		b1=new JButton("�رմ���");
		b2=new JButton("�򿪴���");
		c.add(b1);
		c.add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		jf.pack();                           //�����ڵ������ʺϴ�С
		jf.show();
		jf.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1){                      //����getSource���������ж��Ǹ���ť������
			Toolkit.getDefaultToolkit().beep();
		}
		if(e.getSource()==b2){
			JFrame newjf=new JFrame("�´���");
			newjf.setSize(200, 200);
			newjf.setVisible(true);
		}
		
	}
public static void main(String[] args){
		new EventTest();
	}

}
