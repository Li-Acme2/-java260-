package �Ľ�˳�򲼾ֹ�����;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class FlowLayoutTest extends Frame implements  ActionListener{
	Button b=new Button("���");
	Button bg=new Button("�ر�");
	int i;
	FlowLayoutTest(){
		bg.addActionListener(new ActionListener(){//��Ӷ���������
			public void actionPerformed(ActionEvent e){//����ִ��
				System.exit(1);
			}
		});
		bg.setBackground(Color.RED);
		//���ô�������
		this.setTitle("FlowLayout���ֹ�����");
		this.setLayout(new FlowLayout());//���ò��ֹ�����ΪFlowLayout
		this.add(b);   //��Ӱ�ť
		b.addActionListener(this);
		this.add(bg);
		this.setBounds(100, 100, 250, 250);
		this.setVisible(true);
	}
	
	
	public static void main(String[] args){
		new FlowLayoutTest();
	}
	
	@SuppressWarnings("deprecation")
	public void actionPerformed(ActionEvent e){//��Ӱ�ť
		i++;
		Button bi=new Button("��ť"+i);
		bi.setBackground(Color.BLUE);
		this.add(bi);
		this.show(true);
	}

}
