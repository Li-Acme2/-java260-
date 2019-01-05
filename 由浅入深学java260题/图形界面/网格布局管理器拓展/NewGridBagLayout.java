package 网格布局管理器拓展;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewGridBagLayout {
	public static void main(String[] args){
		Frame f=new Frame("这是网格布局管理器拓展案列");//创建一个新的窗口
		f.setLayout(new GridBagLayout());     	//设置布局管理器
		Button b=new Button("关闭");
		b.setBackground(Color.RED);
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(1);
			}
		});
		GridBagConstraints gbc=new GridBagConstraints();
		//设置横向坐标和纵向坐标，并加入按钮。
		gbc.gridx=0;
		gbc.gridy=0;
		f.add(new Button("按钮1"),gbc);
		gbc.gridx=1;
		gbc.gridy=0;
		f.add(new Button("按钮2"),gbc);
		gbc.gridx=0;
		gbc.gridy=1;
		f.add(new Button("按钮3"),gbc);
		gbc.gridx=1;
		gbc.gridy=1;
		f.add(new Button("按钮4"),gbc);
		gbc.gridx=9;
		gbc.gridy=9;
		f.add(b,gbc);
		
		
		f.setSize(300,200);
		f.setVisible(true);
	}

}
