package ѡ�ν���;

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
		JFrame jf=new JFrame("ѡ��");                //�½�һ������
		Container c=jf.getContentPane();           //����һ������
		Box box,box1,box2;                       //������������
		final JTextField tf=new JTextField();    //�ı���
		JPanel jp1=new JPanel();     
		jp1.setLayout(new GridLayout(2,3));              //���ĸ�ʽ
		jp1.setBorder(BorderFactory.createTitledBorder("��ѡ��γ�"));
	    final JCheckBox cb1=new JCheckBox("��֯��Ϊѧ");
	    final JCheckBox cb2=new JCheckBox("������ѧ");
	    final JCheckBox cb3=new JCheckBox("�г�Ӫ��ѧ");
	    final JCheckBox cb4=new JCheckBox("������ѧ");
	    final JCheckBox cb5=new JCheckBox("��ҵ����ѧ");
	    jp1.add(cb1);
	    jp1.add(cb2);
	    jp1.add(cb3);
	    jp1.add(cb4);
	    jp1.add(cb5);
	    JButton jb=new JButton("�ύ");
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
	    box1=Box.createVerticalBox();              //�������Ҫ����ֱ���еĺ���
	    box1.add(new JScrollPane(tf),BorderLayout.CENTER);
	    
	    box2=Box.createVerticalBox();
	    box2.add(jp1,BorderLayout.CENTER);
	    box2.add(Box.createVerticalStrut(3));         //���ú����������ֱ�߶�Ϊ3������
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













