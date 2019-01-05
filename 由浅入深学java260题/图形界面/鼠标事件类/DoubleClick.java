package ����¼���;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class DoubleClick {
	public static void main(String[] args){
		JFrame jf=new JFrame();
		Container c=jf.getContentPane();
		
		JPanel jp=new JPanel();
		jp.setLayout(new BorderLayout());
		
		final JTextArea jt=new JTextArea();
		jp.add(new JScrollPane(jt),BorderLayout.CENTER);//��jt��ӵ����������
		jt.addMouseListener(new MouseAdapter(){//�������м�����˫����������Ϊ��ɫ��������������Ϊ��ɫ��
			public void mouseClicked(MouseEvent e){
				int a=e.getClickCount();  //�������������¼����ֵ��a��
				if(a==2){
					jt.setBackground(Color.BLUE);
				}
				if(a==3){
					jt.setBackground(Color.WHITE);
				}
			}
		});
		
		c.add(jp);
		jf.setSize(300, 200);
		jf.setVisible(true);
		jf.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}

}
