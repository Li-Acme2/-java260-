package 内部类方式;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MouseInnerTest {
	Frame f;
	TextField tf;
	public static void main(String[] args){
				MouseInnerTest mit=new MouseInnerTest();
				mit.show();
	}
	public MouseInnerTest(){
		f=new Frame("监听器");
		tf=new TextField();
	}
	public void show(){
		f.add(tf,"North");
		f.setVisible(true);
		f.addMouseMotionListener(new MyMouseMotionListener());
		f.setSize(300, 200);
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				f.setVisible(false);
				f.dispose();
				System.out.println("退出");
				System.exit(0);
			}
		});
	}
	class MyMouseMotionListener extends MouseMotionAdapter{
		public void mouseMoved(MouseEvent e){
			tf.setText("鼠标坐标：X="+e.getX()+"Y="+e.getY());
		}
	}

}
