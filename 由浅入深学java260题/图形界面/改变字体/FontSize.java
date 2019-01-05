package �ı�����;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class FontSize {
	public static void main(String[] args){
		JFrame jf=new JFrame();                 //�½�һ�����ڶ���
		Container c=jf.getContentPane();        //����һ������
		c.setLayout(new BorderLayout());
		
		JPanel p=new JPanel();
		p.setLayout(new BorderLayout());
		
		JPanel p1=new JPanel();
		p1.setLayout(new GridLayout(4,1));
		//���弸����ѡ��ť
		JRadioButton r9=new JRadioButton("9��");
		JRadioButton r12=new JRadioButton("12��");
		JRadioButton r18=new JRadioButton("18��");
		JRadioButton r22=new JRadioButton("22��");
		p1.add(r9);
		p1.add(r12);
		p1.add(r18);
		p1.add(r22);
		ButtonGroup bg=new ButtonGroup();//��ѡ��ť�Ͱ�ť�����ʹ��
		bg.add(r9);
		bg.add(r12);
		bg.add(r18);
		bg.add(r22);
		
		p.add(p1,BorderLayout.NORTH);
		
		final JTextField tf=new JTextField();
		p.add(new JScrollPane(tf), BorderLayout.CENTER);//�������
		//JScrollPane(Component view):����һ���µ�JScrollOpane���󣬵�������ݴ�����ʾ����ʱ���Զ����������ᡣ
		r9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tf.setFont(new Font("TimeRoman",Font.PLAIN,9));//��һ�����������壬�ڶ���������������ʽ�������������������С��
				//��һ�������ǡ����塱���ڶ������ԣ�BOLD��������ʽ������ITALIC��б����ʽ������
			}
		});
		r12.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tf.setFont(new Font("����",Font.PLAIN,12));
			}
		});
		r18.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tf.setFont(new Font("TimeRoman",Font.PLAIN,18));
			}
		});
		r22.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tf.setFont(new Font("TimeRamon",Font.PLAIN,22));
			}
		});
		
		c.add(p);
		jf.setSize(300, 100);
		jf.setVisible(true);
		jf.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}

}









