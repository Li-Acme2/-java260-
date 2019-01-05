package 卡片布局的切换;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CardLayoutDemo {
	public static void main(String[] args){
		final Frame f=new Frame("卡片布局管理器");
		final CardLayout c=new CardLayout(5,10);
		f.setLayout(c);
		ActionListener l=new ActionListener(){
			public void actionPerformed(ActionEvent e){
			c.next(f);
			}
			};
		for(int i=1;i<=5;i++){
			Button b=new Button("单击切换"+i);
			b.addActionListener(l);
			f.add(b,""+i);
			b.setBackground(Color.BLUE);
		}
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		f.setSize(300, 200);
		f.setVisible(true);
	}

}
