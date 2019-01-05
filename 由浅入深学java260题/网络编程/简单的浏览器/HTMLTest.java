package �򵥵������;

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
	private JPanel contentpane;                  //content�����ݣ�pane�����壻
	private JPanel mainPanel=new JPanel();
	private JTextField urltext=new JTextField();         //����url�����
	private JEditorPane htmlpane=new JEditorPane();        //����ҳ����ʾ
	public HTMLTest(){
		try{
			jbInit();
		}catch(Exception e){
			e.printStackTrace();
		}
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //�����رհ�ť���Զ��˳������ͷ���Դ
	}
	private void jbInit() throws Exception{
		contentpane=(JPanel)getContentPane();           //���ò���
		contentpane.setLayout(new BorderLayout());
		mainPanel.setLayout(new BorderLayout());     //������ʾ
		JLabel promptlabel= new JLabel("��������ַ");
		urltext.setText("https://");
		urltext.addActionListener(new ActionListener(){//���ü�������������URL��Enter���Զ���ȡ��ҳ����
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setPaneContent(urltext.getText());
			}
			
		});
		htmlpane.setEditable(false);                          //����htmlpaneΪ���ɱ༭
		htmlpane.addHyperlinkListener(new HyperlinkListener(){//����¼���������������������ʱ���Զ���ȡ��������
			public void hyperlinkUpdate(HyperlinkEvent e) {
				// TODO Auto-generated method stub
				hyperlinkUpdate(e);
			}
		});
		JScrollPane scrollpane = new JScrollPane();        //��ӹ�����
		scrollpane.getViewport().add(htmlpane);         
		mainPanel.add(urltext, BorderLayout.NORTH);
		mainPanel.add(scrollpane, BorderLayout.CENTER);
		contentpane.add(promptlabel, BorderLayout.NORTH);         //prompt����ʱ�ģ�׼ʱ��
		contentpane.add(mainPanel, BorderLayout.CENTER);
		this.setSize(new Dimension(600,500));                   //dimensions����С���ߴ磻
		this.setTitle("�����");
		this.setVisible(true);
		}
	public void setPaneContent(String url){           //��URL������ʾ��htmlPane��
		try{
			htmlpane.setPage(url);
		}catch(Exception e){
			JOptionPane.showMessageDialog(this,"��ַ����ȷ��"+urltext.getText(),"���벻��ȷ",0);
		}
	}
	public void hyperLinkUpdate(HyperlinkEvent e){                      //��������������ʾ��htmlPane��
		if(e.getEventType()==javax.swing.event.HyperlinkEvent.EventType.ACTIVATED){
			URL url=e.getURL();
			setPaneContent(url.toString());
		}
	}
	public static void main(String[] args){
		new HTMLTest();
	}
}
