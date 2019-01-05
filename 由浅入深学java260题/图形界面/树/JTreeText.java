package 树;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;

public class JTreeText {
	public static void main(String[] args){
		JFrame jf=new JFrame("树实例");                           //创建一个窗口
		//设置用户在此窗体上发起“close”时默认执行的操作
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);          
		jf.getContentPane();
		Box box=Box.createHorizontalBox();               //创建box类对象
		JTree tree1=new JTree();                            //创建树
		tree1.putClientProperty("JTree.lineStyle", "Angled");    //向此组件添加任意的键/值
		JScrollPane scrollpane1=new JScrollPane(tree1);            //创建一个滚动面板
		tree1.setAutoscrolls(true);
		JTree  tree2=new JTree();
		JScrollPane scrollpane2=new JScrollPane(tree2);
		//向box容器添加滚动面板
		box.add(scrollpane1,BorderLayout.WEST);
		box.add(scrollpane2, BorderLayout.EAST);
		jf.getContentPane().add(box, BorderLayout.CENTER);
		jf.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		jf.setSize(300, 200);
		jf.setVisible(true);
	}

}
