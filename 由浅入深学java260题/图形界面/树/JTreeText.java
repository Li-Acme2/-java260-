package ��;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;

public class JTreeText {
	public static void main(String[] args){
		JFrame jf=new JFrame("��ʵ��");                           //����һ������
		//�����û��ڴ˴����Ϸ���close��ʱĬ��ִ�еĲ���
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);          
		jf.getContentPane();
		Box box=Box.createHorizontalBox();               //����box�����
		JTree tree1=new JTree();                            //������
		tree1.putClientProperty("JTree.lineStyle", "Angled");    //�������������ļ�/ֵ
		JScrollPane scrollpane1=new JScrollPane(tree1);            //����һ���������
		tree1.setAutoscrolls(true);
		JTree  tree2=new JTree();
		JScrollPane scrollpane2=new JScrollPane(tree2);
		//��box������ӹ������
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
