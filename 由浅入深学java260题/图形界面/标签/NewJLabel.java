package 标签;

import java.awt.Frame;
import java.awt.Label;

public class NewJLabel {
	@SuppressWarnings("static-access")
	public static void main(String[] args){
		Frame f=new Frame("这是一个新的标签实例");//创建一个新窗口
		Label l=new Label("我是一个标签");//创建一个Label标签。
		l.setAlignment(l.CENTER);//集合调整  中心
		
		f.add(l);
		f.setSize(300, 200);
		f.setVisible(true);
	}

}
