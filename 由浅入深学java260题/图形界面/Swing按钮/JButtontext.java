package Swing��ť;

import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtontext {
	@SuppressWarnings("deprecation")
	public static void main(String[] args){
		JFrame f=new JFrame("��ť����");
		Container contentpane=f.getContentPane();
		JButton b=new JButton("��ť");     //����һ������ʼ�ı��İ�ť
		//���û���������ֵ�λ�ã�ϵͳ��Ĭ��ֵ�Ὣ��������ͼ�ε��ұ��м��λ�á�
		//�����ı������ͼ���ˮƽ�����λ�á�
		b.setHorizontalTextPosition(JButton.CENTER);
		//�����ı������ͼ��Ĵ�ֱ�����λ�á�
		b.setVerticalTextPosition(JButton.BOTTOM);
		contentpane.add(b);
		f.pack();
		f.show();
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		f.setSize(300, 200);
	}

}
