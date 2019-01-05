package ������;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Enumeration;
import java.util.Vector;

public class ServerTest {
	public ServerTest(int port) throws IOException{            //���캯��������Ϊ�˿ں�
		@SuppressWarnings("resource")
		ServerSocket server = new ServerSocket(port);          //����ServerSocket
		while(true){            //����ѭ�����ܿͻ��˵�����
			Socket conn=server.accept();         //�����ͻ��˵�����
			     //���������˵���������װ��DataInputStream���У�����֧��������޹صı��뷽ʽ
			DataInputStream in = new DataInputStream(conn.getInputStream());
			String who=in.readUTF();              //��ȡ�û���Ϣ
			System.out.println("Client(ip:"+conn.getInetAddress()+")"+who+"Enter!"+"\n");//ÿ�μ�������������ʹ���һ���߳�
			ServerHander cn = new ServerHander(who, conn); //�Ը����Ӵ���һ���߳�
			cn.start();          //�������߳�
		}
	}
	public static void main(String args[])throws IOException{
		 new ServerTest(8041);              //��ʼ����������
	}
}
class ServerHander extends Thread{             //�߳���
	Socket socket;                      //Socket����
	DataInputStream in;          //����������
	DataOutputStream out;             //���������
	String who;
	protected static Vector<ServerHander> clientlist=new Vector<ServerHander>();     //�������пͻ��˶���
	public ServerHander(String name,Socket socket) throws IOException{     //���캯��
		this.who=name;
		this.socket=socket;
		in=new DataInputStream(new BufferedInputStream(socket.getInputStream()));
		out=new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
	}
	public void run(){
		try{
			clientlist.addElement(this);                    //��ӵ�ǰ����vector
			sendallclient("��ӭ"+who+"����������");      //�����¿ͻ�������Ϣ���ͻ�
			while(true){                     //���޵�ѭ��
				String msg=in.readUTF();                      //��ȡ������Ϣ
				System.out.println(who+"˵��"+msg);            //��������Ϣ���͸�������
			}
		}catch(IOException e){
			System.out.println("Client exit or error.");
		}
		finally{
			clientlist.removeElement(this);                         //�����ſͻ��˵�����
			sendallclient(who+"�˳�!");
			try{
				socket.close();            //�ر�socket����
			}catch(IOException ex){
				System.out.println("Connection has been closed.");
			}
		}
	}
	protected static void sendallclient(String msg){          //���ͻ��˴�����Ϣ�ķ���
		synchronized(clientlist){                     //���ͻ���vector����
			Enumeration<ServerHander> allclients=clientlist.elements();            //���vector��ö�ٶ���
			while(allclients.hasMoreElements()){                  //��������ÿ���ͻ��˶���
				ServerHander serh=(ServerHander)allclients.nextElement();
				try{
					serh.out.writeUTF(msg);                             //��ͻ��˷�����Ϣ
					serh.out.flush();                             //ˢ�����������֤�������
				}catch(IOException e){
					serh.interrupt();                           //�ն��߳�
				}
			}
		}
	}
}
