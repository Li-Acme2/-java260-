package 给菜单按钮添加快捷键;

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
		JMenu file=new JMenu("文件");
		file.setMnemonic('F');                //添加快捷键Alt+F
		JMenu edit=new JMenu("编辑");
		edit.setMnemonic('E');
		JMenu format=new JMenu("格式");
		format.setMnemonic('M');
		JMenu help=new JMenu("帮助");
		help.setMnemonic('H');
		
		jm.add(file);
		jm.add(edit);
		jm.add(format);
		jm.add(help);
		//设置下拉菜单
		JMenuItem newfile=new JMenuItem("新建");
		newfile.setAccelerator(KeyStroke.getKeyStroke('N', KeyEvent.CTRL_DOWN_MASK));//添加快捷键Ctrl+N
		newfile.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("====");
				JFrame f=new JFrame();
				f.setSize(200, 200);
				f.setVisible(true);
			}
		});
		JMenuItem open=new JMenuItem("打开");
		JMenuItem close=new JMenuItem("关闭");
		JMenuItem exit=new JMenuItem("退出");
		
		file.add(newfile);
		file.add(open);
		file.add(close);
		file.addSeparator();              //添加分离器，separator
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









