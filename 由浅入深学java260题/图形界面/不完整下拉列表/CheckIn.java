package �����������б�;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CheckIn {
	public static void main(String[] args){
		Frame f=new Frame("��ס�Ǽ�");
		f.setLayout(new GridLayout(3,1));
		Panel p1=new Panel();
		p1.add(new Label("������"));
		p1.add(new TextField(20));
		Panel p2=new Panel();
		p2.add(new Label("������"));
	    List l=new List(4);
		l.add("�й�");
		l.add("����");
		l.add("Ӣ��");
		l.add("����");
		p2.add(l);
		Panel p3=new Panel();
		p3.add(new Button("�ύ"));
		f.add(p1);
		f.add(p2);
		f.add(p3);
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		f.setSize(300,200);
		f.setVisible(true);
	}

}
