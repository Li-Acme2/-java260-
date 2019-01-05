package º∆À„∆˜ΩÁ√Ê;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator {
	public static void main(String[] args){
		JFrame jf=new JFrame();
		Container c=jf.getContentPane();
		JTextField jt=new JTextField("0");
		jt.setEditable(false);
		jt.setHorizontalAlignment(JTextField.RIGHT);
		jt.setColumns(12);
		JButton clear=new JButton("C");
		JButton point=new JButton(".");
		JButton count=new JButton("=");
		JButton add=new JButton("+");
		JButton subtract=new JButton("_");
		JButton multiply=new JButton("X");
		JButton divide=new JButton("/");
		JButton back=new JButton("Back");
		JButton percent=new JButton("%");
		JButton inverse=new JButton("1/x");
		
		JPanel p=new JPanel();
		p.setLayout(new BorderLayout());
		p.add(jt,BorderLayout.NORTH);
		JPanel p1=new JPanel();
		p1.setLayout(new GridLayout(4,4));
		p1.add(clear);
		p1.add(back);
		p1.add(count);
		p1.add(point);
		p1.add(add);
		p1.add(subtract);
		p1.add(multiply);
		p1.add(divide);
		p1.add(percent);
		p1.add(inverse);
		for(int i=0;i<10;i++){
			p1.add(new JButton(""+i));
		}
		
		p.add(p1);
		
		c.add(p);
		
		jf.setSize(300, 200);
		jf.setVisible(true);
		jf.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}

}












