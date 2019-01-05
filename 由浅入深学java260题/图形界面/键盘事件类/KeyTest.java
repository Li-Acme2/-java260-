package �����¼���;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class KeyTest extends KeyAdapter implements ActionListener {
	JFrame jf=null;         //����һ�����ڶ���
	JLabel jl=null;          //����һ����ǩ����
	JTextField jt=null;      //����һ���ı������
	String key="";
	@SuppressWarnings("deprecation")
	public KeyTest(){
		jf=new JFrame("���̼���ʵ��");
		Container c=jf.getContentPane();
		c.setLayout(new GridLayout(3,1));
		jl=new JLabel("��ǩ��");
		jl.setHorizontalAlignment(JLabel.CENTER);              //�����ı���ˮƽ���뷽ʽ
		jt=new JTextField();
		jt.requestFocus();            //��ý���
		jt.addKeyListener(this);          //��Ӽ��̼�����
		JButton jb=new JButton("���");
		//jb.setMnemonic('o');                   //Ϊ��ť���ÿ�ݼ�o��
		jb.addActionListener(this);
		c.add(jl);
		c.add(jt);
		c.add(jb);
		jf.pack();
		jf.show();
		jf.setSize(300, 150);
		jf.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
	
	public void actionPerformed(ActionEvent e) {
		key="";
		jl.setText("");
		jt.setText("");
		jt.requestFocus();
		
	}
	@SuppressWarnings("deprecation")
	public void keyTyped(KeyEvent e){
		char c=e.getKeyChar();        //��ȡ�¼�Դ�ϵ��ַ�
		if(c=='o'){                     //���������ĸo���ͻ�����µĴ��ڡ�
			JFrame newf=new JFrame("��������o�󵯳����µĴ���");
			newf.setSize(300, 200);
			newf.show();
		}
		key=key+c;
		jl.setText(key);           //���ı����������ʾ�ڱ�ǩ��
	}
public static void main(String[] args){
		new KeyTest();
	}

}
