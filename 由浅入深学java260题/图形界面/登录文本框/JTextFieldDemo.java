package ��¼�ı���;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JTextFieldDemo {
	public static void main(String[] args){
		JFrame jf=new JFrame("��¼�ı���");                 //����һ������
		Container contentPane=jf.getContentPane();          //���ش�������
		jf.setContentPane(contentPane);                    //���ô�����������
		JPanel p1=new JPanel();                         //�����������
		p1.setLayout(new GridLayout(3,2));                    //������岼��
		p1.setBorder(BorderFactory.createTitledBorder("��������ĵ�¼��Ϣ"));
		// ���ñ߽粼��
		JLabel l1=new JLabel("�û�����",JLabel.CENTER);
		JLabel l2=new JLabel("���룺",JLabel.CENTER);
		JTextField tf1=new JTextField(10);
		JPasswordField tf2=new JPasswordField(10);
		//�������ӵ����
		p1.add(l1);
		p1.add(tf1);
		p1.add(l2);
		p1.add(tf2);
		contentPane.add(p1);
		jf.addWindowListener(new WindowAdapter(){            //����������
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		jf.setSize(300, 120);
		jf.setVisible(true);
		}

}
