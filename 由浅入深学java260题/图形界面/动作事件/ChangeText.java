package �����¼�;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ChangeText {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args){
		JFrame jf=new JFrame();
		Container c=jf.getContentPane();
		
		JPanel jp=new JPanel();
		jp.setLayout(new BorderLayout());
		String[] items={"��®ɽ�ٲ�","�緢�׵۳�"};
		final String[] poets={"������¯�����̣�ң���ٲ���ǰ����\n����ֱ����ǧ�ߣ�������������졣",
				"���ǰ׵۲��Ƽ䣬ǧ�ｭ��һ�ջ���\n����Գɽ�䲻ס�������ѹ�����ɽ��"};
		@SuppressWarnings("unchecked")
		final JComboBox jcb=new JComboBox(items);       //��item��ӵ���Ͽ�
		jp.add(jcb, BorderLayout.NORTH);
		
		final JTextArea tf=new JTextArea();
		Font f=new Font("����",Font.PLAIN,18);           //���������ʽ
		tf.setFont(f);                               //�������ʽӦ�õ��ı���
		jp.add(tf, BorderLayout.CENTER);
		
		jcb.addActionListener(new ActionListener(){          //����Ͽ�ѡ����Ӽ�����
			public void actionPerformed(ActionEvent e){
				tf.setText(poets[jcb.getSelectedIndex()]);  //���������б��б�ѡѡ���������
			}
		});
		c.add(jp);
		jf.setSize(300, 200);
		jf.setVisible(true);
		jf.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}

}
