package 鼠标事件类;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseTest extends WindowAdapter implements MouseListener {
	JFrame jf=null;
	JButton jb=null;
	JLabel jl=null;
	@SuppressWarnings("deprecation")
	public MouseTest(){
		jf=new JFrame("鼠标事件案例");                //创建一个框架
		Container c=jf.getContentPane();             //获得一个窗口容器
		c.setLayout(new GridLayout(2,1));            //设置布局方式
		jb=new JButton("按钮");                        //创建一个按钮
		jl=new JLabel("起始状态，还没有鼠标事件",JLabel.CENTER);      //创建一个文本标签
		jb.addMouseListener(this);                  // 为按钮添加鼠标监听
		c.add(jl);
		c.add(jb);
		jf.pack();                               //将窗口调到适合的大小
		jf.show();                            //显示窗口
		jf.addWindowListener(this);             //添加窗口监听器
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {//鼠标在组件上单击调用
		jl.setText("你单击了按钮");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {//激发按下鼠标事件
		jl.setText("你已经按下了鼠标按钮");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {//激发松开鼠标按键
		jl.setText("你已经抬起鼠标按钮");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) { //鼠标进入组件时调用
		jl.setText("光标已经进入按钮");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {//鼠标离开组件时调用
		jl.setText("光标已经离开按钮");
		
	}
	public void windowClosing(WindowEvent e){
		System.exit(0);
	}
	
	public static void main(String[] args){
		new MouseTest();
	}
}
