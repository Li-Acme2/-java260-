package 情景对话框;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class OptionDialog {// Dialog:对话框
	public static void main(String[] args){
		JFrame jf=new JFrame();             //新建一个窗口
		Container c=jf.getContentPane();     //定义一个容器
		final JButton b1=new JButton("小惊喜");
		c.add(b1);
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int ch=JOptionPane.showConfirmDialog(b1, "请选择！");//选择面板下的确认对话框，option：选择；confirm：确认。
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
