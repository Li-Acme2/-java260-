package ͼ�����ϵͳ;

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

/*src��javaԴ�ļ�Ŀ¼��bulid��java�������ļ���.class��
 * |-project                                  |-bulid
 *    |-src                                     |-mmm
 *      |-ssss                                    |-Test.class
 *        |-Test.java                             |-file3.txt
 *        |-file1.txt                           |-file4.txt
 *      |-file2.txt
 *        ��ȡfile3.txt��     1.File file3=new File(Test.class.getResource("file3.txt").getFile());
 *                         2.File file3=new File(Test.class.getResource("/mmm/file3.txt").getFile());
 *                         3.File file3=new File(Test.class.getClassLoader().getResource("mmm/file3.txt").getFile());
 *        ��ȡfile4.txt��      1.File file4=new File(Test.class.getResource("/file4.txt").getFile());
 *                         2.File file4=new File(Test.class.getClassLoader().getResource("file4.txt").getFile());
 *        ��ȡfile1.txt��      1.File file1=new File("c:/project/src/ssss/file1.txt");
 *        ��ȡfile2.txt     1.File file3=new File("c:/project/src/file2.txt");
 *        
 *        */
@SuppressWarnings("serial")
public class Login extends JFrame implements ActionListener{
	private JPanel jp=new JPanel();                           //����JPanel����
	   //������ǩ�鲢��ʼ��
	private JLabel[] jlArray={new JLabel("�û�IP"),new JLabel("�˿ں�"),new JLabel("�û���"),new JLabel("�� ��"),new JLabel("")};
	  //������ť���鲢��ʼ��
	private JButton[] jbArray={new JButton("ѧ����¼"),new JButton("���"),new JButton("����Ա��¼")};
	  //�����ı������鲢��ʼ��
	private JTextField[] jtxtArray={new JTextField("127.0.0.1"),new JTextField("3306"),new JTextField("1001")};
	private JPasswordField jpassword=new JPasswordField("1001");       //���������
	String sql;
	//DataBase db;
	public Login(){
		jp.setLayout(null);                  //����JPanel�Ĳ��ֹ�����Ϊ��
		for(int i=0;i<4;i++){                  //�Ա�ǩ�밴ť�¼�ѭ������
			jlArray[i].setBounds(30, 20+i*50, 80, 25);//���ñ�ǩ�밴ť�Ĵ�С��λ��
			jp.add(jlArray[i]);                       //����ǩ�Ͱ�ť��ӵ�JPanel������
		}
		for(int i=0;i<3;i++){                       //���ð�ť�Ĵ�С��λ�ã�������¼�������
			jbArray[i].setBounds(10+i*120, 230, 100, 25);
			jp.add(jbArray[i]);                     //����ť��ӵ������
			jbArray[i].addActionListener(this);
		}
		for(int i=0;i<3;i++){                        //�����ı����С��λ�ã�������¼�������
			jtxtArray[i].setBounds(80, 20+i*50, 180, 25);
			jp.add(jtxtArray[i]);                    //���ı�����ӵ������
			jtxtArray[i].addActionListener(this);
		}
		jpassword.setBounds(80, 170, 180, 25);       //���������Ĵ�С��λ��
		jp.add(jpassword);                           //���������ӵ�JPanel����
		jpassword.setEchoChar('*');                  //���������Ļ����ַ�
		jpassword.addActionListener(this);           //Ϊ�������Ӽ�����
		jlArray[4].setBounds(80, 280, 300, 25);      //����������ʾ��¼״̬�ı�ǩ�Ĵ�С��λ��
		jp.add(jlArray[4]);
		this.add(jp);                                //�������ӵ�������
		Image image = new ImageIcon(this.getClass().getResource("ico.png")).getImage();//��logo��ʼ��
		this.setIconImage(image);                    //����ͼ��
		this.setTitle("--ͼ�����ϵͳ--");            //���ô��ڱ���
		this.setResizable(false);                    //ʹ���ڴ�С���ܱ��ı�
		this.setBounds(100, 100, 400, 350);          //���ô��ڴ�С��λ��
		this.setVisible(true);                       //���ô��ڿɼ���
		this.addWindowListener(new WindowAdapter(){  //���崰�ڹرռ�����
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
	@SuppressWarnings("unused")
	@Override
	/*��ν���������ԣ�һ����ָ����Ҫ����ܶ಻ͬ��Ϣ�Ľ�������һ����Ϣ������ɺ󣬰�Enter�������뽹���Զ���ת����һ��Ҫ������Ϣ�Ŀؼ���*/
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub     //�õ���¼�������Ϣ      //trim():ȥ���ַ�����β�Ŀո�     
		String mgno=jtxtArray[2].getText().trim();//�õ���¼��
		String mgIP=jtxtArray[0].getText().trim();//�õ�IP��ַ
		String port=jtxtArray[1].getText().trim();//�õ��˿�
		String message=mgIP+":"+port;
//		DataBase.message=message;
//		DataBase.log=this;
		if(e.getSource()==jtxtArray[0]){//�¼�ԴΪ�û�IP�ı���
			jtxtArray[1].requestFocus();//������뽹�㵽�˿��ı���
		}
		if(e.getSource()==jtxtArray[1]){//�¼�ԴΪ�˿��ı���
			jtxtArray[2].requestFocus();//�л����뽹�㵽�û����ı���
		}
		if(e.getSource()==jtxtArray[2]){//�¼�ԴΪ�û����ı���
			jpassword.requestFocus();//�л����뽹�㵽�����
		}
		else if(e.getSource()==jbArray[1]){       //�¼�ԴΪ��հ�ť
			 //���������Ϣ
			jlArray[4].setText("");        
			jtxtArray[2].setText("");
			jpassword.setText("");
			jtxtArray[2].requestFocus();//���������õ�jtxtArray[2]
		}
	}
	public static void main(String[] args){
		new Login();
	}

}

