package 不完整下拉列表;

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
		Frame f=new Frame("入住登记");
		f.setLayout(new GridLayout(3,1));
		Panel p1=new Panel();
		p1.add(new Label("姓名："));
		p1.add(new TextField(20));
		Panel p2=new Panel();
		p2.add(new Label("国籍："));
	    List l=new List(4);
		l.add("中国");
		l.add("美国");
		l.add("英国");
		l.add("法国");
		p2.add(l);
		Panel p3=new Panel();
		p3.add(new Button("提交"));
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
