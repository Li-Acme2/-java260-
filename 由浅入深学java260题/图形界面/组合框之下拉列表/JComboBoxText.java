package ��Ͽ�֮�����б�;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class JComboBoxText {
	@SuppressWarnings({ "unchecked", "rawtypes", "deprecation" })
	public static  void main(String[] args){
		JFrame jf=new JFrame("��Ͽ�ʵ��");                //����һ������
		Container contentPane=jf.getContentPane();          //����һ������
		contentPane.setLayout(new GridLayout(1,2));
		String[] str={"�ʹ�","̩ɽ","�ú�԰","�żҽ�","�׸�"};
		Vector vector=new Vector();                             //����һ��vector����
		vector.addElement("����");
		vector.addElement("�Ϻ�");
		vector.addElement("�ൺ");
		vector.addElement("����");
		vector.addElement("�ɶ�");
		vector.addElement("����");
		JComboBox combo1=new JComboBox(str);                         //����һ��JComboBox����
		//����JComboBox���ṩ��addItem��������������һ����Ŀ����JComboBox��
		combo1.addItem( "̩ɽ");
		//����һ������ָ������ı����
		combo1.setBorder(BorderFactory.createTitledBorder("��ϲ���Ǹ����㣿"));
		JComboBox combo2=new JComboBox(vector);
		combo2.setBorder(BorderFactory.createTitledBorder("��ϲ���ĳ��У�"));
		contentPane.add(combo1);
		contentPane.add(combo2);
		jf.pack();
		jf.show();
		jf.setSize(300, 85);
		jf.addWindowListener(new WindowAdapter(){         //��Ӵ��ڼ�����
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}

}









