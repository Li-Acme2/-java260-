package 简单的浏览器;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

@SuppressWarnings("serial")
public class HTMLTest extends JFrame{
	private JPanel contentpane;                  //content：内容；pane：窗体；
	private JPanel mainPanel=new JPanel();
	private JTextField urltext=new JTextField();         //设置url输入框
	private JEditorPane htmlpane=new JEditorPane();        //设置页面显示
	public HTMLTest(){
		try{
			jbInit();
		}catch(Exception e){
			e.printStackTrace();
		}
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //单机关闭按钮，自动退出程序并释放资源
	}
	private void jbInit() throws Exception{
		contentpane=(JPanel)getContentPane();           //设置布局
		contentpane.setLayout(new BorderLayout());
		mainPanel.setLayout(new BorderLayout());     //设置提示
		JLabel promptlabel= new JLabel("请输入网址");
		urltext.setText("https://");
		urltext.addActionListener(new ActionListener(){//设置监听器，输入完URL后按Enter键自动获取网页内容
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setPaneContent(urltext.getText());
			}
			
		});
		htmlpane.setEditable(false);                          //设置htmlpane为不可编辑
		htmlpane.addHyperlinkListener(new HyperlinkListener(){//添加事件监听器，当单击超链接时会自动获取链接内容
			public void hyperlinkUpdate(HyperlinkEvent e) {
				// TODO Auto-generated method stub
				hyperlinkUpdate(e);
			}
		});
		JScrollPane scrollpane = new JScrollPane();        //添加滚动条
		scrollpane.getViewport().add(htmlpane);         
		mainPanel.add(urltext, BorderLayout.NORTH);
		mainPanel.add(scrollpane, BorderLayout.CENTER);
		contentpane.add(promptlabel, BorderLayout.NORTH);         //prompt：及时的，准时的
		contentpane.add(mainPanel, BorderLayout.CENTER);
		this.setSize(new Dimension(600,500));                   //dimensions：大小，尺寸；
		this.setTitle("浏览器");
		this.setVisible(true);
		}
	public void setPaneContent(String url){           //将URL内容显示到htmlPane中
		try{
			htmlpane.setPage(url);
		}catch(Exception e){
			JOptionPane.showMessageDialog(this,"地址不正确："+urltext.getText(),"输入不正确",0);
		}
	}
	public void hyperLinkUpdate(HyperlinkEvent e){                      //将超链接内容显示到htmlPane中
		if(e.getEventType()==javax.swing.event.HyperlinkEvent.EventType.ACTIVATED){
			URL url=e.getURL();
			setPaneContent(url.toString());
		}
	}
	public static void main(String[] args){
		new HTMLTest();
	}
}
