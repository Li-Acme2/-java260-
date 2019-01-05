package FrameTest;

import java.awt.Frame;
import java.awt.Dimension;
import java.awt.Toolkit;

public class FrameTest {
	public static void main(String[] args){
		myFrame frame=new myFrame();
		frame.NewFrame();
		/*frame.setVisible(true);*/
		/*frame.NewFrame();*/
	}

}

@SuppressWarnings("serial")
class myFrame extends Frame{
	public void NewFrame(){
		setTitle("这是一个在屏幕中间位置显示的窗口");
		/*this.setLocation(200, 100);
		this.setSize(800, 600);
		this.setVisible(true);*/
		Toolkit tk=Toolkit.getDefaultToolkit();
		Dimension screenSize=tk.getScreenSize();
		int screenHeight=screenSize.height;
		int screenWidth=screenSize.width;
		setSize(screenWidth/2,screenHeight/2);
		setLocation(screenWidth/2,screenHeight/2);
		this.setVisible(true);
	/*	this.repaint();*/    //此方法有问题
	}
}
