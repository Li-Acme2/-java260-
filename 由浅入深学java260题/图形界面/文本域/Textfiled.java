package �ı���;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Textfiled {
	public static void main(String[] args){
		Frame f=new Frame("����һ���ı�");//����һ���µĴ���
		f.setLayout(new GridLayout(2,3,100,50));//����һ�����񲼾�
		/*1.GridLayout����������һ��Ĭ��ֵ�����񲼾֣���ÿ�����ռ��һ��
		 2.GridLayout��int rows��int cols������������ָ�����������������񲼾֡�RowsΪ������colsΪ����
		 3.GridLayout��int rows��int cols��int hgap��int vgap������������ָ�������������Լ����ˮƽ������һ���������񲼾֡�
		 */
		Label lb=new Label("�������ı�:");//����һ���µı�ǩ
		lb.setAlignment(Label.RIGHT);           //�Ա�ǩλ�õĵ���
		Button b=new Button();//����һ���µİ�ť
		b.setBackground(Color.RED);
		b.setLabel("����һ���رհ�ť");
		b.addActionListener(new ActionListener(){   //����������
			public void actionPerformed(ActionEvent e){//����ִ��performed ִ�У����С�
				System.exit(1);
			}
		});
		TextField tf=new TextField();    //����һ���µ��ı���
		tf.setBackground(Color.blue);
		
	
		f.add(lb);
		f.add(tf);
		f.add(b);
		f.setSize(300, 200);
		f.setVisible(true);
	}

}
