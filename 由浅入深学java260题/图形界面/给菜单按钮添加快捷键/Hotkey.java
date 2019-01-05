package ���˵���ť��ӿ�ݼ�;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class Hotkey {
	public static void main(String[] args){
		JFrame jf=new JFrame("Hotkey");
		JMenuBar jm=new JMenuBar();
		JMenu file=new JMenu("�ļ�");
		file.setMnemonic('F');                //��ӿ�ݼ�Alt+F
		JMenu edit=new JMenu("�༭");
		edit.setMnemonic('E');
		JMenu format=new JMenu("��ʽ");
		format.setMnemonic('M');
		JMenu help=new JMenu("����");
		help.setMnemonic('H');
		
		jm.add(file);
		jm.add(edit);
		jm.add(format);
		jm.add(help);
		//���������˵�
		JMenuItem newfile=new JMenuItem("�½�");
		newfile.setAccelerator(KeyStroke.getKeyStroke('N', KeyEvent.CTRL_DOWN_MASK));//��ӿ�ݼ�Ctrl+N
		newfile.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("====");
				JFrame f=new JFrame();
				f.setSize(200, 200);
				f.setVisible(true);
			}
		});
		JMenuItem open=new JMenuItem("��");
		JMenuItem close=new JMenuItem("�ر�");
		JMenuItem exit=new JMenuItem("�˳�");
		
		file.add(newfile);
		file.add(open);
		file.add(close);
		file.addSeparator();              //��ӷ�������separator
		file.add(exit);
		
		jf.setJMenuBar(jm);
		jf.setSize(300, 200);
		jf.setVisible(true);
		jf.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}

}









