package �����ı���;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewTextArea {
	@SuppressWarnings("static-access")
	public static void main(String[] args){
		Frame f=new Frame("�����ı���ʵ��");          //����һ���µĴ���
		Label lb=new Label("�������ı����ɻ���");      //����һ���µı�ǩ
		lb.setBackground(Color.PINK);
		lb.setAlignment(lb.LEFT);                    //���ñ�ǩ��λ��Alignment������.
		f.setLayout(new GridLayout(2,3));           //�������񲼾�
		TextArea ta=new TextArea();                 //����һ���µĶ����ı���
		ta.setBackground(Color.BLUE);
		Button b=new Button("�ر�");                //����һ���µİ�ť
		b.setBackground(Color.RED);
		
		b.addActionListener(new ActionListener(){  //����������
			public void actionPerformed(ActionEvent e){//����ִ��
				System.exit(1);
			}
		});
		
	
		f.add(lb);
		f.add(ta);
		f.add(b);
		f.setSize(300, 200);
		f.setVisible(true);
	}

}
