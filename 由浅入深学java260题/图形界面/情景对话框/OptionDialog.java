package �龰�Ի���;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class OptionDialog {// Dialog:�Ի���
	public static void main(String[] args){
		JFrame jf=new JFrame();             //�½�һ������
		Container c=jf.getContentPane();     //����һ������
		final JButton b1=new JButton("С��ϲ");
		c.add(b1);
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int ch=JOptionPane.showConfirmDialog(b1, "��ѡ��");//ѡ������µ�ȷ�϶Ի���option��ѡ��confirm��ȷ�ϡ�
				if(ch==0){
					System.out.println("yes");
				}
				if(ch==1){
					System.out.println("no");
				}
				if(ch==2){
					System.out.println("cancel");
				}
			}
		});
		jf.setSize(300, 200);
		jf.setVisible(true);
		jf.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}

}
