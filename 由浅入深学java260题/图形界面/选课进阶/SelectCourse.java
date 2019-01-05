package 选课进阶;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class SelectCourse {
	public static void main(String[] args){
		JFrame jf=new JFrame("选课");                //新建一个窗口
		Container c=jf.getContentPane();           //定义一个容器
		Box box,box1,box2;                       //定义三个盒子
		final JTextField tf=new JTextField();    //文本框
		JPanel jp1=new JPanel();     
		jp1.setLayout(new GridLayout(2,3));              //面板的格式
		jp1.setBorder(BorderFactory.createTitledBorder("请选择课程"));
	    final JCheckBox cb1=new JCheckBox("组织行为学");
	    final JCheckBox cb2=new JCheckBox("管理经济学");
	    final JCheckBox cb3=new JCheckBox("市场营销学");
	    final JCheckBox cb4=new JCheckBox("财务会计学");
	    final JCheckBox cb5=new JCheckBox("企业管理学");
	    jp1.add(cb1);
	    jp1.add(cb2);
	    jp1.add(cb3);
	    jp1.add(cb4);
	    jp1.add(cb5);
	    JButton jb=new JButton("提交");
	    jb.addActionListener(new ActionListener(){
	    	public void actionPerformed(ActionEvent e){
	    		StringBuffer sb=new StringBuffer();
	    		if(cb1.isSelected()) sb.append(cb1.getText()).append(" ");
	    		if(cb2.isSelected()) sb.append(cb2.getText()).append(" ");
	    		if(cb3.isSelected()) sb.append(cb3.getText()).append(" ");
	    		if(cb4.isSelected()) sb.append(cb4.getText()).append(" ");
	    		if(cb5.isSelected()) sb.append(cb5.getText()).append(" ");
	    		tf.setText(sb.toString());;
	    	}
	    });
	    box1=Box.createVerticalBox();              //定义组件要按垂直排列的盒子
	    box1.add(new JScrollPane(tf),BorderLayout.CENTER);
	    
	    box2=Box.createVerticalBox();
	    box2.add(jp1,BorderLayout.CENTER);
	    box2.add(Box.createVerticalStrut(3));         //设置盒子里组件垂直高度为3个像素
	    box2.add(jb);
	    
	    box=Box.createVerticalBox();
	    box.add(box1);
	    box.add(Box.createVerticalStrut(20));
	    box.add(box2);
	    
	    c.add(box);
	    jf.setSize(300, 200);
	    jf.setVisible(true);
	    jf.addWindowListener(new WindowAdapter(){
	    	public void windowClosing(WindowEvent e){
	    		System.exit(0);
	    	}
	    });
	}

}













