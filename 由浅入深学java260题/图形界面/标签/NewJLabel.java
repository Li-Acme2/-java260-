package ��ǩ;

import java.awt.Frame;
import java.awt.Label;

public class NewJLabel {
	@SuppressWarnings("static-access")
	public static void main(String[] args){
		Frame f=new Frame("����һ���µı�ǩʵ��");//����һ���´���
		Label l=new Label("����һ����ǩ");//����һ��Label��ǩ��
		l.setAlignment(l.CENTER);//���ϵ���  ����
		
		f.add(l);
		f.setSize(300, 200);
		f.setVisible(true);
	}

}
