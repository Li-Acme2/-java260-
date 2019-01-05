package 组合框之下拉列表;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class JComboBoxText {
	@SuppressWarnings({ "unchecked", "rawtypes", "deprecation" })
	public static  void main(String[] args){
		JFrame jf=new JFrame("组合框实例");                //创建一个窗口
		Container contentPane=jf.getContentPane();          //定义一个容器
		contentPane.setLayout(new GridLayout(1,2));
		String[] str={"故宫","泰山","颐和园","张家界","孔府"};
		Vector vector=new Vector();                             //创建一个vector容器
		vector.addElement("北京");
		vector.addElement("上海");
		vector.addElement("青岛");
		vector.addElement("广州");
		vector.addElement("成都");
		vector.addElement("西安");
		JComboBox combo1=new JComboBox(str);                         //定义一个JComboBox对象
		//利用JComboBox类提供的addItem（）方法，加入一个项目到此JComboBox中
		combo1.addItem( "泰山");
		//创建一个带有指定标题的标题框
		combo1.setBorder(BorderFactory.createTitledBorder("你喜欢那个景点？"));
		JComboBox combo2=new JComboBox(vector);
		combo2.setBorder(BorderFactory.createTitledBorder("你喜欢的城市："));
		contentPane.add(combo1);
		contentPane.add(combo2);
		jf.pack();
		jf.show();
		jf.setSize(300, 85);
		jf.addWindowListener(new WindowAdapter(){         //添加窗口监听器
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}

}









