package ����¼���;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseTest extends WindowAdapter implements MouseListener {
	JFrame jf=null;
	JButton jb=null;
	JLabel jl=null;
	@SuppressWarnings("deprecation")
	public MouseTest(){
		jf=new JFrame("����¼�����");                //����һ�����
		Container c=jf.getContentPane();             //���һ����������
		c.setLayout(new GridLayout(2,1));            //���ò��ַ�ʽ
		jb=new JButton("��ť");                        //����һ����ť
		jl=new JLabel("��ʼ״̬����û������¼�",JLabel.CENTER);      //����һ���ı���ǩ
		jb.addMouseListener(this);                  // Ϊ��ť���������
		c.add(jl);
		c.add(jb);
		jf.pack();                               //�����ڵ����ʺϵĴ�С
		jf.show();                            //��ʾ����
		jf.addWindowListener(this);             //��Ӵ��ڼ�����
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {//���������ϵ�������
		jl.setText("�㵥���˰�ť");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {//������������¼�
		jl.setText("���Ѿ���������갴ť");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {//�����ɿ���갴��
		jl.setText("���Ѿ�̧����갴ť");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) { //���������ʱ����
		jl.setText("����Ѿ����밴ť");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {//����뿪���ʱ����
		jl.setText("����Ѿ��뿪��ť");
		
	}
	public void windowClosing(WindowEvent e){
		System.exit(0);
	}
	
	public static void main(String[] args){
		new MouseTest();
	}
}
