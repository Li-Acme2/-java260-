package 动作事件;

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
		String[] items={"望庐山瀑布","早发白帝城"};
		final String[] poets={"日照香炉生紫烟，遥看瀑布挂前川。\n飞流直下三千尺，疑是银河落九天。",
				"朝辞白帝彩云间，千里江陵一日还。\n两岸猿山啼不住，轻舟已过万重山。"};
		@SuppressWarnings("unchecked")
		final JComboBox jcb=new JComboBox(items);       //将item添加到组合框
		jp.add(jcb, BorderLayout.NORTH);
		
		final JTextArea tf=new JTextArea();
		Font f=new Font("宋体",Font.PLAIN,18);           //设置字体格式
		tf.setFont(f);                               //将字体格式应用到文本域
		jp.add(tf, BorderLayout.CENTER);
		
		jcb.addActionListener(new ActionListener(){          //对组合框选项添加监听器
			public void actionPerformed(ActionEvent e){
				tf.setText(poets[jcb.getSelectedIndex()]);  //返回下拉列表中被选选项的索引号
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
