package ����̶�;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;

public class AdjustmentListenerDemo {
	public static void main(String[] args){
		JFrame jf=new JFrame();
		Container c=jf.getContentPane();
		final JLabel jl=new JLabel("�̶�:",JLabel.CENTER);
		final JScrollBar jsb=new JScrollBar(JScrollBar.VERTICAL,10,10,0,100);//���ù��������ԡ�vertical:��ֱ�ġ���һ�����Ա�ʾ����������
		          //�ڶ�����ʾ��������ʼֵ����������ʾ����������Ŀ�ȣ������������ָ���������Ͻ���½硣
		jsb.setUnitIncrement(1);            //ÿ���knob��С�飩һ�ι���1������     //ʹ��unit��blockֻ��Ϊ�˺�awt��scroll����api����
		jsb.setBlockIncrement(10);           //ÿ���track�������һ�ξ͹���ʮ������
		jsb.addAdjustmentListener(new AdjustmentListener(){
			public void adjustmentValueChanged(AdjustmentEvent e){
				if(e.getSource()==jsb){
					jl.setText("��ֱ�̶ȣ�"+e.getValue());
				}
			}
		});
		c.add(jl,BorderLayout.NORTH);
		c.add(jsb,BorderLayout.EAST);
		jf.setSize(300, 200);
		jf.setVisible(true);
		jf.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}

}











