package �б�;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewList {
	@SuppressWarnings("static-access")
	public static void main(String[] args){
		Frame f=new Frame("����һ���б����");//����һ���µĴ���
		f.setLayout(new GridLayout(2,2));//�������񲼾�
		Label l=new Label("��ѡ���ұߵ����");//����һ���µı�ǩ
		l.setAlignment(l.CENTER);//���ñ�ǩ��λ��    Alignment������
		l.setBackground(Color.BLUE);
		Button b=new Button("�ر�");  //����һ���µİ�ť
		b.setBackground(Color.RED);
		b.addActionListener(new ActionListener(){  //����һ������������
			public void actionPerformed(ActionEvent e){ //����ִ�з���
				System.exit(1);
			}
		});
		List lt=new List(2,true);   //����һ�����Զ�ѡ���б�
		lt.add("2017��9��");
		lt.add("2017��10��");
		lt.add("2017��11��");
		lt.add("2017��12��");
		
		
		f.add(l);
		f.add(lt);
		f.add(b);
		f.setSize(300, 200);
		f.setVisible(true);
		
	}

}
