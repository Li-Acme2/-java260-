package 图书管理系统;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*src是java源文件目录，bulid是java编译后的文件（.class）
 * |-project                                  |-bulid
 *    |-src                                     |-mmm
 *      |-ssss                                    |-Test.class
 *        |-Test.java                             |-file3.txt
 *        |-file1.txt                           |-file4.txt
 *      |-file2.txt
 *        获取file3.txt：     1.File file3=new File(Test.class.getResource("file3.txt").getFile());
 *                         2.File file3=new File(Test.class.getResource("/mmm/file3.txt").getFile());
 *                         3.File file3=new File(Test.class.getClassLoader().getResource("mmm/file3.txt").getFile());
 *        获取file4.txt：      1.File file4=new File(Test.class.getResource("/file4.txt").getFile());
 *                         2.File file4=new File(Test.class.getClassLoader().getResource("file4.txt").getFile());
 *        获取file1.txt：      1.File file1=new File("c:/project/src/ssss/file1.txt");
 *        获取file2.txt     1.File file3=new File("c:/project/src/file2.txt");
 *        
 *        */
@SuppressWarnings("serial")
public class Login extends JFrame implements ActionListener{
	private JPanel jp=new JPanel();                           //创建JPanel对象
	   //创建标签组并初始化
	private JLabel[] jlArray={new JLabel("用户IP"),new JLabel("端口号"),new JLabel("用户名"),new JLabel("密 码"),new JLabel("")};
	  //创建按钮数组并初始化
	private JButton[] jbArray={new JButton("学生登录"),new JButton("清空"),new JButton("管理员登录")};
	  //创建文本框数组并初始化
	private JTextField[] jtxtArray={new JTextField("127.0.0.1"),new JTextField("3306"),new JTextField("1001")};
	private JPasswordField jpassword=new JPasswordField("1001");       //创建密码框
	String sql;
	//DataBase db;
	public Login(){
		jp.setLayout(null);                  //设置JPanel的布局管理器为空
		for(int i=0;i<4;i++){                  //对标签与按钮事件循环处理
			jlArray[i].setBounds(30, 20+i*50, 80, 25);//设置标签与按钮的大小和位置
			jp.add(jlArray[i]);                       //将标签和按钮添加到JPanel容器中
		}
		for(int i=0;i<3;i++){                       //设置按钮的大小和位置，并添加事件监听器
			jbArray[i].setBounds(10+i*120, 230, 100, 25);
			jp.add(jbArray[i]);                     //将按钮添加到面板中
			jbArray[i].addActionListener(this);
		}
		for(int i=0;i<3;i++){                        //设置文本框大小和位置，并添加事件间听器
			jtxtArray[i].setBounds(80, 20+i*50, 180, 25);
			jp.add(jtxtArray[i]);                    //将文本框添加到面板中
			jtxtArray[i].addActionListener(this);
		}
		jpassword.setBounds(80, 170, 180, 25);       //设置密码框的大小和位置
		jp.add(jpassword);                           //将密码框添加到JPanel容器
		jpassword.setEchoChar('*');                  //设置密码框的回显字符
		jpassword.addActionListener(this);           //为密码框添加监听器
		jlArray[4].setBounds(80, 280, 300, 25);      //设置用于显示登录状态的标签的大小和位置
		jp.add(jlArray[4]);
		this.add(jp);                                //将面板添加到窗体中
		Image image = new ImageIcon(this.getClass().getResource("ico.png")).getImage();//对logo初始化
		this.setIconImage(image);                    //设置图标
		this.setTitle("--图书管理系统--");            //设置窗口标题
		this.setResizable(false);                    //使窗口大小不能被改变
		this.setBounds(100, 100, 400, 350);          //设置窗口大小及位置
		this.setVisible(true);                       //设置窗口可见性
		this.addWindowListener(new WindowAdapter(){  //定义窗口关闭监听器
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
	@SuppressWarnings("unused")
	@Override
	/*所谓键盘易用性，一般是指在需要输入很多不同信息的界面中在一种信息输入完成后，按Enter键，输入焦点自动跳转到下一个要输入信息的控件。*/
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub     //得到登录的相关信息      //trim():去掉字符串首尾的空格     
		String mgno=jtxtArray[2].getText().trim();//得到登录名
		String mgIP=jtxtArray[0].getText().trim();//得到IP地址
		String port=jtxtArray[1].getText().trim();//得到端口
		String message=mgIP+":"+port;
//		DataBase.message=message;
//		DataBase.log=this;
		if(e.getSource()==jtxtArray[0]){//事件源为用户IP文本框
			jtxtArray[1].requestFocus();//奇幻输入焦点到端口文本框
		}
		if(e.getSource()==jtxtArray[1]){//事件源为端口文本框
			jtxtArray[2].requestFocus();//切换输入焦点到用户名文本框
		}
		if(e.getSource()==jtxtArray[2]){//事件源为用户名文本框
			jpassword.requestFocus();//切换输入焦点到密码框
		}
		else if(e.getSource()==jbArray[1]){       //事件源为清空按钮
			 //清空所有信息
			jlArray[4].setText("");        
			jtxtArray[2].setText("");
			jpassword.setText("");
			jtxtArray[2].requestFocus();//将焦点设置到jtxtArray[2]
		}
	}
	public static void main(String[] args){
		new Login();
	}

}

